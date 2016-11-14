package accounts.filing.models;

import javax.validation.constraints.NotNull;

public class AccountingPolicies {
    
	@NotNull(message = "Error banana")
	private String preparationStatement;
	
	private String otherPreparation;
	
	public AccountingPolicies() {
	}	

	public AccountingPolicies(String preparationStatement) {
		this.preparationStatement = preparationStatement;
	}

	public void setPreparationStatement(String preparationStatement){
		//System.out.println("Before validation" + preparationStatement);
		this.preparationStatement = formatPreparationStatement(preparationStatement);
		//System.out.println("After validation" + this.preparationStatement);
	}
	
	public void setOtherPreparation(String otherPreparation){
		this.otherPreparation = otherPreparation;
		//System.out.println("other preparation: " + this.otherPreparation);
	}
	
	public String getPreparationStatement(){
		return this.preparationStatement;
	}
	
	public String getOtherPreparation(){
		return this.otherPreparation;
	}
	
	
	private String formatPreparationStatement(String preparationStatement) {
		if(preparationStatement.isEmpty()){	
			if(this.otherPreparation.isEmpty()){
				return null;
			}
			return this.otherPreparation;	
		}
		return preparationStatement;
	}

}