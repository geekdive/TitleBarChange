package id.co.dev.rabbaanii.titlebarchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toCreate(View view){
        Intent goCreate = new Intent(mainActivity.this, createActivity.class);
        startActivity(goCreate);
    }
}
