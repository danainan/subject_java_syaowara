package MVCPattern;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // fetch student record based on his roll no from the database
        Student model = retriveStudentFromDatabase();
        // Create a view : to write student details on console
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        // update model data
        controller.setStudentName("John");
        controller.updateView();
        Teacher teachermodel = retriveTeacherFromDatabase();
        TeacherView teacherview = new TeacherView();
        TeacherController teachercontroller = new TeacherController(teachermodel, teacherview);
        teachercontroller.updateView();
        teachercontroller.setTeacherName("Teacherza");
        teachercontroller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

    private static Teacher retriveTeacherFromDatabase() {
        Teacher teacher = new Teacher();
        teacher.setName("Teacherzaza");
        teacher.setDepartment("Lecturer");
        return teacher;
    }


}
