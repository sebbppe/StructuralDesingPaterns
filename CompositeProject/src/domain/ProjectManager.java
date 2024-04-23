package domain;

import interfaces.ProjectComponent;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager implements ProjectComponent {
    private List<ProjectComponent> components = new ArrayList<>();
    private String name;

    public ProjectManager(String name) {
        this.name = name;
    }

    public void addComponent(ProjectComponent component) {
        components.add(component);
    }

    @Override
    public void displayProjectDetails() {
        System.out.println("Project Manager: " + name);
        for (ProjectComponent component : components) {
            component.displayProjectDetails();
        }
    }
}
