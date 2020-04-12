package com.example.informasikomiksijuki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_NAMA = "extra nama";
    public static final String EXTRA_DESKRIPSI = "extra DESKRIPSI";
    public static final String EXTRA_IMAGE = "extra IMAGE";

TextView nama , detail;
ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        nama = findViewById(R.id.tv_item_name);
        detail = findViewById(R.id.tv_item_detail);
        image = findViewById(R.id.imageView1);

        nama.setText(getIntent().getStringExtra(EXTRA_NAMA));
        detail.setText(getIntent().getStringExtra(EXTRA_DESKRIPSI));

        int photo = getIntent().getIntExtra(EXTRA_IMAGE, 0);
        Glide.with(this).load(photo).into(image);

        setActionBarTitle(getIntent().getStringExtra(EXTRA_NAMA));

    }
    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
