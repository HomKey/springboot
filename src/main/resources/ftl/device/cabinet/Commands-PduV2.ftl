<linked-list>
    <!-- 1个机柜内 2个二代PDU -->
<#list pduList as object>
    <ModbusRequest>
        <name>pdu_v2_AI_0_31_d${object.index}_1</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip1}</destinationHost>
        <port>${object.port1}</port>
        <busId>${object.busId1}</busId>
        <length>31</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>pdu_v2_AI_0_31_d${object.index}_2</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip2}</destinationHost>
        <port>${object.port2}</port>
        <busId>${object.busId2}</busId>
        <length>31</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>
