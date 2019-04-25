<linked-list>
<#list qyList as object>
    <DeviceDefine>
        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>

            <!--气压-->
            <SensorDefine>
                <name>Transmitter.AirPressure</name>
                <registerIndex>0</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_qy_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--温度值-->
            <SensorDefine>
                <name>Transmitter.Temperature</name>
                <registerIndex>1</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_qy_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>


        </iSensorDefines>
    </DeviceDefine>
</#list>
</linked-list>
