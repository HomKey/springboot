<linked-list>
    <#list pduList as object>
    <!--AI量，请求超过30个长度就83错误码-->
    <ModbusRequest>
        <name>pdu_spem_${object.index}_3_0_30</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>30</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>

    <!--温度设定上下限值-->
    <ModbusRequest>
        <name>pdu_spem_${object.index}_3_30_8</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>8</length>
        <registerNumber>30</registerNumber>
    </ModbusRequest>

    <!--电-->
    <ModbusRequest>
        <name>pdu_spem_${object.index}_3_3926_4</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>4</length>
        <registerNumber>3926</registerNumber>
    </ModbusRequest>


    <ModbusRequest>
        <name>pdu_spem_${object.index}_2_2_4</name>
        <commandType>2</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>4</length>
        <registerNumber>2</registerNumber>
    </ModbusRequest>

    <ModbusRequest>
        <name>pdu_spem_${object.index}_2_10_4</name>
        <commandType>2</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>4</length>
        <registerNumber>10</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>
