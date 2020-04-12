package com.example.informasikomiksijuki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvComic;
    private ArrayList<Comic> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvComic = findViewById(R.id.rv_juki);
        rvComic.setHasFixedSize(true);

        list.addAll(ComicData.getListData());
        showRecyclerList();


    }

    private void showRecyclerList() {
        rvComic.setLayoutManager(new LinearLayoutManager(this));
        ListComicAdapter listComicAdapter = new ListComicAdapter(list);
        rvComic.setAdapter(listComicAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                Intent intent = new Intent(this,AboutMe.class );
                startActivity(intent);
                break;

        }
    }

}
