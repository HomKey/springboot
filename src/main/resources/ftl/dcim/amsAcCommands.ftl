<linked-list>
<#list amsAcList as object>
    <DzRequest>
        <name>cmd_crac_${object.index}_d1_60_42</name>
        <commandType>24642</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>1</addr>
        <ver>33</ver>
        <ctrlData/>
    </DzRequest>
    <DzRequest>
        <name>cmd_crac_${object.index}_d1_60_85</name>
        <commandType>24709</commandType>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>1</addr>
        <ver>33</ver>
        <ctrlData/>
    </DzRequest>
</#list>
</linked-list>

