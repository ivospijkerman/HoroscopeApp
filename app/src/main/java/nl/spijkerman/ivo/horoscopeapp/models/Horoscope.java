package nl.spijkerman.ivo.horoscopeapp.models;

public class Horoscope {
    private final String zodiacSign;
    private final String forecast;
    private final int imageResourceId;

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

    @Override
    public String toString() {
        return zodiacSign;
    }
}
