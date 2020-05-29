<linked-list>
    <#list emhPlusList as object>
        <#list object.unitList as item>
            <DeviceDefine>
                <deviceId>${item.deviceId}</deviceId>
                <iSensorDefines>
                    <SensorDefine>
                        <name>TH.Temperature</name>
                        <registerIndex>${item.index}</registerIndex>
                        <scale>2</scale>
                        <isMean>false</isMean>
                        <commandName>emh_plus_d${object.index}_AI</commandName>
                        <divider>100</divider>
                    </SensorDefine>
                    <SensorDefine>
                        <name>TH.Humidity</name>
                        <registerIndex>${item.index+1}</registerIndex>
                        <scale>2</scale>
                        <isMean>false</isMean>
                        <commandName>emh_plus_d${object.index}_AI</commandName>
                        <divider>100</divider>
                    </SensorDefine>
                </iSensorDefines>
            </DeviceDefine>
        </#list>
    </#list>
</linked-list>
