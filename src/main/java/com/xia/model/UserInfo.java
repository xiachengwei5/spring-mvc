package com.xia.model;

import java.util.Date;

//import org.springframework.format.annotation.DateTimeFormat;
//import com.fasterxml.jackson.annotation.JsonFormat;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
/**
 * 执法人信息表
 * 实体类对应的数据表为：  user_info
 * @author XiaChengwei
 * @date 2017-07-27 16:50:23
 */
//@ApiModel(value ="UserInfo")
public class UserInfo {
	//@ApiModelProperty(value = "ID")
    private Integer id;

    //@ApiModelProperty(value = "用户登录账号")
    private String userNo;

    //@ApiModelProperty(value = "姓名")
    private String userName;

    //@ApiModelProperty(value = "拼音名")
    private String spellName;

    //@ApiModelProperty(value = "密码")
    private String password;

    //@ApiModelProperty(value = "手机号")
    private String userPhone;

    //@ApiModelProperty(value = "性别")
    private Integer userGender;

    //@ApiModelProperty(value = "头像地址")
    private String userImg;

    //@ApiModelProperty(value = "职务")
    private String userDuty;

    //@ApiModelProperty(value = "所属执法机构")
    private Integer orgId;

    //@ApiModelProperty(value = "执法证号(属地)")
    private String enforceNoOrigin;

    //@ApiModelProperty(value = "执法证号(环保部)")
    private String enforceNoEnvrmt;

    //@ApiModelProperty(value = "排序号")
    private Integer sortCode;

    //@ApiModelProperty(value = "记录创建时间")
    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    //@ApiModelProperty(value = "记录修改时间")
    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName == null ? null : spellName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public String getUserDuty() {
        return userDuty;
    }

    public void setUserDuty(String userDuty) {
        this.userDuty = userDuty == null ? null : userDuty.trim();
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getEnforceNoOrigin() {
        return enforceNoOrigin;
    }

    public void setEnforceNoOrigin(String enforceNoOrigin) {
        this.enforceNoOrigin = enforceNoOrigin == null ? null : enforceNoOrigin.trim();
    }

    public String getEnforceNoEnvrmt() {
        return enforceNoEnvrmt;
    }

    public void setEnforceNoEnvrmt(String enforceNoEnvrmt) {
        this.enforceNoEnvrmt = enforceNoEnvrmt == null ? null : enforceNoEnvrmt.trim();
    }

    public Integer getSortCode() {
        return sortCode;
    }

    public void setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
    }

    //@JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    //@JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userNo=").append(userNo);
        sb.append(", userName=").append(userName);
        sb.append(", spellName=").append(spellName);
        sb.append(", password=").append(password);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userGender=").append(userGender);
        sb.append(", userImg=").append(userImg);
        sb.append(", userDuty=").append(userDuty);
        sb.append(", orgId=").append(orgId);
        sb.append(", enforceNoOrigin=").append(enforceNoOrigin);
        sb.append(", enforceNoEnvrmt=").append(enforceNoEnvrmt);
        sb.append(", sortCode=").append(sortCode);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}