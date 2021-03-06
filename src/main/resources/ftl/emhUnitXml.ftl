<#list 1..15 as index>
    <SnmpDeviceTable>
        <oid>1.3.6.1.4.1.0.1.1.2.${index}.1</oid>
        <type>com.keydak.snmp.table.EmhUnitMOTable</type>
        <deviceIds>
            <string>4102c45d-5d64-4b63-8bde-176dd426d46c</string>
        </deviceIds>
        <properties>
            <SnmpDeviceProperty>
                <index>1</index>
                <name>EMH.${index}.Magnetometer.Connect.State</name>
                <isState>true</isState>
            </SnmpDeviceProperty>
            <SnmpDeviceProperty>
                <index>2</index>
                <name>EMH.${index}.Magnetometer.Access.State</name>
                <isState>true</isState>
            </SnmpDeviceProperty>
            <SnmpDeviceProperty>
                <index>3</index>
                <name>EMH.${index}.Magnetometer.State</name>
                <isState>true</isState>
            </SnmpDeviceProperty>
            <SnmpDeviceProperty>
                <index>4</index>
                <name>EMH.${index}.Magnetometer.PowerSupply.State</name>
                <isState>true</isState>
            </SnmpDeviceProperty>
            <SnmpDeviceProperty>
                <index>5</index>
                <name>EMH.${index}.Smoke.Access.State</name>
                <isState>true</isState>
            </SnmpDeviceProperty>
            <SnmpDeviceProperty>
                <index>6</index>
                <name>EMH.${index}.Smoke.State</name>
                <isState>true</isState>
            </SnmpDeviceProperty>
            <SnmpDeviceProperty>
                <index>7</index>
                <name>EMH.${index}.TH.Access.State</name>
                <isState>true</isState>
            </SnmpDeviceProperty>
            <SnmpDeviceProperty>
                <index>8</index>
                <name>EMH.${index}.Tempture</name>
                <isState>false</isState>
            </SnmpDeviceProperty>
            <SnmpDeviceProperty>
                <index>9</index>
                <name>EMH.${index}.Humidity</name>
                <isState>false</isState>
            </SnmpDeviceProperty>
            <SnmpDeviceProperty>
                <index>10</index>
                <name>EMH.${index}.Alert.Temperature.Over</name>
                <isState>true</isState>
            </SnmpDeviceProperty>
            <SnmpDeviceProperty>
                <index>11</index>
                <name>EMH.${index}.Alert.Temperature.Less</name>
                <isState>true</isState>
            </SnmpDeviceProperty>
            <SnmpDeviceProperty>
                <index>12</index>
                <name>EMH.${index}.Alert.Humidity.Over</name>
                <isState>true</isState>
            </SnmpDeviceProperty>
            <SnmpDeviceProperty>
                <index>13</index>
                <name>EMH.${index}.Alert.Humidity.Less</name>
                <isState>true</isState>
            </SnmpDeviceProperty>
        </properties>
    </SnmpDeviceTable>
</#list>