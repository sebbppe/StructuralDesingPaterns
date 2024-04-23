import domain.Designer;
import domain.Developer;
import domain.ProjectManager;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("John Doe", "Frontend Developer");
        Developer dev2 = new Developer("Jane Smith", "Backend Developer");
        Designer des1 = new Designer("Emily Johnson", "UI/UX Designer");

        ProjectManager pm1 = new ProjectManager("Mike Brown");
        pm1.addComponent(dev1);
        pm1.addComponent(dev2);
        pm1.addComponent(des1);

        ProjectManager generalManager = new ProjectManager("Alex Green");
        generalManager.addComponent(pm1);

        generalManager.displayProjectDetails();
    }
}