<linked-list>
<#list pdcList as object>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_4096_101</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>101</length>
        <registerNumber>4096</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_4_70</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>70</length>
        <registerNumber>4</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_74_70</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>70</length>
        <registerNumber>74</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_144_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>144</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_252_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>252</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_360_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>360</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_468_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>468</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_576_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>576</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_684_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>684</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_792_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>792</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pdc_d${object.index}_3_900_108</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>108</length>
        <registerNumber>900</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>
