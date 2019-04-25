<linked-list>
<#list xfjList as object>
  <ModbusRequest>
      <name>newFan_${object.index}_A_${object.busId}</name>
      <commandType>3</commandType>
      <destinationHost>${object.ip}</destinationHost>
      <port>${object.port}</port>
      <busId>${object.busid}</busId>
      <length>5</length>
      <registerNumber>40000</registerNumber>
  </ModbusRequest>
</#list>
</linked-list>
