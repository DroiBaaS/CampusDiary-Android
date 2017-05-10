package com.campus.diary.model;

import com.droi.sdk.core.DroiExpose;
import com.droi.sdk.core.DroiObject;

import java.util.List;

/**
 * Created by chenpei on 2017/5/9.
 */

public class CircleResult extends DroiObject {

    @DroiExpose
    private List<CircleItem> data;
    @DroiExpose
    public int code;
    @DroiExpose
    public String desc;

    public List<CircleItem> getCircles() {
        return data;
    }

    public void setCircles(List<CircleItem> data) {
        this.data = data;
    }
}