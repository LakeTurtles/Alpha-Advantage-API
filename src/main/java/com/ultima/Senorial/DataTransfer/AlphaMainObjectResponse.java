package com.ultima.Senorial.DataTransfer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlphaMainObjectResponse {

    @JsonProperty("Meta Data")
    private MetaData metaData;

    @JsonProperty("Time Series (5min)")
    private TimeSeries timeSeries;

    @Override
    public String toString() {
        return "AlphaMainObjectResponse{" +
                "metaData=" + metaData +
                ", timeSeries=" + timeSeries +
                '}';
    }
}
