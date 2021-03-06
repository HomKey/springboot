<linked-list>
<#list acList as object>
    <DeviceDefine>
        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>
            <SensorDefine>
                <name>CRAC.Fan.State</name>
                <registerIndex>25</registerIndex>
                <scale>0</scale>
                <isMean>false</isMean>
                <commandName>cmd_pex_${object.index}_2_10025_8</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Cooling.State</name>
                <registerIndex>26</registerIndex>
                <scale>0</scale>
                <isMean>false</isMean>
                <commandName>cmd_pex_${object.index}_2_10025_8</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.FreeCooling.State</name>
                <registerIndex>27</registerIndex>
                <scale>0</scale>
                <isMean>false</isMean>
                <commandName>cmd_pex_${object.index}_2_10025_8</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.HotWaterAndGas.State</name>
                <registerIndex>28</registerIndex>
                <scale>0</scale>
                <isMean>false</isMean>
                <commandName>cmd_pex_${object.index}_2_10025_8</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.ElectricReheat.State</name>
                <registerIndex>29</registerIndex>
                <scale>0</scale>
                <isMean>false</isMean>
                <commandName>cmd_pex_${object.index}_2_10025_8</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Humidifier.State</name>
                <registerIndex>30</registerIndex>
                <scale>0</scale>
                <isMean>false</isMean>
                <commandName>cmd_pex_${object.index}_2_10025_8</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Dehumidifier.State</name>
                <registerIndex>31</registerIndex>
                <scale>0</scale>
                <isMean>false</isMean>
                <commandName>cmd_pex_${object.index}_2_10025_8</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Buzzer.Status</name>
                <registerIndex>32</registerIndex>
                <scale>0</scale>
                <isMean>false</isMean>
                <commandName>cmd_pex_${object.index}_2_10025_8</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Fan.Overload</name>
                <registerIndex>34</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.AirFlow.Loss</name>
                <registerIndex>35</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.WaterFlow.Loss</name>
                <registerIndex>36</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Compressor.1.Pressure.High</name>
                <registerIndex>37</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Compressor.1.Pressure.Low</name>
                <registerIndex>38</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Compressor.1.Overload</name>
                <registerIndex>39</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Compressor.1.PumpDown.Fail</name>
                <registerIndex>40</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Compressor.2.Pressure.High</name>
                <registerIndex>41</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Compressor.2.Pressure.Low</name>
                <registerIndex>42</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Compressor.2.Overload</name>
                <registerIndex>43</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Compressor.2.PumpDown.Fail</name>
                <registerIndex>44</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Smoke</name>
                <registerIndex>47</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Water</name>
                <registerIndex>48</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Humidifier.Issue</name>
                <registerIndex>49</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Indoor.TH.Issue</name>
                <registerIndex>53</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Compressor.Power.Lose</name>
                <registerIndex>54</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Blower.AirFlow.Lose</name>
                <registerIndex>55</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10034_22</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Humidifier.WaterLevel.Low</name>
                <registerIndex>58</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10058_4</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Humidifier.Current.High</name>
                <registerIndex>59</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10058_4</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Temperature.High</name>
                <registerIndex>60</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10058_4</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Unknow</name>
                <registerIndex>64</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10064_2</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.CoolingWater.Temperature.High</name>
                <registerIndex>65</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10064_2</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Indoor.Temperature.Over</name>
                <registerIndex>67</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Indoor.Temperature.Under</name>
                <registerIndex>68</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Indoor.Humidity.High</name>
                <registerIndex>69</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Indoor.Humidity.Low</name>
                <registerIndex>70</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.A.Temperature.Over</name>
                <registerIndex>71</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.A.Temperature.Under</name>
                <registerIndex>72</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.A.Humidity.High</name>
                <registerIndex>73</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.A.Humidity.Low</name>
                <registerIndex>74</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.CoolingWater.WaterFlow.Lose</name>
                <registerIndex>75</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Filter.Block</name>
                <registerIndex>76</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Fan.OverTime</name>
                <registerIndex>80</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Compressor.1.OverTime</name>
                <registerIndex>81</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Compressor.2.OverTime</name>
                <registerIndex>82</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.FreeCooling.OverTime</name>
                <registerIndex>83</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.ElectricReheater.1.OverTime</name>
                <registerIndex>84</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.ElectricReheater.2.OverTime</name>
                <registerIndex>85</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.ElectricReheater.3.OverTime</name>
                <registerIndex>86</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.HotWaterAndGas.OverTime</name>
                <registerIndex>87</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Humidifier.OverTime</name>
                <registerIndex>88</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Alarm.Dehumidifier.OverTime</name>
                <registerIndex>89</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_2_10067_23</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.ReturnAir.Temperature</name>
                <registerIndex>110</registerIndex>
                <scale>1</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.SupplyAir.Temperature</name>
                <registerIndex>112</registerIndex>
                <scale>1</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.FreeCooling.FluidTemperature</name>
                <registerIndex>115</registerIndex>
                <scale>1</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Ext.AirSensor.A.Temperature</name>
                <registerIndex>116</registerIndex>
                <scale>1</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Ext.AirSensor.B.Temperature</name>
                <registerIndex>117</registerIndex>
                <scale>1</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Ext.AirSensor.C.Temperature</name>
                <registerIndex>118</registerIndex>
                <scale>1</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.DigScrollComp.1.Discharge.Temperature</name>
                <registerIndex>119</registerIndex>
                <scale>1</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.DigScrollComp.2.Discharge.Temperature</name>
                <registerIndex>120</registerIndex>
                <scale>1</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.ReturnAir.Humidity</name>
                <registerIndex>130</registerIndex>
                <scale>1</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Ext.AirSensor.A.Humidity</name>
                <registerIndex>132</registerIndex>
                <scale>1</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Ext.AirSensor.B.Humidity</name>
                <registerIndex>133</registerIndex>
                <scale>1</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.Ext.AirSensor.C.Humidity</name>
                <registerIndex>134</registerIndex>
                <scale>1</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>10</divider>
            </SensorDefine>
            <!-- 风机运行时间 小时-->
            <SensorDefine>
                <name>CRAC.Fan.RunningTime</name>
                <registerIndex>141</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>1</divider>
            </SensorDefine>
            <!-- 压缩机运行时间 小时-->
            <SensorDefine>
                <name>CRAC.Compressor.1.RunningTime</name>
                <registerIndex>142</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>1</divider>
            </SensorDefine>
            <!-- 压缩机运行时间 小时-->
            <SensorDefine>
                <name>CRAC.Compressor.2.RunningTime</name>
                <registerIndex>143</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>1</divider>
            </SensorDefine>
            <!-- 加湿器运行 时间 -->
            <SensorDefine>
                <name>CRAC.Humidifier.RunningTime</name>
                <registerIndex>144</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>1</divider>
            </SensorDefine>
            <!-- 除湿器运行 时间 -->
            <SensorDefine>
                <name>CRAC.Dehumidifier.RunningTime</name>
                <registerIndex>145</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>1</divider>
            </SensorDefine>
            <!-- 自然冷却运行 时间 -->
            <SensorDefine>
                <name>CRAC.FreeCooling.RunningTime</name>
                <registerIndex>146</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>1</divider>
            </SensorDefine>
            <!-- 电加热运行 时间 -->
            <SensorDefine>
                <name>CRAC.ElectricReheater.1.RunningTime</name>
                <registerIndex>147</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.ElectricReheater.2.RunningTime</name>
                <registerIndex>148</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.ElectricReheater.3.RunningTime</name>
                <registerIndex>149</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>CRAC.HotWaterAndGas.RunningTime</name>
                <registerIndex>150</registerIndex>
                <scale>0</scale>
                <isMean>true</isMean>
                <commandName>cmd_pex_${object.index}_4_30110_41</commandName>
                <divider>1</divider>
            </SensorDefine>
        </iSensorDefines>
    </DeviceDefine>
</#list>
</linked-list>