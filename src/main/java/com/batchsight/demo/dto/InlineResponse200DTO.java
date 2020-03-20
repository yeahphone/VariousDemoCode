/*
 * iBatchPharma API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.batchsight.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * InlineResponse200DTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-23T09:18:38.531+08:00[Asia/Shanghai]")
public class InlineResponse200DTO   {
  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  private Integer errorCode;

  public static final String JSON_PROPERTY_DATA = "data";
  @JsonProperty(JSON_PROPERTY_DATA)
  private AuditTrailDtoDTO data = null;

  public static final String JSON_PROPERTY_ERROR_INFO = "errorInfo";
  @JsonProperty(JSON_PROPERTY_ERROR_INFO)
  private String errorInfo;

  public static final String JSON_PROPERTY_DATA_TYPE = "dataType";
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  private String dataType;

  public static final String JSON_PROPERTY_TOTAL = "total";
  @JsonProperty(JSON_PROPERTY_TOTAL)
  private Integer total;

  public static final String JSON_PROPERTY_API_ID = "apiId";
  @JsonProperty(JSON_PROPERTY_API_ID)
  private Integer apiId;

  public static final String JSON_PROPERTY_ELAPSED = "elapsed";
  @JsonProperty(JSON_PROPERTY_ELAPSED)
  private Long elapsed;

  public static final String JSON_PROPERTY_SUCCESS = "success";
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  private Boolean success;

  public InlineResponse200DTO errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * 异常代码
   * @return errorCode
   **/
  @JsonProperty("errorCode")
  @ApiModelProperty(value = "异常代码")
  
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public InlineResponse200DTO data(AuditTrailDtoDTO data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @JsonProperty("data")
  @ApiModelProperty(value = "")
  @Valid 
  public AuditTrailDtoDTO getData() {
    return data;
  }

  public void setData(AuditTrailDtoDTO data) {
    this.data = data;
  }

  public InlineResponse200DTO errorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }

  /**
   * 异常信息
   * @return errorInfo
   **/
  @JsonProperty("errorInfo")
  @ApiModelProperty(value = "异常信息")
  
  public String getErrorInfo() {
    return errorInfo;
  }

  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }

  public InlineResponse200DTO dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * 数据类型
   * @return dataType
   **/
  @JsonProperty("dataType")
  @ApiModelProperty(value = "数据类型")
  
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public InlineResponse200DTO total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * 记录数
   * @return total
   **/
  @JsonProperty("total")
  @ApiModelProperty(value = "记录数")
  
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public InlineResponse200DTO apiId(Integer apiId) {
    this.apiId = apiId;
    return this;
  }

  /**
   * 接口ID
   * @return apiId
   **/
  @JsonProperty("apiId")
  @ApiModelProperty(value = "接口ID")
  
  public Integer getApiId() {
    return apiId;
  }

  public void setApiId(Integer apiId) {
    this.apiId = apiId;
  }

  public InlineResponse200DTO elapsed(Long elapsed) {
    this.elapsed = elapsed;
    return this;
  }

  /**
   * 接口耗时(ns)
   * @return elapsed
   **/
  @JsonProperty("elapsed")
  @ApiModelProperty(value = "接口耗时(ns)")
  
  public Long getElapsed() {
    return elapsed;
  }

  public void setElapsed(Long elapsed) {
    this.elapsed = elapsed;
  }

  public InlineResponse200DTO success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * 接口调用成功标志
   * @return success
   **/
  @JsonProperty("success")
  @ApiModelProperty(value = "接口调用成功标志")
  
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DTO inlineResponse200 = (InlineResponse200DTO) o;
    return Objects.equals(this.errorCode, inlineResponse200.errorCode) &&
        Objects.equals(this.data, inlineResponse200.data) &&
        Objects.equals(this.errorInfo, inlineResponse200.errorInfo) &&
        Objects.equals(this.dataType, inlineResponse200.dataType) &&
        Objects.equals(this.total, inlineResponse200.total) &&
        Objects.equals(this.apiId, inlineResponse200.apiId) &&
        Objects.equals(this.elapsed, inlineResponse200.elapsed) &&
        Objects.equals(this.success, inlineResponse200.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, data, errorInfo, dataType, total, apiId, elapsed, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200DTO {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

