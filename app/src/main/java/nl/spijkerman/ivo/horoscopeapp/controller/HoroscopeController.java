package nl.spijkerman.ivo.horoscopeapp.controller;

import nl.spijkerman.ivo.horoscopeapp.R;
import nl.spijkerman.ivo.horoscopeapp.models.Horoscope;

public class HoroscopeController {
    private static final Horoscope[] HOROSCOPES = {
            new Horoscope("Aries", R.drawable.aries),
            new Horoscope("Taurus", R.drawable.taurus),
            new Horoscope("Gemini", R.drawable.gemini),
            new Horoscope("Cancer", R.drawable.cancer),
            new Horoscope("Leo", R.drawable.leo),
            new Horoscope("Virgo", R.drawable.virgo),
            new Horoscope("Libra", R.drawable.libra),
            new Horoscope("Scorpio", R.drawable.scorpio),
            new Horoscope("Sagittarius", R.drawable.sagittarius),
            new Horoscope("Capricorn", R.drawable.capricorn),
            new Horoscope("Aquarius", R.drawable.aquarius),
            new Horoscope("Pisces", R.drawable.pisces)
    };

    public static Horoscope[] getAll() {
        return HOROSCOPES;
    }

    public static Horoscope getById(int id) {
        return HOROSCOPES[id];
    }
}
