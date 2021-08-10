package com.example.photoapp.api.users.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {

    @NotBlank(message = "First name cannot be null or empty")
    @Size(min = 2, message = "First must not be less than 2 characters")
    public String firstName;
    @NotBlank(message = "Last name cannot be null or empty")
    @Size(min = 2, message = "Last name must not be less than 2 characters")
    public String lastName;
    @NotBlank(message = "Password cannot be null or empty")
    @Size(min = 8, max = 16, message = "The password must be equal or grater than 8 characters and less than 16 characters")
    public String password;
    @NotBlank(message = "Email cannot be null or empty")
    @Email
    public String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
