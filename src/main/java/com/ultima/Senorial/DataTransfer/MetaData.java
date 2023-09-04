package com.ultima.Senorial.DataTransfer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaData {

    @JsonProperty("1. Information")
        private String Information;
    @JsonProperty("2. Symbol")
               private String Symbol;
    @JsonProperty("3. Last Refreshed")
          private String lastRefreshed;
    @JsonProperty("4. Interval")
               private String Interval;
    @JsonProperty("5. Output Size")
         private String outputSize;
    @JsonProperty("6. Time Zone")
        private String TimeZone;

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(String lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public String getInterval() {
        return Interval;
    }

    public void setInterval(String interval) {
        Interval = interval;
    }

    public String getOutputSize() {
        return outputSize;
    }

    public void setOutputSize(String outputSize) {
        this.outputSize = outputSize;
    }

    public String getTimeZone() {
        return TimeZone;
    }

    public void setTimeZone(String timeZone) {
        TimeZone = timeZone;
    }


    @Override
    public String toString() {
        return "MetaData{" +
                "Information='" + Information + '\'' +
                ", Symbol='" + Symbol + '\'' +
                ", lastRefreshed='" + lastRefreshed + '\'' +
                ", Interval='" + Interval + '\'' +
                ", outputSize='" + outputSize + '\'' +
                ", TimeZone='" + TimeZone + '\'' +
                '}';
    }
}
