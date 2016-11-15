package accounts.filing.models;

import javax.validation.constraints.AssertTrue;

public class AccountingPolicies {
    
	private String preparationStatement;
	private String customStatement;
	private String turnoverPolicy;
	private String assetsDepreciationPolicy;
	private String assetsAmortisationPolicy;
	private String valuationInformationPolicy;
	private String otherAccountingPolicies;
	
	public AccountingPolicies() {
	}	

	@AssertTrue(message = "Please ensure you choose the statement that reflects the way your accounts were prepared.") 
	public boolean isPreparationStatementSelected(){		
		if (preparationStatement == null || ( preparationStatement.equals("custom") && customStatement.isEmpty()))
		{		
				return false;
		}	
	return true;
	}
	

	public void setPreparationStatement(String preparationStatement){
		this.preparationStatement = preparationStatement;
	}
	
	public void setOtherPreparation(String otherPreparation){
		this.customStatement = otherPreparation;
	}
	
	public void setTurnoverPolicy(String turnoverPolicy){
		this.turnoverPolicy = turnoverPolicy;
	}
	
	public void setAssetsDepreciationPolicy(String assetsDepreciationPolicy){
		this.assetsDepreciationPolicy = assetsDepreciationPolicy;
	}
	
	public void setAssetsAmortisationPolicy(String assetsAmortisationPolicy){
		this.assetsAmortisationPolicy = assetsAmortisationPolicy;
	}
	
	public void setValuationInformationPolicy(String  valuationInformationPolicy){
		this.valuationInformationPolicy = valuationInformationPolicy;
	}
	
	public void setOtherAccountingPolicies(String otherAccountingPolicies){
		this.otherAccountingPolicies = otherAccountingPolicies;
	}
	
	public String getPreparationStatement(){
		return this.preparationStatement;
	}
	
	public String getOtherPreparation(){
		return this.customStatement;
	}
	
	public String getTurnoverPolicy(){
		return this.turnoverPolicy;
	}
	
	public String getAssetsDepreciationPolicy(){
		return this.assetsDepreciationPolicy;
	}
	
	public String getAssetsAmortisationPolicy(){
		return this.assetsAmortisationPolicy;
	}
	
	public String getValuationInformationPolicy(){
		return this.valuationInformationPolicy;
	}
	
	public String getOtherAccountingPolicies(){
		return this.otherAccountingPolicies;
	}
	
	public void cleanupPreparationStatement(){
		if (this.preparationStatement.equals("custom")){
			this.preparationStatement = this.customStatement;
		}
		else{
			this.customStatement = null;
		}
	}

}