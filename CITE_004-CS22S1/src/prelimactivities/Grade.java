package prelimactivities;

public class Grade {
//attributes 
	private double assignment = 0.0;
	private double attendance = 0.0;
	private double machineProblem = 0.0;
	private double project = 0.0;
	
	public Grade(double assignment, double attendance, double machineProblem, double project) {
		super();
		this.assignment = assignment;
		this.attendance = attendance;
		this.machineProblem = machineProblem;
		this.project = project;
	}

	public double getAssignment() {
		return assignment;
	}

	public void setAssignment(double assignment) {
		this.assignment = assignment;
	}

	public double getAttendance() {
		return attendance;
	}

	public void setAttendance(double attendance) {
		this.attendance = attendance;
	}

	public double getMachineProblem() {
		return machineProblem;
	}

	public void setMachineProblem(double machineProblem) {
		this.machineProblem = machineProblem;
	}

	public double getProject() {
		return project;
	}

	public void setProject(double project) {
		this.project = project;
	}
	//customized method
	public double computeGrade(double assignment, double attendance, double machineProblem, double project) {
		double grade = 0.0;
		grade = (assignment + attendance + machineProblem + project) /4;
		return grade; 
	}
}
