package sg.edu.ntu.taskflow_api.config;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import sg.edu.ntu.taskflow_api.model.Task;
import sg.edu.ntu.taskflow_api.repository.TaskRepository;

@Component
public class TaskLoader {

    private TaskRepository taskRepository;

    public TaskLoader(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @PostConstruct
    public void loadTask() {
        taskRepository.save(new Task("Task Number One"));
        taskRepository.save(new Task("Task Number Two"));
        taskRepository.save(new Task("Task Number Three"));
        taskRepository.save(new Task("Task Number Four"));
        taskRepository.save(new Task("Task Number Five"));
        taskRepository.save(new Task("Task Number Six"));
        taskRepository.save(new Task("Task Number Seven"));
        taskRepository.save(new Task("Task Number Eight"));
        taskRepository.save(new Task("Task Number Nine"));
        taskRepository.save(new Task("Task Number Ten"));

    }

}
