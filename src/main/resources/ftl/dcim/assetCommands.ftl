<linked-list>
<#list assetList as object>
    <AssetDiRequest>
        <name>asset_cmd_c${object.index}_a${object.busId}</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <commandType>1</commandType>
        <busId>${object.busId}</busId>
        <length>84</length>
        <registerNumber>104</registerNumber>
    </AssetDiRequest>
</#list>
</linked-list>
