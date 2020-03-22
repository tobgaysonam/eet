package bt.gov.moh.helper;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class FileUploadValidator {

    public static final Integer MESSAGE_STATUS_SUCCESSFUL = 1;
    public static final Integer MESSAGE_STATUS_UNSUCCESSFUL = 0;

    /**
     * validates the file type and file size for upload by loading from properties file.
     *
     * @param propFileName  -- properties file name to get size and valid file type
     * @param fileExtension -- file extension to check
     * @param fileSize      -- file size to check
     */
    public static ResponseMessage isFileValidForUpload(String propFileName, String fileExtension, Long fileSize)
            throws IOException {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setResponseStatus(MESSAGE_STATUS_SUCCESSFUL);
        String errorMessage;
        FileUploadDTO fileUploadDTO = getFileUploadValidationConfig(propFileName);
        Double maxFileSize = fileUploadDTO.getMaxFileSize() * 1024 * 1024; //convert MB to Bytes for comparison

        if (fileSize > maxFileSize) {
            errorMessage = "File size Must be less than or equal to " + fileUploadDTO.getMaxFileSize() + "MB";
            responseMessage.setResponseDTO(errorMessage);
            return responseMessage;
        }
        for (String validFileType : fileUploadDTO.getSupportedFileType()) {
            if (fileExtension.equals(validFileType)) {
                responseMessage.setResponseStatus(MESSAGE_STATUS_UNSUCCESSFUL);
                break;
            }
        }
        errorMessage = "Provided file format is not supported. Please attach " + fileUploadDTO.getSupportedFileTypeInString() + " files only";
        responseMessage.setResponseDTO(errorMessage);
        return responseMessage;
    }

    /**
     * get the file upload setup (like max file size and types of file supported to upload)
     *
     * @param propFileName -- name of properties file that contain upload config
     */
    public static FileUploadDTO getFileUploadValidationConfig(String propFileName) throws IOException {
        Resource resource = new ClassPathResource("/fileupload/" + propFileName);
        Properties props = PropertiesLoaderUtils.loadProperties(resource);
        FileUploadDTO fileUploadDTO = new FileUploadDTO();
        String propFileWithoutExtension = propFileName.substring(0, propFileName.lastIndexOf('.'));
        Double maxFileSize = Double.parseDouble(props.getProperty(propFileWithoutExtension + ".maxSize"));
        String supportedFileType[] = props.getProperty(propFileWithoutExtension + ".supportedFileType").toString().split(",");
        String errorMsg = props.getProperty(propFileWithoutExtension + ".supportedFileType");

        fileUploadDTO.setMaxFileSize(maxFileSize);
        fileUploadDTO.setSupportedFileType(supportedFileType);
        fileUploadDTO.setSupportedFileTypeInString(errorMsg.replace(",", " or "));
        return fileUploadDTO;
    }

  /*  public static FileUploadDTO getFileUploadValidationConfig(String propFileName) throws IOException{
        Resource resource = new ClassPathResource("/fileupload/" + propFileName);
        Properties props = PropertiesLoaderUtils.loadProperties(resource);
        FileUploadDTO fileUploadDTO = new FileUploadDTO();
        String propFileWithoutExtension = propFileName.substring(0,propFileName.lastIndexOf('.'));
        if(maxFileSize != null){
            try {
                fileUploadDTO.getMaxFileSize(Double.parseDouble(maxFileSize));
            }catch(Exception e){
                fileUploadDTO.setMaxFileSize(null);
            }
        }

        String supportedFileTypeString = props.getProperty(propFileWithoutExtension+".supportedFileType");
        if(supportedFileTypeString != null){
            String supportedFileType[] = supportedFileType.split(",");
            fileUploadDTO.setSuppportedFileType(supportedFileType);
            fileUploadDTO.setSuppportedFileTypeString(supportedFileType.replace(",", " or "));
        }

        return fileUploadDTO;
    }*/

}