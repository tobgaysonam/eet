$(document).ready(function () {

    if (document.URL.search("calculator") > 1)
        scriptLoader("/resources/js/eet/calculator.js");

    if (document.URL.search("average") > 1)
        scriptLoader("/resources/js/eet/average.js");

    if (document.URL.search("studentDetail") > 1)
        scriptLoader("/resources/js/eet/studentDetail.js");

    if (document.URL.search("cutoffMarks") > 1)
        scriptLoader("/resources/js/eet/cutoffMarks.js");

    if (document.URL.search("topThreeEnglish") > 1)
        scriptLoader("/resources/js/eet/topThreeEnglish.js");

    if (document.URL.search("avgMarksRatio") > 1)
        scriptLoader("/resources/js/eet/avgMarksRatio.js");

});

var scriptLoader = function (url) {
    $.ajax(
        {
            type: "GET",
            url: url,
            dataType: "script",
            cache: false
        });
};

