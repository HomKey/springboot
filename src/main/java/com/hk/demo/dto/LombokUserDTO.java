package com.hk.demo.dto;

import com.google.common.base.Converter;
import com.hk.demo.entity.LombokUser;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by LuHj on 2018/7/24.
 */
@Accessors(chain = true)
@Builder
@Data // @Getter @Setter
// @AllArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class LombokUserDTO {
    @NotNull
    private int id;
    @NotNull
    @Size(min=2, max=30, message = "用户名长度为2~30")
    private String userName;
    @NotNull
    @Size(min=6, max=16)
    private String password;
    @NotNull
    @Min(18)
    private Integer age;

    public LombokUser convertToLombokUser(){
        LombokUserDTOConvert lombokUserDTOConvert = new LombokUserDTOConvert();
        LombokUser convert = lombokUserDTOConvert.convert(this);
        return convert;
    }

    public LombokUserDTO convertFor(LombokUser lombokUser){
        LombokUserDTOConvert lombokUserDTOConvert = new LombokUserDTOConvert();
        LombokUserDTO convert = lombokUserDTOConvert.reverse().convert(lombokUser);
        return convert;
    }


    private static class LombokUserDTOConvert extends Converter<LombokUserDTO, LombokUser> {
        @Override
        protected LombokUser doForward(LombokUserDTO lombokUserDTO) {
            if (lombokUserDTO != null){

            }
            LombokUser lombokUser = new LombokUser();
            BeanUtils.copyProperties(lombokUserDTO, lombokUser);
            return lombokUser;
        }

        @Override
        protected LombokUserDTO doBackward(LombokUser lombokUser) {
            LombokUserDTO lombokUserDTO = new LombokUserDTO();
            BeanUtils.copyProperties(lombokUser, lombokUserDTO);
            // throw new AssertionError("不支持逆向转化方法!"); // 若限制转换可在此抛出异常
            return lombokUserDTO;
        }
    }
}