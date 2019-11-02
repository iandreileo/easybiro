package hackaton.smartbureaucracy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void persoana_fizica(View view) {

        if(getSharedPreferences("Nume_pfiz", MODE_PRIVATE).getString("key", "").equals("") || getSharedPreferences("Prenume_pfiz", MODE_PRIVATE).getString("key", "").equals("") || getSharedPreferences("CNP_pfiz", MODE_PRIVATE).getString("key", "").equals("") || getSharedPreferences("Data_pfiz", MODE_PRIVATE).getString("key", "").equals("") || getSharedPreferences("Domiciliu_pfiz", MODE_PRIVATE).getString("key", "").equals("") || getSharedPreferences("Serie_pfiz", MODE_PRIVATE).getString("key", "").equals("") || getSharedPreferences("Nrbul_pfiz", MODE_PRIVATE).getString("key", "").equals("") || getSharedPreferences("Locnastere_pfiz", MODE_PRIVATE).getString("key", "").equals("") || getSharedPreferences("Email_pfiz", MODE_PRIVATE).getString("key", "").equals("")) {
            Intent myIntent = new Intent(MainActivity.this,
                    content_main_pfiz.class);
            startActivity(myIntent);
        } else {
            Intent myIntent = new Intent(MainActivity.this,
                    pfizica.class);
            startActivity(myIntent);
        }
    }


    public void GDPR(View view) {
    }

    public void scaneaza_qr(View view) {
        //de testat daca ai toate datele completate
        if(getSharedPreferences("Nume_pfiz", MODE_PRIVATE).getString("key","").equals("") || getSharedPreferences("Prenume_pfiz", MODE_PRIVATE).getString("key","").equals("") || getSharedPreferences("Data_pfiz", MODE_PRIVATE).getString("key","").equals("") || getSharedPreferences("CNP_pfiz", MODE_PRIVATE).getString("key","").equals("") || getSharedPreferences("Domiciliu_pfiz", MODE_PRIVATE).getString("key","").equals("") || getSharedPreferences("Serie_pfiz", MODE_PRIVATE).getString("key", "").equals("") || getSharedPreferences("Nrbul_pfiz", MODE_PRIVATE).getString("key", "").equals("") || getSharedPreferences("Domiciliu_pfiz", MODE_PRIVATE).getString("key", "").equals("") || getSharedPreferences("Email_pfiz", MODE_PRIVATE).getString("key", "").equals("")) {
            Toast.makeText(getApplicationContext(),"Nu ai toate datele completate!", Toast.LENGTH_SHORT).show();

        }else {
            Intent myIntent = new Intent(MainActivity.this,
                    QR.class);
            startActivity(myIntent);
        }
    }

    public void ocr(View view) {
        Intent myIntent = new Intent(MainActivity.this,
                OCR.class);
        startActivity(myIntent);
    }
}
