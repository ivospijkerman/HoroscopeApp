package nl.spijkerman.ivo.horoscopeapp.models;

public class Horoscope {
    private String zodiacSign;
    private String forecast;
    private int imageResourceId;

    public Horoscope(String zodiacSign,
                     int imageResourceId) {
        this(zodiacSign, "Forecast for " + zodiacSign, imageResourceId);
    }

    public Horoscope(String zodiacSign,
                     String forecast,
                     int imageResourceId) {
        this.zodiacSign = zodiacSign;
        this.forecast = forecast;
        this.imageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getForecast() {
        return forecast;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }
}
