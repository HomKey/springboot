<linked-list>
<#list thList as object>
    <ModbusRequest>
        <name>th_q1_d${object.index}_3_2_2</name>
        <commandType>3</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>2</length>
        <registerNumber>0</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>
