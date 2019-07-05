<?xml version="1.0" encoding="UTF-8"?>

<linked-list> 
  <AlertDefine> 
    <id>10000</id>  
    <title>【配电柜#${busId}】掉线报警</title>
    <category>4</category>  
    <level>1</level>
    <repeat>5</repeat>
    <descriptionPattern>【配电柜#${busId}】掉线报警</descriptionPattern>
    <rule class="Equal">
      <name>PDC</name>
      <limit>0</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>${deviceId}</deviceId>
        <propertyPath>Connection_Status</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable> 
  </AlertDefine> 
</linked-list>
