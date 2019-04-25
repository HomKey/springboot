<linked-list>
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
        <ver>16</ver>
        <commandType>10817</commandType>
        <ctrlData></ctrlData>
    </DzRequest>
    <!--E1H 获取模拟量量化数据,模拟量化数据1-->
    <DzRequest>
        <name>cmd_E1_ups_d${object.index}_get_analog1</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>1</addr>
        <ver>16</ver>
        <commandType>10977</commandType>
        <ctrlData>00</ctrlData>
    </DzRequest>
    <!--E2H 获取模拟量量化数据,模拟量化数据2-->
    <DzRequest>
        <name>cmd_E2_ups_d${object.index}_get_analog2</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>1</addr>
        <ver>16</ver>
        <commandType>10978</commandType>
        <ctrlData>00</ctrlData>
    </DzRequest>
    <!--E7H 获取模拟量量化数据,模拟量化数据4 电池组-->
    <DzRequest>
        <name>cmd_E7_ups_d${object.index}_get_analog4</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>1</addr>
        <ver>16</ver>
        <commandType>10983</commandType>
        <ctrlData>0100</ctrlData>
    </DzRequest>
    <!--43H 获取开关输入状态-->
    <DzRequest>
        <name>cmd_43_ups_d${object.index}_switch_state</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>1</addr>
        <ver>16</ver>
        <commandType>10819</commandType>
        <ctrlData></ctrlData>
    </DzRequest>
    <!--44H 获取告警状态-->
    <DzRequest>
        <name>cmd_44_ups_d${object.index}_alarm_state</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>1</addr>
        <ver>16</ver>
        <commandType>10820</commandType>
        <ctrlData></ctrlData>
    </DzRequest>
</#list>
</linked-list>
