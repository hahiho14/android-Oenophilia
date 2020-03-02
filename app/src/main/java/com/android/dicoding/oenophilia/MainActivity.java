package com.android.dicoding.oenophilia;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWine;
    private ArrayList<Wine> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWine = findViewById(R.id.rv_wine);
        rvWine.setHasFixedSize(true);

        list.addAll(WineData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvWine.setLayoutManager(new LinearLayoutManager(this));
        ListWineAdapter listWineAdapter = new ListWineAdapter(list);
        rvWine.setAdapter(listWineAdapter);

        listWineAdapter.setOnItemClickCallback(new ListWineAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Wine data) {
                showSelectedWine(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.action_about:
                Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntent);
                break;
        }
    }

    private void showSelectedWine(Wine wine) {
        Toast.makeText(this, "Kamu memilih " + wine.getName(), Toast.LENGTH_SHORT).show();
        Intent moveWithDataIntent = new Intent(MainActivity.this, DetailWineActivity.class);
        moveWithDataIntent.putExtra(DetailWineActivity.EXTRA_IMAGE, wine.getPhoto());
        moveWithDataIntent.putExtra(DetailWineActivity.EXTRA_NAME, wine.getName());
        moveWithDataIntent.putExtra(DetailWineActivity.EXTRA_AVG, wine.getAvgprice());
        moveWithDataIntent.putExtra(DetailWineActivity.EXTRA_DESC, wine.getDescription());
        startActivity(moveWithDataIntent);
    }
}
