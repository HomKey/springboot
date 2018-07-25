package com.hk.base.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by LuHj on 2018/7/25.
 */
public abstract class BaseController {
    /**
     * 日志对象
     */
    protected Logger logger = LogManager.getLogger(getClass());
}
