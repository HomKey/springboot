<linked-list>
<#list amsAc3000List as object>
    <DeviceDefine>
        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>
            <!-- 室内温度 -->
            <CommonDefine>
                <name>CRAC.Indoor.Temperature</name>
                <commandName>cmd_r2_crac_d${object.index}_60_42</commandName>
                <index>0</index>
                <length>4</length>
                <divider>10</divider>
                <precision>1</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <!-- 室内湿度 -->
            <CommonDefine>
                <name>CRAC.Indoor.Humidity</name>
                <commandName>cmd_r2_crac_d${object.index}_60_42</commandName>
                <index>4</index>
                <length>4</length>
                <divider>10</divider>
                <precision>1</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>

            <!-- 室外温度 -->
            <CommonDefine>
                <name>CRAC.Outdoor.Temperature</name>
                <commandName>cmd_r2_crac_d${object.index}_60_42</commandName>
                <index>8</index>
                <length>4</length>
                <divider>10</divider>
                <precision>1</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            uint16Calc
            <hexCalToInt></hexCalToInt>
            <!-- 开机状态：1开，0关 -->
            <CommonDefine>
                <name>CRAC.RunState</name>
                <commandName>cmd_r2_crac_d${object.index}_60_43</commandName>
                <index>0</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 设定温度 -->
            <CommonDefine>
                <name>CRAC.Setting.Temperature</name>
                <commandName>cmd_r2_crac_d${object.index}_60_47</commandName>
                <index>8</index>
                <length>4</length>
                <divider>10</divider>
                <precision>1</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>

            <!-- 温度偏差 -->
            <CommonDefine>
                <name>CRAC.Precision.Temperature</name>
                <commandName>cmd_r2_crac_d${object.index}_60_47</commandName>
                <index>12</index>
                <length>4</length>
                <divider>10</divider>
                <precision>1</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>

            <!-- 湿度设定 -->
            <CommonDefine>
                <name>CRAC.Setting.Humidity</name>
                <commandName>cmd_r2_crac_d${object.index}_60_47</commandName>
                <index>16</index>
                <length>4</length>
                <divider>10</divider>
                <precision>1</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>

            <!-- 湿度偏差 -->
            <CommonDefine>
                <name>CRAC.Precision.Humidity</name>
                <commandName>cmd_r2_crac_d${object.index}_60_47</commandName>
                <index>20</index>
                <length>4</length>
                <divider>10</divider>
                <precision>1</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>

            <!-- 风机状态 -->
            <CommonDefine>
                <name>CRAC.Module.1.InnerBlower.1.RunState</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>2</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>1</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 制冷状态 -->
            <CommonDefine>
                <name>CRAC.Module.1.Cold.1.RunState</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>2</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>2</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 加热状态 -->
            <CommonDefine>
                <name>CRAC.Module.1.Hot.1.RunState</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>2</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>3</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 加湿状态 -->
            <CommonDefine>
                <name>CRAC.Module.1.Humidify.RunState</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>2</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>4</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 除湿状态 -->
            <CommonDefine>
                <name>CRAC.Module.1.Dehumidify.RunState</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>2</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>5</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 高压告警 -->
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.HighPressure</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>6</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>0</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 低压告警 -->
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.LowPressure</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>6</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>1</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 高温告警 -->
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.HighTemperature</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>6</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>2</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 低温告警 -->
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.LowTemperature</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>6</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>3</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 高湿告警 -->
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.HighHumidify</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>6</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>4</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 低湿告警 -->
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.LowHumidify</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>6</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>5</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 电源故障告警 -->
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.Power</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>6</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>6</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 短周期告警 -->
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.ShortPeriod</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>6</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>7</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 过滤网维护报警 -->
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.Filter.Fault</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>8</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>4</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <CommonDefine>
                <name>CRAC.Module.1.Alarm.Communication</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>5</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <getBitCalc>
                        <bitIndex>5</bitIndex>
                    </getBitCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
        </iSensorDefines>
    </DeviceDefine>
</#list>
</linked-list>
