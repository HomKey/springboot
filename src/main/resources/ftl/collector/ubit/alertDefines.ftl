<?xml version="1.0" encoding="UTF-8"?>

<linked-list> 
  <AlertDefine> 
    <id>10000</id>  
    <title>【U位#${busId}】机柜U位管理掉线</title>
    <category>4</category>  
    <level>1</level>
    <repeat>5</repeat>
    <descriptionPattern>【U位#${busId}】机柜U位管理掉线</descriptionPattern>
    <rule class="Equal">
      <name>Ubit</name>
      <limit>0</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>${deviceId}</deviceId>
        <propertyPath>Connection_Status</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable> 
  </AlertDefine> 
</linked-list>
