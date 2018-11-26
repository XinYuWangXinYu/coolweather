package com.coolweather.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 名称: Suggestion
 * 作者: WangXinYu
 * 时间: 2018/11/22
 * 描述:
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;


    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }

}
