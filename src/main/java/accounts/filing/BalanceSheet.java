package accounts.filing;


public class BalanceSheet {
    
	private int currentIntangibleAssets;
	private int currentTangibleAssets;
	private int currentInvestments;
	private int currentTotalFixedAssets;
				
	private int previousIntangibleAssets;
	private int previousTangibleAssets;
	private int previousInvestments;
	private int previousTotalFixedAssets;
	
	
	
	public BalanceSheet(int currentIntangibleAssets, int currentTangibleAssets, int currentInvestments,
			int currentTotalFixedAssets, int previousIntangibleAssets, int previousTangibleAssets,
			int previousInvestments, int previousTotalFixedAssets) {
		super();
		this.currentIntangibleAssets = currentIntangibleAssets;
		this.currentTangibleAssets = currentTangibleAssets;
		this.currentInvestments = currentInvestments;
		this.currentTotalFixedAssets = currentTotalFixedAssets;
		this.previousIntangibleAssets = previousIntangibleAssets;
		this.previousTangibleAssets = previousTangibleAssets;
		this.previousInvestments = previousInvestments;
		this.previousTotalFixedAssets = previousTotalFixedAssets;
	}
	
	public BalanceSheet() {
		// TODO Auto-generated constructor stub
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
	public int getCurrentInvestments() {
		return currentInvestments;
	}
	public void setCurrentInvestments(int currentInvestments) {
		this.currentInvestments = currentInvestments;
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
	public int getPreviousInvestments() {
		return previousInvestments;
	}
	public void setPreviousInvestments(int previousInvestments) {
		this.previousInvestments = previousInvestments;
	}
	public int getPreviousTotalFixedAssets() {
		return previousTotalFixedAssets;
	}
	public void setPreviousTotalFixedAssets(int previousTotalFixedAssets) {
		this.previousTotalFixedAssets = previousTotalFixedAssets;
	}

	@Override
	public String toString() {
		return "BalanceSheetModel [currentIntangibleAssets=" + currentIntangibleAssets + ", currentTangibleAssets="
				+ currentTangibleAssets + ", currentInvestments=" + currentInvestments + ", currentTotalFixedAssets="
				+ currentTotalFixedAssets + ", previousIntangibleAssets=" + previousIntangibleAssets
				+ ", previousTangibleAssets=" + previousTangibleAssets + ", previousInvestments="
				+ previousInvestments + ", previousTotalFixedAssets=" + previousTotalFixedAssets + "]";
	}


}


