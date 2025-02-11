class Student {
    String name;
    int age;
    String address;

}

public class App {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "John";
        student1.age = 20;
        student1.address = "1234 Main St";

        Student student2 = new Student();
        student2.name = "Jane";
        student2.age = 21;
        student2.address = "5678 Elm St";

        Student students[] = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (Student student : students) {
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
            System.out.println("Address: " + student.address);
            System.out.println();

        }

    }
}
