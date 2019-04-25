<map>
    <entry>
        <string>pdu_list</string>
        <UIInfo>
            <name>pdu_list</name>
            <propertyDefines class="linked-list">
                <ArrayPropertyDefine>
                    <name>pdus</name>
                    <propertyDefines>
                        <#list pduList as pdu>
                        <ComposePropertyDefine>
                            <name>${pdu.name}</name>
                            <propertyDefines>
                                <ConstantProperty>
                                    <name>id</name>
                                    <value>${pdu.id}</value>
                                </ConstantProperty>
                                <ConstantProperty>
                                    <name>name</name>
                                    <value>${pdu.name}</value>
                                </ConstantProperty>
                                <#assign keys = pdu.properties?keys>
                                <#list keys as key>
                                    <SimplePropertyDefine>
                                        <name>${key}</name>
                                        <sensorEntry>
                                            <deviceId>${pdu.uuid}</deviceId>
                                            <sensorId>${pdu.properties[key]}</sensorId>
                                        </sensorEntry>
                                    </SimplePropertyDefine>
                                </#list>
                            </propertyDefines>
                        </ComposePropertyDefine>
                        </#list>
                    </propertyDefines>
                </ArrayPropertyDefine>
            </propertyDefines>
        </UIInfo>
    </entry>
</map>