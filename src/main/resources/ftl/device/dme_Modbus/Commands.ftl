<linked-list>
<#list dmeList as object>
    <ModbusRequest>
        <name>crac_dme_q1_${object.index}_A${object.busId}</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <commandType>3</commandType>
        <registerNumber>0</registerNumber>
        <length>11</length>
    </ModbusRequest>
</#list>
</linked-list>
