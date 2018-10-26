package com.hk.xstream.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by LuHj on 2018/10/23.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@XStreamAlias("d")
public class City {
    @XStreamAsAttribute
    @XStreamAlias("d1")
    private String cityId;

    @XStreamAsAttribute
    @XStreamAlias("d2")
    private String cityName;

    @XStreamAlias("d3")
    @XStreamAsAttribute
    private String cityCode;

    @XStreamAsAttribute
    @XStreamAlias("d4")
    private String province;
}
