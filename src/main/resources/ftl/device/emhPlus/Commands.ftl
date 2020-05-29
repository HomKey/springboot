<linked-list>
<#list emhPlusList as object>
    <ModbusRequest>
        <name>emh_plus_d${object.index}_AI</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>120</length>
        <registerNumber>8</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>
