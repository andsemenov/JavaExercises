package IOStreams.task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList <Empoyee> employees = new ArrayList<>();
        employees.add(new Empoyee("Ivan Ivanov", 35000));
        employees.add(new Empoyee("Petr Salov", 25000));
        employees.add(new Empoyee("Klim Sapov", 30000));
        employees.add(new Empoyee("Alex Fedorov", 45000));
        Report report = new Report(employees);
        report.generateReport();
    }
}

//Задача 2.
//Создать класс Employee, у которого есть fullname и salary.
//Создать массив либо коллекцию содержащую несколько объектов этого типа.
//Создать класс Report с методом generateReport, в котором выводится информация о зарплате всех сотрудников.
//Добавить метод в класс Employee, который будет записывать report в файл repotr.txt.
//Используем класс PrintWriter.