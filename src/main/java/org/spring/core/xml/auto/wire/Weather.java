package org.spring.core.xml.auto.wire;

public class Weather {
    private String weatherName;
    private Season season;

    public Weather() {
        super();
    }

    public Weather(String weatherName, Season season) {
        this.weatherName = weatherName;
        this.season = season;
    }

    public String getWeather() {
        return weatherName;
    }

    public void setWeatherName(String weatherName) {
        this.weatherName = weatherName;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "weather='" + weatherName + '\'' +
                ", season=" + season +
                '}';
    }
}
