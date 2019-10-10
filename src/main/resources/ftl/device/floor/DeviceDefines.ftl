<linked-list>
<#list floorList as object>
  <DeviceDefine>
    <deviceId>${object.deviceId}</deviceId>
    <iSensorDefines>
      <SensorDefine>
        <name>FloodSensor.Switch.Flood</name>
        <registerIndex>0</registerIndex>
        <scale>0</scale>
        <isMean>false</isMean>
        <commandName>cmd_r2_flood${object.index}_di</commandName>
        <divider>1</divider>
      </SensorDefine>
    </iSensorDefines>
  </DeviceDefine>
</#list>
</linked-list>
