package domain;

import interfaces.ProjectComponent;

public class Developer implements ProjectComponent {
    private String name;
    private String role;

    public Developer(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public void displayProjectDetails() {
        System.out.println("Developer: " + name + ", Role: " + role);
    }
}
