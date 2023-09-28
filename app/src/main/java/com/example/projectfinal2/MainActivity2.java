package com.example.projectfinal2;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Solo Leveling", "Rating : 10 / 10", R.drawable.solo));
        items.add(new Item("Nano Machine", "Rating : 9 / 10", R.drawable.nano));
        items.add(new Item("Magic Emperor", "Rating :  8 / 10", R.drawable.magic));
        items.add(new Item("Assassination Classroom", "Rating :  8 / 10", R.drawable.assassination));
        items.add(new Item("Overgeared (Remake)", "Rating : 8 / 10", R.drawable.overgeared));
        items.add(new Item("Mage Returns After 4000 Years", "Rating :  7 / 10", R.drawable.years));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));



    }
}