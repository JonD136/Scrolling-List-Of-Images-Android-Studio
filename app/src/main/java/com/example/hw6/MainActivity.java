package com.example.hw6;

import android.graphics.LinearGradient;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declare object
    LinearLayout spotsLL;

    int pic[] = {R.drawable.bklyn_bridge, R.drawable.central_park, R.drawable.citi_field, R.drawable.coney_island, R.drawable.empire_st_bldg,
            R.drawable.museum_natural_history, R.drawable.nyc_public_library, R.drawable.queens_globe, R.drawable.statue_liberty,
            R.drawable.times_square, R.drawable.world_trade_center};

    //create a String array that holds each tour spot name
    String tourspotnameArray[] = {"Brooklyn Bridge", "Central Park", "Citi Field", "Coney Island", "Empire State Building", "Museum of Natural History",
                                  "NYC Public Library", "Queens Globe", "Statue of Liberty", "Times Square", "World Trade Center"};


    ImageButton image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define object
        spotsLL = (LinearLayout) findViewById(R.id.touristLL);

        //looping each site from the array
        for (int i = 0; i < pic.length; i++) {
            //storing each image as the logical ImageButton
            image = new ImageButton(MainActivity.this);

            //loading the photo using its unique ID
            image.setImageResource(pic[i]);

            //adding this ImageButton to the LinearLayout
            spotsLL.addView(image);

            //setting the corresponding tour name to the Image Button
            image.setContentDescription(tourspotnameArray[i]);

            //setting up a Listener to the ImageButton
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View currentImageButton) {
                    String tourname = (String)currentImageButton.getContentDescription();

                    //displaying the tour name
                    Toast.makeText(MainActivity.this,tourname, Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
