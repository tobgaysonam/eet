guestLog = (function () {
    "use strict";
    var form = $('#guestLogFormId');
    var isSubmitted = false;

    function _baseURL() {
        return 'guestLog/';
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
        $('#documentListTableId tbody').on('click', 'tr .documentTypeId', function () {
            $('#documentErrorMsg').text('');
            var row = $(this).closest('tr');
            var selectedRow = row.addClass('selected');
            var documentId = selectedRow.find('.documentTypeId').val();
            var isChecked = $(this).prop('checked');
            var url = _baseURL() + 'getChargeByDocumentId';
            $.ajax({
                url: url
                , type: 'GET'
                , data: {documentId: documentId}
                , success: function (res) {
                    calculateCharge(res, isChecked);
                }
            });
            selectedRow.removeClass('selected');
        });
    }

    function getDocumentList() {
        var url = _baseURL() + 'getDocumentList';
        $.ajax({
            url: url,
            type: 'GET',
            success: function (res) {
                if (res.responseStatus == 1) {
                    var data = res.responseDTO;
                    for (var i = 0; i < data.length; i++) {
                        var documentTypeId = data[i].valueInteger;
                        var documentName = data[i].text;
                        var row = '<tr style="border-top: hidden">' +
                            '<td><input type="checkbox" name="appliedDocumentDTOs[' + i + '].documentTypeId" ' +
                            'value="' + documentTypeId + '" id="documentTypeId' + i + '" class="documentTypeId"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
                            '<label for="documentTypeId' + i + '">' + documentName + '</label></td>' +
                            '</tr>';
                        $('#documentListTableId tbody').append(row);
                    }
                } else {
                    $('#documentList').append('<div class="col-sm-6"><font color="red">Document list not available at the moment.</font></div>');
                }
            }
        });
    }


    function addMoreAttachment() {
        $('#fileAttachmentTableId tbody').on('click', '#btnAddMore', function () {
            var row = "<tr style='border-top: hidden'>" +
                "<td>" + "<input type='file' id ='attachedFile' class='attachedFile' name ='fileAttachmentDTOs[0].attachedFile' required accept='image/jpeg,image/png,.doc,.docx,.pdf,.xlsx,.xls'/>" + "</td>" +
                "<td>" + "<button class='btn btn-sm btn-danger' type='button' id='btnRemove'><i class='fa fa-times'>Delete</i></button> &nbsp;&nbsp;&nbsp;&nbsp;" +
                "<button class='btn btn-sm btn-success' type='button' id='btnAddMore'><i class='fa fa-plus'>Add More</i></button>" + "</td>" +
                "</tr>";
            $('#fileAttachmentTableId tbody').append(row);
            $(this).addClass('hidden');
            $('#btnRemove').removeClass('hidden');
            formIndexing($('#fileAttachmentTableId tbody'), $('#fileAttachmentTableId tbody').find('tr'));
        });
    }

    function deleteAttachment() {
        $('#fileAttachmentTableId tbody').on('click', 'tr #btnRemove', function () {
            var rowLen = $('#fileAttachmentTableId tbody tr').length;
            $(this).closest('tr').remove();
            if (rowLen == 2) {
                $('#fileAttachmentTableId tr').last().find('#btnRemove').addClass('hidden');
            }
            $('#fileAttachmentTableId tr').last().find('#btnAddMore').removeClass('hidden');
            formIndexing($('#fileAttachmentTableId tbody'), $('#fileAttachmentTableId tbody').find('tr'));
        });
    }

    function checkFileSize() {
        $('#fileAttachmentTableId tbody').on('change', 'tr input[type=file]', function () {
            if ($('#attachedFile')[0].files.length > 0) {
                if ($('#attachedFile')[0].files[0].size < 20971520 == false) {
                    warningMsg('File too large. Please attach file size less than 20 MB.');
                    $('#attachedFile').val('');
                }
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
        , addMoreAttachment: addMoreAttachment
        , checkFileSize: checkFileSize
        , deleteAttachment: deleteAttachment
        ,saveGuestLog: saveGuestLog
    }
})
();
$(document).ready(
    function () {
        $('.field').val('');
        guestLog.fetchCitizenDetails();
        guestLog.addMoreAttachment();
        guestLog.checkFileSize();
        guestLog.deleteAttachment();
        guestLog.saveGuestLog();
        guestLog.fetchExistingGuestLogDetails();
    });
