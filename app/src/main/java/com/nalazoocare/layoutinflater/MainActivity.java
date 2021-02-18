package com.nalazoocare.layoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button add_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_view = findViewById(R.id.add_layout);
        add_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sub n_layout = new Sub(getApplicationContext());
                LinearLayout con = findViewById(R.id.con);
                con.addView(n_layout);

                Button but = con.findViewById(R.id.b1);
                but.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "클릭", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
