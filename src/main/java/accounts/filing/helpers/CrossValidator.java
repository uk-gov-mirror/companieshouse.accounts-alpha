package accounts.filing.helpers;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import accounts.filing.models.BalanceSheet;
import accounts.filing.models.TangibleAssetsNote;

@Service
public class CrossValidator {
    
	public CrossValidator(){}
	
	public void tangibleAssetsNoteValidate( BindingResult result, BalanceSheet balanceSheet, TangibleAssetsNote tangibleAssetsNote )
	{

		if (!balanceSheet.getCurrentTangibleAssets().equals(tangibleAssetsNote.getNetBookValueEnd())){
			result.rejectValue("netBookValueEnd", "tangibleAssetsNote", "Make sure the net book value at the end of current period you are filing for matches tangible assets for this period.");
		}
		
		if (!balanceSheet.getPreviousTangibleAssets().equals(tangibleAssetsNote.getNetBookValueStart())){
			result.rejectValue("netBookValueStart", "tangibleAssetsNote", "Make sure the net book value at the end of previous period you are filing for matches tangible assets for this period.");
		}
	}
	
}


