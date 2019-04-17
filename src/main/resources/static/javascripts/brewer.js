$(function() {
	var decimal = $('.js-decimal');
	decimal.maskMoney();

	var plain = $('.js-plain');
	decimal.maskMoney({
		precion : 0
	});
});