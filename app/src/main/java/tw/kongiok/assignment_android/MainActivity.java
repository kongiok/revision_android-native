package tw.kongiok.assignment_android;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final ActivityResultLauncher<Intent> startActivityResultLauncher =
            registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() != Activity.RESULT_OK) {
                        return;
                    }
                    Intent data = result.getData();
                    if (data != null) {
                        String returnValue = data.getStringExtra("return_key");
                        Toast.makeText(MainActivity.this, returnValue, Toast.LENGTH_SHORT).show();
                    }
                });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeToSecondary(View view){
        Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
        startActivityResultLauncher.launch(intent);
    }
}