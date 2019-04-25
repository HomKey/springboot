<#list alertDefines as define>
<AlertDefine>
    <id>${define.id}</id>
    <title>${template}${define.name}${define.desc!""}</title>
    <category>${define.category}</category>
    <level>${define.level}</level>
    <descriptionPattern>${define.name}${define.desc}</descriptionPattern>
    <rule class="Equal">
        <name>${define.name}${define.desc}</name>
        <limit>${define.limit}</limit>
        <sensorValue class="SimpleSensorValue">
            <deviceId>{devid}</deviceId>
            <propertyPath>${define.property}</propertyPath>
        </sensorValue>
    </rule>
    <enable>${define.enable}</enable>
</AlertDefine>
</#list>