
EntryExitTrackerDao.getIdentificationType = SELECT identification_type_id AS valueInteger ,identification_type AS text FROM identificationtypes

EntryExitTrackerDao.getExitReasons = SELECT reason_id AS valueInteger, reason AS text FROM exitreasons

EntryExitTrackerDao.getNationalities = SELECT nationality_id AS valueInteger, nationality AS text FROM nationality

EntryExitTrackerDao.getGates = SELECT gate_id AS valueInteger ,gate_name AS text FROM gates

EntryExitTrackerDao.getidentificationtypes = SELECT identification_type_id ,identification_type \
                                              FROM identificationtypes

EntryExitTrackerDao.getUserType = SELECT user_type_id AS valueInteger,user_type  AS text FROM usertypes

EntryExitTrackerDao.insertusers = INSERT INTO users(cid,password,full_name,mobile_number,designation,working_address,user_type_id) \
                                  VALUES()

EntryExitTrackerDao.insertvisitorlog = INSERT INTO guestlog(guest_id,identification_type_id,identification_no,nationality_id,guest_name,gender,age,present_address,contact_no,temperature,entry_date_time,exit_date_time,reason_id,reason,created_by,created_on) \
                                        VALUES()


