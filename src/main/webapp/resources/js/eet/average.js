average = (function () {
    "use strict";
    var form = $('#averageFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'average/';
    }

    function calculate() {
        $('#btnOk').on('click', function () {
            var i;
            $('.field').val('');
            var countNumber = $('#countNumber').val();
            if (countNumber=='') {
                warningMsg("Please enter number");
            }
           else if (countNumber < 1 || countNumber > 100) {
                warningMsg("Please enter number greater than 1 and less than 100");
                $('#countNumber').val('');
            }else{
                for (i = 0; i < countNumber; i++) {

                }
            }
        });
    }

    return {
        calculate: calculate
    }
})
();
$(document).ready(
    function () {
        average.calculate();
    });
