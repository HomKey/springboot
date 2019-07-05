<?xml version="1.0" encoding="UTF-8"?>

<linked-list>
  <AlertDefine>
    <id>10000</id>
    <title>环境主机掉线</title>
    <category>4</category>
    <level>1</level>
    <repeat>5</repeat>
    <descriptionPattern>环境主机掉线告警</descriptionPattern>
    <rule class="Equal">
      <name>环境主机掉线</name>
      <limit>0</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>${deviceId}</deviceId>
        <propertyPath>Connection_Status</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine> 
    <id>11000</id>  
    <title>【管理服务器】环境主机总报警</title>
    <category>1</category>  
    <level>0</level>  
    <descriptionPattern>{l:name}总报警</descriptionPattern>  
    <rule class="Equal"> 
      <name>环境主机</name>  
      <limit>1</limit>  
      <sensorValue class="SimpleSensorValue"> 
        <deviceId>${deviceId}</deviceId>
        <propertyPath>EMH.Alert.All</propertyPath> 
      </sensorValue> 
    </rule>  
    <enable>true</enable> 
  </AlertDefine>  
  <AlertDefine> 
    <id>21000</id>  
    <title>【管理服务器】环境主机温度越值</title>
    <category>2</category>  
    <level>0</level>  
    <descriptionPattern>{l:name}</descriptionPattern>  
    <rule class="Equal"> 
      <name>环境主机温度越值</name>  
      <limit>1</limit>  
      <sensorValue class="SimpleSensorValue"> 
        <deviceId>${deviceId}</deviceId>
        <propertyPath>EMH.Alert.Temperature.Over</propertyPath> 
      </sensorValue> 
    </rule>  
    <enable>true</enable> 
  </AlertDefine>  
  <AlertDefine> 
    <id>21001</id>  
    <title>【管理服务器】环境主机温度欠值</title>
    <category>2</category>  
    <level>0</level>  
    <descriptionPattern>{l:name}报警</descriptionPattern>  
    <rule class="Equal"> 
      <name>环境主机温度欠值</name>  
      <limit>1</limit>  
      <sensorValue class="SimpleSensorValue"> 
        <deviceId>${deviceId}</deviceId>
        <propertyPath>EMH.Alert.Temperature.Less</propertyPath> 
      </sensorValue> 
    </rule>  
    <enable>true</enable> 
  </AlertDefine>  
  <AlertDefine> 
    <id>21003</id>  
    <title>【管理服务器】环境主机湿度越值</title>
    <category>2</category>  
    <level>0</level>  
    <descriptionPattern>{l:name}报警</descriptionPattern>  
    <rule class="Equal"> 
      <name>环境主机湿度越值</name>  
      <limit>1</limit>  
      <sensorValue class="SimpleSensorValue"> 
        <deviceId>${deviceId}</deviceId>
        <propertyPath>EMH.Alert.Humidity.Over</propertyPath> 
      </sensorValue> 
    </rule>  
    <enable>true</enable> 
  </AlertDefine>  
  <AlertDefine> 
    <id>21004</id>  
    <title>【管理服务器】环境主机湿度欠值</title>
    <category>2</category>  
    <level>0</level>  
    <descriptionPattern>{l:name}报警</descriptionPattern>  
    <rule class="Equal"> 
      <name>环境主机湿度欠值</name>  
      <limit>1</limit>  
      <sensorValue class="SimpleSensorValue"> 
        <deviceId>${deviceId}</deviceId>
        <propertyPath>EMH.Alert.Humidity.Less</propertyPath> 
      </sensorValue> 
    </rule>  
    <enable>true</enable> 
  </AlertDefine>  
  <AlertDefine> 
    <id>21005</id>  
    <title>【管理服务器】烟感报警</title>
    <category>2</category>  
    <level>0</level>  
    <descriptionPattern>{l:name}报警</descriptionPattern>  
    <rule class="Equal"> 
      <name>环境主机烟感</name>  
      <limit>1</limit>  
      <sensorValue class="SimpleSensorValue"> 
        <deviceId>${deviceId}</deviceId>
        <propertyPath>EMH.Alert.Smoke</propertyPath> 
      </sensorValue> 
    </rule>  
    <enable>true</enable> 
  </AlertDefine>  
  <AlertDefine> 
    <id>21006</id>  
    <title>【管理服务器】水浸报警</title>
    <category>2</category>  
    <level>0</level>  
    <descriptionPattern>{l:name}报警</descriptionPattern>  
    <rule class="Equal"> 
      <name>环境主机水浸</name>  
      <limit>1</limit>  
      <sensorValue class="SimpleSensorValue"> 
        <deviceId>${deviceId}</deviceId>
        <propertyPath>EMH.Alert.Water</propertyPath> 
      </sensorValue> 
    </rule>  
    <enable>true</enable> 
  </AlertDefine>  
  <AlertDefine> 
    <id>41000</id>  
    <title>【管理服务器】门磁报警</title>
    <category>2</category>  
    <level>0</level>  
    <descriptionPattern>{l:name}报警</descriptionPattern>  
    <rule class="Equal"> 
      <name>门磁</name>  
      <limit>1</limit>  
      <sensorValue class="SimpleSensorValue"> 
        <deviceId>${deviceId}</deviceId>
        <propertyPath>EMH.Alert.Magnetometer</propertyPath> 
      </sensorValue> 
    </rule>  
    <enable>true</enable> 
  </AlertDefine>  
  <!--<AlertDefine>
    <id>21007</id>  
    <title>【环境主机】气压报警</title>
    <category>2</category>  
    <level>0</level>  
    <descriptionPattern>{l:name}报警</descriptionPattern>
    <rule class="Equal"> 
      <name>环境主机气压</name>  
      <limit>1</limit>  
      <sensorValue class="SimpleSensorValue"> 
        <deviceId>44ee076d-4b09-4209-a030-dee884fbd4ed</deviceId>  
        <propertyPath>EMH.Alert.Pressure</propertyPath> 
      </sensorValue> 
    </rule>  
    <enable>true</enable> 
  </AlertDefine> --> 
</linked-list>
