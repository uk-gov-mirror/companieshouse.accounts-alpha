package accounts.filing.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Approval {
	
	@Size(min=1, max=120, message="Please provide name details of accounts approver(s)")
	@NotNull( message="Please provide name details of accounts approver(s)")
	private String directorConfirmation;
	@NotNull( message="Please provide the date when the accounts were approved")
	private Integer dayConfirmation;
	@NotNull( message="Please provide the date when the accounts were approved")
	private Integer monthConfirmation;
	@NotNull( message="Please provide the date when the accounts were approved")
	private Integer yearConfirmation;


	public Approval() {
    }

	public String getDirectorConfirmation() {
		return directorConfirmation;
	}

	public void setDirectorConfirmation(String directorConfirmation) {
		this.directorConfirmation = directorConfirmation;
	}

	public Integer getDayConfirmation() {
		return dayConfirmation;
	}

	public void setDayConfirmation(Integer dayConfirmation) {
		this.dayConfirmation = dayConfirmation;
	}

	public Integer getMonthConfirmation() {
		return monthConfirmation;
	}

	public void setMonthConfirmation(Integer monthConfirmation) {
		this.monthConfirmation = monthConfirmation;
	}

	public Integer getYearConfirmation() {
		return yearConfirmation;
	}

	public void setYearConfirmation(Integer yearConfirmation) {
		this.yearConfirmation = yearConfirmation;
	}
	
}