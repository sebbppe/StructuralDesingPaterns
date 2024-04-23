package domain;

import interfaces.ProjectComponent;

public class Designer implements ProjectComponent {
    private String name;
    private String role;

    public Designer(String name, String role) {
        this.name = name;
        this.role = role;
    }


    @Override
    public void displayProjectDetails() {
        System.out.println("Designer: " + name + ", Role: " + role);
    }
}
