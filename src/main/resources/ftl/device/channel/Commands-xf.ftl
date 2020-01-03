<linked-list>
    <!-- 冷通道 -->
<#list channelList as object>
    <ModbusRequest>
        <name>cmd_channel_xf_${object.index}_1_8_186</name>
        <commandType>1</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <busId>${object.busId}</busId>
        <length>186</length>
        <registerNumber>8</registerNumber>
    </ModbusRequest>
</#list>
</linked-list>

