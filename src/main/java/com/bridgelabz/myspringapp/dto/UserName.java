package com.bridgelabz.myspringapp.dto;

/**
 *  @Purpose: To Create UserName Entity to Create User DTO Bean
 *           with firstName and lastName as attributes.
 *
 * @author : VAISHNAVI R. VISHWAKARMA.
 * @since : 1-12-2021.
 */
public class UserName {
    private String firstName;
    private String lastName;

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

    @Override
    public String toString() {
        return "UserName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
