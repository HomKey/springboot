<linked-list>
  <#list elmList as object>
      <ModbusRequest>
          <name>cmd_ek5a_${object.index}_3_0_45</name>
          <commandType>3</commandType>
          <destinationHost>${object.ip}</destinationHost>
          <port>${object.port}</port>
          <busId>${object.busId}</busId>
          <length>45</length>
          <registerNumber>0</registerNumber>
      </ModbusRequest>
      <ModbusRequest>
          <name>cmd_ek5a_${object.index}_3_54_66</name>
          <commandType>3</commandType>
          <destinationHost>${object.ip}</destinationHost>
          <port>${object.port}</port>
          <busId>${object.busId}</busId>
          <length>66</length>
          <registerNumber>54</registerNumber>
      </ModbusRequest>
  </#list>
</linked-list>
