<linked-list>
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
<#list pfjList as object>
    <ModbusRequest>
        <name>paiFan_${object.index}_A_${object.busId}_ai</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>5</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>paiFan_${object.index}_A_${object.busId}_di</name>
        <commandType>1</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>16</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>
<#list dlyList as object>
    <ModbusRequest>
        <name>cmd_r2_em1_03_1848_45_${object.index}</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>69</length>
        <registerNumber>6216</registerNumber>
    </ModbusRequest>
</#list>
<#list dczList as object>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A1</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>18</length>
        <registerNumber>2033</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A2</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>12</length>
        <registerNumber>2113</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A3</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>85</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A4</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>85</length>
        <registerNumber>85</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A6</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>85</length>
        <registerNumber>255</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A7</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>85</length>
        <registerNumber>340</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A9</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>85</length>
        <registerNumber>509</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A10</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>85</length>
        <registerNumber>594</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A12</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>85</length>
        <registerNumber>1779</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A13</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>85</length>
        <registerNumber>1864</registerNumber>
    </ModbusRequest>
</#list>
<#list amsUpsList as object>
    <!--41H 获取模拟量量化数据-->
    <DzRequest>
        <name>cmd_41_ups_d${object.index}_get_sys_analog</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>1</addr>
        <ver>17</ver>
        <commandType>10817</commandType>
        <ctrlData></ctrlData>
    </DzRequest>

    <!--E2H 获取模拟量量化数据,模拟量化数据2-->
    <DzRequest>
        <name>cmd_E2_ups_d${object.index}_get_analog2</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>1</addr>
        <ver>17</ver>
        <commandType>10978</commandType>
        <ctrlData></ctrlData>

    </DzRequest>
    <!--E7H 获取模拟量量化数据,模拟量化数据4-->
    <DzRequest>
        <name>cmd_E7_ups_d${object.index}_get_analog4</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>2</addr>
        <ver>17</ver>
        <commandType>10983</commandType>
        <ctrlData></ctrlData>
    </DzRequest>

    <!--43H 获取开关输入状态-->
    <DzRequest>
        <name>cmd_43_ups_d${object.index}_switch_state</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>2</addr>
        <ver>17</ver>
        <commandType>10819</commandType>
        <ctrlData></ctrlData>
    </DzRequest>

    <!--44H 获取告警状态-->
    <DzRequest>
        <name>cmd_44_ups_d${object.index}_alarm_state</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>2</addr>
        <ver>17</ver>
        <commandType>10820</commandType>
        <ctrlData></ctrlData>
    </DzRequest>
</#list>
</linked-list>

