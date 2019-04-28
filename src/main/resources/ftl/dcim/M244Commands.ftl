<linked-list>
<#list fanList as object>
    <BytesRequest>
        <name>cmd_newFan_d${object.index}_tcp</name>
        <connect>tcp</connect>
        <commandType>0</commandType>
        <destinationHost>${object.host}</destinationHost>
        <port>${object.port}</port>
        <busId>0</busId>
        <length>0</length>
        <registerNumber>0</registerNumber>
        <command>00 01 00 00 00 06 01 03 00 21 00 04</command>
    </BytesRequest>
</#list>
</linked-list>