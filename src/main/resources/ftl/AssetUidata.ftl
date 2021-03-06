<map>
    <entry>
        <string>assert_list</string>
        <UIInfo>
            <name>assert_list</name>
            <propertyDefines class="linked-list">
                <ArrayPropertyDefine>
                    <name>asserts</name>
                    <propertyDefines>
                        <#list assetList as asset>
                        <ComposePropertyDefine>
                            <name>${asset.name}</name>
                            <propertyDefines>
                                <ConstantProperty>
                                    <name>id</name>
                                    <value>${asset.uuid}</value>
                                </ConstantProperty>
                                <ConstantProperty>
                                    <name>displayName</name>
                                    <value>${asset.displayName}</value>
                                </ConstantProperty>
                                <#list 1..42 as i>
                                <SimplePropertyDefine>
                                    <name>u${i}</name>
                                    <sensorEntry>
                                        <deviceId>${asset.uuid}</deviceId>
                                        <sensorId>U.${i}.State</sensorId>
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