<linked-list>
<#list pfjList as object>
    <DeviceDefine>
        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>

            <!--控制器地址 -->
            <SensorDefine>
                <name>NewFan.Controller.Address</name>
                <registerIndex>0</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>paiFan_${object.index}_A_${object.busId}_ai</commandName>
                <divider>1</divider>
            </SensorDefine>

            <!--模式  0x01 自动模式，0x02低风模式，0x04中风模式，0x08高风模式-->
            <SensorDefine>
                <name>NewFan.Pattern</name>
                <registerIndex>1</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>paiFan_${object.index}_A_${object.busId}_ai</commandName>
                <divider>1</divider>
            </SensorDefine>

            <!--设定温度  （实际温度+20）-->
            <SensorDefine>
                <name>NewFan.SettingTemperature</name>
                <registerIndex>2</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>paiFan_${object.index}_A_${object.busId}_ai</commandName>
                <divider>1</divider>
            </SensorDefine>

            <!--室内温度 -->
            <SensorDefine>
                <name>NewFan.InnerDoor.Temperature</name>
                <registerIndex>3</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>paiFan_${object.index}_A_${object.busId}_ai</commandName>
                <divider>1</divider>
            </SensorDefine>

            <!--室内湿度 -->
            <SensorDefine>
                <name>NewFan.InnerDoor.Humidity</name>
                <registerIndex>4</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>paiFan_${object.index}_A_${object.busId}_ai</commandName>
                <divider>1</divider>
            </SensorDefine>

            <!--开机状态 0关 1开 -->
            <SensorDefine>
                <name>NewFan.StartUp.Status</name>
                <registerIndex>0</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>paiFan_${object.index}_A_${object.busId}_di</commandName>
                <divider>1</divider>
            </SensorDefine>


            <!--低风状态 0关 1开 -->
            <SensorDefine>
                <name>NewFan.LowFan.Status</name>
                <registerIndex>9</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>paiFan_${object.index}_A_${object.busId}_di</commandName>
                <divider>1</divider>
            </SensorDefine>

            <!--高风状态 0关 1开 -->
            <SensorDefine>
                <name>NewFan.HighFan.Status</name>
                <registerIndex>11</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>paiFan_${object.index}_A_${object.busId}_di</commandName>
                <divider>1</divider>
            </SensorDefine>

            <!--高温故障 -->
            <SensorDefine>
                <name>NewFan.HighTemperature.BreakDown</name>
                <registerIndex>13</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>paiFan_${object.index}_A_${object.busId}_di</commandName>
                <divider>1</divider>
            </SensorDefine>

            <!--高湿故障 -->
            <SensorDefine>
                <name>NewFan.HighHumidity.BreakDown</name>
                <registerIndex>14</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>paiFan_${object.index}_A_${object.busId}_di</commandName>
                <divider>1</divider>
            </SensorDefine>

            <!--过滤网故障 -->
            <SensorDefine>
                <name>NewFan.FilterNet.BreakDown</name>
                <registerIndex>15</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>paiFan_${object.index}_A_${object.busId}_di</commandName>
                <divider>1</divider>
            </SensorDefine>



        </iSensorDefines>
    </DeviceDefine>
</#list>
</linked-list>
