package uta.fisei.daniela_villacis_prueba_01;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {

    private EditText nombre;
    private EditText apellido;
    private EditText dividendo;
    private EditText divisor;
    private EditText numero;

    private Button button;

/*    ActivityResultLauncher<Intent> activityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if(result.getResultCode() == Activity.RESULT_OK) {


                    }
                }
            });*/




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        dividendo = findViewById(R.id.editTextDividendo);
        divisor = findViewById(R.id.editTextDivisor);
        numero = findViewById(R.id.editTextNumInvertido);
        nombre = findViewById(R.id.editTextName);
        apellido = findViewById(R.id.editTextApellido);

        button = findViewById(R.id.buttonCerrar);

        Bundle extras = getIntent().getExtras();

        String nombres = extras.getString("nameExtra");
        String apellidos = extras.getString("apeExtra");



        nombre.setText(nombres);
        apellido.setText(apellidos);



        button.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View view) {
               String divr = divisor.getText().toString();
               String divd = dividendo.getText().toString();
               String num = numero.getText().toString();
               String send = divr + "" + divd + "" + num;

               Intent intent = new Intent();
               intent.setData(Uri.parse(send));
               setResult(Activity.RESULT_OK, intent);

            finish();
           }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //apellido.setText(data.getDataString());

    }


}