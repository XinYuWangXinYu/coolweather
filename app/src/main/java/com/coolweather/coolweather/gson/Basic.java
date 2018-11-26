package com.coolweather.coolweather.gson;


import com.google.gson.annotations.SerializedName;

/**
 * 名称: Basic
 * 作者: WangXinYu
 * 时间: 2018/11/22
 * 描述:
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String wheatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
