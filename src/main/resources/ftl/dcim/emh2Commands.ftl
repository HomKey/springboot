<linked-list>
<#list emhList as object>
    <ModbusRequest>
        <name>emhPro_D1_DI_Index_${object.index}</name>
        <commandType>1</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>464</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>
