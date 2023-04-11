package MVCPattern;

public class TeacherController {
	private Teacher model;
	private TeacherView view;

	public TeacherController(Teacher model, TeacherView view) {
		this.model = model;
		this.view = view;
	}

	public void setTeacherName(String name) {
		model.setName(name);
	}

	public String getTeacherName() {
		return model.getName();
	}


	public void setTeacherDepartment(String department) {
		model.setDepartment(department);
	}

	public String getTeacherDepartment() {
		return model.getDepartment();
	}

	public void updateView() {
		view.printTeacherDetails(model.getName(), model.getDepartment());
	}
}
