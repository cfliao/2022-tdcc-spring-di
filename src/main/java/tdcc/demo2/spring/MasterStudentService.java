package tdcc.demo2.spring;

import java.util.List;

public class MasterStudentService {

    private List<MasterStudentTemplate> students;

    public void setStudents(List<MasterStudentTemplate> students) {
        this.students = students;
    }

    public void graduateAll(){
        for(MasterStudentTemplate student: students){
            student.graduate();
        }
    }
}
