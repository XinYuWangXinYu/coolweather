package com.coolweather.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 名称: Forecast
 * 作者: WangXinYu
 * 时间: 2018/11/22
 * 描述:
 */
public class Forecast {
    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
