cutoffMarks = (function () {
    "use strict";
    var form = $('#cutoffMarksFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'cutoffMarks/';
    }

    function getStudentList() {
            var url = _baseURL() + "getStudentList";
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
                            , {"data": "dzongkha", class: "dzongkha"}
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
        getStudentList: getStudentList
    }
})
();
$(document).ready(
    function () {
        cutoffMarks.getStudentList();
    });
