<linked-list>
    <!-- Acrel智能电表 -->
<#list acrelList as object>
    <BytesRequest>
        <name>cmd_acrel_d1_mdbs_AI_${object.index}</name>
        <commandType>0</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>0</busId>
        <length>0</length>
        <registerNumber>0</registerNumber>
        <command>01 03 00 00 00 4F 04 3E</command>
    </BytesRequest>
</#list>

    <!-- 艾默生空调 -->
<#list amsAcList as object>
    <DzRequest>
        <name>cmd_crac_${object.deviceId}_d1_60_42</name>
        <commandType>24642</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>6001</port>
        <addr>1</addr>
        <ver>33</ver>
        <ctrlData/>
    </DzRequest>
    <DzRequest>
        <name>cmd_crac_${object.deviceId}_d1_60_85</name>
        <commandType>24709</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>6001</port>
        <addr>1</addr>
        <ver>33</ver>
        <ctrlData/>
    </DzRequest>
</#list>

    <!-- 施耐德空调 -->
<#list sndAcList as object>
    <ModbusRequest>
        <name>modbus_${object.ip}_${object.port}_${object.index}_1_0_100</name>
        <commandType>1</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>100</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>modbus_${object.ip}_${object.port}_${object.index}_3_0_50</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>50</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>
    <!-- 温度探头 -->
<#list thList as object>
    <ModbusRequest>
        <name>th_r2_d${object.index}_AI</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>2</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>

    <!-- 新风机 -->
<#list xfjList as object>
    <ModbusRequest>
        <name>newFan_${object.index}_A_${object.busId}</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>5</length>
        <registerNumber>40000</registerNumber>
    </ModbusRequest>
</#list>

    <!-- 漏水 -->
<#list lsList as object>
    <ModbusRequest>
        <name>cmd_flood${object.index}_di</name>
        <commandType>1</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId> <!--253-->
        <length>1</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>

    <!-- 配电柜 -->
<#list pdcList as object>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_4096_101</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>101</length>
        <registerNumber>4096</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_4_70</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>70</length>
        <registerNumber>4</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_74_70</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>70</length>
        <registerNumber>74</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_144_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>144</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_252_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>252</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_360_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>360</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_468_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>468</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_576_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>576</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_684_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>684</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_792_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>792</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_900_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>900</registerNumber>
    </ModbusRequest>
</#list>

    <!-- 二氧化碳 -->
<#list eyhtList as object>
    <ModbusRequest>
        <name>Transmitter_co2_${object.index}_A</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>65</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>

    <!-- 气压 -->
<#list qyList as object>
    <ModbusRequest>
        <name>Transmitter_qy_${object.index}_A</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>2</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>

    <!-- 消防主机 -->
<#list emhList as object>
    <ModbusRequest>
        <name>emhPro_D1_DI_Index_${object.index}</name>
        <commandType>1</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>464</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>