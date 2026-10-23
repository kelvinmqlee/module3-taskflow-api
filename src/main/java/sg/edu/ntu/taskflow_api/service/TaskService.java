package sg.edu.ntu.taskflow_api.service;

import java.util.List;

import sg.edu.ntu.taskflow_api.model.Task;

public interface TaskService {
    Task createTask(Task task);

    List<Task> findAllTasks();

    Task findTaskById(Long id);

    Task updateTask(Long id, Task task);

    Task markTaskAsComplete(Long id);

    void deleteTask(Long id);

}
