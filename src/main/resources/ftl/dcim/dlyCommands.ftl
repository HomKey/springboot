<linked-list>
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
</linked-list>
