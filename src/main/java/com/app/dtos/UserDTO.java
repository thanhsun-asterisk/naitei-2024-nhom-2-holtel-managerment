package com.app.dtos;

import lombok.*;
import com.app.constants.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;


@Data
@Builder
public class UserDTO {
    private Long id;

    @NotBlank(message = "Email address cannot be empty")
    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "Name cannot be empty")
    @Pattern(regexp = "^(?!\\s*$)[A-Za-z ]+$", message = "Name must only contain letters")
    private String name;

    private Role role;


}

