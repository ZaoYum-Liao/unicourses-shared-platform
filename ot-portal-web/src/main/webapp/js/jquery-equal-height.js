/*
* jQuery Equal Height
* Author: Suson Waiba
* Github: https://github.com/susonwaiba/jquery-equal-height
* URL: http://susonwaiba.com
*/
$.fn.jQueryEqualHeight = function(innerDiv) {
    if (innerDiv == undefined) {
        innerDiv = '.card';
    }
    var currentTallest = 0, currentRowStart = 0, rowDivs = new Array(), topPosition = 0;
    $(this).each(function() {
        $(this).find(innerDiv).height('auto')
        topPosition = $(this).position().top;
        if (currentRowStart != topPosition) {
            for (currentDiv = 0 ; currentDiv < rowDivs.length ; currentDiv++) {
                rowDivs[currentDiv].find(innerDiv).height(currentTallest);
            }
            rowDivs.length = 0;
            currentRowStart = topPosition;
            currentTallest = $(this).find(innerDiv).height();
            rowDivs.push($(this));
        } else {
            rowDivs.push($(this));
            currentTallest = (currentTallest < $(this).find(innerDiv).height()) ? ($(this).find(innerDiv).height()) : (currentTallest);
        }
        for (currentDiv = 0 ; currentDiv < rowDivs.length ; currentDiv++) {
            rowDivs[currentDiv].find(innerDiv).height(currentTallest);
        }
    });
};