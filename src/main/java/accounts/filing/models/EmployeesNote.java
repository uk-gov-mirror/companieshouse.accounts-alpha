package accounts.filing.models;

public class EmployeesNote {

	private Integer employeesCurrent;
	private Integer employeesPrevious;
	
	private String additionalInfo;
	
	public EmployeesNote() {}
	
	public Integer getEmployeesCurrent() {
		return employeesCurrent;
	}



	public void setEmployeesCurrent(Integer employeesCurrent) {
		this.employeesCurrent = employeesCurrent;
	}



	public Integer getEmployeesPrevious() {
		return employeesPrevious;
	}



	public void setEmployeesPrevious(Integer employeesPrevious) {
		this.employeesPrevious = employeesPrevious;
	}



	public String getAdditionalInfo() {
		return additionalInfo;
	}



	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	
	public void cleanupPreparationStatement() {
		// TODO Auto-generated method stub
		
	}

}