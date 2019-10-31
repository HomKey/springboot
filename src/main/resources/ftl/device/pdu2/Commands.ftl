<linked-list>
<#list pduList as object>
    <ModbusRequest>
        <name>pdu_v2_AI_0_31_d${object.index}</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>31</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>
