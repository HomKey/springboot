<linked-list>
<#list elmList as object>
    <ModbusRequest>
        <name>cmd_pm5350bw_${object.index}_3_3000_111</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>112</length>
        <registerNumber>2999</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>
