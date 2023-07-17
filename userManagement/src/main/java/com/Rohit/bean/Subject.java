package com.Rohit.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Subject")
public class Subject {
    @Id
    @NotNull
    @Pattern(regexp = "GS-\\d{3}",message="UserId must start with 'GS-' followed by numbers")
    private String userId;
    @Column(name = "name", nullable = false)
    @NotEmpty
    @Size(min = 2, message = "user should have at least 2 characters")
    private String userName;
    @NotNull
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "DOB should be in yyyy-mm-dd formate")
    private String dateOfBirth;
    @NotEmpty
    @Email(message = "Invalid email address")
    private String email;
    @NotNull
    @Pattern(regexp = "\\+91-\\d{10}", message = "Phone number must be in the formate XX-XXXXXXXXXX")
    private String phoneNumber;
//	@NotNull
//	@Pattern(regexp = "\\d{2}-\\d{2}", message = "Time must be in the format HH:mm")
//	private String time;

    public Subject(String userId, String userName, String dateOfBirth, String email, String phoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public Subject() {
        // TODO Auto-generated constructor stub
    }

}
