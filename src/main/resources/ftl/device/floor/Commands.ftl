<linked-list>
    <!-- 水浸port 默认253-->
<#list floorList as object>
  <ModbusRequest>
    <name>cmd_r2_flood${object.index}_di</name>
    <commandType>1</commandType>
    <destinationHost>${object.ip}</destinationHost>
    <port>${object.port}</port>
    <busId>${object.busId}</busId>
    <length>1</length>
    <registerNumber>0</registerNumber>
  </ModbusRequest>
</#list>
</linked-list>

