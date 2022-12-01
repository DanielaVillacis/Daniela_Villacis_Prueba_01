package uta.fisei.daniela_villacis_prueba_01;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


   ActivityResultLauncher<Intent>   activityResult = registerForActivityResult(
           new ActivityResultContracts.StartActivityForResult(),
           new ActivityResultCallback<ActivityResult>() {
               @Override
               public void onActivityResult(ActivityResult result) {
                  if(result.getResultCode() == Activity.RESULT_OK) {
                      Intent
                  }
               }
           }
   )
}
