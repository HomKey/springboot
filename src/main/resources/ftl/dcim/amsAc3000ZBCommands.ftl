<linked-list>
<#list amsAc3000List as object>
    <DzRequest>
        <name>cmd_r2_crac_d${object.index}_60_42</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>1</addr>
        <ver>33</ver>
        <commandType>24642</commandType>
        <ctrlData></ctrlData>
    </DzRequest>
    <DzRequest>
        <name>cmd_r2_crac_d${object.index}_60_43</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>1</addr>
        <ver>33</ver>
        <commandType>24643</commandType>
        <ctrlData></ctrlData>
    </DzRequest>
    <DzRequest>
        <name>cmd_r2_crac_d${object.index}_60_47</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>1</addr>
        <ver>33</ver>
        <commandType>24647</commandType>
        <ctrlData></ctrlData>
    </DzRequest>
    <DzRequest>
        <name>cmd_r2_crac_d${object.index}_60_82</name>
        <destinationHost>${object.ip}</destinationHost>
        <port>${object.port}</port>
        <addr>1</addr>
        <ver>33</ver>
        <commandType>24706</commandType>
        <ctrlData></ctrlData>
    </DzRequest>
</#list>
</linked-list>

