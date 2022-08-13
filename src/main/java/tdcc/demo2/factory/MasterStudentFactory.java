package tdcc.demo2.factory;

public class MasterStudentFactory {
    public static MasterStudentTemplate create(String type, String name) {
        if ("network".equals(type)) {
            return new NetworkSubjectMasterStudent(name);
        } else if ("software-engineering".equals(type)) {
            return new SoftwareEngineeringSubjectMasterStudent(name);
        } else return null;
    }
}
