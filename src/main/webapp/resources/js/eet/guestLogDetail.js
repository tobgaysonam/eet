guestLogDetail = (function () {
    "use strict";
    var form = $('#guestLogFormId');
    var isSubmitted = false;

    function _baseURL() {
        return 'guestLogDetail/';
    }

    function validatePersonalDetail() {
        var retval = true;
        if ($('#IdentificationTypeId').val() == "") {
            $('#IdentificationTypeId').addClass('error');
            $('#IdentificationTypeIdErrorMsg').html('Identification type is required');
            retval = false;
        }
        if ($('#identificationNo').val() == "") {
            $('#identificationNo').addClass('error');
            $('#identificationNoErrorMsg').html('Identification number is required');
            retval = false;
        }
        if ($('#nationalityId').val() == "") {
            $('#nationalityId').addClass('error');
            $('#nationalityIdErrorMsg').html('Nationality is required');
            retval = false;
        }
        if ($('#name').val() == "") {
            $('#name').addClass('error');
            $('#nameErrorMsg').html('Your name is required');
            retval = false;
        }
        if ($('#gender').val() == "") {
            $('#gender').addClass('error');
            $('#genderErrorMsg').html('Gender is required');
            retval = false;
        }
        if ($('#age').val() == "") {
            $('#age').addClass('error');
            $('#ageErrorMsg').html('Age is required');
            retval = false;
        }
        if ($('#presentAddress').val() == "") {
            $('#presentAddress').addClass('error');
            $('#presentAddressErrorMsg').html('Present address is required');
            retval = false;
        }
        if ($('#contactNo').val() == "") {
            $('#contactNo').addClass('error');
            $('#contactNoErrorMsg').html('Contact number is required');
            retval = false;
        }
        if ($('#exitReasonId').val() == "") {
            $('#exitReasonId').addClass('error');
            $('#exitReasonIdErrorMsg').html('Select reason type');
            retval = false;
        }
        if ($('#reasons').val() == "") {
            $('#reasons').addClass('error');
            $('#reasonsErrorMsg').html('Reason is required');
            retval = false;
        }
        if ($('#temperature').val() == "") {
            $('#temperature').addClass('error');
            $('#temperatureErrorMsg').html('Temperature is required');
            retval = false;
        }
        return retval;
    }
    function onChangeReason(value) {
        if (value == "2")
            $("#NextEntryDiv").hide();
        else
            $("#NextEntryDiv").show();
    }
    function onChangeReason(){
        $('#exitReasonId').on('Click', function () {
            var exitReasonId = $(this).val();
            if(exitReasonId =='2'){
                $("#NextEntryDiv").show();
            } else {
                $("#NextEntryDiv").hide();
            }
        });
    }

    function fetchCitizenDetails() {
        $('#identificationNo').on('change', function () {
            var identificationNo = $(this).val();
                if (identificationNo != '') {
                   
                    var url = _baseURL() + 'getCitizenDetails';
                    $.ajax({
                        url: url,
                        type: 'GET',
                        data: {cidNo: identificationNo},
                        success: function (res) {
                            var data = res.responseDTO;
                            if (res.responseStatus == 1) {
                                $('#identificationNoErrorMsg').html('');
                                $('#name').val(data.name);
                                $('#gender').val(data.gender);
                                $('#age').val(data.age);

                            } else {
                                $('#identificationNoErrorMsg').html(res.responseText);
                                $('#name').val('');
                                $('#cidNo').val('');
                                $('#cidNo').addClass('error');
                            }
                        }
                    });
                } else {
                    $('#name').val();
                    $('#gender').val();
                    $('#age').val();
                }
        });
    }

    function fetchExistingGuestLogDetails() {
        $('#identificationNo').on('Click', function () {
            var identificationNo = $(this).val();
            if (identificationNo != '') {
                var url = _baseURL() + 'fetchExistingGuestLogDetails';
                $.ajax({
                    url: url,
                    type: 'GET',
                    data: {cidNo: identificationNo},
                    success: function (res) {
                        var data = res.responseDTO;
                        if (res.responseStatus == 1) {
                            populate(data);
                        } else {
                            $('#identificationNoErrorMsg').html(res.responseText);
                            $('#name').val('');
                            $('#cidNo').val('');
                            $('#cidNo').addClass('error');
                        }
                    }
                });
            } else {
                $('#name').val();
                $('#gender').val();
                $('#age').val();
            }
        });
    }

    function removeErrorMsg() {
        $('#cidNo').on('keyup blur', function () {
            var cid = $(this).val();
            if (cid != '') {
                $('#cidNo').removeClass('error');
                $('#cidNoErrorMsg').text('');
            }
        });
        $('#religion').on('keyup blur', function () {
            var cid = $(this).val();
            if (cid != '') {
                $('#religion').removeClass('error');
                $('#religionErrorMsg').text('');
            }
        });
        $('#spouseCidNo').on('keyup blur', function () {
            var cid = $(this).val();
            if (cid != '') {
                $('#spouseCidNo').removeClass('error');
                $('#spouseCidNoErrorMsg').text('');
            }
        });
        $('#spouseReligion').on('keyup blur', function () {
            var cid = $(this).val();
            if (cid != '') {
                $('#spouseReligion').removeClass('error');
                $('#spouseReligionErrorMsg').text('');
            }
        });
        $('#confirmChild').on('keyup blur', function () {
            var cid = $(this).val();
            if (cid != '') {
                $('#confirmChild').removeClass('error');
                $('#confirmChildErrorMsg').text('');
            }
        });
        $('#childName').on('keyup blur', function () {
            var cid = $(this).val();
            if (cid != '') {
                $('#childName').removeClass('error');
                $('#childNameErrorMsg').text('');
            }
        });
        $('#childDob').on('keyup blur', function () {
            var cid = $(this).val();
            if (cid != '') {
                $('#childDob').removeClass('error');
                $('#childDobErrorMsg').text('');
            }
        });
        $('#childGender').on('keyup blur', function () {
            var cid = $(this).val();
            if (cid != '') {
                $('#childGender').removeClass('error');
                $('#childGenderErrorMsg').text('');
            }
        });
        $('#mobileNo').on('keyup blur', function () {
            var val = $(this).val();
            if (val != '') {
                $('#mobileNo').removeClass('error');
                $('#mobileNoErrorMsg').text('');
            }
        });
        $('#courtId').on('keyup blur', function () {
            var val = $(this).val();
            if (val != '') {
                $('#courtId').removeClass('error');
                $('#courtIdErrorMsg').text('');
            }
        });
        $('#address').on('keyup blur', function () {
            var val = $(this).val();
            if (val != '') {
                $('#address').removeClass('error');
                $('#addressErrorMsg').text('');
            }
        });
        $('#email').on('keyup blur', function () {
            var val = $(this).val();
            if (val != '') {
                $('#email').removeClass('error');
                $('#emailErrorMsg').text('');
            }
        });
        $('#reason').on('keyup blur', function () {
            var val = $(this).val();
            if (val != '') {
                $('#reason').removeClass('error');
                $('#reasonErrorMsg').text('');
            }
        });
    }

    function saveGuestLog() {
        $('#btnSubmit').on('click', function () {
            $('#guestLogFormId').validate({
                submitHandler: function (form) {
                    var url = _baseURL() + 'saveGuestLog';
                    var formData = new FormData(form);
                    if (isSubmitted) {
                        errorMsg('Your request is processing. Please wait...');
                        return;
                    }
                    isSubmitted = true;
                    $('#btnSubmit').attr('disabled', true);
                    $.ajax({
                        url: url,
                        type: 'POST',
                        data: formData,
                        enctype: 'multipart/form-data',
                        contentType: false,
                        processData: false,
                        success: function (res) {
                            if (res.responseStatus == 1) {
                                alert("Submitted Successfully")
                                $('.field').val('');
                            } else {
                                warningMsg(res.responseText);
                            }
                        },
                        complete: function () {
                            isSubmitted = false;
                            $('#btnSubmit').attr('disabled', false);
                        },
                        error: function (res) {
                            errorMsg(res.responseText);
                        }
                    });
                }
            });
        });
    }


    return {
        fetchCitizenDetails: fetchCitizenDetails
        , fetchExistingGuestLogDetails: fetchExistingGuestLogDetails
        ,saveGuestLog: saveGuestLog
    }
})
();
$(document).ready(
    function () {
        $('.field').val('');
        guestLogDetail.fetchCitizenDetails();
        guestLogDetail.saveGuestLog();
        guestLogDetail.fetchExistingGuestLogDetails();
    });
