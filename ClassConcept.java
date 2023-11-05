class StudentStructure {
    String name;
    int age;
    String course;
    public StudentStructure(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
}
public class ClassConcept {
    public static void main(String[] args) {
        StudentStructure student1 = new StudentStructure("Chetan", 20, "CST");
        StudentStructure student2 = new StudentStructure("Pratik", 20, "CSE");
        System.out.println("Student 1:");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("Course: " + student1.course);
        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("Course: " + student2.course);
    }
}