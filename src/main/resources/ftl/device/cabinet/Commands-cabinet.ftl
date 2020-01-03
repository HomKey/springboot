<linked-list>
<#list cabinetList as object>
    <!-- 机柜名称${object.name} -->
    <!-- PDU A -->
    <ModbusRequest>
        <name>pdu_spem_A_${object.index}_3_0_30</name>
        <commandType>3</commandType>
        <destinationHost>${object.pduFrontIp}</destinationHost>
        <port>${object.pduFrontPort}</port>
        <busId>${object.pduFrontBusId}</busId>
        <length>30</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
    <!-- PDU B -->
    <ModbusRequest>
        <name>pdu_spem_B_${object.index}_3_0_30</name>
        <commandType>3</commandType>
        <destinationHost>${object.pduBackIp}</destinationHost>
        <port>${object.pduBackPort}</port>
        <busId>${object.pduBackBusId}</busId>
        <length>30</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
    <!-- 柜内温湿度 -->
    <ModbusRequest>
        <name>th_thada_d${object.index}_3_9_12</name>
        <commandType>3</commandType>
        <destinationHost>${object.thIp}</destinationHost>
        <port>${object.thPort}</port>
        <busId>${object.thBusId}</busId>
        <length>12</length>
        <registerNumber>8</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>th_thada_d${object.index}_3_14_7</name>
        <commandType>1</commandType>
        <destinationHost>${object.thIp}</destinationHost>
        <port>${object.thPort}</port>
        <busId>${object.thBusId}</busId>
        <length>7</length>
        <registerNumber>14</registerNumber>
    </ModbusRequest>

</#list>
</linked-list>
