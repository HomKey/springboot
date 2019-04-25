<linked-list>
<#list amsUpsList as object>
    <DeviceDefine>
        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>
            <!--B相输入电压-->
            <CommonDefine>
                <name>UPS.Input.A.Current</name>
                <commandName>cmd_41_ups_d${object.index}_get_sys_analog</commandName>
                <index>2</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--B相输入电压-->
            <CommonDefine>
                <name>UPS.Input.B.Current</name>
                <commandName>cmd_41_ups_d${object.index}_get_sys_analog</commandName>
                <index>10</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>


            <!--C相输入电压-->
            <CommonDefine>
                <name>UPS.Input.C.Current</name>
                <commandName>cmd_41_ups_d${object.index}_get_sys_analog</commandName>
                <index>18</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--A相输出电压-->
            <CommonDefine>
                <name>UPS.Output.A.Voltage</name>
                <commandName>cmd_41_ups_d${object.index}_get_sys_analog</commandName>
                <index>26</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--B相输出电压-->
            <CommonDefine>
                <name>UPS.Output.B.Voltage</name>
                <commandName>cmd_41_ups_d${object.index}_get_sys_analog</commandName>
                <index>34</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--C相输出电压-->
            <CommonDefine>
                <name>UPS.Output.C.Voltage</name>
                <commandName>cmd_41_ups_d${object.index}_get_sys_analog</commandName>
                <index>42</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--A相输出电流-->
            <CommonDefine>
                <name>UPS.Output.A.Current</name>
                <commandName>cmd_41_ups_d${object.index}_get_sys_analog</commandName>
                <index>50</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--B相输出电流-->
            <CommonDefine>
                <name>UPS.Output.B.Current</name>
                <commandName>cmd_41_ups_d${object.index}_get_sys_analog</commandName>
                <index>58</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--C相输出电流-->
            <CommonDefine>
                <name>UPS.Output.C.Current</name>
                <commandName>cmd_41_ups_d${object.index}_get_sys_analog</commandName>
                <index>66</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--直流输入电压 (电池组1电池电压-->
            <CommonDefine>
                <name>UPS.BatteryGroup.1.Voltage</name>
                <commandName>cmd_41_ups_d${object.index}_get_sys_analog</commandName>
                <index>74</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--输出频率 (三相一致)-->
            <CommonDefine>
                <name>UPS.OutPut.Frequency</name>
                <commandName>cmd_41_ups_d${object.index}_get_sys_analog</commandName>
                <index>82</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>


            <CommonDefine>
                <name>UPS.Output.A.PowerFactor</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>6</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>UPS.Output.B.PowerFactor</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>14</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>UPS.Output.C.PowerFactor</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>22</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>UPS.Output.A.PeakRate</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>30</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>UPS.Output.B.PeakRate</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>38</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>UPS.Output.C.PeakRate</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>46</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <CommonDefine>
                <name>UPS.Output.A.ActivePower</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>54</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>UPS.Output.B.ActivePower</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>62</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>UPS.Output.C.ActivePower</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>68</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>UPS.Output.A.ApparentPower</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>76</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>UPS.Output.B.ApparentPower</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>84</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>UPS.Output.C.ApparentPower</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>92</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>UPS.Output.A.LoadRate</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>100</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>UPS.Output.B.LoadRate</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>108</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>UPS.Output.C.LoadRate</name>
                <commandName>cmd_E2_ups_d${object.index}_get_analog2</commandName>
                <index>116</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--电池后备时间-->
            <CommonDefine>
                <name>UPS.Battery.ReserveTime</name>
                <commandName>cmd_E7_ups_d${object.index}_get_analog4</commandName>
                <index>6</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--正电池电压-->
            <CommonDefine>
                <name>UPS.Positive.Battery.Voltage</name>
                <commandName>cmd_E7_ups_d${object.index}_get_analog4</commandName>
                <index>4</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--正电池电流-->
            <CommonDefine>
                <name>UPS.Positive.Battery.Current</name>
                <commandName>cmd_E7_ups_d${object.index}_get_analog4</commandName>
                <index>14</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--负电池电压-->
            <CommonDefine>
                <name>UPS.Negative.Battery.Voltage</name>
                <commandName>cmd_E7_ups_d${object.index}_get_analog4</commandName>
                <index>22</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--负电池电流-->
            <CommonDefine>
                <name>UPS.Negative.Battery.Current</name>
                <commandName>cmd_E7_ups_d${object.index}_get_analog4</commandName>
                <index>30</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--电池老化系数-->
            <CommonDefine>
                <name>UPS.Battery.Agingcoefficient</name>
                <commandName>cmd_E7_ups_d${object.index}_get_analog4</commandName>
                <index>38</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--电池温度-->
            <CommonDefine>
                <name>UPS.Battery.Temperature</name>
                <commandName>cmd_E7_ups_d${object.index}_get_analog4</commandName>
                <index>46</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--环境温度-->
            <CommonDefine>
                <name>UPS.Environment.Temperature</name>
                <commandName>cmd_E7_ups_d${object.index}_get_analog4</commandName>
                <index>54</index>
                <length>8</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <ieee32FloatCalc>
                        <highHead>false</highHead>
                    </ieee32FloatCalc>
                </calcList>
            </CommonDefine>

            <!--本机架供电模式-->
            <CommonDefine>
                <name>UPS.Mode.PowerSupply</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>2</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="1" target="1"></map>
                        <map val="2" target="2"></map>
                        <map val="0xe9" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组1自检-->
            <CommonDefine>
                <name>UPS.State.BatteryGroup.1.Test</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>6</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组1均充浮充-->
            <CommonDefine>
                <name>UPS.State.BatteryGroup.1.PowerSupply</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>8</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="2"></map>
                        <map val="0xe2" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--整机开机/关机-->
            <CommonDefine>
                <name>UPS.State.StartUp</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>10</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe1" target="1"></map>
                        <map val="0xe0" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--整流器供电状态-->
            <CommonDefine>
                <name>UPS.State.Rectifier.PowerSupply</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>12</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="0"></map>
                        <map val="0xe1" target="1"></map>
                        <map val="0xe2" target="2"></map>
                        <map val="0xe3" target="3"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!--整机发电机模式状态-->
            <CommonDefine>
                <name>UPS.State.Generator.Access</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>14</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--整机输入空开状态 e0断开 ,e1闭合-->
            <CommonDefine>
                <name>UPS.State.AirSwitch</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>16</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--整机维修旁路空开 e0断开 ,e1闭合-->
            <CommonDefine>
                <name>UPS.State.Maintain.Bypass.AirSwitch</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>18</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>


            <!--整机旁路空开 e0断开 ,e1闭合-->
            <CommonDefine>
                <name>UPS.State.Bypass.AirSwitch</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>20</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--整机输出空开 e0断开 ,e1闭合-->
            <CommonDefine>
                <name>UPS.State.OutPut.AirSwitch</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>22</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--整机旋转空开状态 0关闭 1测试 2正常 3旁路 4维修-->
            <CommonDefine>
                <name>UPS.State.OutPut.AirSwitch</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>24</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="0"></map>
                        <map val="0xe1" target="1"></map>
                        <map val="0xe2" target="2"></map>
                        <map val="0xe3" target="3"></map>
                        <map val="0xe4" target="4"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--机架并机系统供电状态 0不供电 1旁路供电 2市电供电 3电池逆变供电 4联合供电 5输出禁止-->
            <CommonDefine>
                <name>UPS.State.System.SupplyPower</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>26</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="0"></map>
                        <map val="0xe1" target="1"></map>
                        <map val="0xe2" target="2"></map>
                        <map val="0xe3" target="3"></map>
                        <map val="0xe4" target="4"></map>
                        <map val="0xe5" target="5"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组2自检-->
            <CommonDefine>
                <name>UPS.State.BatteryGroup.2.Test</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>28</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组2均充浮充-->
            <CommonDefine>
                <name>UPS.State.BatteryGroup.2.PowerSupply</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>30</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="2"></map>
                        <map val="0xe2" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!--模块.1.在线状态 -->
            <CommonDefine>
                <name>UPS.State.Model.1</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>32</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块.2.在线状态 -->
            <CommonDefine>
                <name>UPS.State.Model.2</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>34</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块.3.在线状态 -->
            <CommonDefine>
                <name>UPS.State.Model.3</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>36</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块.4.在线状态 -->
            <CommonDefine>
                <name>UPS.State.Model.4</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>38</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块.5.在线状态 -->
            <CommonDefine>
                <name>UPS.State.Model.5</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>40</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块.6.在线状态 -->
            <CommonDefine>
                <name>UPS.State.Model.6</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>42</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块.7.在线状态 -->
            <CommonDefine>
                <name>UPS.State.Model.7</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>44</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块.8.在线状态 -->
            <CommonDefine>
                <name>UPS.State.Model.8</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>46</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块.9.在线状态 -->
            <CommonDefine>
                <name>UPS.State.Model.9</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>48</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块.10.在线状态 -->
            <CommonDefine>
                <name>UPS.State.Model.10</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>50</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--变频器模式 oxe0 正常模式 0xe1 变频器模式 -->
            <CommonDefine>
                <name>UPS.State.Transducer</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>52</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--ECO模式状态 oxe0 正常模式 0xe1 ECO模式 -->
            <CommonDefine>
                <name>UPS.State.ECO</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>54</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块.11.在线状态 -->
            <CommonDefine>
                <name>UPS.State.Model.11</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>56</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块.12.在线状态 -->
            <CommonDefine>
                <name>UPS.State.Model.12</name>
                <commandName>cmd_43_ups_d${object.index}_switch_state</commandName>
                <index>58</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0xe0" target="1"></map>
                        <map val="0xe1" target="0"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 逆变器同步状态 0正常 3不同步-->
            <CommonDefine>
                <name>UPS.State.Inverter.Sync</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>2</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="3" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 主电路电压异常 0正常 0xf0异常-->
            <CommonDefine>
                <name>UPS.Fault.MainCircuit.Voltage</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>4</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 整流器 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.Rectifier</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>6</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 逆变器 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.Inverter</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>8</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 旁路状态（频率或电压） 0正常 0xf0超限-->
            <CommonDefine>
                <name>UPS.Alarm.Bypass.Overlimit</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>10</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xE0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 电池组1状态（频率或电压） 0正常 0xf0低于下限 f1高于上限 f2 电池无 f3预告警 f4 电池接反-->
            <CommonDefine>
                <name>UPS.State.BatteryGroup.1</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>12</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                        <map val="0xf1" target="2"></map>
                        <map val="0xf2" target="3"></map>
                        <map val="0xf3" target="4"></map>
                        <map val="0xf4" target="5"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>


            <!-- 功率模块.1.故障 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.PowerModel.1</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>18</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 功率模块.1.故障 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.PowerModel.1</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>18</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 功率模块.2.故障 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.PowerModel.2</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>20</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 功率模块.3.故障 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.PowerModel.3</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>22</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 功率模块.4.故障 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.PowerModel.4</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>24</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 功率模块.5.故障 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.PowerModel.5</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>26</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 功率模块.6.故障 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.PowerModel.6</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>28</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 功率模块.7.故障 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.PowerModel.7</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>30</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 功率模块.8.故障 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.PowerModel.8</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>32</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 功率模块.9.故障 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.PowerModel.9</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>34</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- 功率模块.10.故障 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.PowerModel.10</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>36</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!-- LBS异常 0正常 0xf0故障-->
            <CommonDefine>
                <name>UPS.Fault.LBS</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>38</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 键盘板故障或者机型容量无效 0正常 0xf0键盘版故障 0xf1机型容量无效-->
            <CommonDefine>
                <name>UPS.Fault.LBS</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>40</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                        <map val="0xf1" target="2"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!-- 风扇故障 0正常 0xf0-->
            <CommonDefine>
                <name>UPS.Fault.Fan</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>42</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--环境温度过高-->
            <CommonDefine>
                <name>UPS.Alarm.Environment.Temperature</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>44</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--紧急关机-->
            <CommonDefine>
                <name>UPS.Fault.EmergencyShutdown</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>46</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--旁路晶闸管故障-->
            <CommonDefine>
                <name>UPS.Fault.Bypass.Thyristor</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>48</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!--旁路相序反-->
            <CommonDefine>
                <name>UPS.Fault.Bypass.PhaseReversed</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>50</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>
            <!--旁路过流故障-->
            <CommonDefine>
                <name>UPS.Alarm.Bypass.Current</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>52</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--旁路异常关机-->
            <CommonDefine>
                <name>UPS.Fault.Bypass.AbnormalShutdown</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>54</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--旁路切换次数限制-->
            <CommonDefine>
                <name>UPS.Fault.Bypass.SwitchLimit</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>56</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块并机故障-->
            <CommonDefine>
                <name>UPS.Fault.ModelMergeMachine</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>58</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块并机接线故障-->
            <CommonDefine>
                <name>UPS.Fault.ModelMergeMachineLine</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>60</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--模块并机通信故障-->
            <CommonDefine>
                <name>UPS.Fault.ModelMergeMachine.Communication</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>62</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--辅助电源2掉电-->
            <CommonDefine>
                <name>UPS.Fault.Auxiliary.PowerTwo.LoseElec</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>64</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--接触器电源板1故障-->
            <CommonDefine>
                <name>UPS.Fault.Contactor.PowerPanel.1</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>66</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--接触器电源板2故障-->
            <CommonDefine>
                <name>UPS.Fault.Contactor.PowerPanel.2</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>68</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--冗余风扇电源故障-->
            <CommonDefine>
                <name>UPS.Fault.Redundancy.Fan</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>70</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--BCB接入情况 0 BCB未接入 1 BCB闭合 2 BCB断开-->
            <CommonDefine>
                <name>UPS.State.AccessBCB</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>72</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                        <map val="0xf1" target="2"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.1.接触器故障 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.Contactor.1</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>74</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.2.接触器故障 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.Contactor.2</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>76</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.1.变换器.故障 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.Convertor.1</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>78</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.2.变换器.故障 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.Convertor.2</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>80</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.1.变换器.过流 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.Convertor.OverCurrent.1</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>82</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.2.变换器.过流 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.OverCurrent.2</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>84</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.1.变换器.过温 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.Convertor.OverTemperature.1</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>86</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.2.变换器.过温 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.OverTemperature.2</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>88</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.1.充电器.故障 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.Changer.1</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>90</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.2.充电器.故障 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.Changer.2</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>92</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.1.寿命情况   0 正常 1 电池需要更换 1 电池寿命终结-->
            <CommonDefine>
                <name>UPS.State.BatteryGroup.LifeTime.1</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>94</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                        <map val="0xf1" target="2"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.2.寿命情况   0 正常 1 电池需要更换 1 电池寿命终结-->
            <CommonDefine>
                <name>UPS.State.BatteryGroup.LifeTime.2</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>96</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                        <map val="0xf1" target="2"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.1.过温 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.OverTemperature.1</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>98</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.2.过温 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.OverTemperature.2</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>100</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.1.接地.故障 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.ConnectionGround.1</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>102</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--电池组.2.接地.故障 -->
            <CommonDefine>
                <name>UPS.Fault.BatteryGroup.ConnectionGround.2</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>104</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--主路频率异常 0 正常 1 超限 -->
            <CommonDefine>
                <name>UPS.Fault.MainCircuit.Frequency</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>106</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--平衡电感过温 0 正常 1 过温 -->
            <CommonDefine>
                <name>UPS.Alarm.BalanceElecInductance.OverTemperature</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>108</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--输入电感过温 0 正常 1 过温 -->
            <CommonDefine>
                <name>UPS.Alarm.InputElecInductance.OverTemperature</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>110</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--整流器过温 0 正常 1 过温 -->
            <CommonDefine>
                <name>UPS.Alarm.Rectifier.OverTemperature</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>112</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--平衡电路故障 0 正常 1 故障 -->
            <CommonDefine>
                <name>UPS.Fault.BalanceCircuit</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>114</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--平衡电路过流 0 正常 1 过流 -->
            <CommonDefine>
                <name>UPS.Alarm.BalanceCircuit.OverCurrent</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>116</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--主路熔丝断 0 正常 1断  -->
            <CommonDefine>
                <name>UPS.Alarm.MainCircuit.FuseWireBreak</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>118</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--辅助电源1掉电-->
            <CommonDefine>
                <name>UPS.Fault.Auxiliary.PowerOne.LoseElec</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>120</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--主路相序反-->
            <CommonDefine>
                <name>UPS.Fault.MainCircuit.PhaseReversed</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>122</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--整流器过流 0 正常 1 过流 -->
            <CommonDefine>
                <name>UPS.Alarm.Rectifier.OverCurrent</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>124</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--软起动失败 0 正常 1 故障 -->
            <CommonDefine>
                <name>UPS.Fault.SoftStart</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>126</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--逆变电感过温 0 正常 1 过温 -->
            <CommonDefine>
                <name>UPS.Alarm.InverterElecInductance.OverTemperature</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>128</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--逆变过温 0 正常 1 过温 -->
            <CommonDefine>
                <name>UPS.Alarm.Inverter.OverTemperature</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>130</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--逆变晶闸管故障 0 正常 1 故障 -->
            <CommonDefine>
                <name>UPS.Fault.Inverter.Thyristor</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>132</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--用户操作错误 0 正常 1 错误-->
            <CommonDefine>
                <name>UPS.Alarm.UserOperationError</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>134</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--输出熔丝断 0 正常 1 断-->
            <CommonDefine>
                <name>UPS.Alarm.OutPut.FuseWireBreak</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>136</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--单机输出过载 0 正常 1 过载-->
            <CommonDefine>
                <name>UPS.Alarm.StandAlone.OutPutOverLoad</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>138</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--并机系统过载 0 正常 1 过载-->
            <CommonDefine>
                <name>UPS.Alarm.MergeMachineSystem.OverLoad</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>140</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--单机过载超时 0 正常 1 过载超时-->
            <CommonDefine>
                <name>UPS.Alarm.StandAlone.OverLoad.OverTime</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>142</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--交流输出过压 0 正常 1 过压-->
            <CommonDefine>
                <name>UPS.Alarm.Alternating.OutPutOverVoltage</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>144</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--逆变器过流 0 正常 1 过流-->
            <CommonDefine>
                <name>UPS.Alarm.Inverter.OverCurrent</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>146</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--负载冲击转旁路 0 正常 1 故障-->
            <CommonDefine>
                <name>UPS.Fault.LoadPunchToBypass</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>148</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--并机均流故障 0 正常 1 故障-->
            <CommonDefine>
                <name>UPS.Fault.MergeMachine.AvgCurrent</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>150</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>

            <!--母线异常关机 0 正常 1 故障-->
            <CommonDefine>
                <name>UPS.Fault.BusBar.Shutdown</name>
                <commandName>cmd_44_ups_d${object.index}_alarm_state</commandName>
                <index>152</index>
                <length>2</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <mapIntCalc except="0">
                        <map val="0" target="0"></map>
                        <map val="0xf0" target="1"></map>
                    </mapIntCalc>
                </calcList>
            </CommonDefine>


        </iSensorDefines>
    </DeviceDefine>
</#list>
</linked-list>
