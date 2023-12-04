package com.example.krasrakas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    CardView laporCard;
    TextView pelaporanTextView, statLaporTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        laporCard = findViewById(R.id.laporCard);
        pelaporanTextView = findViewById(R.id.pelaporan);
        statLaporTextView = findViewById(R.id.statLapor);

        laporCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Pelaporan1Activity.class);
                startActivity(intent);
            }
        });

        pelaporanTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Pelaporan1Activity.class);
                startActivity(intent);
            }
        });

        statLaporTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, StatusPelaporanActivity.class);
                startActivity(intent);
            }
        });
    }
}
