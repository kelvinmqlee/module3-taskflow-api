package sg.edu.ntu.taskflow_api.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.ntu.taskflow_api.exceptions.TaskNotFoundException;
import sg.edu.ntu.taskflow_api.model.Task;
import sg.edu.ntu.taskflow_api.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task findTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
    }

    @Override
    public Task updateTask(Long id, Task task) {
        Task taskToUpdate = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));

        taskToUpdate.setTitle(task.getTitle());
        taskToUpdate.setDetails(task.getDetails());

        return taskRepository.save(taskToUpdate);
    }

    @Override
    public Task markTaskAsComplete(Long id) {
        Task taskToMarkAsComplete = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));

        taskToMarkAsComplete.setDateCompleted(LocalDate.now());
        taskToMarkAsComplete.setCompletedFlag(true);

        return taskRepository.save(taskToMarkAsComplete);
    }

    @Override
    public void deleteTask(Long id) {
        if (!taskRepository.deleteById(id)) {
            throw new TaskNotFoundException(id);
        }
    }

}
