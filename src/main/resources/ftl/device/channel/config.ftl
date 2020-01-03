<?xml version="1.0" encoding="utf-8" ?>
<root>
<#list channelList as object>
    <deviceActionDefine>
        <deviceId>${object.deviceId}</deviceId>
        <actionDefines>
            <actionDefine>
                <actionName>openSkylight</actionName>
                <actionNodes>
                    <actionNode>
                        <actionId>cd${object.index}.Electromagnet.1.PowerOff</actionId>
                        <delayAfter>10</delayAfter>
                    </actionNode>
                    <actionNode>
                        <actionId>cd${object.index}.Electromagnet.2.PowerOff</actionId>
                        <delayAfter>10</delayAfter>
                    </actionNode>
                    <actionNode>
                        <actionId>cd${object.index}.Electromagnet.3.PowerOff</actionId>
                        <delayAfter>10</delayAfter>
                    </actionNode>
                    <actionNode>
                        <actionId>cd${object.index}.Electromagnet.1.PowerOn</actionId>
                        <delayAfter>10</delayAfter>
                    </actionNode>
                    <actionNode>
                        <actionId>cd${object.index}.Electromagnet.2.PowerOn</actionId>
                        <delayAfter>10</delayAfter>
                    </actionNode>
                    <actionNode>
                        <actionId>cd${object.index}.Electromagnet.3.PowerOn</actionId>
                        <delayAfter>10</delayAfter>
                    </actionNode>
                </actionNodes>
            </actionDefine>
            <actionDefine>
                <actionName>closeSkylight</actionName>
                <actionNodes>
                    <actionNode>
                        <actionId>cd${object.index}.Pushrod.Push</actionId>
                        <delayAfter>500</delayAfter>
                    </actionNode>
                    <actionNode>
                        <actionId>cd${object.index}.Pushrod.PushReset</actionId>
                        <delayAfter>0</delayAfter>
                    </actionNode>
                </actionNodes>
            </actionDefine>
        </actionDefines>
    </deviceActionDefine>
</#list>
</root>
