package com.hk.base.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.FieldStrategy;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hk.base.domain.SuperEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author HomKey123
 * @since 2018-06-27
 */
@TableName("sys_user")
public class SysUser extends SuperEntity<SysUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 租户ID
     */
    @TableField("tenant_id")
    private Long tenantId;
    /**
     * 账号名称
     */
    private String name;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 密码
     */
    private String password;
    /**
     * 加密密码的盐
     */
    private String salt;
    /**
     * 账号状态
     */
    private Integer state;
    /**
     * 创建人ID
     */
    @TableField(value = "create_user_id", fill = FieldFill.INSERT, strategy = FieldStrategy.NOT_EMPTY)
    private Long createUserId;
    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT, strategy = FieldStrategy.NOT_EMPTY)
    private Date createTime;
    /**
     * 最近更新人ID
     */
    @TableField(value = "update_user_id", fill = FieldFill.UPDATE, strategy = FieldStrategy.NOT_EMPTY)
    private Long updateUserId;
    /**
     * 最近更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.UPDATE, strategy = FieldStrategy.NOT_EMPTY)
    private Date updateTime;
    /**
     * 删除标志(正常0,删除1)
     */
    @TableField("delete_flag")
    @TableLogic
    @JsonIgnore
    private Integer deleteFlag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public static final String ID = "id";

    public static final String TENANT_ID = "tenant_id";

    public static final String NAME = "name";

    public static final String PHONE = "phone";

    public static final String PASSWORD = "password";

    public static final String SALT = "salt";

    public static final String STATE = "state";

    public static final String CREATE_USER_ID = "create_user_id";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_USER_ID = "update_user_id";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETE_FLAG = "delete_flag";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        ", id=" + id +
        ", tenantId=" + tenantId +
        ", name=" + name +
        ", phone=" + phone +
        ", password=" + password +
        ", salt=" + salt +
        ", state=" + state +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", updateUserId=" + updateUserId +
        ", updateTime=" + updateTime +
        ", deleteFlag=" + deleteFlag +
        "}";
    }
}
