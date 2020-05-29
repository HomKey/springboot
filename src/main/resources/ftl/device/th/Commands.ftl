<linked-list>
<#list thList as object>
    <ModbusRequest>
        <name>th_r2_d${object.ip}_${object.index}_AI</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>2</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>
