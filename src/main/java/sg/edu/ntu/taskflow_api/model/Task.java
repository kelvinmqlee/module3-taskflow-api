package sg.edu.ntu.taskflow_api.model;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Task {

    private Long id;

    @NotBlank(message = "Task title is mandatory")
    @Size(max = 50, message = "Please keep your task title within 50 characters")
    private String title;

    @Size(max = 300, message = "Please keep your task details within 300 characters")
    private String details;

    private LocalDate dateCreated = LocalDate.now();

    private LocalDate dateCompleted;

    private boolean completedFlag;

    public Task(String title) {
        this.title = title;
    }
}
