package uta.fisei.daniela_villacis_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextname;
    private EditText editTextapellido;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.buttonSiguiente);

        button.setOnClickListener(new View.OnClickListener(){
              @Override
             public void onClick(View view) {
                  Intent intent = new Intent(MainActivity.this, Activity2.class);

                  startActivity(intent);
               }
          }
        );

    }



    public int[] metodoParteEntera(int dividendo, int divisor){


        int cos = 0;

        while (dividendo>0) {
            cos++;
            dividendo = dividendo- divisor;
        }

      int[] res = {cos, dividendo};

        return  res;
    }

    public int num_invertido(int num){
        return 0;
    }

}