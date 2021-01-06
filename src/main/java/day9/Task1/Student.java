package day9.Task1;

public class Student extends Human {
    public String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void printInfo() {
        System.out.println("\n  *Этого Человека зовут " + super.name); //*3
        System.out.println("  *Этого студента зовут " + super.name); //*4
    }
}
