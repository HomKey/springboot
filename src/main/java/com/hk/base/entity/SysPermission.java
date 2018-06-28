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
@TableName("sys_permission")
public class SysPermission extends SuperEntity<SysPermission> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 账号名称
     */
    private String name;
    /**
     * 资源类型
     */
    @TableField("resource_type")
    private Integer resourceType;
    /**
     * url地址
     */
    private String url;
    /**
     * 账号状态
     */
    private Integer state;
    /**
     * 父编号
     */
    @TableField("parent_id")
    private Integer parentId;
    /**
     * 父编号列表
     */
    @TableField("parent_ids")
    private String parentIds;
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

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
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

    public static final String RESOURCE_TYPE = "resource_type";

    public static final String URL = "url";

    public static final String STATE = "state";

    public static final String PARENT_ID = "parent_id";

    public static final String PARENT_IDS = "parent_ids";

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
        return "SysPermission{" +
        ", id=" + id +
        ", name=" + name +
        ", resourceType=" + resourceType +
        ", url=" + url +
        ", state=" + state +
        ", parentId=" + parentId +
        ", parentIds=" + parentIds +
        ", available=" + available +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", updateUserId=" + updateUserId +
        ", updateTime=" + updateTime +
        ", deleteFlag=" + deleteFlag +
        "}";
    }
}
