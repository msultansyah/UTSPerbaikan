package id.ac.poliban.mi.sultan.utsperbaikan;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btShow = findViewById(R.id.btShow);
        Button btInput = findViewById(R.id.btInput);


        btShow.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("info")
                    .setMessage(str)
                    .setPositiveButton("OK", null)
                    .show();

        });

        btInput.setOnClickListener(v -> {
            startActivityForResult(new Intent(this, SecondActivity.class), 1000);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1000 && resultCode==RESULT_OK && data.getExtras()!=null){
            str= data.getStringExtra("nim") + "\n";
            str += data.getStringExtra("nama") + "\n";
            str += data.getStringExtra("alamat") + "\n";
            str += data.getStringExtra("telp") + "\n";

        }
    }
}
