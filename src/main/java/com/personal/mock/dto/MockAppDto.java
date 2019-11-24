package com.personal.mock.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class MockAppDto implements Serializable {
    /**
     * 对应数据库关系 mock.mock_app.id
     */
    private Integer id;

    /**
     * 对应数据库关系 mock.mock_app.name
     */
    private String name;

    /**
     * 对应数据库关系 mock.mock_app.description
     */
    private String description;

    /**
     * 对应数据库关系 mock.mock_app.request_type
     */
    private String requestType;

    /**
     * 对应数据库关系 mock.mock_app.request_url
     */
    private String requestUrl;

    /**
     * 对应数据库关系 mock.mock_app.request_query
     */
    private String requestQuery;

    /**
     * 对应数据库关系 mock.mock_app.request_body
     */
    private String requestBody;

    /**
     * 对应数据库关系 mock.mock_app.request_header
     */
    private String requestHeader;

    /**
     * 对应数据库关系 mock.mock_app.mock_data
     */
    @JsonProperty("mock_data")
    private Object mockData;

    /**
     * 对应数据库关系 mock.mock_app.redirect_url
     */
    private String redirectUrl;

    /**
     * 对应数据库关系 mock.mock_app.is_active
     */
    private Boolean isActive;

    /**
     * 对应数据库关系 mock.mock_app.create_time
     */
    private Date createTime;

    /**
     * 对应数据库关系 mock.mock_app.update_time
     */
    private Date updateTime;

    /**
     * 对应数据库关系 mock.mock_app.approver
     */
    private String approver;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType == null ? null : requestType.trim();
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    public String getRequestQuery() {
        return requestQuery;
    }

    public void setRequestQuery(String requestQuery) {
        this.requestQuery = requestQuery == null ? null : requestQuery.trim();
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody == null ? null : requestBody.trim();
    }

    public String getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(String requestHeader) {
        this.requestHeader = requestHeader == null ? null : requestHeader.trim();
    }

    public Object getMockData() {
        return mockData;
    }

    public void setMockData(Object mockData) {
        this.mockData = mockData;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl == null ? null : redirectUrl.trim();
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }
}