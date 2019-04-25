<linked-list>
<#list amsAc3000List as object>
    <DeviceDefine>
        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>
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
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.Filter.Fault</name>
                <commandName>cmd_r2_crac_d${object.index}_60_82</commandName>
                <index>5</index>
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
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.InnerBlower.1.Overload</name>
                <commandName>cmd_crac_d${object.index}_60_85</commandName>
                <index>4</index>
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
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.InnerBlower.2.Overload</name>
                <commandName>cmd_crac_d${object.index}_60_85</commandName>
                <index>4</index>
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
            <CommonDefine>
                <name>CRAC.Module.2.Alarm.InnerBlower.1.Overload</name>
                <commandName>cmd_crac_d${object.index}_60_85</commandName>
                <index>4</index>
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
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.Filter.Fault</name>
                <commandName>cmd_crac_d${object.index}_60_85</commandName>
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
            <CommonDefine>
                <name>CRAC.Alarm.Smoke</name>
                <commandName>cmd_crac_d${object.index}_60_85</commandName>
                <index>8</index>
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
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.Compressor.1.Overload</name>
                <commandName>cmd_crac_d${object.index}_60_85</commandName>
                <index>8</index>
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
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.Compressor.2.Overload</name>
                <commandName>cmd_crac_d${object.index}_60_85</commandName>
                <index>8</index>
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
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.Heater.1.Protect</name>
                <commandName>cmd_crac_d${object.index}_60_85</commandName>
                <index>10</index>
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
            <CommonDefine>
                <name>CRAC.Module.1.Alarm.Heater.2.Protect</name>
                <commandName>cmd_crac_d${object.index}_60_85</commandName>
                <index>10</index>
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
        </iSensorDefines>
    </DeviceDefine>
</#list>
</linked-list>
