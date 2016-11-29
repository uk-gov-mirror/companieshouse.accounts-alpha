package accounts.filing.models;


public class TangibleAssetsNote {
	
	private Integer costAtStart;
	private Integer additions;
	private Integer disposals;
	private Integer revaluations;
	private Integer transfers;
	private Integer costAtEnd;
	
	
	private Integer depreciationAtStart;
	private Integer chargeForYear;
	private Integer onDisposals;
	private Integer otherAdjustments;
	private Integer depreciationAtEnd;
	
	private Integer netBookValueStart;
	private Integer netBookValueEnd;
	
	private String additionalInfo;
	

	
	public TangibleAssetsNote() {}



	public Integer getCostAtStart() {
		return costAtStart;
	}



	public void setCostAtStart(Integer costAtStart) {
		this.costAtStart = costAtStart;
	}



	public Integer getAdditions() {
		return additions;
	}



	public void setAdditions(Integer additions) {
		this.additions = additions;
	}



	public Integer getDisposals() {
		return disposals;
	}



	public void setDisposals(Integer disposals) {
		this.disposals = disposals;
	}



	public Integer getRevaluations() {
		return revaluations;
	}



	public void setRevaluations(Integer revaluations) {
		this.revaluations = revaluations;
	}



	public Integer getTransfers() {
		return transfers;
	}



	public void setTransfers(Integer transfers) {
		this.transfers = transfers;
	}



	public Integer getCostAtEnd() {
		return costAtEnd;
	}



	public void setCostAtEnd(Integer costAtEnd) {
		this.costAtEnd = costAtEnd;
	}



	public Integer getDepreciationAtStart() {
		return depreciationAtStart;
	}



	public void setDepreciationAtStart(Integer depreciationAtStart) {
		this.depreciationAtStart = depreciationAtStart;
	}



	public Integer getChargeForYear() {
		return chargeForYear;
	}



	public void setChargeForYear(Integer chargeForYear) {
		this.chargeForYear = chargeForYear;
	}



	public Integer getOnDisposals() {
		return onDisposals;
	}



	public void setOnDisposals(Integer onDisposals) {
		this.onDisposals = onDisposals;
	}



	public Integer getOtherAdjustments() {
		return otherAdjustments;
	}



	public void setOtherAdjustments(Integer otherAdjustments) {
		this.otherAdjustments = otherAdjustments;
	}



	public Integer getDepreciationAtEnd() {
		return depreciationAtEnd;
	}



	public void setDepreciationAtEnd(Integer depreciationAtEnd) {
		this.depreciationAtEnd = depreciationAtEnd;
	}



	public Integer getNetBookValueStart() {
		return netBookValueStart;
	}



	public void setNetBookValueStart(Integer netBookValueStart) {
		this.netBookValueStart = netBookValueStart;
	}



	public Integer getNetBookValueEnd() {
		return netBookValueEnd;
	}



	public void setNetBookValueEnd(Integer netBookValueEnd) {
		this.netBookValueEnd = netBookValueEnd;
	}



	public String getAdditionalInfo() {
		return additionalInfo;
	}



	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}


}