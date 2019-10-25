<linked-list>
<#list dmeList as object>
    <DeviceDefine>
        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>
            <SensorDefine>
                <name>CRAC.Temperature</name>
                <registerIndex>0</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Humidity</name>
                <registerIndex>1</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Compressor.high</name>
                <registerIndex>2</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SwitchSensorDefine>
                <!-- 高压告警 -->
                <name>CRAC.Alert.HighVoltage</name>
                <registerIndex>7</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>0</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 低压告警 -->
                <name>CRAC.Alert.LowVoltage</name>
                <registerIndex>7</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>1</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 排气温度告警 -->
                <name>CRAC.Alert.Exhaust.Temperature</name>
                <registerIndex>7</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>2</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 高温告警 -->
                <name>CRAC.Alert.HighTemperature</name>
                <registerIndex>7</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>3</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 低温告警 -->
                <name>CRAC.Alert.LowTemperature</name>
                <registerIndex>7</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>4</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 高湿告警 -->
                <name>CRAC.Alert.HighHumidifier</name>
                <registerIndex>7</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>5</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 低湿告警 -->
                <name>CRAC.Alert.LowHumidifier</name>
                <registerIndex>7</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>6</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 加湿器故障 -->
                <name>CRAC.Alert.Humidifier.ProbeFailed</name>
                <registerIndex>7</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>7</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 回风温度传感器故障告警 -->
                <name>CRAC.Alert.Exception.Return.Temperature</name>
                <registerIndex>7</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>8</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 高压锁定 -->
                <name>CRAC.Alert.HighVoltage.Lock</name>
                <registerIndex>7</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>9</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 低压锁定 -->
                <name>CRAC.Alert.LowVoltage.Lock</name>
                <registerIndex>7</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>10</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 排气锁定 -->
                <name>CRAC.Alert.Exhaust.Lock</name>
                <registerIndex>7</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>11</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 地板溢水锁定 -->
                <name>CRAC.Alert.OverFlow.Water</name>
                <registerIndex>7</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>12</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!--告警_电源丢失 -->
                <name>CRAC.Alert.Power.Lose</name>
                <registerIndex>8</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>13</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!--告警_电源过压 -->
                <name>CRAC.Alert.Power.OverVoltage</name>
                <registerIndex>8</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>14</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!--告警_电源欠压 -->
                <name>CRAC.Alert.Power.LessVoltage</name>
                <registerIndex>8</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>15</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!--告警_电源频偏 -->
                <name>CRAC.Alert.Power.DeviateFrequency</name>
                <registerIndex>9</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>0</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!--告警_电源缺相 -->
                <name>CRAC.Alert.Power.MissAppearance</name>
                <registerIndex>9</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>1</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!--告警_电源反相 -->
                <name>CRAC.Alert.Power.ReversalAppearance</name>
                <registerIndex>9</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>2</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!--节能卡故障 -->
                <name>CRAC.Alert.EnergySavingCard.Failure</name>
                <registerIndex>9</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>4</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!--节能卡故障 -->
                <name>CRAC.Alert.Fan.Failure</name>
                <registerIndex>9</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>4</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!--主风机维护提醒 -->
                <name>CRAC.Alert.Fan.Maintain</name>
                <registerIndex>9</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>5</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 加湿器维护 -->
                <name>CRAC.Alert.Humidifier.Maintain</name>
                <registerIndex>9</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>6</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 过滤网维护 -->
                <name>CRAC.Alert.FilterNet.Maintain</name>
                <registerIndex>9</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>7</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 气流丢失 -->
                <name>CRAC.Alert.Air.Loss</name>
                <registerIndex>9</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>8</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 压力传感器故障 -->
                <name>CRAC.Alert.Pressure.Sensor.Failure</name>
                <registerIndex>9</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>10</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 回风湿度传感器故障 -->
                <name>CRAC.Alert.ReturnHumidifier.Sensor.Failure</name>
                <registerIndex>9</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>11</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 气流传感器故障 -->
                <name>CRAC.Alert.Air.Sensor.Failure</name>
                <registerIndex>9</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>12</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 红外加湿高水位告警 -->
                <name>CRAC.Alert.Red.Humidifier</name>
                <registerIndex>9</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>13</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 风机状态 -->
                <name>CRAC.State.Fan</name>
                <registerIndex>10</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>0</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 制冷状态 -->
                <name>CRAC.State.Cooling</name>
                <registerIndex>10</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>1</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 加热状态 -->
                <name>CRAC.State.Heating</name>
                <registerIndex>10</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>2</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 加湿状态 -->
                <name>CRAC.State.Humidifier</name>
                <registerIndex>10</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>3</routeIndex>
            </SwitchSensorDefine>
            <SwitchSensorDefine>
                <!-- 除湿状态 -->
                <name>CRAC.State.Dehumidifier</name>
                <registerIndex>10</registerIndex>
                <commandName>crac_dme_q1_${object.index}_A${object.busId}</commandName>
                <routeIndex>4</routeIndex>
            </SwitchSensorDefine>
        </iSensorDefines>
    </DeviceDefine>
</#list>
</linked-list>