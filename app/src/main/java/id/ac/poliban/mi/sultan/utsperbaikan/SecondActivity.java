package id.ac.poliban.mi.sultan.utsperbaikan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText etNim, etNama, etAlamat, etTelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btSave = findViewById(R.id.btSend);
        etNim = findViewById(R.id.etNim);
        etNama= findViewById(R.id.etNama);
        etAlamat= findViewById(R.id.etAlamat);
        etTelp= findViewById(R.id.etTelp);

        btSave.setOnClickListener(v -> {
            submit();
        });



    }

    private void submit() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("nim", etNim.getText().toString());
        intent.putExtra("nama", etNama.getText().toString());
        intent.putExtra("alamat", etAlamat.getText().toString());
        intent.putExtra("telp", etNim.getText().toString());

        setResult(RESULT_OK, intent);
        finish();
    }
}
