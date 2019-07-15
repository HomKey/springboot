<linked-list>
<#list pduList as object>
    <ModbusRequest>
        <name>cmd_c1_pdu_${object.index}_left_AI_2_10</name>
        <commandType>3</commandType>
        <destinationHost>${object.lip}</destinationHost>
        <port>${object.lport}</port>
        <busId>${object.lbusId}</busId>
        <length>10</length>
        <registerNumber>2</registerNumber>
    </ModbusRequest>
    <ModbusRequest>
        <name>cmd_c1_pdu_${object.index}_right_AI_2_10</name>
        <commandType>3</commandType>
        <destinationHost>${object.rip}</destinationHost>
        <port>${object.rport}</port>
        <busId>${object.rbusId}</busId>
        <length>10</length>
        <registerNumber>2</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>