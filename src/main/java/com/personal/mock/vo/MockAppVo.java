package com.personal.mock.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class MockAppVo implements Serializable {

    private static final long serialVersionUID = -7768856903178085445L;
    /**
     * 对应数据库关系 mock.mock_app.id
     */
    @JsonProperty("id")
    private Integer id;

    /**
     * 对应数据库关系 mock.mock_app.name
     */
    @JsonProperty("name")
    private String name;

    /**
     * 对应数据库关系 mock.mock_app.description
     */
    @JsonProperty("description")
    private String description;

    /**
     * 对应数据库关系 mock.mock_app.request_url
     */
    @JsonProperty("request_url")
    private String requestUrl;

    /**
     * 对应数据库关系 mock.mock_app.mock_data
     */
    @JsonProperty("mock_data")
    private String mockData;

    /**
     * 对应数据库关系 mock.mock_app.redirect_url
     */
    @JsonProperty("redirect_url")
    private String redirectUrl;

    /**
     * 对应数据库关系 mock.mock_app.is_active
     */
    @JsonProperty("is_active")
    private Boolean isActive;

    /**
     * 对应数据库关系 mock.mock_app.create_time
     */
    @JsonProperty("create_time")
    private Date createTime;

    /**
     * 对应数据库关系 mock.mock_app.update_time
     */
    @JsonProperty("update_time")
    private Date updateTime;

    /**
     * 对应数据库关系 mock.mock_app.approver
     */
    @JsonProperty("approver")
    private String approver;


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

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    public String getMockData() {
        return mockData;
    }

    public void setMockData(String mockData) {
        this.mockData = mockData == null ? null : mockData.trim();
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