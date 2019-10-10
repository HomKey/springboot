<?xml version="1.0" encoding="UTF-8"?>
<linked-list>
<#list upsList as object>
    <ModbusRequest>
        <name>Modbus_MGE_Galaxy300_${object.index}_A1</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>81</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>Modbus_MGE_Galaxy300_${object.index}_A2</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>100</length>
        <registerNumber>224</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>Modbus_MGE_Galaxy300_${object.index}_A3</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>101</length>
        <registerNumber>324</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>Modbus_MGE_Galaxy300_${object.index}_A4</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>100</length>
        <registerNumber>432</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>
