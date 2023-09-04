package com.ultima.Senorial.DataTransfer;

import com.fasterxml.jackson.annotation.JsonProperty;


public class TimeSeries {


    @JsonProperty("2023-09-01 19:55:00")
    private TimeObject timeObject;













///////////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "TimeSeries{" +
                "timeObject=" + timeObject +
                '}';
    }
}
