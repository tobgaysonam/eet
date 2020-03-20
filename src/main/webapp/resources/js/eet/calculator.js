calculator = (function () {
    "use strict";
    var form = $('#calculatorFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'calculator/';
    }

    function calculate() {
        $('#btnCalculate').on('click', function () {
            $('.field').val('');
            var firstNumber = parseFloat($('#firstNumber').val());
            var secondNumber = parseFloat($('#secondNumber').val());
            var operator = parseFloat($('#operator').val());

            var addition = parseFloat(firstNumber)+ parseFloat(secondNumber);
            var subtraction = parseFloat(firstNumber) - parseFloat(secondNumber);
            var multiplication = parseFloat(firstNumber) * parseFloat(secondNumber);
            var division = parseFloat(firstNumber) / parseFloat(secondNumber);

            $('#addition').val(addition);
            $('#subtraction').val(subtraction);
            $('#multiplication').val(multiplication);
            $('#division').val(division);
        });
    }


    return {
        calculate: calculate
    }
})
();
$(document).ready(
    function () {
        calculator.calculate();
    });
