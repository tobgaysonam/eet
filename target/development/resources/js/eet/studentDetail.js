studentDetail = (function () {
    "use strict";
    var form = $('#studentDetailFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'studentDetail/';
    }

    function getStudentDetail() {
        $('#btnView').on('click', function () {
            var url =  "getStudentDetail";
            var cid = $('#cid').val();
            $.ajax({
                url: url,
                type: 'GET',
                data: {cid: cid},
                success: function (res) {
                    if (res.responseStatus === 1) {
                        //populate(res.responseDTO);
                        $('#studentName').text(res.responseDTO.studentName);
                        $('#school').text(res.responseDTO.school);
                        $('#indexNo').text(res.responseDTO.indexNo);
                        $('#stream').text(res.responseDTO.stream);

                        if (res.responseDTO.mediaStudies != null) {
                            $('#mediaStudiesHidden').removeClass('hidden');
                            $('#mediaStudies').text(res.responseDTO.mediaStudies);
                        }
                        if (res.responseDTO.evs != null) {
                            $('#evsHidden').removeClass('hidden');
                            $('#evs').text(res.responseDTO.evs);
                        }
                        if (res.responseDTO.agriculture != null) {
                            $('#agricultureHidden').removeClass('hidden');
                            $('#agriculture').text(res.responseDTO.agriculture);
                        }

                        if (res.responseDTO.businessMathematics != null) {
                            $('#businessMathematicsHidden').removeClass('hidden');
                            $('#businessMathematics').text(res.responseDTO.businessMathematics);
                        }

                        if (res.responseDTO.biology != null) {
                            $('#biologyHidden').removeClass('hidden');
                            $('#biology').text(res.responseDTO.biology);
                        }
                        if (res.responseDTO.computerStudies != null) {
                            $('#computerStudiesHidden').removeClass('hidden');
                            $('#computerStudies').text(res.responseDTO.english);
                        }
                        if (res.responseDTO.physics != null) {
                            $('#physicsHidden').removeClass('hidden');
                            $('#physics').text(res.responseDTO.physics);
                        }
                        if (res.responseDTO.chemistry != null) {
                            $('#chemistryHidden').removeClass('hidden');
                            $('#chemistry').text(res.responseDTO.chemistry);
                        }
                        if (res.responseDTO.dzongkha != null) {
                            $('#dzongkhaHidden').removeClass('hidden');
                            $('#dzongkha').text(res.responseDTO.dzongkha);
                        }
                        if (res.responseDTO.english != null) {
                            $('#englishHidden').removeClass('hidden');
                            $('#english').text(res.responseDTO.english);
                        }
                        if (res.responseDTO.maths != null) {
                            $('#mathsHidden').removeClass('hidden');
                            $('#maths').text(res.responseDTO.maths);
                        }
                        if (res.responseDTO.economics != null) {
                            $('#economicsHidden').removeClass('hidden');
                            $('#economics').text(res.responseDTO.economics);
                        }
                        if (res.responseDTO.geography != null) {
                            $('#geographyHidden').removeClass('hidden');
                            $('#geography').text(res.responseDTO.geography);
                        }
                        if (res.responseDTO.history != null) {
                            $('#historyHidden').removeClass('hidden');
                            $('#history').text(res.responseDTO.history);
                        }if (res.responseDTO.accounts != null) {
                            $('#accountsHidden').removeClass('hidden');
                            $('#accounts').text(res.responseDTO.accounts);
                        }
                        if (res.responseDTO.commerce != null) {
                            $('#commerceHidden').removeClass('hidden');
                            $('#commerce').text(res.responseDTO.commerce);
                        }

                    } else {
                        warningMsg(res.responseText);
                    }
                }
            });
        });
    }


    return {
        getStudentDetail: getStudentDetail
    }
})
();
$(document).ready(
    function () {
        studentDetail.getStudentDetail();
    });
