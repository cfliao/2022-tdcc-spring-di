package tdcc.demo2.factory;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {

    public static void main(String[] args) {

        MasterStudentTemplate tom = MasterStudentFactory.create("network", "Tom");
        MasterStudentTemplate mary = MasterStudentFactory.create("software-engineering", "Mary");

        List<MasterStudentTemplate> students = new ArrayList<>();
        students.add(tom);
        students.add(mary);

        for(MasterStudentTemplate student: students){
            student.graduate();
        }

    }
}
