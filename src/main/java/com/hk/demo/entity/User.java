package com.hk.demo.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.FieldStrategy;
import com.hk.base.domain.SuperEntity;
import com.hk.demo.entity.enums.ValidEnum;

/**
 * <p>
 * 
 * </p>
 *
 * @author HomKey123
 * @since 2018-06-26
 */
public class User extends SuperEntity<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 租户ID
     */
    @TableField(value = "tenant_id", fill = FieldFill.INSERT_UPDATE, strategy = FieldStrategy.NOT_EMPTY)
    private Long tenantId;
    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 测试下划线字段命名类型
     */
    @TableField("test_type")
    private Integer testType;
    /**
     * 日期
     */
    @TableField("test_date")
    private Date testDate;
    /**
     * 测试
     */
    private Long role;
    /**
     * 手机号码
     */
    private String phone;
    @TableField(value = "last_update_user_id", fill = FieldFill.INSERT_UPDATE, strategy = FieldStrategy.NOT_EMPTY)
    private Long lastUpdateUserId;
    @TableField(value = "last_update_time", fill = FieldFill.INSERT_UPDATE, strategy = FieldStrategy.NOT_EMPTY)
    private Date lastUpdateTime;
    @TableField(value = "delete_flag")
    @TableLogic
    private ValidEnum deleteFlag;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTestType() {
        return testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(Long lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public ValidEnum getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(ValidEnum deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
    public static final String ID = "id";

    public static final String TENANT_ID = "tenant_id";

    public static final String NAME = "name";

    public static final String AGE = "age";

    public static final String TEST_TYPE = "test_type";

    public static final String TEST_DATE = "test_date";

    public static final String ROLE = "role";

    public static final String PHONE = "phone";

    public static final String LAST_UPDATE_USER_ID = "last_update_user_id";

    public static final String LAST_UPDATE_TIME = "last_update_time";

    public static final String DELETE_FLAG = "delete_flag";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        ", id=" + id +
        ", tenantId=" + tenantId +
        ", name=" + name +
        ", age=" + age +
        ", testType=" + testType +
        ", testDate=" + testDate +
        ", role=" + role +
        ", phone=" + phone +
        ", lastUpdateUserId=" + lastUpdateUserId +
        ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }
}
