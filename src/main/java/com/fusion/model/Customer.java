package com.fusion.model;

public class Customer {
    private String email;
    private String firstName;
    private String lastName;
    private String mobile;  
    public Customer() {
    }
    
    public Customer( final String firstName, final String lastName, final String email,final String mobile) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    public String getMobile() {
        return mobile;
    }
    
    public void setMobile(final String mobile) {
        this.mobile = mobile;
    }
        
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
}
