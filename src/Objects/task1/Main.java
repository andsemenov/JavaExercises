package Objects.task1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("Joe");
        student1.setLastName("Burns");
        student1.setAge(24);
        student1.setAverageRating(4.2);
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + ", age: " + student1.getAge() +
                ", average rating: " + student1.getAverageRating());
        student1.study();
        System.out.println();
        Student student2 = new Student("Alex", "Smith");
        student2.setAge(28);
        student2.setAverageRating(4.4);
        System.out.println(student2.getFirstName() + " " + student2.getLastName() + ", age: " + student2.getAge() +
                ", average rating: " + student2.getAverageRating());
        student2.relax();
        System.out.println();
        Student student3 = new Student("John", "Brown", 23, 4.7);
        System.out.println(student3.getFirstName() + " " + student3.getLastName() + ", age: " + student3.getAge() +
                ", average rating: " + student3.getAverageRating());
        student3.study();
        System.out.println();
    }
}
