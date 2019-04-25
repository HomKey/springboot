<linked-list>
<#list amsAcList as object>
    <DeviceDefine>
        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>
            <CommonSensorDefine>
                <name>Room.Temperature</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>0</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <CommonSensorDefine>
                <name>Room.Humidity</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>4</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <CommonSensorDefine>
                <name>AC.Input.A.Voltage</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>8</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <CommonSensorDefine>
                <name>AC.Input.B.Voltage</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>12</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <CommonSensorDefine>
                <name>AC.Input.C.Voltage</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>16</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <CommonSensorDefine>
                <name>Humidifier.Current</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>20</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <CommonSensorDefine>
                <name>Power.frequency</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>24</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <CommonSensorDefine>
                <name>Temperature.1</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>28</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <CommonSensorDefine>
                <name>Temperature.2</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>32</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <CommonSensorDefine>
                <name>Temperature.3</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>36</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <CommonSensorDefine>
                <name>Temperature.4</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>40</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <CommonSensorDefine>
                <name>Analog.Quantity.1</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>44</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <CommonSensorDefine>
                <name>Analog.Quantity.2</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>48</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <CommonSensorDefine>
                <name>Analog.Quantity.3</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>52</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <CommonSensorDefine>
                <name>Analog.Quantity.4</name>
                <commandName>cmd_crac_${object.deviceId}_d1_60_42</commandName>
                <index>56</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--高压开关1-->
            <CommonSensorDefine>
                <name>HighPressure.Switch1.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>0</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--高压开关2-->
            <CommonSensorDefine>
                <name>HighPressure.Switch2.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>2</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--低压开关1-->
            <CommonSensorDefine>
                <name>LowPressure.Switch1.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>4</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--低压开关2-->
            <CommonSensorDefine>
                <name>LowPressure.Switch2.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>6</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--排气温度开关1-->
            <CommonSensorDefine>
                <name>Exhausted.Air.Temperature1.Switch.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>8</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--排气温度开关2-->
            <CommonSensorDefine>
                <name>Exhausted.Air.Temperature2.Switch.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>10</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <!--过滤网开关-->
            <CommonSensorDefine>
                <name>FilterNet.Switch.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>12</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <!--地板溢水开关-->
            <CommonSensorDefine>
                <name>WaterFloor.Switch.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>14</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--风机故障开关-->
            <CommonSensorDefine>
                <name>FanException.Switch.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>16</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--气流不足开关-->
            <CommonSensorDefine>
                <name>AirFloorNotEnough.Switch.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>22</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--自定义开关1-->
            <CommonSensorDefine>
                <name>Custom1.Switch.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>24</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--自定义开关2-->
            <CommonSensorDefine>
                <name>Custom2.Switch.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>26</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--自定义开关3-->
            <CommonSensorDefine>
                <name>Custom3.Switch.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>28</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>


            <!--自定义开关4-->
            <CommonSensorDefine>
                <name>Custom4.Switch.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>30</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--CM+水位探头-->
            <CommonSensorDefine>
                <name>CMAndWaterBit.Switch.State</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>32</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>
            <!--远程关机-->
            <CommonSensorDefine>
                <name>RemoteShutDown</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>34</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--加湿器告警-->
            <CommonSensorDefine>
                <name>Humidifier.Alert</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>36</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--烟感输入-->
            <CommonSensorDefine>
                <name>Smoke.Input</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>38</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--电加热告警输入-->
            <CommonSensorDefine>
                <name>Electric.Heating.Input.Alert</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>40</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--红外加湿高水位-->
            <CommonSensorDefine>
                <name>InfraredRay.Humidifier.HighWaterBit</name>
                <commandName>cmd_crac_${object.index}_d1_60_85</commandName>
                <index>42</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--空调开关机状态-->
            <CommonSensorDefine>
                <name>AC.StartUp.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>0</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--空调开关机状态-->
            <CommonSensorDefine>
                <name>AC.StartUp.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>0</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--空调开关机状态-->
            <CommonSensorDefine>
                <name>AC.StartUp.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>0</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--风机输出开关状态-->
            <CommonSensorDefine>
                <name>Fan.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>2</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--加湿机输出开关状态-->
            <CommonSensorDefine>
                <name>Humidifier.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>4</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--压缩机1输出开关状态-->
            <CommonSensorDefine>
                <name>Compressor1.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>6</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--压缩机2输出开关状态-->
            <CommonSensorDefine>
                <name>Compressor2.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>8</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--加热1输出开关状态-->
            <CommonSensorDefine>
                <name>Heating1.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>10</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--加热2输出开关状态-->
            <CommonSensorDefine>
                <name>Heating2.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>12</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--公共报警输出开关状态-->
            <CommonSensorDefine>
                <name>Public.Alarm.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>14</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--液路旁通1输出开关状态-->
            <CommonSensorDefine>
                <name>liquid1.ByPass.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>16</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--液路旁通2输出开关状态-->
            <CommonSensorDefine>
                <name>liquid2.ByPass.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>18</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--注水输出开关状态-->
            <CommonSensorDefine>
                <name>Injected.Water.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>20</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--除湿输出开关状态-->
            <CommonSensorDefine>
                <name>Dehumidification.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>22</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--备用输出开关状态-->
            <CommonSensorDefine>
                <name>StandBy.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>24</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--压缩机1反相输出开关状态-->
            <CommonSensorDefine>
                <name>Compressor1.Reversed.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>26</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--压缩机2反相输出开关状态-->
            <CommonSensorDefine>
                <name>Compressor2.Reversed.OutPut.Switch.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>28</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--制冷状态-->
            <CommonSensorDefine>
                <name>MakeCold.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>30</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--加热状态-->
            <CommonSensorDefine>
                <name>Heating.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>32</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--除湿状态-->
            <CommonSensorDefine>
                <name>DeHumidity.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>34</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>

            <!--加湿状态-->
            <CommonSensorDefine>
                <name>DoHumidity.State</name>
                <commandName>DZ_{devid}_{busid}_24706_</commandName>
                <index>36</index>
                <length>2</length>
                <divider>1</divider>
                <precision>1</precision>
                <calcFuncs>
                    <AsciiToHexCalc/>
                    <Int32CalcFunc>
                        <isHighByteAhead>true</isHighByteAhead>
                    </Int32CalcFunc>
                </calcFuncs>
            </CommonSensorDefine>


            <!--压缩机类型  0:普通他压缩机 1:数码压缩机-->
            <DzBitSensorDefine>
                <name>CRAC.Compressor.Type</name>
                <registerIndex>2</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>0</routeIndex>
            </DzBitSensorDefine>

            <!--高压1告警 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.HighVoltage</name>
                <registerIndex>2</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>1</routeIndex>
            </DzBitSensorDefine>

            <!--高压2告警 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.HighVoltage2</name>
                <registerIndex>2</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>2</routeIndex>
            </DzBitSensorDefine>


            <!--低压1告警 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.LowVoltage</name>
                <registerIndex>2</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>3</routeIndex>
            </DzBitSensorDefine>

            <!--低压2告警 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.LowVoltage2</name>
                <registerIndex>2</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>4</routeIndex>
            </DzBitSensorDefine>


            <!--告警_排气温度1 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Exhaust.Temperature1</name>
                <registerIndex>2</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>5</routeIndex>
            </DzBitSensorDefine>

            <!--告警_排气温度2 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Exhaust.Temperature2</name>
                <registerIndex>2</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>6</routeIndex>
            </DzBitSensorDefine>

            <!--告警_盘管冻结1 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Coiler1</name>
                <registerIndex>2</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>7</routeIndex>
            </DzBitSensorDefine>

            <!--告警_盘管冻结2 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Coiler2</name>
                <registerIndex>4</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>0</routeIndex>
            </DzBitSensorDefine>

            <!--告警_风机故障 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Exception.Fan</name>
                <registerIndex>4</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>1</routeIndex>
            </DzBitSensorDefine>


            <!--_短周期1告警 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.ShortPeriod1</name>
                <registerIndex>4</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>4</routeIndex>
            </DzBitSensorDefine>

            <!--_短周期2告警 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.ShortPeriod2</name>
                <registerIndex>4</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>5</routeIndex>
            </DzBitSensorDefine>

            <!--告警_高温 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.HighTemperature</name>
                <registerIndex>4</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>6</routeIndex>
            </DzBitSensorDefine>

            <!--告警_低温 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.LowTemperature</name>
                <registerIndex>4</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>7</routeIndex>
            </DzBitSensorDefine>


            <!--告警_高湿 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.HighHumidity</name>
                <registerIndex>6</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>0</routeIndex>
            </DzBitSensorDefine>

            <!--告警_低湿 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.LowHumidity</name>
                <registerIndex>6</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>1</routeIndex>
            </DzBitSensorDefine>

            <!--告警_红外加湿器故障 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.InfraredRay.Humidifier.Exception</name>
                <registerIndex>6</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>2</routeIndex>
            </DzBitSensorDefine>

            <!--告警_卡乐加湿器故障 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.KaLe.Humidifier.Exception</name>
                <registerIndex>6</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>3</routeIndex>
            </DzBitSensorDefine>

            <!--告警_CM+加湿器低水位故障 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.CM.Humidifier.LowWater.Exception</name>
                <registerIndex>6</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>4</routeIndex>
            </DzBitSensorDefine>

            <!--告警_气流丢失 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.AirFlow.Lose</name>
                <registerIndex>6</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>5</routeIndex>
            </DzBitSensorDefine>

            <!--告警_过滤网堵塞 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.FilterNet.Block</name>
                <registerIndex>6</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>6</routeIndex>
            </DzBitSensorDefine>

            <!--告警_远程关机 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Remote.ShutDown</name>
                <registerIndex>6</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>7</routeIndex>
            </DzBitSensorDefine>


            <!--告警_温湿度检测版故障 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.TH.Check.Exception</name>
                <registerIndex>8</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>0</routeIndex>
            </DzBitSensorDefine>

            <!--告警_烟感 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Smoke</name>
                <registerIndex>8</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>1</routeIndex>
            </DzBitSensorDefine>

            <!--告警_火感 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Fire</name>
                <registerIndex>8</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>2</routeIndex>
            </DzBitSensorDefine>

            <!--告警_风机运行超时 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Fan.Runtime.TimeOut</name>
                <registerIndex>8</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>5</routeIndex>
            </DzBitSensorDefine>


            <!--告警_压缩机1运行超时 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Compressor.Runtime.TimeOut</name>
                <registerIndex>8</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>6</routeIndex>
            </DzBitSensorDefine>

            <!--告警_压缩机2运行超时 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Compressor2.Runtime.TimeOut</name>
                <registerIndex>8</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>7</routeIndex>
            </DzBitSensorDefine>


            <!--告警_加热器1运行超时 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Heater1.Runtime.TimeOut</name>
                <registerIndex>10</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>0</routeIndex>
            </DzBitSensorDefine>

            <!--告警_加热器2运行超时 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Heater2.Runtime.TimeOut</name>
                <registerIndex>10</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>1</routeIndex>
            </DzBitSensorDefine>

            <!--告警_加湿器需要维护 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Humidifier.Need.Maintain</name>
                <registerIndex>10</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>2</routeIndex>
            </DzBitSensorDefine>

            <!--告警_电源丢失 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Power.Lose</name>
                <registerIndex>10</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>3</routeIndex>
            </DzBitSensorDefine>

            <!--告警_电源过压 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Power.OverVoltage</name>
                <registerIndex>10</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>4</routeIndex>
            </DzBitSensorDefine>


            <!--告警_电源欠压 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Power.LowVoltage</name>
                <registerIndex>10</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>5</routeIndex>
            </DzBitSensorDefine>

            <!--告警_电源频偏 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Power.DeviateFrequency</name>
                <registerIndex>10</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>6</routeIndex>
            </DzBitSensorDefine>

            <!--告警_电源缺相 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Power.MissAppearance</name>
                <registerIndex>10</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>7</routeIndex>
            </DzBitSensorDefine>

            <!--告警_电源反相 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Power.ReversalAppearance</name>
                <registerIndex>12</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>0</routeIndex>
            </DzBitSensorDefine>

            <!--告警_地板溢水 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.OverFlow.Water</name>
                <registerIndex>12</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>1</routeIndex>
            </DzBitSensorDefine>

            <!--告警_NTC1故障 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.NTC1.Exception</name>
                <registerIndex>12</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>2</routeIndex>
            </DzBitSensorDefine>

            <!--告警_NTC2故障 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.NTC2.Exception</name>
                <registerIndex>12</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>3</routeIndex>
            </DzBitSensorDefine>

            <!--告警_NTC3故障 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.NTC3.Exception</name>
                <registerIndex>12</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>4</routeIndex>
            </DzBitSensorDefine>

            <!--告警_NTC4故障 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.NTC4.Exception</name>
                <registerIndex>12</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>5</routeIndex>
            </DzBitSensorDefine>

            <!--告警_机组组网失败报警0-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork.Faile</name>
                <registerIndex>12</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>6</routeIndex>
            </DzBitSensorDefine>

            <!--告警_机组组网失败报警1-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork1.Faile</name>
                <registerIndex>12</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>7</routeIndex>
            </DzBitSensorDefine>

            <!--告警_机组组网失败报警2-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork2.Faile</name>
                <registerIndex>14</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>0</routeIndex>
            </DzBitSensorDefine>

            <!--告警_机组组网失败报警3-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork3.Faile</name>
                <registerIndex>14</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>1</routeIndex>
            </DzBitSensorDefine>


            <!--告警_机组组网失败报警4-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork4.Faile</name>
                <registerIndex>14</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>2</routeIndex>
            </DzBitSensorDefine>


            <!--告警_机组组网失败报警5-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork5.Faile</name>
                <registerIndex>14</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>3</routeIndex>
            </DzBitSensorDefine>


            <!--告警_机组组网失败报警6-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork6.Faile</name>
                <registerIndex>14</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>4</routeIndex>
            </DzBitSensorDefine>


            <!--告警_机组组网失败报警7-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork7.Faile</name>
                <registerIndex>14</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>5</routeIndex>
            </DzBitSensorDefine>


            <!--告警_机组组网失败报警8-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork8.Faile</name>
                <registerIndex>14</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>6</routeIndex>
            </DzBitSensorDefine>


            <!--告警_机组组网失败报警9-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork9.Faile</name>
                <registerIndex>14</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>7</routeIndex>
            </DzBitSensorDefine>


            <!--告警_机组组网失败报警10-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork10.Faile</name>
                <registerIndex>16</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>0</routeIndex>
            </DzBitSensorDefine>


            <!--告警_机组组网失败报警11-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork11.Faile</name>
                <registerIndex>16</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>1</routeIndex>
            </DzBitSensorDefine>


            <!--告警_机组组网失败报警12-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork12.Faile</name>
                <registerIndex>16</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>2</routeIndex>
            </DzBitSensorDefine>


            <!--告警_机组组网失败报警13-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork13.Faile</name>
                <registerIndex>16</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>3</routeIndex>
            </DzBitSensorDefine>


            <!--告警_机组组网失败报警14-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork14.Faile</name>
                <registerIndex>16</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>4</routeIndex>
            </DzBitSensorDefine>


            <!--告警_机组组网失败报警15-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.MakeNetWork15.Faile</name>
                <registerIndex>16</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>5</routeIndex>
            </DzBitSensorDefine>


            <!--高压1锁定报警 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.HighVoltage.Lock1</name>
                <registerIndex>16</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>6</routeIndex>
            </DzBitSensorDefine>


            <!--高压2锁定报警 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.HighVoltage.Lock2</name>
                <registerIndex>16</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>7</routeIndex>
            </DzBitSensorDefine>


            <!--低警_低压1锁定 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.LowVoltage.Lock</name>
                <registerIndex>18</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>0</routeIndex>
            </DzBitSensorDefine>

            <!--低警_低压2锁定 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.LowVoltage.Lock2</name>
                <registerIndex>18</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>1</routeIndex>
            </DzBitSensorDefine>

            <!--告警_排气温度锁定1 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Exhaust.Temperature1.Lock</name>
                <registerIndex>18</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>2</routeIndex>
            </DzBitSensorDefine>

            <!--告警_排气温度锁定2 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Exhaust.Temperature2.Lock</name>
                <registerIndex>18</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>3</routeIndex>
            </DzBitSensorDefine>


            <!--告警_盘管冻结1锁定 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Coiler1.Lock</name>
                <registerIndex>18</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>4</routeIndex>
            </DzBitSensorDefine>

            <!--告警_盘管冻结2锁定 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Coiler2.Lock</name>
                <registerIndex>18</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>5</routeIndex>
            </DzBitSensorDefine>

            <!--告警_排气1低温锁定 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Exhaust.Temperature1.Lock</name>
                <registerIndex>18</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>6</routeIndex>
            </DzBitSensorDefine>

            <!--告警_排气2低温锁定 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Exhaust.Temperature2.Lock</name>
                <registerIndex>18</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>7</routeIndex>
            </DzBitSensorDefine>


            <!--告警_机组地址重复报警-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Address.Repeat</name>
                <registerIndex>20</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>0</routeIndex>
            </DzBitSensorDefine>

            <!--告警_群控模式从机丢失-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Slave.Lose</name>
                <registerIndex>20</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>1</routeIndex>
            </DzBitSensorDefine>

            <!--告警_群控模式主机丢失-->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Master.Lose</name>
                <registerIndex>20</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>2</routeIndex>
            </DzBitSensorDefine>

            <!--告警_送风高温 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.OutAir.HighTemperature</name>
                <registerIndex>20</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>3</routeIndex>
            </DzBitSensorDefine>


            <!--告警_A路水流丢失 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.A.Road.Water.Lose</name>
                <registerIndex>20</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>4</routeIndex>
            </DzBitSensorDefine>

            <!--告警_B路水流丢失 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.B.Road.Water.Lose</name>
                <registerIndex>20</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>5</routeIndex>
            </DzBitSensorDefine>

            <!--告警_风压传感器故障 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Wind.Pressure.Exception</name>
                <registerIndex>20</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>6</routeIndex>
            </DzBitSensorDefine>


            <!--告警_红外加湿器高水位故障 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.InfraredRay.Humidifier.Water.High.Exception</name>
                <registerIndex>20</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>7</routeIndex>
            </DzBitSensorDefine>

            <!--告警_排气低温锁定1 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Exhaust.LowTemperature1.Lock</name>
                <registerIndex>22</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>0</routeIndex>
            </DzBitSensorDefine>

            <!--告警_排气低温锁定2 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.Exhaust.LowTemperature2.Lock</name>
                <registerIndex>22</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>1</routeIndex>
            </DzBitSensorDefine>

            <!--告警_低压传感器1失效 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.LowPressure1.Lose.Efficacy</name>
                <registerIndex>22</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>2</routeIndex>
            </DzBitSensorDefine>

            <!--告警_低压传感器2失效 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.LowPressure2.Lose.Efficacy</name>
                <registerIndex>22</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>3</routeIndex>
            </DzBitSensorDefine>

            <!--告警_过滤网许维护 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.FilterNet.Need.Maintain</name>
                <registerIndex>22</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>4</routeIndex>
            </DzBitSensorDefine>

            <!--告警_电加热 -->
            <DzBitSensorDefine>
                <name>CRAC.Alert.HeartingByElec</name>
                <registerIndex>22</registerIndex>
                <commandName>DZ_{devid}_{busid}_24709_</commandName>
                <routeIndex>5</routeIndex>
            </DzBitSensorDefine>

        </iSensorDefines>
    </DeviceDefine>


    <DeviceDefine>
        <deviceId></deviceId>
        <iSensorDefines>
            <CommonDefine>
                <name>ELM.DPT</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>73</index>
                <length>1</length>
                <precision>2</precision>
                <divider>1</divider>
                <isMean>false</isMean>
                <calcList>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.DCT</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>74</index>
                <length>1</length>
                <precision>2</precision>
                <divider>1</divider>
                <isMean>false</isMean>
                <calcList>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.DPQ</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>75</index>
                <length>2</length>
                <precision>2</precision>
                <divider>1</divider>
                <isMean>false</isMean>
                <calcList>
                </calcList>
            </CommonDefine>

            <CommonDefine>
                <name>ELM.A.Voltage</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>77</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.B.Voltage</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>79</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.C.Voltage</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>81</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>

            <CommonDefine>
                <name>ELM.LineVoltage.AB</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>83</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.LineVoltage.BC</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>85</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.LineVoltage.CA</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>87</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>

            <CommonDefine>
                <name>ELM.A.Current</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>89</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.B.Current</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>91</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.C.Current</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>93</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.A.ActivePower</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>95</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.B.ActivePower</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>97</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.C.ActivePower</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>99</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.ActivePower</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>101</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.A.ReactivePower</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>103</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.B.ReactivePower</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>105</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.C.ReactivePower</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>107</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.ReactivePower</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>109</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.A.PowerFactor</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>111</index>
                <length>2</length>
                <precision>2</precision>
                <divider>1000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.B.PowerFactor</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>113</index>
                <length>2</length>
                <precision>2</precision>
                <divider>1000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.C.PowerFactor</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>115</index>
                <length>2</length>
                <precision>2</precision>
                <divider>1000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.PowerFactor</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>117</index>
                <length>2</length>
                <precision>2</precision>
                <divider>1000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>

            <CommonDefine>
                <name>ELM.A.ApparentPower</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>119</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.B.ApparentPower</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>121</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.C.ApparentPower</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>123</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.ApparentPower</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>125</index>
                <length>2</length>
                <precision>2</precision>
                <divider>10000000</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>ELM.Frequency</name>
                <commandName>cmd_acrel_d1_mdbs_AI_${object.index}</commandName>
                <index>127</index>
                <length>2</length>
                <precision>2</precision>
                <divider>100</divider>
                <isMean>false</isMean>
                <calcList>
                    <uint16Calc>
                        <highHead>true</highHead>
                    </uint16Calc>
                </calcList>
            </CommonDefine>
        </iSensorDefines>
    </DeviceDefine>
</#list>
</linked-list>
