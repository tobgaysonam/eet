
EntryExitTrackerDao.getIdentificationType = SELECT identification_type_id AS valueInteger ,identification_type AS text FROM identificationtypes

EntryExitTrackerDao.getExitReasons = SELECT reason_id AS valueInteger, reason AS text FROM exitreasons

EntryExitTrackerDao.getNationalities = SELECT nationality_id AS valueInteger, nationality AS text FROM nationality

EntryExitTrackerDao.getGates = SELECT gate_id AS valueInteger ,gate_name AS text FROM gates

EntryExitTrackerDao.getidentificationtypes = SELECT identification_type_id ,identification_type \
                                              FROM identificationtypes

EntryExitTrackerDao.getUserType = SELECT user_type_id AS valueInteger,user_type  AS text FROM usertypes

EntryExitTrackerDao.fetchExistingGuestLogDetails = SELECT \
                                                  identification_type_id AS IdentificationTypeId, \
                                                  nationality_id AS nationalityId, \
                                                  guest_name AS name, \
                                                  gender AS gender, \
                                                  age AS age, \
                                                  present_address AS presentAddress, \
                                                  contact_no AS contactNo, \
                                                  temperature AS temperature, \
                                                  reason_id AS exitReasonId, \
                                                  reason AS reasons \
                                                FROM guestlog \
                                                WHERE identification_no = :cidNo

