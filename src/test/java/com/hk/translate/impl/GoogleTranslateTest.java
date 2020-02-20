package com.hk.translate.impl;

import com.hk.translate.ITranslate;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoogleTranslateTest {
    @Test
    public void testGoogleTranslate() {
        ITranslate translate = GoogleTranslate.getInstance();
        String s = translate.translateText("温度", "auto", "en");
        System.out.println(s);
        String t = translate.translateText(s, "auto", "zh_cn");
        System.out.println(t);
    }

    @Test
    public void test() {
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
        System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.commons.httpclient", "stdout");
        String[] data = new String[]{
                "Fan.State",
                "Cooling.State",
                "FreeCooling.State",
                "HotWaterAndGas.State",
                "ElectricReheat.State",
                "Humidifier.State",
                "Dehumidifier.State",
                "Buzzer.Status",
                "Fan.Overload",
                "AirFlow.Loss",
                "WaterFlow.Loss",
                "Compressor.1.Pressure.High",
                "Compressor.1.Pressure.Low",
                "Compressor.1.Overload",
                "Compressor.1.PumpDown.Fail",
                "Compressor.2.Pressure.High",
                "Compressor.2.Pressure.Low",
                "Compressor.2.Overload",
                "Compressor.2.PumpDown.Fail",
                "Alarm.Smoke",
                "Alarm.Water",
                "Alarm.Humidifier.Issue",
                "Alarm.Indoor.TH.Issue",
                "Compressor.Power.Lose",
                "Blower.AirFlow.Lose",
                "Alarm.Humidifier.WaterLevel.Low",
                "Alarm.Humidifier.Current.High",
                "Alarm.Temperature.High",
                "Alarm.Unknow",
                "Alarm.CoolingWater.Temperature.High",
                "Alarm.CoolingWater.Temperature.High",
                "Alarm.Indoor.Temperature.Over",
                "Alarm.Indoor.Temperature.Under",
                "Alarm.Indoor.Humidity.High",
                "Alarm.Indoor.Humidity.Low",
                "Alarm.A.Temperature.Over",
                "Alarm.A.Temperature.Under",
                "Alarm.A.Humidity.High",
                "Alarm.A.Humidity.Low",
                "Alarm.CoolingWater.WaterFlow.Lose",
                "Alarm.Filter.Block",
                "Alarm.Filter.Block",
                "Alarm.Fan.OverTime",
                "Alarm.Compressor.1.OverTime",
                "Alarm.Compressor.2.OverTime",
                "Alarm.FreeCooling.OverTime",
                "Alarm.ElectricReheater.1.OverTime",
                "Alarm.ElectricReheater.2.OverTime",
                "Alarm.ElectricReheater.3.OverTime",
                "Alarm.HotWaterAndGas.OverTime",
                "Alarm.Humidifier.OverTime",
                "Alarm.Dehumidifier.OverTime",
                "ReturnAir.Temperature",
                "SupplyAir.Temperature",
                "FreeCooling.FluidTemperature",
                "Ext.AirSensor.A.Temperature",
                "Ext.AirSensor.B.Temperature",
                "Ext.AirSensor.C.Temperature",
                "DigScrollComp.1.Discharge.Temperature",
                "DigScrollComp.2.Discharge.Temperature",
                "ReturnAir.Humidity",
                "Ext.AirSensor.A.Humidity",
                "Ext.AirSensor.B.Humidity",
                "Ext.AirSensor.C.Humidity",
                "Fan.RunningTime",
                "Compressor.1.RunningTime",
                "Compressor.2.RunningTime",
                "Humidifier.RunningTime",
                "Dehumidifier.RunningTime",
                "FreeCooling.RunningTime",
                "ElectricReheater.1.RunningTime",
                "ElectricReheater.2.RunningTime",
                "ElectricReheater.3.RunningTime",
                "HotWaterAndGas.RunningTime"
        };

        for (String item :
                data) {
            String value = GoogleTranslate.getInstance().translateText(item, "auto", "zh_cn").replace(".", "");
            System.out.println(item + ":" + value);
        }


    }


}