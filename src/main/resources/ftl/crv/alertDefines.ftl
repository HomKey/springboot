<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<linked-list>
  <AlertDefine>
    <id>10000</id>
    <title>#{title}掉线</title>
    <category>4</category>
    <level>1</level>
    <repeat>5</repeat>
    <descriptionPattern>空调掉线报警</descriptionPattern>
    <rule class="Equal">
      <name>空调</name>
      <limit>0</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>Connection_Status</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10001</id>
    <title>#{title}风机1故障告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>风机1故障告警</descriptionPattern>
    <rule class="Equal">
      <name>风机1</name>
      <limit>0</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.State.Fan1</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10002</id>
    <title>#{title}风机2故障告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>风机2故障告警</descriptionPattern>
    <rule class="Equal">
      <name>风机2</name>
      <limit>0</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.State.Fan2</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10003</id>
    <title>#{title}风机3故障告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>风机3故障告警</descriptionPattern>
    <rule class="Equal">
      <name>风机3</name>
      <limit>0</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.State.Fan3</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10004</id>
    <title>#{title}风机4故障告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>风机4故障告警</descriptionPattern>
    <rule class="Equal">
      <name>风机4</name>
      <limit>0</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.State.Fan4</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10005</id>
    <title>#{title}高压告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>高压告警</descriptionPattern>
    <rule class="Equal">
      <name>高压告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.HighPressure</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10006</id>
    <title>#{title}低压告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>低压告警</descriptionPattern>
    <rule class="Equal">
      <name>低压告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.LowPressure</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10007</id>
    <title>#{title}高压异常告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>高压异常告警</descriptionPattern>
    <rule class="Equal">
      <name>高压异常告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.HighPressure.Abnormal</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10008</id>
    <title>#{title}排气高温告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>排气高温告警</descriptionPattern>
    <rule class="Equal">
      <name>排气高温告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Exhaust.Temperature.High</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10009</id>
    <title>#{title}排气过热度低告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>排气过热度低告警</descriptionPattern>
    <rule class="Equal">
      <name>排气过热度低告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Exhaust.Temperature.Over</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10010</id>
    <title>#{title}回风高温告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>回风高温告警</descriptionPattern>
    <rule class="Equal">
      <name>回风高温告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alert.ReturnAir.Temperature.Over</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10011</id>
    <title>#{title}回风低温告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>回风低温告警</descriptionPattern>
    <rule class="Equal">
      <name>回风低温告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alert.ReturnAir.Temperature.Less</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10012</id>
    <title>#{title}送风高温告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>送风高温告警</descriptionPattern>
    <rule class="Equal">
      <name>送风高温告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alert.OutAir.Temperature.Over</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10013</id>
    <title>#{title}回风高湿告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>回风高湿告警</descriptionPattern>
    <rule class="Equal">
      <name>回风高湿告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alert.ReturnAir.Humidity.Over</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10014</id>
    <title>#{title}回风低湿告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>回风低湿告警</descriptionPattern>
    <rule class="Equal">
      <name>回风低湿告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alert.ReturnAir.Humidity.Less</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10015</id>
    <title>#{title}高压锁定告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>高压锁定告警</descriptionPattern>
    <rule class="Equal">
      <name>高压锁定告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alert.Pressure.High.Lock</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10016</id>
    <title>#{title}低压锁定告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>低压锁定告警</descriptionPattern>
    <rule class="Equal">
      <name>低压锁定告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alert.Pressure.Low.Lock</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10017</id>
    <title>#{title}排气高温锁定告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>排气高温锁定告警</descriptionPattern>
    <rule class="Equal">
      <name>排气高温锁定告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alert.Exhaust.Temperature.High.Lock</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10018</id>
    <title>#{title}排气过热度低锁定告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>排气过热度低锁定告警</descriptionPattern>
    <rule class="Equal">
      <name>排气过热度低锁定告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alert.Exhaust.Temperature.Over.LowLock</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10019</id>
    <title>#{title}电源丢失告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>电源丢失告警</descriptionPattern>
    <rule class="Equal">
      <name>电源丢失告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alert.Power.Loss</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10020</id>
    <title>#{title}电源过压告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>电源过压告警</descriptionPattern>
    <rule class="Equal">
      <name>电源过压告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alert.Power.Voltage.Over</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10021</id>
    <title>#{title}电源欠压告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>电源欠压告警</descriptionPattern>
    <rule class="Equal">
      <name>电源欠压告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alert.Power.Voltage.Less</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10022</id>
    <title>#{title}电源缺相告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>电源缺相告警</descriptionPattern>
    <rule class="Equal">
      <name>电源缺相告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alert.Power.Phase.Miss</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10023</id>
    <title>#{title}地板溢水告警 </title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>地板溢水告警 </descriptionPattern>
    <rule class="Equal">
      <name>地板溢水告警 </name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Flood</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10024</id>
    <title>#{title}高水位告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>高水位告警</descriptionPattern>
    <rule class="Equal">
      <name>高水位告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.WaterLevel.High</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10025</id>
    <title>#{title}滤网堵塞告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>滤网堵塞告警</descriptionPattern>
    <rule class="Equal">
      <name>滤网堵塞告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.FilterClog</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10026</id>
    <title>#{title}滤网维护提醒</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>滤网维护提醒</descriptionPattern>
    <rule class="Equal">
      <name>滤网维护提醒</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Filter.Maintenance</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
  <AlertDefine>
    <id>10027</id>
    <title>#{title}气流丢失告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>气流丢失告警</descriptionPattern>
    <rule class="Equal">
      <name>气流丢失告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Air.Loss</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10028</id>
    <title>#{title}低压传感器锁定</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>低压传感器锁定</descriptionPattern>
    <rule class="Equal">
      <name>低压传感器锁定</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Lock.Sensor.LowPressure</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10029</id>
    <title>#{title}回风温度传感器故障</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>回风温度传感器故障</descriptionPattern>
    <rule class="Equal">
      <name>回风温度传感器故障</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Sensor.ReturnAi.Temperature</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10030</id>
    <title>#{title}回风湿度传感器故障</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>回风湿度传感器故障</descriptionPattern>
    <rule class="Equal">
      <name>回风湿度传感器故障</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Sensor.ReturnAir.Humidity</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10031</id>
    <title>#{title}气流温差传感器故障</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>气流温差传感器故障</descriptionPattern>
    <rule class="Equal">
      <name>气流温差传感器故障</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Sensor.AirDifference.Temperature</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10032</id>
    <title>#{title}送风温度传感器故障</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>送风温度传感器故障</descriptionPattern>
    <rule class="Equal">
      <name>送风温度传感器故障</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Sensor.OutAir.Temperature</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10033</id>
    <title>#{title}远程温度传感器故障</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>远程温度传感器故障</descriptionPattern>
    <rule class="Equal">
      <name>远程温度传感器故障</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Sensor.Remote.Temperature</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10034</id>
    <title>#{title}高压压力传感器故障</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>高压压力传感器故障</descriptionPattern>
    <rule class="Equal">
      <name>高压压力传感器故障</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Sensor.HighPressure</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10035</id>
    <title>#{title}电加热故障告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>电加热故障告警</descriptionPattern>
    <rule class="Equal">
      <name>电加热故障告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.ElectricHeating</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10036</id>
    <title>#{title}排气温度传感器故障</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>排气温度传感器故障</descriptionPattern>
    <rule class="Equal">
      <name>排气温度传感器故障</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Sensor.ExhaustTemperature</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10037</id>
    <title>#{title}风机/电源故障</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>风机/电源故障</descriptionPattern>
    <rule class="Equal">
      <name>风机/电源故障</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Fan.Power</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10038</id>
    <title>#{title}EEV通信故障</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>EEV通信故障</descriptionPattern>
    <rule class="Equal">
      <name>EEV通信故障</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.EEV.Communication</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10039</id>
    <title>#{title}未选择制冷剂告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>未选择制冷剂告警</descriptionPattern>
    <rule class="Equal">
      <name>未选择制冷剂告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.NotSelectRefrigerant</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10040</id>
    <title>#{title}制冷剂不足告警</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>制冷剂不足告警</descriptionPattern>
    <rule class="Equal">
      <name>制冷剂不足告警</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Refrigerant.Inadequate</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10041</id>
    <title>#{title}吸气温度传感器故障</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>吸气温度传感器故障</descriptionPattern>
    <rule class="Equal">
      <name>吸气温度传感器故障</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Sensor.SuctionTemperature</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10042</id>
    <title>#{title}低压压力传感器故障</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>低压压力传感器故障</descriptionPattern>
    <rule class="Equal">
      <name>低压压力传感器故障</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Sensor.LowPressure</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10043</id>
    <title>#{title}压缩机驱动通信故障</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>压缩机驱动通信故障</descriptionPattern>
    <rule class="Equal">
      <name>压缩机驱动通信故障</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Compressor.DriveCommunication</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10044</id>
    <title>#{title}压缩机驱动故障</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>压缩机驱动故障</descriptionPattern>
    <rule class="Equal">
      <name>压缩机驱动故障</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Compressor.Drive</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
<AlertDefine>
    <id>10045</id>
    <title>#{title}压缩机散热器过温</title>
    <category>4</category>
    <level>1</level>
    <descriptionPattern>压缩机散热器过温</descriptionPattern>
    <rule class="Equal">
      <name>压缩机散热器过温</name>
      <limit>1</limit>
      <sensorValue class="SimpleSensorValue">
        <deviceId>#{devid}</deviceId>
        <propertyPath>CRAC.Alarm.Compressor.RadiatorOver</propertyPath>
      </sensorValue>
    </rule>
    <enable>true</enable>
  </AlertDefine>
</linked-list>