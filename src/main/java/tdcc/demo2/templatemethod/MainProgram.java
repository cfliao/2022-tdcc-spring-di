package tdcc.demo2.templatemethod;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {

	public static void main(String[] args) {
	    
		MasterStudentTemplate tom = new NetworkSubjectMasterStudent("Tom");
		MasterStudentTemplate mary = new SoftwareEngineeringSubjectMasterStudent("Mary");

		List<MasterStudentTemplate> students = new ArrayList<>();
		students.add(tom);
		students.add(mary);

		for(MasterStudentTemplate student: students){
			student.graduate();
		}

	}

}
