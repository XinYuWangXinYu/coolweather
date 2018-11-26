package com.coolweather.coolweather.gson;

/**
 * 名称: AQI
 * 作者: WangXinYu
 * 时间: 2018/11/22
 * 描述:
 */
public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
