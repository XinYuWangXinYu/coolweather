package com.coolweather.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 名称: Weather
 * 作者: WangXinYu
 * 时间: 2018/11/22
 * 描述:
 */
public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
