<linked-list>
<#list sndAcList as object>
    <ModbusRequest>
        <name>modbus_${object.deviceId}_${object.port}_${object.index}_1_0_100</name>
        <commandType>1</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>100</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>modbus_${object.deviceId}_${object.port}_${object.index}_3_0_50</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>50</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>

