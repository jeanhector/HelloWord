package com.openlab.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Bryam Soto on 22/04/2017.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtText = (EditText) findViewById(R.id.edt_text);
        Button btnMostrar = (Button) findViewById(R.id.btn_mostar);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), edtText.getText().toString(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                startActivity(intent);

            }
        });

    }
}
