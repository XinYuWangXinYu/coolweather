package com.coolweather.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 名称: County
 * 作者: WangXinYu
 * 时间: 2018/11/22
 * 描述:
 */
public class County extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
