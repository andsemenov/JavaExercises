package Objects.task1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("Joe");
        student1.setLastName("Burns");
        student1.setAge(24);
        student1.setAverageRating(4.2);
        System.out.println(student1.toString());
        student1.study();
        System.out.println();
        Student student2 = new Student("Alex", "Smith");
        student2.setAge(28);
        student2.setAverageRating(4.4);
        System.out.println(student2.toString());
        student2.relax();
        System.out.println();
        Student student3 = new Student("John", "Brown", 23, 4.7);
        System.out.println(student3.toString());
        student3.study();
        System.out.println();
    }
}
