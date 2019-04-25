<list>
    <#list cabinetList as cabinet>
    <CabinetInfo>
        <id>${cabinet.id}</id>
        <type>${cabinet.type}</type>
        <position>${cabinet.position}</position>
        <typeName>${cabinet.typeName}</typeName>
        <name>${cabinet.name}</name>
        <displayName>${cabinet.displayName}</displayName>
        <uposition>${cabinet.uposition}</uposition>
        <used>0</used>
        <status>0</status>
    </CabinetInfo>
    </#list>
</list>