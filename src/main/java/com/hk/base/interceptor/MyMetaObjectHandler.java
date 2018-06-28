package com.hk.base.interceptor;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by LuHj on 2018/6/26.
 */
@Component
public class MyMetaObjectHandler extends MetaObjectHandler{

    @Override
    public void insertFill(MetaObject metaObject) {
        Object createUserId = getFieldValByName("createUserId", metaObject);
        if (null == createUserId){
            setFieldValByName("createUserId", 1L, metaObject);
        }
        Object createTime = getFieldValByName("createTime", metaObject);
        if (null == createTime){
            setFieldValByName("createTime", new Date(), metaObject);
        }
        updateFill(metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Object lastUpdateNameId = getFieldValByName("updateUserId", metaObject);
        Object lastUpdateTime = getFieldValByName("updateTime", metaObject);
        Object tenantId = getFieldValByName("tenantId", metaObject);
        //获取当前登录用户
        //SysUser user = (SysUser)SecurityUtils.getSubject().getPrincipal();
        if (null == tenantId){
            setFieldValByName("tenantId", 2L, metaObject);
        }
        if (null == lastUpdateNameId) {
            setFieldValByName("lastUpdateUserId", 2L, metaObject);
        }
        if (null == lastUpdateTime) {
            setFieldValByName("lastUpdateTime", new Date(), metaObject);
        }
    }
}
