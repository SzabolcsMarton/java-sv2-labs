package looptypesmodify;

public class Student {
    private String name;
    private boolean active;

    public Student (String nameofStudent) {
        this.name = nameofStudent;
        this.active = true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
