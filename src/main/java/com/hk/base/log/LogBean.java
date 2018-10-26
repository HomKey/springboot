package com.hk.base.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by LuHj on 2018/10/24.
 */
public abstract class LogBean {
    protected Logger logger = LogManager.getLogger(getClass());
}
