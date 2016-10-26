package accounts.filing;


public class BalanceSheet {
    
	// Fixed assets
	private Integer currentIntangibleAssets;
	private Integer currentTangibleAssets;
	private Integer currentFixedInvestments;
	private Integer currentTotalFixedAssets;
				
	private Integer previousIntangibleAssets;
	private Integer previousTangibleAssets;
	private Integer previousFixedInvestments;
	private Integer previousTotalFixedAssets;
	
	// Current assets
	private Integer currentStocks;
	private Integer currentDebtors;
	private Integer currentCash;
	private Integer currentInvestments;
	private Integer currentTotalAssets;
				
	private Integer previousStocks;
	private Integer previousDebtors;
	private Integer previousCash;
	private Integer previousInvestments;
	private Integer previousTotalAssets;
	
	// Liabilities
	
	private Integer currentCreditorsOneYear;
	private Integer currentNetAssets;
	private Integer currentTotalAssetsMinusCurrentLiabilities;
	private Integer currentCreditorsMoreYears;
	private Integer currentProvisionLiabilities;
	private Integer currentTotalNetAssetsLiabilities;
				
	private Integer previousCreditorsOneYear;
	private Integer previousNetAssets;
	private Integer previousTotalAssetsMinusCurrentLiabilities;
	private Integer previousCreditorsMoreYears;
	private Integer previousProvisionLiabilities;
	private Integer previousTotalNetAssetsLiabilities;
	
	
	public BalanceSheet(){}
	
	public BalanceSheet(Integer currentIntangibleAssets, Integer currentTangibleAssets, Integer currentFixedInvestments,
			Integer currentTotalFixedAssets, Integer previousIntangibleAssets, Integer previousTangibleAssets,
			Integer previousFixedInvestments, Integer previousTotalFixedAssets, Integer currentStocks, Integer currentDebtors,
			Integer currentCash, Integer currentInvestments, Integer currentTotalAssets, Integer previousStocks, Integer previousDebtors,
			Integer previousCash, Integer previousInvestments, Integer previousTotalAssets) {
		super();
		this.currentIntangibleAssets = currentIntangibleAssets;
		this.currentTangibleAssets = currentTangibleAssets;
		this.currentFixedInvestments = currentFixedInvestments;
		this.currentTotalFixedAssets = currentTotalFixedAssets;
		this.previousIntangibleAssets = previousIntangibleAssets;
		this.previousTangibleAssets = previousTangibleAssets;
		this.previousFixedInvestments = previousFixedInvestments;
		this.previousTotalFixedAssets = previousTotalFixedAssets;
		this.currentStocks = currentStocks;
		this.currentDebtors = currentDebtors;
		this.currentCash = currentCash;
		this.currentInvestments = currentInvestments;
		this.currentTotalAssets = currentTotalAssets;
		this.previousStocks = previousStocks;
		this.previousDebtors = previousDebtors;
		this.previousCash = previousCash;
		this.previousInvestments = previousInvestments;
		this.previousTotalAssets = previousTotalAssets;
	}

	public Integer getCurrentIntangibleAssets() {
		return currentIntangibleAssets;
	}

	public void setCurrentIntangibleAssets(Integer currentIntangibleAssets) {
		this.currentIntangibleAssets = currentIntangibleAssets;
	}

	public Integer getCurrentTangibleAssets() {
		return currentTangibleAssets;
	}

	public void setCurrentTangibleAssets(Integer currentTangibleAssets) {
		this.currentTangibleAssets = currentTangibleAssets;
	}

	public Integer getCurrentFixedInvestments() {
		return currentFixedInvestments;
	}

	public void setCurrentFixedInvestments(Integer currentFixedInvestments) {
		this.currentFixedInvestments = currentFixedInvestments;
	}

	public Integer getCurrentTotalFixedAssets() {
		return currentTotalFixedAssets;
	}

	public void setCurrentTotalFixedAssets(Integer currentTotalFixedAssets) {
		this.currentTotalFixedAssets = currentTotalFixedAssets;
	}

	public Integer getPreviousIntangibleAssets() {
		return previousIntangibleAssets;
	}

	public void setPreviousIntangibleAssets(Integer previousIntangibleAssets) {
		this.previousIntangibleAssets = previousIntangibleAssets;
	}

	public Integer getPreviousTangibleAssets() {
		return previousTangibleAssets;
	}

	public void setPreviousTangibleAssets(Integer previousTangibleAssets) {
		this.previousTangibleAssets = previousTangibleAssets;
	}

	public Integer getPreviousFixedInvestments() {
		return previousFixedInvestments;
	}

	public void setPreviousFixedInvestments(Integer previousFixedInvestments) {
		this.previousFixedInvestments = previousFixedInvestments;
	}

	public Integer getPreviousTotalFixedAssets() {
		return previousTotalFixedAssets;
	}

	public void setPreviousTotalFixedAssets(Integer previousTotalFixedAssets) {
		this.previousTotalFixedAssets = previousTotalFixedAssets;
	}

	public Integer getCurrentStocks() {
		return currentStocks;
	}

	public void setCurrentStocks(Integer currentStocks) {
		this.currentStocks = currentStocks;
	}

	public Integer getCurrentDebtors() {
		return currentDebtors;
	}

	public void setCurrentDebtors(Integer currentDebtors) {
		this.currentDebtors = currentDebtors;
	}

	public Integer getCurrentCash() {
		return currentCash;
	}

	public void setCurrentCash(Integer currentCash) {
		this.currentCash = currentCash;
	}

	public Integer getCurrentInvestments() {
		return currentInvestments;
	}

	public void setCurrentInvestments(Integer currentInvestments) {
		this.currentInvestments = currentInvestments;
	}

	public Integer getCurrentTotalAssets() {
		return currentTotalAssets;
	}

	public void setCurrentTotalAssets(Integer currentTotalAssets) {
		this.currentTotalAssets = currentTotalAssets;
	}

	public Integer getPreviousStocks() {
		return previousStocks;
	}

	public void setPreviousStocks(Integer previousStocks) {
		this.previousStocks = previousStocks;
	}

	public Integer getPreviousDebtors() {
		return previousDebtors;
	}

	public void setPreviousDebtors(Integer previousDebtors) {
		this.previousDebtors = previousDebtors;
	}

	public Integer getPreviousCash() {
		return previousCash;
	}

	public void setPreviousCash(Integer previousCash) {
		this.previousCash = previousCash;
	}

	public Integer getPreviousInvestments() {
		return previousInvestments;
	}

	public void setPreviousInvestments(Integer previousInvestments) {
		this.previousInvestments = previousInvestments;
	}

	public Integer getPreviousTotalAssets() {
		return previousTotalAssets;
	}

	public void setPreviousTotalAssets(Integer previousTotalAssets) {
		this.previousTotalAssets = previousTotalAssets;
	}

	public Integer getCurrentCreditorsOneYear() {
		return currentCreditorsOneYear;
	}

	public void setCurrentCreditorsOneYear(Integer currentCreditorsOneYear) {
		this.currentCreditorsOneYear = currentCreditorsOneYear;
	}

	public Integer getCurrentNetAssets() {
		return currentNetAssets;
	}

	public void setCurrentNetAssets(Integer currentNetAssets) {
		this.currentNetAssets = currentNetAssets;
	}

	public Integer getCurrentTotalAssetsMinusCurrentLiabilities() {
		return currentTotalAssetsMinusCurrentLiabilities;
	}

	public void setCurrentTotalAssetsMinusCurrentLiabilities(Integer currentTotalAssetsMinusCurrentLiabilities) {
		this.currentTotalAssetsMinusCurrentLiabilities = currentTotalAssetsMinusCurrentLiabilities;
	}

	public Integer getCurrentCreditorsMoreYears() {
		return currentCreditorsMoreYears;
	}

	public void setCurrentCreditorsMoreYears(Integer currentCreditorsMoreYears) {
		this.currentCreditorsMoreYears = currentCreditorsMoreYears;
	}

	public Integer getCurrentProvisionLiabilities() {
		return currentProvisionLiabilities;
	}

	public void setCurrentProvisionLiabilities(Integer currentProvisionLiabilities) {
		this.currentProvisionLiabilities = currentProvisionLiabilities;
	}

	public Integer getCurrentTotalNetAssetsLiabilities() {
		return currentTotalNetAssetsLiabilities;
	}

	public void setCurrentTotalNetAssetsLiabilities(Integer currentTotalNetAssetsLiabilities) {
		this.currentTotalNetAssetsLiabilities = currentTotalNetAssetsLiabilities;
	}

	public Integer getPreviousCreditorsOneYear() {
		return previousCreditorsOneYear;
	}

	public void setPreviousCreditorsOneYear(Integer previousCreditorsOneYear) {
		this.previousCreditorsOneYear = previousCreditorsOneYear;
	}

	public Integer getPreviousNetAssets() {
		return previousNetAssets;
	}

	public void setPreviousNetAssets(Integer previousNetAssets) {
		this.previousNetAssets = previousNetAssets;
	}

	public Integer getPreviousTotalAssetsMinusCurrentLiabilities() {
		return previousTotalAssetsMinusCurrentLiabilities;
	}

	public void setPreviousTotalAssetsMinusCurrentLiabilities(Integer previousTotalAssetsMinusCurrentLiabilities) {
		this.previousTotalAssetsMinusCurrentLiabilities = previousTotalAssetsMinusCurrentLiabilities;
	}

	public Integer getPreviousCreditorsMoreYears() {
		return previousCreditorsMoreYears;
	}

	public void setPreviousCreditorsMoreYears(Integer previousCreditorsMoreYears) {
		this.previousCreditorsMoreYears = previousCreditorsMoreYears;
	}

	public Integer getPreviousProvisionLiabilities() {
		return previousProvisionLiabilities;
	}

	public void setPreviousProvisionLiabilities(Integer previousProvisionLiabilities) {
		this.previousProvisionLiabilities = previousProvisionLiabilities;
	}

	public Integer getPreviousTotalNetAssetsLiabilities() {
		return previousTotalNetAssetsLiabilities;
	}

	public void setPreviousTotalNetAssetsLiabilities(Integer previousTotalNetAssetsLiabilities) {
		this.previousTotalNetAssetsLiabilities = previousTotalNetAssetsLiabilities;
	}
	
	
	
	
	
	
	

}


