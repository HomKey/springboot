<linked-list>
<#list qyList as object>
  <ModbusRequest> 
    <name>Transmitter_qy_${object.index}_A</name>
    <commandType>3</commandType>  
    <destinationHost>${object.ip}</destinationHost>
    <port>${object.port}</port>
    <busId>${object.busid}</busId>
    <length>2</length>
    <registerNumber>0</registerNumber>
  </ModbusRequest>
</#list>
</linked-list>
