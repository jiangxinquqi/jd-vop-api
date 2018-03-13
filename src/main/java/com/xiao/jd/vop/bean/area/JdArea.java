package com.xiao.jd.vop.bean.area;

import java.io.Serializable;

/**
 * 〈京东地区〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/2/8 13:57
 * @since 1.0.0
 */
public class JdArea implements Serializable {
    private static final long serialVersionUID = -1050596842929583961L;

    private int province;
    private int city;
    private int county;
    /**
     * 四级地址 (如果该地区有四级地址，则必须传递四级地址，没有四级地址则传 0)
     */
    private int town = 0;

    public JdArea() {
    }

    public JdArea(int province, int city, int county, int town) {
        this.province = province;
        this.city = city;
        this.county = county;
        this.town = town;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public int getCounty() {
        return county;
    }

    public void setCounty(int county) {
        this.county = county;
    }

    public int getTown() {
        return town;
    }

    public void setTown(int town) {
        this.town = town;
    }

    public String getAreaStringOf3(JdArea jdArea) {
        return this.province + "_" + this.city + "_" + this.county;
    }
}
