package IOStreams.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Empoyee {
    String fullName;
    float salary;

    public Empoyee(String fullName, float salary) {
        this.fullName = fullName;
        this.salary = salary;
    }
    void copyInFile() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("report.txt"),true));
        printWriter.println ("Empoyee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}');
        printWriter.close ();
    }
    @Override
    public String toString() {
        return "Empoyee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
