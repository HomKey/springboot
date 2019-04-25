<map>
    <entry>
        <string>env_list</string>
        <UIInfo>
            <name>env_list</name>
            <propertyDefines class="linked-list">
                <ArrayPropertyDefine>
                    <name>envs</name>
                    <propertyDefines>
                        <#list emhList as emh>
                        <ComposePropertyDefine>
                            <name>env${emh_index + 1}</name>
                            <propertyDefines>
                                <ConstantProperty>
                                    <name>id</name>
                                    <value>${emh_index + 1}</value>
                                </ConstantProperty>
                                <ConstantProperty>
                                    <name>name</name>
                                    <value>${emh.name}${emh_index + 1}</value>
                                </ConstantProperty>
                                <SimplePropertyDefine>
                                    <name>magnetometerAccessState</name>
                                    <sensorEntry>
                                        <deviceId>${emh.deviceid}</deviceId>
                                        <sensorId>EMH.1.Magnetometer.Access.State</sensorId>
                                    </sensorEntry>
                                </SimplePropertyDefine>
                                <SimplePropertyDefine>
                                    <name>magnetometerState</name>
                                    <sensorEntry>
                                        <deviceId>${emh.deviceid}</deviceId>
                                        <sensorId>EMH.1.Magnetometer.Connect.State</sensorId>
                                    </sensorEntry>
                                </SimplePropertyDefine>
                                <SimplePropertyDefine>
                                    <name>temperature</name>
                                    <sensorEntry>
                                        <deviceId>${emh.deviceid}</deviceId>
                                        <sensorId>THADA.1.Tempture</sensorId>
                                    </sensorEntry>
                                </SimplePropertyDefine>
                            </propertyDefines>
                        </ComposePropertyDefine>
                        </#list>
                    </propertyDefines>
                </ArrayPropertyDefine>
            </propertyDefines>
        </UIInfo>
    </entry>
</map>