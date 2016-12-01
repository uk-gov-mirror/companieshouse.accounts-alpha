package accounts.filing.models;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Approval {
	
	@Size(min=1, max=120, message="Please provide name details of accounts approver(s)")
	@NotNull(message="Please provide name details of accounts approver(s)")
	private String directorConfirmation;
	
	private Integer dayConfirmation;
	private Integer monthConfirmation;
	private Integer yearConfirmation;
	
	
	@AssertTrue(message = "Please provide the valid date when the accounts were approved") 
	public boolean isDateValid(){
		if(dayConfirmation != null && (dayConfirmation < 1 || dayConfirmation > 31)) {
			return false;
		}
			else if (monthConfirmation != null && (monthConfirmation < 1 || monthConfirmation > 12)) {
				return false;
			}
			else if (yearConfirmation != null && (yearConfirmation < 2015 || yearConfirmation > 2018)) {
				return false;
			}
			return true;	
		
	}
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