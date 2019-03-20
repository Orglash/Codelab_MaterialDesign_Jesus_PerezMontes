package es.escuelaestech.chopo.mainactivity;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

        private TextView placeDetailAbout, placeLocationAbout, emailAbout, phoneAbout, gitAbout;
        private ImageView placePictureAbout;
        private Toolbar toolbarAbout;
        private Button button;
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_about);
            setSupportActionBar((Toolbar) findViewById(R.id.toolbar_about));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            // Set Collapsing Toolbar layout to the screen
            CollapsingToolbarLayout collapsingToolbar =
                    findViewById(R.id.collapsing_toolbar_about);
            // Set title of Detail page
            collapsingToolbar.setTitle(getString(R.string.item_title_about));
            inicializeUI();


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(AboutActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            });
    }
    private void inicializeUI(){
        placeDetailAbout = findViewById(R.id.place_detail_about);
        placeLocationAbout = findViewById(R.id.place_location_about);
        placePictureAbout = findViewById(R.id.image_about);
        toolbarAbout= findViewById(R.id.toolbar_about);
        emailAbout=findViewById(R.id.about_email);
        phoneAbout=findViewById(R.id.about_phone);
        gitAbout=findViewById(R.id.about_git);
        button=findViewById(R.id.back_button);

    }


}
