<linked-list>
<#list acList as object>
    <ModbusRequest>
        <name>cmd_pex_${object.index}_2_10025_8</name>
        <commandType>2</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>8</length>
        <registerNumber>25</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pex_${object.index}_2_10034_22</name>
        <commandType>2</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>22</length>
        <registerNumber>34</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pex_${object.index}_2_10058_4</name>
        <commandType>2</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>4</length>
        <registerNumber>58</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pex_${object.index}_2_10064_2</name>
        <commandType>2</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>2</length>
        <registerNumber>64</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pex_${object.index}_2_10067_23</name>
        <commandType>2</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>23</length>
        <registerNumber>67</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_pex_${object.index}_4_30110_41</name>
        <commandType>4</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>41</length>
        <registerNumber>110</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>