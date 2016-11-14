package accounts.filing.models;

import javax.validation.constraints.AssertTrue;

public class AccountingPolicies {
    
	private String preparationStatement;
	
	private String otherPreparation;
	
	public AccountingPolicies() {
	}	

	@AssertTrue(message = "Please ensure you choose the statement that reflects the way your accounts were prepared.") 
	public boolean isPreparationStatementSelected(){		
		if (preparationStatement == null || preparationStatement.isEmpty())
		{
			if(otherPreparation == null || otherPreparation.isEmpty()){
				return false;
			}
				return true;
		}
		return true;
	}

	public void setPreparationStatement(String preparationStatement){
		this.preparationStatement = preparationStatement;
	}
	
	public void setOtherPreparation(String otherPreparation){
		this.otherPreparation = otherPreparation;
	}
	
	public String getPreparationStatement(){
		return this.preparationStatement;
	}
	
	public String getOtherPreparation(){
		return this.otherPreparation;
	}
	
	public void cleanupPreparationStatement(){
		if (this.preparationStatement == null || this.preparationStatement.isEmpty()){
			this.preparationStatement = this.otherPreparation;
		}
	}

}