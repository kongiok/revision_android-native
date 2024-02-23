package revision.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] cities = {"台北市","新北市","桃園市","台中市"};
    ArrayAdapter listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Set a Adapter for String.
//        layout.simple_list_item_1 just a template style for list item view.
        listAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                cities);
        ListView listView = findViewById(R.id.List);
//        Now, you got a adapter.
//        Yet, you still need a view binding your adapter to toggle things on change.
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String currentCity = cities[position];
                String resultText = "You've chosen " + currentCity + " .";
                Toast.makeText(MainActivity.this,resultText, Toast.LENGTH_LONG).show();
            }
        });
    }
}