<linked-list>
    <!-- 1个机柜内 2个3代PDU，1个柜内温湿度-->
<#list pduList as object>
    <!--AI量，请求超过30个长度就83错误码-->
    <ModbusRequest>
        <name>pdu_spem_A_${object.index}_3_0_30</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip1}</destinationHost>
        <port>${object.port1}</port>
        <busId>${object.busId1}</busId>
        <length>30</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>pdu_spem_B_${object.index}_3_0_30</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip2}</destinationHost>
        <port>${object.port2}</port>
        <busId>${object.busId2}</busId>
        <length>30</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
    <!-- 柜内温湿度 -->
    <ModbusRequest>
        <name>th_thada_d${object.index}_3_9_12</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip3}</destinationHost>
        <port>${object.port3}</port>
        <busId>${object.busId3}</busId>
        <length>12</length>
        <registerNumber>8</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>th_thada_d${object.index}_3_14_7</name>
        <commandType>1</commandType>
        <destinationHost>${object.ip3}</destinationHost>
        <port>${object.port3}</port>
        <busId>${object.busId3}</busId>
        <length>7</length>
        <registerNumber>14</registerNumber>
    </ModbusRequest>

</#list>
</linked-list>
