package com.personal.mock.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * author: zhaoxu
 * date: 2019/3/27 上午10:07
 */
public class MockAppStrategyDto {

    public class MockAppDto {

        /**
         * 对应数据库关系 mock.mock_app.id
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 对应数据库关系 mock.mock_app.name
         */
        @JsonProperty("name")
        @NotNull(message = "param name is required,but not exist")
        private String name;

        /**
         * 对应数据库关系 mock.mock_app.description
         */
        @JsonProperty("description")
        @NotNull(message = "param description is required,but not exist")
        private String description;

        /**
         * 对应数据库关系 mock.mock_app.request_url
         */
        @JsonProperty("request_url")
        @NotNull(message = "param request_url is required,but not exist")
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
         * 对应数据库关系 mock.mock_app.approver
         */
        @JsonProperty("approver")
        @NotNull(message = "param approver is required,but not exist")
        private String approver;

        /**
         * 对应数据库关系 mock.mock_app.is_active
         */
        @JsonProperty("is_active")
        private String isActive;

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getRequestUrl() {
            return requestUrl;
        }

        public String getMockData() {
            return mockData;
        }

        public String getRedirectUrl() {
            return redirectUrl;
        }

        public String getApprover() {
            return approver;
        }

        public String getIsActive() {
            return isActive;
        }
    }

}
