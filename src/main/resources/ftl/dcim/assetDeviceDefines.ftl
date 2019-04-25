<linked-list>
<#list assetList as object>
    <AssetDefine>
        <assetId>${object.deviceId}</assetId>
        <command>asset_cmd_c${object.index}_a${object.busId}</command>
    </AssetDefine>
</#list>
</linked-list>
