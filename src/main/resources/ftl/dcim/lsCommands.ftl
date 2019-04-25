<linked-list>
<#list lsList as object>
    <ModbusRequest>
        <name>cmd_flood${object.index}_di</name>
        <commandType>1</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId> <!--253-->
        <length>1</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>
