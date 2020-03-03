package org.lili.sharding.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 手机号对应的国家编码
     */
    private String countryCode;

    /**
     * 手机号码
     */
    private String mobileNumber;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 登录密码
     */
    private String loginPword;

    /**
     * 创建时间
     */
    private Date ctime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber == null ? null : mobileNumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLoginPword() {
        return loginPword;
    }

    public void setLoginPword(String loginPword) {
        this.loginPword = loginPword == null ? null : loginPword.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public static class Builder {
        private User obj;

        public Builder() {
            this.obj = new User();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder countryCode(String countryCode) {
            obj.countryCode = countryCode;
            return this;
        }

        public Builder mobileNumber(String mobileNumber) {
            obj.mobileNumber = mobileNumber;
            return this;
        }

        public Builder email(String email) {
            obj.email = email;
            return this;
        }

        public Builder loginPword(String loginPword) {
            obj.loginPword = loginPword;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public User build() {
            return this.obj;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", countryCode='" + countryCode + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", loginPword='" + loginPword + '\'' +
                ", ctime=" + ctime +
                '}';
    }
}