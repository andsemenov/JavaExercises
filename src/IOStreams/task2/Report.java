package IOStreams.task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Report {
    ArrayList<Empoyee> employees;

    public Report(ArrayList<Empoyee> employees) {
        this.employees = employees;
    }

    void generateReport() throws FileNotFoundException {
        for (Empoyee employee:employees){
            System.out.println(employee);
            employee.copyInFile();
        }

    }
}
