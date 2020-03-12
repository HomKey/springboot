<linked-list>
<#list thList as object>
    <DeviceDefine>
        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>
            <SensorDefine>
                <name>TH.Temperature</name>
                <registerIndex>0</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_ws11r_${object.index}_3_0_1</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>TH.Humidity</name>
                <registerIndex>1</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_ws11r_${object.index}_3_0_1</commandName>
                <divider>100</divider>
            </SensorDefine>
        </iSensorDefines>
    </DeviceDefine>
</#list>
</linked-list>
