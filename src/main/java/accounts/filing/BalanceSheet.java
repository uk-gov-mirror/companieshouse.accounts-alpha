package accounts.filing;


public class BalanceSheet {
    
	// Fixed assets
	private int currentIntangibleAssets;
	private int currentTangibleAssets;
	private int currentFixedInvestments;
	private int currentTotalFixedAssets;
				
	private int previousIntangibleAssets;
	private int previousTangibleAssets;
	private int previousFixedInvestments;
	private int previousTotalFixedAssets;
	
	// Current assets
	private int currentStocks;
	private int currentDebtors;
	private int currentCABAIH;
	private int currentInvestments;
	private int currentTotalAssets;
				
	private int previousStocks;
	private int previousDebtors;
	private int previousCABAIH;
	private int previousInvestments;
	private int previousTotalAssets;
	
	
	public BalanceSheet(){}
	
	public BalanceSheet(int currentIntangibleAssets, int currentTangibleAssets, int currentFixedInvestments,
			int currentTotalFixedAssets, int previousIntangibleAssets, int previousTangibleAssets,
			int previousFixedInvestments, int previousTotalFixedAssets, int currentStocks, int currentDebtors,
			int currentCABAIH, int currentInvestments, int currentTotalAssets, int previousStocks, int previousDebtors,
			int previousCABAIH, int previousInvestments, int previousTotalAssets) {
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
		this.currentCABAIH = currentCABAIH;
		this.currentInvestments = currentInvestments;
		this.currentTotalAssets = currentTotalAssets;
		this.previousStocks = previousStocks;
		this.previousDebtors = previousDebtors;
		this.previousCABAIH = previousCABAIH;
		this.previousInvestments = previousInvestments;
		this.previousTotalAssets = previousTotalAssets;
	}

	public int getCurrentIntangibleAssets() {
		return currentIntangibleAssets;
	}

	public void setCurrentIntangibleAssets(int currentIntangibleAssets) {
		this.currentIntangibleAssets = currentIntangibleAssets;
	}

	public int getCurrentTangibleAssets() {
		return currentTangibleAssets;
	}

	public void setCurrentTangibleAssets(int currentTangibleAssets) {
		this.currentTangibleAssets = currentTangibleAssets;
	}

	public int getCurrentFixedInvestments() {
		return currentFixedInvestments;
	}

	public void setCurrentFixedInvestments(int currentFixedInvestments) {
		this.currentFixedInvestments = currentFixedInvestments;
	}

	public int getCurrentTotalFixedAssets() {
		return currentTotalFixedAssets;
	}

	public void setCurrentTotalFixedAssets(int currentTotalFixedAssets) {
		this.currentTotalFixedAssets = currentTotalFixedAssets;
	}

	public int getPreviousIntangibleAssets() {
		return previousIntangibleAssets;
	}

	public void setPreviousIntangibleAssets(int previousIntangibleAssets) {
		this.previousIntangibleAssets = previousIntangibleAssets;
	}

	public int getPreviousTangibleAssets() {
		return previousTangibleAssets;
	}

	public void setPreviousTangibleAssets(int previousTangibleAssets) {
		this.previousTangibleAssets = previousTangibleAssets;
	}

	public int getPreviousFixedInvestments() {
		return previousFixedInvestments;
	}

	public void setPreviousFixedInvestments(int previousFixedInvestments) {
		this.previousFixedInvestments = previousFixedInvestments;
	}

	public int getPreviousTotalFixedAssets() {
		return previousTotalFixedAssets;
	}

	public void setPreviousTotalFixedAssets(int previousTotalFixedAssets) {
		this.previousTotalFixedAssets = previousTotalFixedAssets;
	}

	public int getCurrentStocks() {
		return currentStocks;
	}

	public void setCurrentStocks(int currentStocks) {
		this.currentStocks = currentStocks;
	}

	public int getCurrentDebtors() {
		return currentDebtors;
	}

	public void setCurrentDebtors(int currentDebtors) {
		this.currentDebtors = currentDebtors;
	}

	public int getCurrentCABAIH() {
		return currentCABAIH;
	}

	public void setCurrentCABAIH(int currentCABAIH) {
		this.currentCABAIH = currentCABAIH;
	}

	public int getCurrentInvestments() {
		return currentInvestments;
	}

	public void setCurrentInvestments(int currentInvestments) {
		this.currentInvestments = currentInvestments;
	}

	public int getCurrentTotalAssets() {
		return currentTotalAssets;
	}

	public void setCurrentTotalAssets(int currentTotalAssets) {
		this.currentTotalAssets = currentTotalAssets;
	}

	public int getPreviousStocks() {
		return previousStocks;
	}

	public void setPreviousStocks(int previousStocks) {
		this.previousStocks = previousStocks;
	}

	public int getPreviousDebtors() {
		return previousDebtors;
	}

	public void setPreviousDebtors(int previousDebtors) {
		this.previousDebtors = previousDebtors;
	}

	public int getPreviousCABAIH() {
		return previousCABAIH;
	}

	public void setPreviousCABAIH(int previousCABAIH) {
		this.previousCABAIH = previousCABAIH;
	}

	public int getPreviousInvestments() {
		return previousInvestments;
	}

	public void setPreviousInvestments(int previousInvestments) {
		this.previousInvestments = previousInvestments;
	}

	public int getPreviousTotalAssets() {
		return previousTotalAssets;
	}

	public void setPreviousTotalAssets(int previousTotalAssets) {
		this.previousTotalAssets = previousTotalAssets;
	}
	
	
	
	
	
	
	

}


