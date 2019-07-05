<?xml version="1.0" encoding="UTF-8"?>

<!--15 温湿度，4 气压-->
<linked-list> 
  <ModbusRequest> 
    <name>emh_q1_${ip}_A1</name>
    <commandType>1</commandType>  
    <destinationHost>${ip}</destinationHost>
    <port>6001</port>  
    <busId>1</busId>  
    <length>111</length>  
    <registerNumber>8</registerNumber> 
  </ModbusRequest>  
  <ModbusRequest> 
    <name>emh_q2_${ip}_A1</name>
    <commandType>1</commandType>  
    <destinationHost>${ip}</destinationHost>
    <port>6001</port>  
    <busId>1</busId>  
    <length>75</length>  
    <registerNumber>119</registerNumber> 
  </ModbusRequest>  
  <ModbusRequest> 
    <name>emh_q3_${ip}_A1</name>
    <commandType>3</commandType>  
    <destinationHost>${ip}</destinationHost>
    <port>6001</port>  
    <busId>1</busId>  
    <length>34</length>  
    <registerNumber>8</registerNumber> 
  </ModbusRequest> 
</linked-list>
