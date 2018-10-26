package com.hk.xstream.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by LuHj on 2018/10/23.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@XStreamAlias("c")
public class CityList {
    @XStreamImplicit(itemFieldName="d")
    private List<City> cityList;
}
