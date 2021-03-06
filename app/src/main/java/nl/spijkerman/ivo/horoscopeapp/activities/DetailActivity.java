package nl.spijkerman.ivo.horoscopeapp.activities;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import nl.spijkerman.ivo.horoscopeapp.R;
import nl.spijkerman.ivo.horoscopeapp.controller.HoroscopeController;
import nl.spijkerman.ivo.horoscopeapp.models.Horoscope;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_ZODIAC_ID = "zodiacId";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int id = getIntent().getExtras().getInt(EXTRA_ZODIAC_ID);
        Horoscope horoscope = HoroscopeController.getById(id);

        TextView textViewHeader = findViewById(R.id.text_view_header);
        textViewHeader.setText(horoscope.getZodiacSign());

        TextView textViewDescription = findViewById(R.id.text_view_description);
        textViewDescription.setText(horoscope.getForecast());

        ImageView imageViewZodiacSign = findViewById(R.id.image_view_zodiac_sign);
        Drawable image = getDrawable(horoscope.getImageResourceId());
        imageViewZodiacSign.setImageDrawable(image);

    }
}
