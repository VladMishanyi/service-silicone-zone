package com.vk.servicesiliconezone.json;

/**
 * Created by User on 2017-07-20.
 */
public class DateFromChart {
    private String start;
    private String end;

    public DateFromChart(){}

    public DateFromChart(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(final String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(final String end) {
        this.end = end;
    }
}
