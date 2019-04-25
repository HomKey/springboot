<linked-list>
<#list eyhtList as object>
  <ModbusRequest> 
    <name>Transmitter_co2_${object.index}_A</name>
    <commandType>3</commandType>  
    <destinationHost>${object.ip}</destinationHost>
    <port>${object.port}</port>
    <busId>${object.busId}</busId>
    <length>65</length>
    <registerNumber>0</registerNumber>
  </ModbusRequest>
</#list>
</linked-list>
