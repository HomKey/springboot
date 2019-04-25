<linked-list>
<#list dczList as object>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A1</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busid}</busId>
        <length>18</length>
        <registerNumber>2033</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A2</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busid}</busId>
        <length>12</length>
        <registerNumber>2113</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A3</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busid}</busId>
        <length>85</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A4</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busid}</busId>
        <length>85</length>
        <registerNumber>85</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A6</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busid}</busId>
        <length>85</length>
        <registerNumber>255</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A7</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busid}</busId>
        <length>85</length>
        <registerNumber>340</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A9</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busid}</busId>
        <length>85</length>
        <registerNumber>509</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A10</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busid}</busId>
        <length>85</length>
        <registerNumber>594</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A12</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busid}</busId>
        <length>85</length>
        <registerNumber>1779</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_batteryPacket_d${object.index}_A13</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busid}</busId>
        <length>85</length>
        <registerNumber>1864</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>
