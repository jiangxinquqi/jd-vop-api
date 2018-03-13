package com.xiao.jd.vop.bean.aftersale;

import java.io.Serializable;
import java.util.List;

/**
 * 〈服务单明细信息〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/9 19:31
 * @since 1.0.0
 */
public class CompatibleServiceDetailDTO implements Serializable {
    private static final long serialVersionUID = -7354456788160328908L;

    /**
     * 服务单号
     */
    private int afsServiceId;
    /**
     * 服务类型码 退货(10)、换货(20)、维修(20)
     */
    private int customerExpect;
    /**
     * 服务单申请时间 yyyy-MM-dd HH:mm:ss
     */
    private String afsApplyTime;
    private long orderId;
    private int isHasInvoice;
    private int isNeedDetectionReport;
    private int isHasPackage;
    private String questionPic;
    private  int afsServiceStep;
    private String afsServiceStepName;
    private String approveNotes;
    private String questionDesc;
    private int approvedResult;
    private String approvedResultName;
    private  int processResult;
    private String processResultName;
    private ServiceCustomerInfoDTO serviceCustomerInfoDTO;
    private ServiceAftersalesAddressInfoDTO serviceAftersalesAddressInfoDTO;
    private ServiceExpressInfoDTO serviceExpressInfoDTO;
    private List<ServiceFinanceDetailInfoDTO> serviceFinanceDetailInfoDTOs;
    private List<ServiceTrackInfoDTO> serviceTrackInfoDTOs;
    private List<ServiceDetailInfoDTO> serviceDetailInfoDTOs;
    private List<Integer> allowOperations;

    public int getAfsServiceId() {
        return afsServiceId;
    }

    public void setAfsServiceId(int afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public int getCustomerExpect() {
        return customerExpect;
    }

    public void setCustomerExpect(int customerExpect) {
        this.customerExpect = customerExpect;
    }

    public String getAfsApplyTime() {
        return afsApplyTime;
    }

    public void setAfsApplyTime(String afsApplyTime) {
        this.afsApplyTime = afsApplyTime;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getIsHasInvoice() {
        return isHasInvoice;
    }

    public void setIsHasInvoice(int isHasInvoice) {
        this.isHasInvoice = isHasInvoice;
    }

    public int getIsNeedDetectionReport() {
        return isNeedDetectionReport;
    }

    public void setIsNeedDetectionReport(int isNeedDetectionReport) {
        this.isNeedDetectionReport = isNeedDetectionReport;
    }

    public int getIsHasPackage() {
        return isHasPackage;
    }

    public void setIsHasPackage(int isHasPackage) {
        this.isHasPackage = isHasPackage;
    }

    public String getQuestionPic() {
        return questionPic;
    }

    public void setQuestionPic(String questionPic) {
        this.questionPic = questionPic;
    }

    public int getAfsServiceStep() {
        return afsServiceStep;
    }

    public void setAfsServiceStep(int afsServiceStep) {
        this.afsServiceStep = afsServiceStep;
    }

    public String getAfsServiceStepName() {
        return afsServiceStepName;
    }

    public void setAfsServiceStepName(String afsServiceStepName) {
        this.afsServiceStepName = afsServiceStepName;
    }

    public String getApproveNotes() {
        return approveNotes;
    }

    public void setApproveNotes(String approveNotes) {
        this.approveNotes = approveNotes;
    }

    public String getQuestionDesc() {
        return questionDesc;
    }

    public void setQuestionDesc(String questionDesc) {
        this.questionDesc = questionDesc;
    }

    public int getApprovedResult() {
        return approvedResult;
    }

    public void setApprovedResult(int approvedResult) {
        this.approvedResult = approvedResult;
    }

    public String getApprovedResultName() {
        return approvedResultName;
    }

    public void setApprovedResultName(String approvedResultName) {
        this.approvedResultName = approvedResultName;
    }

    public int getProcessResult() {
        return processResult;
    }

    public void setProcessResult(int processResult) {
        this.processResult = processResult;
    }

    public String getProcessResultName() {
        return processResultName;
    }

    public void setProcessResultName(String processResultName) {
        this.processResultName = processResultName;
    }

    public ServiceCustomerInfoDTO getServiceCustomerInfoDTO() {
        return serviceCustomerInfoDTO;
    }

    public void setServiceCustomerInfoDTO(ServiceCustomerInfoDTO serviceCustomerInfoDTO) {
        this.serviceCustomerInfoDTO = serviceCustomerInfoDTO;
    }

    public ServiceAftersalesAddressInfoDTO getServiceAftersalesAddressInfoDTO() {
        return serviceAftersalesAddressInfoDTO;
    }

    public void setServiceAftersalesAddressInfoDTO(ServiceAftersalesAddressInfoDTO serviceAftersalesAddressInfoDTO) {
        this.serviceAftersalesAddressInfoDTO = serviceAftersalesAddressInfoDTO;
    }

    public ServiceExpressInfoDTO getServiceExpressInfoDTO() {
        return serviceExpressInfoDTO;
    }

    public void setServiceExpressInfoDTO(ServiceExpressInfoDTO serviceExpressInfoDTO) {
        this.serviceExpressInfoDTO = serviceExpressInfoDTO;
    }

    public List<ServiceFinanceDetailInfoDTO> getServiceFinanceDetailInfoDTOs() {
        return serviceFinanceDetailInfoDTOs;
    }

    public void setServiceFinanceDetailInfoDTOs(List<ServiceFinanceDetailInfoDTO> serviceFinanceDetailInfoDTOs) {
        this.serviceFinanceDetailInfoDTOs = serviceFinanceDetailInfoDTOs;
    }

    public List<ServiceTrackInfoDTO> getServiceTrackInfoDTOs() {
        return serviceTrackInfoDTOs;
    }

    public void setServiceTrackInfoDTOs(List<ServiceTrackInfoDTO> serviceTrackInfoDTOs) {
        this.serviceTrackInfoDTOs = serviceTrackInfoDTOs;
    }

    public List<ServiceDetailInfoDTO> getServiceDetailInfoDTOs() {
        return serviceDetailInfoDTOs;
    }

    public void setServiceDetailInfoDTOs(List<ServiceDetailInfoDTO> serviceDetailInfoDTOs) {
        this.serviceDetailInfoDTOs = serviceDetailInfoDTOs;
    }

    public List<Integer> getAllowOperations() {
        return allowOperations;
    }

    public void setAllowOperations(List<Integer> allowOperations) {
        this.allowOperations = allowOperations;
    }
}