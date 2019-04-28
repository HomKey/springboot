<linked-list>
<#list fanList as object>
    <BytesRequest>
        <name>M244.${object.index}.Status.Close.All</name>
        <commandType>0</commandType>
        <destinationHost>${object.host}</destinationHost>
        <port>${object.port}</port>
        <connect>tcp</connect>
        <command>00 01 00 00 00 0F 01 10 00 19 00 04 08 00 00 00 00 00 00 00 00</command>
    </BytesRequest>
    <BytesRequest>
        <name>M244.${object.index}.Status.Open.All</name>
        <commandType>0</commandType>
        <destinationHost>${object.host}</destinationHost>
        <port>${object.port}</port>
        <connect>tcp</connect>
        <command>00 01 00 00 00 0F 01 10 00 19 00 04 08 00 01 00 01 00 01 00 01</command>
    </BytesRequest>
</#list>
</linked-list>