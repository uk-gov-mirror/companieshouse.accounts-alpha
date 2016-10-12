function calculateBalanceSheetSectionTotal($total, $val1, $val2, $val3){

$val1.add($val2).add($val3).on('change', function () 
		{
			$total.val(
					+$val1.val() + +$val2.val() + +$val3.val()
					);
			}
);
}

$(function() {
		
			calculateBalanceSheetSectionTotal($('#total-fixed-assets-current') ,$('#intangible-assets-current'),  $('#tangible-assets-current'),  $('#investments-fixed-assets-current'));
			calculateBalanceSheetSectionTotal($('#total-fixed-assets-previous') ,$('#intangible-assets-previous'),  $('#tangible-assets-previous'),  $('#investments-fixed-assets-previous'));
	}
);
