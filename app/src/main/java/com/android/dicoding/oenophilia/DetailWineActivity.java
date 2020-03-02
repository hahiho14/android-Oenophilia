package com.android.dicoding.oenophilia;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailWineActivity extends AppCompatActivity{
    public static final String EXTRA_IMAGE = "extra_image" ;
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_AVG = "extra_average";
    public static final String EXTRA_DESC = "extra_description";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_wine);

        ImageView ivDetailWine = findViewById(R.id.iv_detail_wine);
        TextView tvDetailName = findViewById(R.id.tv_detail_wine_name);
        TextView tvDetailAvg = findViewById(R.id.tv_detail_avg_price);
        TextView tvDetailDesc = findViewById(R.id.tv_detail_wine_desc);

        String image = getIntent().getStringExtra(EXTRA_IMAGE);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String avg_price = getIntent().getStringExtra(EXTRA_AVG);
        String description = getIntent().getStringExtra(EXTRA_DESC);

        Glide.with(this)
                .load(image)
                .into(ivDetailWine);
        tvDetailName.setText(name);
        tvDetailAvg.setText(avg_price);
        tvDetailDesc.setText(description);
    }
}
