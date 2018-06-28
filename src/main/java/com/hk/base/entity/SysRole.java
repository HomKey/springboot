package com.hk.base.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.FieldStrategy;
import com.hk.base.domain.SuperEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author HomKey123
 * @since 2018-06-27
 */
@TableName("sys_role")
public class SysRole extends SuperEntity<SysRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;
    /**
     * 是否可用(可用1,否则不可以)
     */
    private Integer available;
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
    private Integer deleteFlag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
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

    public static final String NAME = "name";

    public static final String DESCRIPTION = "description";

    public static final String AVAILABLE = "available";

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
        return "SysRole{" +
        ", id=" + id +
        ", name=" + name +
        ", description=" + description +
        ", available=" + available +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", updateUserId=" + updateUserId +
        ", updateTime=" + updateTime +
        ", deleteFlag=" + deleteFlag +
        "}";
    }
}
