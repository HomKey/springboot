<?xml version="1.0" encoding="UTF-8"?>
<linked-list>
<#list emhList as object>
    <ModbusRequest>
        <name>Modbus_CAEMH_AI_8_124_d${object.index}</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>124</length>
        <registerNumber>8</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>