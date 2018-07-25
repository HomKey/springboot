package com.hk.demo.controller;

import com.google.common.collect.Lists;
import com.hk.base.domain.ResponseResult;
import com.hk.base.enums.ResponseCode;
import com.hk.demo.dto.LombokUserDTO;
import com.hk.demo.entity.LombokUser;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by LuHj on 2018/7/24.
 */
@Controller
@RequestMapping("/lombok")
public class LombokController {

    @PostMapping("/add")
    @ResponseBody
    public ResponseResult addLombokUser(@Valid LombokUserDTO lombokUserDTO, BindingResult bindingResult){
        ResponseResult responseResult = checkDTOParams(bindingResult);
        if (responseResult != null){
            return responseResult;
        }
        List<LombokUserDTO> list = Lists.newArrayList();
        LombokUser lombokUser = lombokUserDTO.convertToLombokUser();
        // LombokUserDTO model = new LombokUserDTO().setId(1);
        System.out.println(lombokUser.toString());
        return new ResponseResult(ResponseCode.SUCCESS, lombokUser);
    }

    private ResponseResult checkDTOParams(BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            for(ObjectError error : errorList){
                System.out.println(error.getDefaultMessage());
            }
            return new ResponseResult(ResponseCode.ERROR, errorList);
            //throw new 带验证码的验证错误异常
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        LombokUserDTO model = LombokUserDTO.builder().id(1).build();
        model.setPassword("123");
        LombokUserDTO model2 = model.builder().userName("usrName").build();
        System.out.println(model.toString());
        System.out.println(model2.toString());

    }
}
