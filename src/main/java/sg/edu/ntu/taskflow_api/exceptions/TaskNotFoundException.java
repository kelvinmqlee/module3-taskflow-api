package sg.edu.ntu.taskflow_api.exceptions;

public class TaskNotFoundException extends RuntimeException {

    public TaskNotFoundException(Long id) {
        super("Unable to find task with ID: " + id);
    }
}
