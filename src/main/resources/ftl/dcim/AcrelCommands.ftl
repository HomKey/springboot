<linked-list>
<#list acrelList as object>
    <BytesRequest>
        <name>cmd_acrel_d1_mdbs_AI_${object.index}</name>
        <commandType>0</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>0</busId>
        <length>0</length>
        <registerNumber>0</registerNumber>
        <command>01 03 00 00 00 4F 04 3E</command>
    </BytesRequest>
</#list>
</linked-list>

