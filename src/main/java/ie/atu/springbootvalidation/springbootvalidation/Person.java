package ie.atu.springbootvalidation.springbootvalidation;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "Title cannot be blank")
    @Size(min = 2, max = 50, message = "Title must be between 2 and 50 characters")
    private String title;

    @NotBlank(message = "Employee ID cannot be blank")
    @Size(min = 1, max = 5, message = "Employee ID must be between 1 and 5 characters")
    private String employeeId;

    @Min(value = 18, message = "Employee Age must be over 18")
    private int age;

    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "Position cannot be blank")
    @Size(min = 2, max = 50, message = "Position must be between 2 and 50 characters")
    private String position;

    @NotBlank(message = "Department cannot be blank")
    @Size(min = 2, max = 50, message = "Department must be between 2 and 50 characters")
    private String department;
}
