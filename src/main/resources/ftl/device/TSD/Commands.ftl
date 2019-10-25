<?xml version="1.0" encoding="UTF-8"?>

<linked-list>
<#list tsdList as object>
    <ModbusRequest>
        <name>NewFan_TSD_d${object.index}_AI_0_6</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <registerNumber>0</registerNumber>
        <length>6</length>
    </ModbusRequest>

    <ModbusRequest>
        <name>NewFan_TSD_d${object.index}_AI_12_9</name>
        <commandType>4</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <registerNumber>12</registerNumber>
        <length>9</length>
    </ModbusRequest>

    <ModbusRequest>
        <name>NewFan_TSD_d${object.index}_AI_29_5</name>
        <commandType>4</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <registerNumber>29</registerNumber>
        <length>5</length>
    </ModbusRequest>

    <ModbusRequest>
        <name>NewFan_TSD_d${object.index}_AI_46_5</name>
        <commandType>4</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <registerNumber>46</registerNumber>
        <length>5</length>
    </ModbusRequest>

    <ModbusRequest>
        <name>NewFan_TSD_d${object.index}_AI_63_5</name>
        <commandType>4</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <registerNumber>63</registerNumber>
        <length>5</length>
    </ModbusRequest>

    <ModbusRequest>
        <name>NewFan_TSD_d${object.index}_AI_80_5</name>
        <commandType>4</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <registerNumber>80</registerNumber>
        <length>5</length>
    </ModbusRequest>

    <ModbusRequest>
        <name>NewFan_TSD_d${object.index}_AI_97_5</name>
        <commandType>4</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <registerNumber>97</registerNumber>
        <length>5</length>
    </ModbusRequest>

    <ModbusRequest>
        <name>NewFan_TSD_d${object.index}_AI_114_5</name>
        <commandType>4</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <registerNumber>114</registerNumber>
        <length>5</length>
    </ModbusRequest>
</#list>
</linked-list>
