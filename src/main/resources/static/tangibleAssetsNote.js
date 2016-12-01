$(function() {
		
	// Cost
	attachOnChangeListener([$('#tangible-cost-at-start'),  $('#tangible-cost-additions'),  $('#tangible-cost-revaluations'), $('#tangible-cost-transfers')], [$('#tangible-cost-disposals')],  'tangible-cost-at-end')

	// Depreciation
	attachOnChangeListener([$('#tangible-depreciation-at-start'),  $('#tangible-depreciation-charge-for-year'),  $('#tangible-depreciation-other-adjustments')], [$('#tangible-depreciation-on-disposals')],  'tangible-depreciation-at-end')
	
	// Net book value current
	attachOnChangeListener([$('#tangible-cost-at-end')], [$('#tangible-depreciation-at-end')],  'tangible-net-book-value-end')

	// Net book value previous
	attachOnChangeListener([$('#tangible-cost-at-start')], [$('#tangible-depreciation-at-start')],  'tangible-net-book-value-start')
	
		$(".grid-row").focusin(function() {	
		var $this = $(this);
		$('details').removeAttr('open');
		$this.find('details').attr('open', 'true')
		})
		
	
});


