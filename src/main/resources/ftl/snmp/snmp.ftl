<#list 33..48 as index>
--    1.3.6.1.4.1.32832.9.5.1.1.${index}
-- 1.3.6.1.4.1.0.1.2.5.1.1.${index}
-- 1.3.6.1.4.1.0.1.2.5.1.1.${index}
        -- 1.3.6.1.4.1.0.1.2.5.1.1.${index}
        pdcFirstBranchCurrent${index} OBJECT-TYPE
            SYNTAX Integer32
            MAX-ACCESS read-only
            STATUS current
            DESCRIPTION
                "The ${index}st branch current value of first main input circuit, precision is 0.01A"
            ::= { pdcFirstBranchCurrentEntry ${index} }
</#list>