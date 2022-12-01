package uta.fisei.daniela_villacis_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        button = findViewById(R.id.buttonCerrar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();

            });
    }
}