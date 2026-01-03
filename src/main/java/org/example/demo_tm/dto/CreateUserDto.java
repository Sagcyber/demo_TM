package org.example.demo_tm.dto;

public class CreateUserDto {
    
    private String name;
    
    public CreateUserDto() {}
    
    public CreateUserDto(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

}
