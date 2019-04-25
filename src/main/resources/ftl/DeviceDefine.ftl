<?xml version="1.0" encoding="UTF-8"?>
<linked-list>
    <DeviceDefine>
        <deviceId>{devid}</deviceId>
        <iSensorDefines>
        <#list commandList as command>
            <#list command.deviceDefines as device>
            <SensorDefine>
                <#if device.desc != "">
                <!-- ${device.desc} -->
                </#if>
                <commandName>ups_${command.name}_{devid}_A{busid}</commandName>
                <name>${device.name}</name>
                <registerIndex>${device.registerIndex}</registerIndex>
                <scale>${device.scale}</scale>
                <divider>${device.divider}</divider>
                <isMean>${device.isMean}</isMean>
            </SensorDefine>
            </#list>
        </#list>
        </iSensorDefines>
    </DeviceDefine>
</linked-list>
