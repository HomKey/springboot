<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<linked-list>
  <!--<ModbusRequest>
    <name>crac_q1_${deviceId}_A1</name>
    <destinationHost>${ip}</destinationHost>
    <port>${port}</port>
    <busId>${busId}</busId>
    <commandType>3</commandType>
    <registerNumber>0</registerNumber>
    <length>10</length>
  </ModbusRequest>-->
  <ModbusRequest>
    <name>crac_q2_${deviceId}_A1</name>
    <destinationHost>${ip}</destinationHost>
    <port>${port}</port>
    <busId>${busId}</busId>
    <commandType>3</commandType>
    <registerNumber>20</registerNumber>
    <length>16</length>
  </ModbusRequest>
  <ModbusRequest>
    <name>crac_q3_${deviceId}_A1</name>
    <destinationHost>${ip}</destinationHost>
    <port>${port}</port>
    <busId>${busId}</busId>
    <commandType>3</commandType>
    <registerNumber>36</registerNumber>
    <length>17</length>
  </ModbusRequest>
  <!--<ModbusRequest>
    <name>crac_q4_${deviceId}_A1</name>
    <destinationHost>${ip}</destinationHost>
    <port>${port}</port>
    <busId>${busId}</busId>
    <commandType>3</commandType>
    <registerNumber>100</registerNumber>
    <length>10</length>
  </ModbusRequest>-->
</linked-list>