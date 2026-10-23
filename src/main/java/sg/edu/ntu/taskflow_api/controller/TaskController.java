package sg.edu.ntu.taskflow_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import sg.edu.ntu.taskflow_api.model.Task;
import sg.edu.ntu.taskflow_api.service.TaskService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("")
    public ResponseEntity<Task> createTask(@RequestBody @Valid Task task) {
        Task newTask = taskService.createTask(task);
        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<Task>> findAllTasks() {
        List<Task> allTasks = taskService.findAllTasks();
        return new ResponseEntity<>(allTasks, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> findTaskById(@PathVariable Long id) {
        Task foundTask = taskService.findTaskById(id);
        return new ResponseEntity<>(foundTask, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @Valid @RequestBody Task task) {
        Task updatedTask = taskService.updateTask(id, task);
        return new ResponseEntity<>(updatedTask, HttpStatus.OK);

    }

    @PutMapping("/{id}/complete")
    public ResponseEntity<Task> markTaskAsComplete(@PathVariable Long id) {
        Task markedTaskAsComplete = taskService.markTaskAsComplete(id);
        return new ResponseEntity<>(markedTaskAsComplete, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
