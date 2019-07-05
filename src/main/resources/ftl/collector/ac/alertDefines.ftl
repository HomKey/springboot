<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<linked-list>
  <AlertDefine>
    <id>10000</id>
    <title>空调#${busId}#掉线</title>
    <category>4</category>
    <level>1</level>
    <repeat>5</repeat>
    <descriptionPattern>空调#${busId}#掉线报警</descriptionPattern>
    <rule class="Equal">
      <name>空调#${busId}#</name>
      <limit>0</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>${deviceId}</deviceId>
        <propertyPath>Connection_Status</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
</linked-list>