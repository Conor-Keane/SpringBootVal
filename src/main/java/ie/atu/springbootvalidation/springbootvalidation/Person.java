package ie.atu.springbootvalidation.springbootvalidation;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Title must be between 2 and 50 characters")
    private String title;

    @NotBlank(message = "Employee ID cannot be blank")
    @Size(min = 1, max = 5, message = "Employee ID must be between 1 and 5 characters")
    private int employeeId;

    @NotBlank(message = "Age cannot be blank")
    @Size(min = 18, max = 100, message = "Employee Age must be between 18 and 100 years old ")
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
