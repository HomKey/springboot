<linked-list>
    <#list pduList as object>
    <DeviceDefine>
        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>
            <Byte4ToFloatComputeSensorDefine>
                <name>RACK.BackDoor.PDU.1.Voltage</name>
                <highPropertyDefines>
                    <name>PDU.MainSupply.Voltage.H</name>
                    <registerIndex>0</registerIndex>
                    <scale>2</scale>
                    <isMean>true</isMean>
                    <commandName>pdu_spem_${object.index}_3_0_30</commandName>
                    <divider>1</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>PDU.MainSupply.Voltage.L</name>
                    <registerIndex>1</registerIndex>
                    <scale>2</scale>
                    <isMean>true</isMean>
                    <commandName>pdu_spem_${object.index}_3_0_30</commandName>
                    <divider>1</divider>
                </lowPropertyDefines>
            </Byte4ToFloatComputeSensorDefine>

            <Byte4ToFloatComputeSensorDefine>
                <name>RACK.BackDoor.PDU.1.Current</name>
                <highPropertyDefines>
                    <name>PDU.MainSupply.Current.H</name>
                    <registerIndex>2</registerIndex>
                    <scale>2</scale>
                    <isMean>true</isMean>
                    <commandName>pdu_spem_${object.index}_3_0_30</commandName>
                    <divider>1</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>PDU.MainSupply.Current.L</name>
                    <registerIndex>3</registerIndex>
                    <scale>2</scale>
                    <isMean>true</isMean>
                    <commandName>pdu_spem_${object.index}_3_0_30</commandName>
                    <divider>1</divider>
                </lowPropertyDefines>
            </Byte4ToFloatComputeSensorDefine>

            <Byte4ToFloatComputeSensorDefine>
                <name>RACK.BackDoor.PDU.1.ActivePower</name>
                <highPropertyDefines>
                    <name>PDU.ActivePower.H</name>
                    <registerIndex>6</registerIndex>
                    <scale>2</scale>
                    <isMean>true</isMean>
                    <commandName>pdu_spem_${object.index}_3_0_30</commandName>
                    <divider>1</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>PDU.ActivePower.L</name>
                    <registerIndex>7</registerIndex>
                    <scale>2</scale>
                    <isMean>true</isMean>
                    <commandName>pdu_spem_${object.index}_3_0_30</commandName>
                    <divider>1</divider>
                </lowPropertyDefines>
            </Byte4ToFloatComputeSensorDefine>

            <Byte4ToFloatComputeSensorDefine>
                <name>RACK.BackDoor.PDU.1.Humidity</name>
                <highPropertyDefines>
                    <name>PDU.Humidity.H</name>
                    <registerIndex>14</registerIndex>
                    <scale>2</scale>
                    <isMean>true</isMean>
                    <commandName>pdu_spem_${object.index}_3_0_30</commandName>
                    <divider>1</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>PDU.Humidity.L</name>
                    <registerIndex>15</registerIndex>
                    <scale>2</scale>
                    <isMean>true</isMean>
                    <commandName>pdu_spem_${object.index}_3_0_30</commandName>
                    <divider>1</divider>
                </lowPropertyDefines>
            </Byte4ToFloatComputeSensorDefine>

            <Byte4ToFloatComputeSensorDefine>
                <name>RACK.BackDoor.PDU.1.Temperature</name>
                <highPropertyDefines>
                    <name>PDU.Temperature.H</name>
                    <registerIndex>16</registerIndex>
                    <scale>2</scale>
                    <isMean>true</isMean>
                    <commandName>pdu_spem_${object.index}_3_0_30</commandName>
                    <divider>1</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>PDU.Temperature.L</name>
                    <registerIndex>17</registerIndex>
                    <scale>2</scale>
                    <isMean>true</isMean>
                    <commandName>pdu_spem_${object.index}_3_0_30</commandName>
                    <divider>1</divider>
                </lowPropertyDefines>
            </Byte4ToFloatComputeSensorDefine>

            <Byte4ToFloatComputeSensorDefine>
                <name>RACK.BackDoor.PDU.1.ActiveEnergy</name>
                <highPropertyDefines>
                    <name>PDU.ElectricQuantity.H</name>
                    <registerIndex>18</registerIndex>
                    <scale>2</scale>
                    <isMean>true</isMean>
                    <commandName>pdu_spem_${object.index}_3_0_30</commandName>
                    <divider>1</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>PDU.ElectricQuantity.L</name>
                    <registerIndex>19</registerIndex>
                    <scale>2</scale>
                    <isMean>true</isMean>
                    <commandName>pdu_spem_${object.index}_3_0_30</commandName>
                    <divider>1</divider>
                </lowPropertyDefines>
            </Byte4ToFloatComputeSensorDefine>

        </iSensorDefines>
    </DeviceDefine>
    </#list>
</linked-list>