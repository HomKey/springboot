<linked-list>
<#list xfjList as object>
    <DeviceDefine>

        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>

            <!--开关机控制  0关机 1开机手动 0x11开机自动  0x33开机制热，写命令对应-->
            <SensorDefine>
                <name>NewFan.StartUp.Status</name>
                <registerIndex>40000</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>newFan_${object.index}_A_${object.busId}</commandName>
                <divider>1</divider>
            </SensorDefine>

            <!--风机数量 当前风量0、1、2、3-->
            <SensorDefine>
                <name>NewFan.Count</name>
                <registerIndex>40001</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>newFan_${object.index}_A_${object.busId}</commandName>
                <divider>1</divider>
            </SensorDefine>

            <!--当前温度 -->
            <CommonDefine>
                <name>NewFan.CurrentTemperature</name>
                <commandName>newFan_${object.index}_A_${object.busId}</commandName>
                <index>40002</index>
                <length>2</length>
                <precision>1</precision>
                <isMean>false</isMean>
                <divider>10</divider>
                <calcList>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>

            <!--设定自动控制温度 -->
            <CommonDefine>
                <name>NewFan.Setting.Auto.ControlTemperature</name>
                <index>40003</index>
                <length>2</length>
                <precision>1</precision>
                <isMean>false</isMean>
                <divider>10</divider>
                <commandName>newFan_${object.index}_A_${object.busId}</commandName>
                <calcList>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>

            <!--阀状态  0x00 阀关 ， 0x11 阀开-->
            <SensorDefine>
                <name>NewFan.Threshold.Status</name>
                <registerIndex>40004</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>newFan_${object.index}_A_${object.busId}</commandName>
                <divider>1</divider>
            </SensorDefine>


        </iSensorDefines>
    </DeviceDefine>
</#list>
</linked-list>
