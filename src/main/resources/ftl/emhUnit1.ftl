<#list 1..15 as index>

		-- 1.3.6.1.4.1.0.1.1.2.${index}
		emhUnit${index}Table OBJECT-TYPE
			SYNTAX SEQUENCE OF EmhUnit1Entry
			MAX-ACCESS not-accessible
			STATUS current
			DESCRIPTION
				"emh Unit${index}."
			::= { emhUnit ${index} }


		-- 1.3.6.1.4.1.0.1.1.2.${index}.1
		emhUnit${index}Entry OBJECT-TYPE
			SYNTAX EmhUnit1Entry
			MAX-ACCESS not-accessible
			STATUS current
			DESCRIPTION
				"Entry of emhUnit5."
			INDEX {  }
			::= { emhUnit${index}Table 1 }


		EmhUnit1Entry ::=
			SEQUENCE {
				emhUnit${index}Online
					INTEGER,
				emhUnit${index}DoorAccess
					INTEGER,
				emhUnit${index}DoorStatus
					INTEGER,
				emhUnit${index}DoorElecMagneticPower
					INTEGER,
				emhUnit${index}SmokeAccess
					INTEGER,
				emhUnit${index}SmokeStatus
					INTEGER,
				emhUnit${index}THAccess
					INTEGER,
				emhUnit${index}Temperature
					OCTET STRING,
				emhUnit${index}Humidity
					OCTET STRING,
				emhUnit${index}TemperatureOverAlarm
					INTEGER,
				emhUnit${index}TemperatureLessAlarm
					INTEGER,
				emhUnit${index}HumidityOverAlarm
					INTEGER,
				emhUnit${index}HumidityLessAlarm
					INTEGER
			 }

		-- 1.3.6.1.4.1.0.1.1.2.${index}.1.1
		emhUnit${index}Online OBJECT-TYPE
			SYNTAX INTEGER
				{
				off(0),
				on(1)
				}
			MAX-ACCESS read-only
			STATUS current
			DESCRIPTION
				"The communication status of the unit."
			::= { emhUnit${index}Entry 1 }


		-- 1.3.6.1.4.1.0.1.1.2.${index}.1.2
		emhUnit${index}DoorAccess OBJECT-TYPE
			SYNTAX INTEGER
				{
				off(0),
				on(1)
				}
			MAX-ACCESS read-only
			STATUS current
			DESCRIPTION
				"The access door status of the unit"
			::= { emhUnit${index}Entry 2 }


		-- 1.3.6.1.4.1.0.1.1.2.${index}.1.3
		emhUnit${index}DoorStatus OBJECT-TYPE
			SYNTAX INTEGER
				{
				off(0),
				on(1)
				}
			MAX-ACCESS read-only
			STATUS current
			DESCRIPTION
				"The door status of the unit"
			::= { emhUnit${index}Entry 3 }


		-- 1.3.6.1.4.1.0.1.1.2.${index}.1.4
		emhUnit${index}DoorElecMagneticPower OBJECT-TYPE
			SYNTAX INTEGER
				{
				off(0),
				on(1)
				}
			MAX-ACCESS read-only
			STATUS current
			DESCRIPTION
				"The ElecMagneticPower status of the unit."
			::= { emhUnit${index}Entry 4 }


		-- 1.3.6.1.4.1.0.1.1.2.${index}.1.5
		emhUnit${index}SmokeAccess OBJECT-TYPE
			SYNTAX INTEGER
				{
				off(0),
				on(1)
				}
			MAX-ACCESS read-only
			STATUS current
			DESCRIPTION
				"The access smoke status of the unit"
			::= { emhUnit${index}Entry 5 }


		-- 1.3.6.1.4.1.0.1.1.2.${index}.1.6
		emhUnit${index}SmokeStatus OBJECT-TYPE
			SYNTAX INTEGER
				{
				off(0),
				on(1)
				}
			MAX-ACCESS read-only
			STATUS current
			DESCRIPTION
				"The smoke status of the unit"
			::= { emhUnit${index}Entry 6 }


		-- 1.3.6.1.4.1.0.1.1.2.${index}.1.7
		emhUnit${index}THAccess OBJECT-TYPE
			SYNTAX INTEGER
				{
				off(0),
				on(1)
				}
			MAX-ACCESS read-only
			STATUS current
			DESCRIPTION
				"The access TH status of the unit."
			::= { emhUnit${index}Entry 7 }


		-- 1.3.6.1.4.1.0.1.1.2.${index}.1.8
		emhUnit${index}Temperature OBJECT-TYPE
			SYNTAX OCTET STRING
			MAX-ACCESS read-only
			STATUS current
			DESCRIPTION
				"The temperature value of the unit."
			::= { emhUnit${index}Entry 8 }


		-- 1.3.6.1.4.1.0.1.1.2.${index}.1.9
		emhUnit${index}Humidity OBJECT-TYPE
			SYNTAX OCTET STRING
			MAX-ACCESS read-only
			STATUS current
			DESCRIPTION
				"The humidity value of the unit."
			::= { emhUnit${index}Entry 9 }


		-- 1.3.6.1.4.1.0.1.1.2.${index}.1.10
		emhUnit${index}TemperatureOverAlarm OBJECT-TYPE
			SYNTAX INTEGER
				{
				normal(0),
				alarm(1)
				}
			MAX-ACCESS read-only
			STATUS current
			DESCRIPTION
				"The temperature over alarm of the unit."
			::= { emhUnit${index}Entry 10 }


		-- 1.3.6.1.4.1.0.1.1.2.${index}.1.11
		emhUnit${index}TemperatureLessAlarm OBJECT-TYPE
			SYNTAX INTEGER
				{
				normal(0),
				alarm(1)
				}
			MAX-ACCESS read-only
			STATUS current
			DESCRIPTION
				"The temperature less alarm of the unit."
			::= { emhUnit${index}Entry 11 }


		-- 1.3.6.1.4.1.0.1.1.2.${index}.1.12
		emhUnit${index}HumidityOverAlarm OBJECT-TYPE
			SYNTAX INTEGER
				{
				normal(0),
				alarm(1)
				}
			MAX-ACCESS read-only
			STATUS current
			DESCRIPTION
				"The humidity over alarm of the unit."
			::= { emhUnit${index}Entry 12 }


		-- 1.3.6.1.4.1.0.1.1.2.${index}.1.13
		emhUnit${index}HumidityLessAlarm OBJECT-TYPE
			SYNTAX INTEGER
				{
				normal(0),
				alarm(1)
				}
			MAX-ACCESS read-only
			STATUS current
			DESCRIPTION
				"The humidity less alarm of the unit."
			::= { emhUnit${index}Entry 13 }


</#list>