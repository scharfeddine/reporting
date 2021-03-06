(function($)
{
	if (!Modernizr.touch && $('#menu').is(':visible'))
		$('body').removeClass('menu-hidden');

	if (Modernizr.touch)
		$('#menu').removeClass('hidden-xs');

	// handle menu toggle button action
	window.toggleMenuHidden = function()
	{
		$('body').toggleClass('menu-hidden');
		$('#menu').toggleClass('hidden-xs');

		resizeNiceScroll();
	}

	// main menu visibility toggle
	$('.navbar .btn-navbar').click(function(e)
	{
		e.preventDefault();
		toggleMenuHidden();
	});
	
	$(window).on('load', function()
	{
		
	});
})(jQuery);