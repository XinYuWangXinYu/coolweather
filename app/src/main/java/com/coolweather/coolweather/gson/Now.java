package com.coolweather.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 名称: Now
 * 作者: WangXinYu
 * 时间: 2018/11/22
 * 描述:
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}
