topThreeEnglish = (function () {
    "use strict";
    var form = $('#topThreeEnglishFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'topThreeEnglish/';
    }

    function getTopThreeStudentList() {
        var url = _baseURL() + "getTopThreeStudentList";
        $.ajax({
            url: url,
            type: 'GET',
            success: function (res) {
                if (res.responseStatus === 1) {
                    var data = res.responseDTO;
                    var dataTableDefinition = [
                        {
                            class: "slNo"
                            , "mRender": function (data, type, row, meta) {
                            return meta.row + 1;
                        }
                        }
                        , {"data": "studentName", class: "studentName"}
                        , {"data": "indexNo", class: "indexNo"}
                        , {"data": "english", class: "english"}
                    ];
                    $('#resultTableId').DataTable({
                        data: data
                        , columns: dataTableDefinition
                        , destroy: true
                        , bSort: false
                        , filter: true
                        , pageLength: 100
                        , paginate: false
                        , bInfo: false
                    });
                } else {
                    warningMsg(res.responseText);
                }
            }
        });
    }


    return {
        getTopThreeStudentList: getTopThreeStudentList
    }
})
();
$(document).ready(
    function () {
        topThreeEnglish.getTopThreeStudentList();
    });
