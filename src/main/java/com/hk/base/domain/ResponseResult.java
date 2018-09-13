package com.hk.base.domain;

import com.hk.base.enums.ResponseCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by LuHj on 2018/7/24.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class ResponseResult {
    @ApiModelProperty(value = "响应码", dataType = "Integer", name = "code", example = "200")
    private Integer code;
    @ApiModelProperty(value = "响应码信息", dataType = "String", name = "message", example = "成功")
    private String msg;
    @ApiModelProperty(value = "数据", dataType = "Object", name = "data", example = "user")
    private Object data;

    public ResponseResult(ResponseCode responseCode, Object data){
        this.code = responseCode.getKey();
        this.msg = responseCode.getDesc();
        this.data = data;
    }
}
