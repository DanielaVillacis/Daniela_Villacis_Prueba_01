package uta.fisei.daniela_villacis_prueba_01;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Activity2 extends AppCompatActivity {

    private EditText nombre;
    private EditText apellido;
    private Button buttonS;
    private Button buttonC;
    private EditText dividendo;
    private EditText divisor;
    private EditText numero;
    public final static String EXTRA_APE = "uta.fisei.daniela_villacis_prueba_01.APELLIDO";

    ActivityResultLauncher<Intent> activityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if(result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        //cerrar.setEnabled(true);
                        String[] resultado = data.getDataString().split("_");
                        dividendo.setText(resultado[0]);
                        divisor.setText(resultado[1]);
                        numero.setText(resultado[2]);
                    }
                }
            });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        buttonS = findViewById(R.id.buttonSiguiente);
        nombre = findViewById(R.id.editTextName);
        apellido = findViewById(R.id.editTextApellido);
        divisor = findViewById(R.id.editTextDivisor;
        numero = findViewById(R.id.editTextNumInvertido;
        buttonS = findViewById(R.id.buttonSiguiente);
        buttonC = findViewById(R.id.buttonCerrar);

        String name = nombre.getText().toString();
        String ape = apellido.getText().toString();

        buttonS.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View view) {
             Intent intent = new Intent(Activity2.this, Activity3.class);
             intent.putExtra("nameExtra", name);
             intent.putExtra("apeExtra", ape);

               //activityResult.launch(Intent);

             startActivity(intent);

              }
          }
        );

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


    }
}