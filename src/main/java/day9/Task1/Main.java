package day9.Task1;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Maria");
        Student h2 = new Student("Alex", "Group 777");
        Teacher h3 = new Teacher("Ivan Pavlovich", "Mathe");

        System.out.println(h1.getName());  //*1 Maya
        h1.printInfo();   //*2
        h2.printInfo();   //*3,4  OVERRIDE!!!! h2  ("Alex")
        h3.printInfo();   //*5    OVERRIDE!!!! h3  ("Ivan Pavlovich")

        System.out.println();
        System.out.println(h2.getGroupName());
        System.out.println(h3.getSubjectName());
    }

}
