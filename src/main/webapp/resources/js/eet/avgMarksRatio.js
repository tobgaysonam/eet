avgMarksRatio = (function () {
    "use strict";
    var form = $('#avgMarksRatioFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'avgMarksRatio/';
    }

    function getAvgMarksRatioList() {
        var url = _baseURL() + "getAvgMarksRatioList";
        $.ajax({
            url: url,
            type: 'GET',
            success: function (res) {
                if (res.responseStatus === 1) {
                    $('#englishMarksMale').text(res.responseDTO.englishMarksMale);
                    $('#englishMarksFemale').text(res.responseDTO.englishMarksFemale);
                    $('#dzongkhaMarksMale').text(res.responseDTO.dzongkhaMarksMale);
                    $('#dzongkhaMarksFemale').text(res.responseDTO.dzongkhaMarksFemale);
                } else {
                    warningMsg(res.responseText);
                }
            }
        });
    }


    return {
        getAvgMarksRatioList: getAvgMarksRatioList
    }
})
();
$(document).ready(
    function () {
        avgMarksRatio.getAvgMarksRatioList();
    });
