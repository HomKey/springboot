<linked-list>
<#list thList as object>
    <ModbusRequest>
        <name>cmd_ws11r_${object.index}_3_0_1</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>1</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>
