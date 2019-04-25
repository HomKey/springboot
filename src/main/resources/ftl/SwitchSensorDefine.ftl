<#list commandList as command>
    <#list command.switchSensorDefine as device>
    <SwitchSensorDefine>
        <#if device.desc != "">
            <!-- ${device.desc} -->
        </#if>
        <name>${device.name}</name>
        <registerIndex>${device.registerIndex}</registerIndex>
        <commandName>${command.name}</commandName>
        <routeIndex>${device.routeIndex}</routeIndex>
    </SwitchSensorDefine>
    </#list>
</#list>