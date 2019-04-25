<linked-list>
<#list eyhtList as object>
    <DeviceDefine>
        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>
            <!--湿度值-->
            <SensorDefine>
                <name>Co2.Temperature</name>
                <registerIndex>0</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--温度值-->
            <SensorDefine>
                <name>Co2.Humidity</name>
                <registerIndex>1</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--浓度 单位ppm-->
            <SensorDefine>
                <name>Co2.Concentration</name>
                <registerIndex>2</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>1</divider>
            </SensorDefine>

            <!--温度上限报警值-->
            <SensorDefine>
                <name>Co2.AlertValue.Temperature.UpperLimit</name>
                <registerIndex>48</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--温度下限报警值-->
            <SensorDefine>
                <name>Co2.AlertValue.Temperature.LowLimit</name>
                <registerIndex>49</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--温度报警回差值-->
            <SensorDefine>
                <name>Co2.Temperature.BackAlertValue</name>
                <registerIndex>50</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--温度校准值-->
            <SensorDefine>
                <name>Co2.Temperature.Verify.Value</name>
                <registerIndex>51</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--温度继电器使能 1为使能 -->
            <SensorDefine>
                <name>Co2.Temperature.Relay.Enable</name>
                <registerIndex>52</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>1</divider>
            </SensorDefine>


            <!--湿度上限报警值-->
            <SensorDefine>
                <name>Co2.AlertValue.Humidity.UpperLimit</name>
                <registerIndex>53</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--湿度下限报警值-->
            <SensorDefine>
                <name>Co2.AlertValue.Humidity.LowLimit</name>
                <registerIndex>54</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--湿度报警回差值-->
            <SensorDefine>
                <name>Co2.Humidity.BackAlertValue</name>
                <registerIndex>55</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--湿度校准值-->
            <SensorDefine>
                <name>Co2.Humidity.Verify.Value</name>
                <registerIndex>56</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--湿度继电器使能 1为使能 -->
            <SensorDefine>
                <name>Co2.Humidity.Relay.Enable</name>
                <registerIndex>57</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>1</divider>
            </SensorDefine>


            <!--Co2上限报警值-->
            <SensorDefine>
                <name>Co2.AlertValue.Co2.UpperLimit</name>
                <registerIndex>58</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--Co2下限报警值-->
            <SensorDefine>
                <name>Co2.AlertValue.Co2.LowLimit</name>
                <registerIndex>59</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--Co2湿度报警回差值-->
            <SensorDefine>
                <name>Co2.Co2.BackAlertValue</name>
                <registerIndex>60</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--Co2校准值-->
            <SensorDefine>
                <name>Co2.Co2.Verify.Value</name>
                <registerIndex>61</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>10</divider>
            </SensorDefine>

            <!--Co2继电器使能 1为使能 -->
            <SensorDefine>
                <name>Co2.Co2.Relay.Enable</name>
                <registerIndex>62</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>1</divider>
            </SensorDefine>

            <!--继电器状态  1为吸合 0为断开-->
            <SensorDefine>
                <name>Co2.Relay.Status</name>
                <registerIndex>64</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>Transmitter_co2_${object.index}_A</commandName>
                <divider>1</divider>
            </SensorDefine>

        </iSensorDefines>
    </DeviceDefine>
</#list>
</linked-list>
