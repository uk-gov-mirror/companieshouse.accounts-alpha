package accounts.filing.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Approval {
	
	@Size(min=1, max=120, message="Please provide name details of accounts approver(s)")
	@NotNull(message="Please provide name details of accounts approver(s)")

	private String directorConfirmation;
	
	@Min(value = 1, message="Please provide the valid date when the accounts were approved")
	@Max(value = 31, message="Please provide the valid date when the accounts were approved")
	@NotNull(message="Please provide the valid date when the accounts were approved")
	private Integer dayConfirmation;
	
	@Min(value = 1, message="Please provide the valid date when the accounts were approved")
	@Max(value = 12, message="Please provide the valid date when the accounts were approved")
	@NotNull(message="Please provide the valid date when the accounts were approved")
	private Integer monthConfirmation;
	
	@Min(value = 2015, message="Please provide the valid date when the accounts were approved")
	@Max(value = 2018, message="Please provide the valid date when the accounts were approved")
	@NotNull(message="Please provide the valid date when the accounts were approved")
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