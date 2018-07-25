package com.hk.base.domain;

import com.hk.base.enums.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by LuHj on 2018/7/24.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult {
    private Integer code;
    private String msg;
    private Object data;

    public ResponseResult(ResponseCode responseCode, Object data){
        this.code = responseCode.getKey();
        this.msg = responseCode.getDesc();
        this.data = data;
    }
}
