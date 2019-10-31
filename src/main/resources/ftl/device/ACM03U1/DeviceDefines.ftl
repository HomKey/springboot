<linked-list>
<#list acmList as object>
    <DeviceDefine>
        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>
            <CommonDefine>
                <name>Room.Temperature</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24642_33</commandName>
                <index>0</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Room.Humidity</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24642_33</commandName>
                <index>4</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcList>
                    <asciiToHexCalc/>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>

            <CommonDefine>
                <name>AC.Input.A.Voltage</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24642_33</commandName>
                <index>8</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint32Calc>
                        <highHead>true</highHead>
                    </uint32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>AC.Input.B.Voltage</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24642_33</commandName>
                <index>12</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint32Calc>
                        <highHead>true</highHead>
                    </uint32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>AC.Input.C.Voltage</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24642_33</commandName>
                <index>16</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint32Calc>
                        <highHead>true</highHead>
                    </uint32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Humidifier.Current</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24642_33</commandName>
                <index>20</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint32Calc>
                        <highHead>true</highHead>
                    </uint32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Power.frequency</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24642_33</commandName>
                <index>24</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint32Calc>
                        <highHead>true</highHead>
                    </uint32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Temperature.1</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24642_33</commandName>
                <index>28</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint32Calc>
                        <highHead>true</highHead>
                    </uint32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Temperature.2</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24642_33</commandName>
                <index>32</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint32Calc>
                        <highHead>true</highHead>
                    </uint32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Temperature.3</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24642_33</commandName>
                <index>36</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint32Calc>
                        <highHead>true</highHead>
                    </uint32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Temperature.4</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24642_33</commandName>
                <index>40</index>
                <length>4</length>
                <divider>10</divider>
                <isMean>false</isMean>
                <precision>2</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <uint32Calc>
                        <highHead>true</highHead>
                    </uint32Calc>
                </calcList>
            </CommonDefine>

            <CommonDefine>
                <name>HighPressure.Switch1.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>0</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>HighPressure.Switch2.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>1</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>LowPressure.Switch1.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>2</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>LowPressure.Switch2.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>3</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Exhausted.Air.Temperature1.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>4</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Exhausted.Air.Temperature2.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>5</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>FilterNet.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>6</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>WaterFloor.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>7</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>FanOverLoad1.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>8</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>FanOverLoad2.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>9</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>FanOverLoad3.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>10</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>AirFloorNotEnough.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>11</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>

            <CommonDefine>
                <name>CMAndWaterBit.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>16</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>RemoteShutDown</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>17</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Humidifier.Alert</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>18</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Smoke.Input</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>19</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Electric.Heating.Input.Alert</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>20</index>
                <length>2</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>InfraredRay.Humidifier.HighWaterBit</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24643_33</commandName>
                <index>21</index>
                <length>2</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>

            <CommonDefine>
                <name>AC.StartUp.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>0</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Fan.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>1</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Humidifier.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>2</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Compressor1.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>3</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Compressor2.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>4</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Heating1.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>5</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Heating2.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>6</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Public.Alarm.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>7</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>liquid1.ByPass.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>8</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>liquid2.ByPass.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>9</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Injected.Water.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>10</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Dehumidification.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>11</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>StandBy.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>12</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Compressor1.Reversed.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>13</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Compressor2.Reversed.OutPut.Switch.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>14</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>MakeCold.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>15</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>Heating.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>16</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>DeHumidity.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>17</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>
            <CommonDefine>
                <name>DoHumidity.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24706_33</commandName>
                <index>18</index>
                <length>1</length>
                <divider>1</divider>
                <isMean>false</isMean>
                <precision>1</precision>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>


            <CommonDefine>
                <name>CRAC.Running.State</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>0</index>
                <length>1</length>
                <divider>1</divider>
                <precision>2</precision>
                <isMean>false</isMean>
                <calcList>
                    <asciiToHexCalc></asciiToHexCalc>
                    <int32Calc>
                        <highHead>true</highHead>
                    </int32Calc>
                </calcList>
            </CommonDefine>

            <CommonDefine>
                <name>CRAC.Alert.HighVoltage1</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>1</index>
                <length>1</length>
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
                <name>CRAC.Alert.HighVoltage2</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>1</index>
                <length>1</length>
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
                <name>CRAC.Alert.LowVoltage1</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>1</index>
                <length>1</length>
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
                <name>CRAC.Alert.LowVoltage2</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>1</index>
                <length>1</length>
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
                <name>CRAC.Alert.Exhaust.Temperature1</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>1</index>
                <length>1</length>
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
                <name>CRAC.Alert.Exhaust.Temperature2</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>1</index>
                <length>1</length>
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
                <name>CRAC.Alert.Coiler1</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>1</index>
                <length>1</length>
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
                <name>CRAC.Alert.Coiler2</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>2</index>
                <length>1</length>
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
                <name>CRAC.Alert.OverLoad.Fan1</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>2</index>
                <length>1</length>
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
                <name>CRAC.Alert.OverLoad.Fan2</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>2</index>
                <length>1</length>
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
                <name>CRAC.Alert.OverLoad.Fan3</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>2</index>
                <length>1</length>
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
                <name>CRAC.Alert.ShortPeriod1</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>2</index>
                <length>1</length>
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
                <name>CRAC.Alert.ShortPeriod2</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>2</index>
                <length>1</length>
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
                <name>CRAC.Alert.HighTemperature</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>2</index>
                <length>1</length>
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
                <name>CRAC.Alert.LowTemperature</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>2</index>
                <length>1</length>
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
                <name>CRAC.Alert.HighHumidity</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>3</index>
                <length>1</length>
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
                <name>CRAC.Alert.LowHumidity</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>3</index>
                <length>1</length>
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
                <name>CRAC.Alert.InfraredRay.Humidifier.Exception</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>3</index>
                <length>1</length>
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
                <name>CRAC.Alert.KaLe.Humidifier.Exception</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>3</index>
                <length>1</length>
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
                <name>CRAC.Alert.CM.Humidifier.LowWater.Exception</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>3</index>
                <length>1</length>
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
                <name>CRAC.Alert.AirFlow.Lose</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>3</index>
                <length>1</length>
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
                <name>CRAC.Alert.FilterNet.Block</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>3</index>
                <length>1</length>
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
                <name>CRAC.Alert.Remote.ShutDown</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>3</index>
                <length>1</length>
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
                <name>CRAC.Alert.Remote.ShutDown</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>3</index>
                <length>1</length>
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
                <name>CRAC.Alert.TH.Check.Exception</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>4</index>
                <length>1</length>
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
                <name>CRAC.Alert.Smoke</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>4</index>
                <length>1</length>
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
                <name>CRAC.Alert.Fire</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>4</index>
                <length>1</length>
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
                <name>CRAC.Alert.Fan.Runtime.TimeOut</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>4</index>
                <length>1</length>
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
                <name>CRAC.Alert.Compressor1.Runtime.TimeOut</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>4</index>
                <length>1</length>
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
                <name>CRAC.Alert.Compressor2.Runtime.TimeOut</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>4</index>
                <length>1</length>
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
                <name>CRAC.Alert.Heater1.Runtime.TimeOut</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>5</index>
                <length>1</length>
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
                <name>CRAC.Alert.Heater2.Runtime.TimeOut</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>5</index>
                <length>1</length>
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
                <name>CRAC.Alert.Humidifier.Need.Maintain</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>5</index>
                <length>1</length>
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
                <name>CRAC.Alert.Power.Lose</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>5</index>
                <length>1</length>
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
                <name>CRAC.Alert.Power.OverVoltage</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>5</index>
                <length>1</length>
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
                <name>CRAC.Alert.Power.LowVoltage</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>5</index>
                <length>1</length>
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
                <name>CRAC.Alert.Power.DeviateFrequency</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>5</index>
                <length>1</length>
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
                <name>CRAC.Alert.Power.MissAppearance</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>5</index>
                <length>1</length>
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
                <name>CRAC.Alert.Power.ReversalAppearance</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>6</index>
                <length>1</length>
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
                <name>CRAC.Alert.OverFlow.Water</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>6</index>
                <length>1</length>
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
                <name>CRAC.Alert.NTC1.Exception</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>6</index>
                <length>1</length>
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
                <name>CRAC.Alert.NTC2.Exception</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>6</index>
                <length>1</length>
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
                <name>CRAC.Alert.NTC3.Exception</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>6</index>
                <length>1</length>
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
                <name>CRAC.Alert.NTC4.Exception</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>6</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>6</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork1.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>6</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork2.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>7</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork3.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>7</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork4.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>7</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork5.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>7</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork6.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>7</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork7.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>7</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork8.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>7</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork9.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>7</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork10.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>8</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork11.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>8</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork12.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>8</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork13.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>8</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork14.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>8</index>
                <length>1</length>
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
                <name>CRAC.Alert.MakeNetWork15.Faile</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>8</index>
                <length>1</length>
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
                <name>CRAC.Alert.HighVoltage.Lock1</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>8</index>
                <length>1</length>
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
                <name>CRAC.Alert.HighVoltage.Lock2</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>8</index>
                <length>1</length>
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
                <name>CRAC.Alert.LowVoltage.Lock</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>9</index>
                <length>1</length>
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
                <name>CRAC.Alert.LowVoltage.Lock2</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>9</index>
                <length>1</length>
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
                <name>CRAC.Alert.Exhaust.Temperature1.Lock</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>9</index>
                <length>1</length>
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
                <name>CRAC.Alert.Exhaust.Temperature2.Lock</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>9</index>
                <length>1</length>
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
                <name>CRAC.Alert.Coiler1.Lock</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>9</index>
                <length>1</length>
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
                <name>CRAC.Alert.Coiler2.Lock</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>9</index>
                <length>1</length>
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
                <name>CRAC.Alert.Exhaust.Temperature1.Lock</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>9</index>
                <length>1</length>
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
                <name>CRAC.Alert.Exhaust.Temperature2.Lock</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>9</index>
                <length>1</length>
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
                <name>CRAC.Alert.Address.Repeat</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>10</index>
                <length>1</length>
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
                <name>CRAC.Alert.Slave.Lose</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>10</index>
                <length>1</length>
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
                <name>CRAC.Alert.Master.Lose</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>10</index>
                <length>1</length>
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
                <name>CRAC.Alert.OutAir.HighTemperature</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>10</index>
                <length>1</length>
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
                <name>CRAC.Alert.A.Road.Water.Lose</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>10</index>
                <length>1</length>
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
                <name>CRAC.Alert.B.Road.Water.Lose</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>10</index>
                <length>1</length>
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
                <name>CRAC.Alert.Wind.Pressure.Exception</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>10</index>
                <length>1</length>
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
                <name>CRAC.Alert.InfraredRay.Humidifier.Water.High.Exception</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>10</index>
                <length>1</length>
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
                <name>CRAC.Alert.Exhaust.LowTemperature1.Lock</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>11</index>
                <length>1</length>
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
                <name>CRAC.Alert.Exhaust.LowTemperature2.Lock</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>11</index>
                <length>1</length>
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
                <name>CRAC.Alert.LowPressure1.Lose.Efficacy</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>11</index>
                <length>1</length>
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
                <name>CRAC.Alert.LowPressure2.Lose.Efficacy</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>11</index>
                <length>1</length>
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
                <name>CRAC.Alert.FilterNet.Need.Maintain</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>11</index>
                <length>1</length>
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
                <name>CRAC.Alert.HeartingByElec</name>
                <commandName>crac_acm03u1_dz_d${object.index}_24709_33</commandName>
                <index>11</index>
                <length>1</length>
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