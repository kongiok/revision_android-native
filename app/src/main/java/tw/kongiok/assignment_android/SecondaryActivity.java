package tw.kongiok.assignment_android;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
    }
    public void changeIntentToMain(View view){
        Intent returnIntent = new Intent();
        returnIntent.putExtra("return_key","Success");
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}