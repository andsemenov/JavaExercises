package Objects.task1;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double averageRating;

    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = -1;
        this.averageRating = -1;
    }

    public Student(String firstName, String lastName, int age, double averageRating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageRating = averageRating;
    }

    public void study() {
        System.out.println("I am studying!");
    }

    public void relax() {
        System.out.println("I am relaxing!");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
}

//Задача 1.
//Создать класс Student, который содержит:
//a) поля firstName, lastName, age, averageRating.
//б) методы study() и relax(), в которых просто вывести на консоль текстовые сообщения.
//в) Добавьте три конструктора  - Student(), Student(firstName, lastName), Student(firstName, lastName, age, averageRating).
//Создайте три объекта этого класса. Каждый объект должен быть инициализирован разным конструктором.