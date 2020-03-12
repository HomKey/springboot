<linked-list>
<#list elmList as object>
    <DeviceDefine>
        <deviceId>${object.deviceId}</deviceId>
        <iSensorDefines>
            <SensorDefine>
                <name>ELM.A.Voltage</name>
                <registerIndex>50</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.B.Voltage</name>
                <registerIndex>51</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.C.Voltage</name>
                <registerIndex>52</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.LineVoltage.AB</name>
                <registerIndex>53</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.LineVoltage.BC</name>
                <registerIndex>54</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.LineVoltage.CA</name>
                <registerIndex>55</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.A.Current</name>
                <registerIndex>56</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.B.Current</name>
                <registerIndex>57</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.C.Current</name>
                <registerIndex>58</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <ComputeSensorDefine>
                <name>ELM.ActivePower</name>
                <highPropertyDefines>
                    <name>ELM.ActivePower_h</name>
                    <registerIndex>60</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                    <divider>10</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>ELM.ActivePower_l</name>
                    <registerIndex>59</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                    <divider>10</divider>
                </lowPropertyDefines>
            </ComputeSensorDefine>
            <ComputeSensorDefine>
                <name>ELM.ReactivePower</name>
                <highPropertyDefines>
                    <name>ELM.ReactivePower_h</name>
                    <registerIndex>62</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                    <divider>10</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>ELM.ReactivePower_l</name>
                    <registerIndex>61</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                    <divider>10</divider>
                </lowPropertyDefines>
            </ComputeSensorDefine>
            <SensorDefine>
                <name>ELM.PowerFactor</name>
                <registerIndex>63</registerIndex>
                <scale>3</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>1000</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.A.ActivePower</name>
                <registerIndex>64</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.B.ActivePower</name>
                <registerIndex>65</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.C.ActivePower</name>
                <registerIndex>66</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.A.ReactivePower</name>
                <registerIndex>67</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.B.ReactivePower</name>
                <registerIndex>68</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.C.ReactivePower</name>
                <registerIndex>69</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.A.PowerFactor</name>
                <registerIndex>70</registerIndex>
                <scale>3</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>1000</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.B.PowerFactor</name>
                <registerIndex>71</registerIndex>
                <scale>3</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>1000</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.C.PowerFactor</name>
                <registerIndex>72</registerIndex>
                <scale>3</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>1000</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.Frequency</name>
                <registerIndex>73</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40051_24</commandName>
                <divider>100</divider>
            </SensorDefine>
            <ComputeSensorDefine>
                <name>ELM.ActiveDegree</name>
                <highPropertyDefines>
                    <name>ELM.ActiveDegree_h</name>
                    <registerIndex>75</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>ELM.ActiveDegree_l</name>
                    <registerIndex>74</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </lowPropertyDefines>
            </ComputeSensorDefine>
            <ComputeSensorDefine>
                <name>ELM.ReactiveDegree</name>
                <highPropertyDefines>
                    <name>ELM.ReactiveDegree_h</name>
                    <registerIndex>77</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>ELM.ReactiveDegree_l</name>
                    <registerIndex>76</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </lowPropertyDefines>
            </ComputeSensorDefine>
            <ComputeSensorDefine>
                <name>ELM.Input.ActiveDegree</name>
                <highPropertyDefines>
                    <name>ELM.Input.ActiveDegree_h</name>
                    <registerIndex>79</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>ELM.Input.ActiveDegree_l</name>
                    <registerIndex>78</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </lowPropertyDefines>
            </ComputeSensorDefine>
            <ComputeSensorDefine>
                <name>ELM.Output.ActiveDegree</name>
                <highPropertyDefines>
                    <name>ELM.Output.ActiveDegree_h</name>
                    <registerIndex>81</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>ELM.Output.ActiveDegree_l</name>
                    <registerIndex>80</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </lowPropertyDefines>
            </ComputeSensorDefine>
            <ComputeSensorDefine>
                <name>ELM.Input.ReactiveDegree</name>
                <highPropertyDefines>
                    <name>ELM.Input.ReactiveDegree_h</name>
                    <registerIndex>83</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>ELM.Input.ReactiveDegree_l</name>
                    <registerIndex>82</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </lowPropertyDefines>
            </ComputeSensorDefine>
            <ComputeSensorDefine>
                <name>ELM.Output.ReactiveDegree</name>
                <highPropertyDefines>
                    <name>ELM.Output.ReactiveDegree_h</name>
                    <registerIndex>85</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>ELM.Output.ReactiveDegree_l</name>
                    <registerIndex>84</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </lowPropertyDefines>
            </ComputeSensorDefine>
            <SensorDefine>
                <name>ELM.Switch.Status</name>
                <registerIndex>86</registerIndex>
                <scale>0</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.Relay.Status</name>
                <registerIndex>87</registerIndex>
                <scale>0</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>1</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.A.Voltage.THD</name>
                <registerIndex>88</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.B.Voltage.THD</name>
                <registerIndex>89</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.C.Voltage.THD</name>
                <registerIndex>90</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.A.Current.THD</name>
                <registerIndex>91</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.B.Current.THD</name>
                <registerIndex>92</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.C.Current.THD</name>
                <registerIndex>93</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <!--中线性电流-->
            <SensorDefine>
                <name>ELM.Middle.Current</name>
                <registerIndex>94</registerIndex>
                <scale>3</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>1000</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.Average.Current</name>
                <registerIndex>95</registerIndex>
                <scale>3</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>1000</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.Line.Average.Voltage</name>
                <registerIndex>96</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.ABC.Average.Voltage</name>
                <registerIndex>97</registerIndex>
                <scale>2</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>100</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.A.Voltage.Distortion.Rate</name>
                <registerIndex>98</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.B.Voltage.Distortion.Rate</name>
                <registerIndex>99</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.C.Voltage.Distortion.Rate</name>
                <registerIndex>100</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.A.Current.Distortion.Rate</name>
                <registerIndex>101</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.B.Current.Distortion.Rate</name>
                <registerIndex>102</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.C.Current.Distortion.Rate</name>
                <registerIndex>103</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.A.ApparentPower</name>
                <registerIndex>105</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.B.ApparentPower</name>
                <registerIndex>106</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <SensorDefine>
                <name>ELM.C.ApparentPower</name>
                <registerIndex>107</registerIndex>
                <scale>1</scale>
                <isMean>false</isMean>
                <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                <divider>10</divider>
            </SensorDefine>
            <ComputeSensorDefine>
                <name>ELM.ApparentPower</name>
                <highPropertyDefines>
                    <name>ELM.ApparentPower_h</name>
                    <registerIndex>109</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </highPropertyDefines>
                <lowPropertyDefines>
                    <name>ELM.ApparentPower_l</name>
                    <registerIndex>108</registerIndex>
                    <scale>1</scale>
                    <isMean>true</isMean>
                    <commandName>cmd_dtm830c_${object.index}_3_40075_35</commandName>
                    <divider>10</divider>
                </lowPropertyDefines>
            </ComputeSensorDefine>
        </iSensorDefines>
    </DeviceDefine>
</#list>
</linked-list>