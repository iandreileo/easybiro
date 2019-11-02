package hackaton.smartbureaucracy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class date_pfizica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_pfizica);

        //autocomplete
        TextView textView1 = (TextView)findViewById(R.id.Nume);
        textView1.setText(getSharedPreferences("Nume_pfiz", MODE_PRIVATE).getString("key",""));

        TextView textView2 = (TextView)findViewById(R.id.Prenume);
        textView2.setText(getSharedPreferences("Prenume_pfiz", MODE_PRIVATE).getString("key",""));

        TextView textView3 = (TextView)findViewById(R.id.DataNast);
        textView3.setText(getSharedPreferences("Data_pfiz", MODE_PRIVATE).getString("key",""));

        TextView textView4 = (TextView)findViewById(R.id.CNP);
        textView4.setText(getSharedPreferences("CNP_pfiz", MODE_PRIVATE).getString("key",""));

        TextView textView5 = (TextView)findViewById(R.id.Domiciliu);
        textView5.setText(getSharedPreferences("Domiciliu_pfiz", MODE_PRIVATE).getString("key",""));

        TextView textView6 = (TextView)findViewById(R.id.Serie);
        textView6.setText(getSharedPreferences("Serie_pfiz", MODE_PRIVATE).getString("key",""));

        TextView textView7 = (TextView)findViewById(R.id.NrBul);
        textView7.setText(getSharedPreferences("Nrbul_pfiz", MODE_PRIVATE).getString("key",""));

        TextView textView8 = (TextView)findViewById(R.id.LocNastere);
        textView8.setText(getSharedPreferences("Locnastere_pfiz", MODE_PRIVATE).getString("key",""));

        TextView textView9 = (TextView)findViewById(R.id.Email);
        textView9.setText(getSharedPreferences("Email_pfiz", MODE_PRIVATE).getString("key",""));

        TextView textView10 = (TextView)findViewById(R.id.TelefonX);
        textView10.setText(getSharedPreferences("TlfX_pfiz", MODE_PRIVATE).getString("key",""));

        TextView textView11 = (TextView)findViewById(R.id.Parola);
        textView11.setText(getSharedPreferences("Parola", MODE_PRIVATE).getString("key",""));
    }

    public void submit(View view) {
        //memoram numele persoanei local
        EditText simpleEditText1 = (EditText) findViewById(R.id.Nume);
        String strValue1 = simpleEditText1.getText().toString();

        SharedPreferences nume_pfiz = getSharedPreferences("Nume_pfiz", MODE_PRIVATE);
        SharedPreferences.Editor numepfiz_editor = nume_pfiz.edit();
        numepfiz_editor.putString("key", strValue1);
        numepfiz_editor.apply();

        //memoram telefon

        EditText simpleEditTextX = (EditText) findViewById(R.id.TelefonX);
        String strValueX = simpleEditTextX.getText().toString();

        SharedPreferences tlf_pfiz = getSharedPreferences("TlfX_pfiz", MODE_PRIVATE);
        SharedPreferences.Editor tlfpfiz_editor = tlf_pfiz.edit();
        tlfpfiz_editor.putString("key", strValueX);
        tlfpfiz_editor.apply();

        //memoram prenumele persoanei local

        EditText simpleEditText2 = (EditText) findViewById(R.id.Prenume);
        String strValue2 = simpleEditText2.getText().toString();

        SharedPreferences prenume_pfiz = getSharedPreferences("Prenume_pfiz", MODE_PRIVATE);
        SharedPreferences.Editor prenumepfiz_editor = prenume_pfiz.edit();
        prenumepfiz_editor.putString("key", strValue2);
        prenumepfiz_editor.apply();


        //memoram data nasterii

        EditText simpleEditText3 = (EditText) findViewById(R.id.DataNast);
        String strValue3 = simpleEditText3.getText().toString();

        SharedPreferences data_pfiz = getSharedPreferences("Data_pfiz", MODE_PRIVATE);
        SharedPreferences.Editor datapfiz_editor = data_pfiz.edit();
        datapfiz_editor.putString("key", strValue3);
        datapfiz_editor.apply();

        //memoram CNP

        EditText simpleEditText4 = (EditText) findViewById(R.id.CNP);
        String strValue4 = simpleEditText4.getText().toString();

        SharedPreferences cnp_pfiz = getSharedPreferences("CNP_pfiz", MODE_PRIVATE);
        SharedPreferences.Editor cnppfiz_editor = cnp_pfiz.edit();
        cnppfiz_editor.putString("key", strValue4);
        cnppfiz_editor.apply();

        //memoram domiciliu

        EditText simpleEditText5 = (EditText) findViewById(R.id.Domiciliu);
        String strValue5 = simpleEditText5.getText().toString();

        SharedPreferences domiciliu_pfiz = getSharedPreferences("Domiciliu_pfiz", MODE_PRIVATE);
        SharedPreferences.Editor domiciliupfiz_editor = domiciliu_pfiz.edit();
        domiciliupfiz_editor.putString("key", strValue5);
        domiciliupfiz_editor.apply();

        //memoram serie buletin

        EditText simpleEditText6 = (EditText) findViewById(R.id.Serie);
        String strValue6 = simpleEditText6.getText().toString();

        SharedPreferences serie_pfiz = getSharedPreferences("Serie_pfiz", MODE_PRIVATE);
        SharedPreferences.Editor seriepfiz_editor = serie_pfiz.edit();
        seriepfiz_editor.putString("key", strValue6);
        seriepfiz_editor.apply();

        //memoram nr buleltin

        EditText simpleEditText7 = (EditText) findViewById(R.id.NrBul);
        String strValue7 = simpleEditText7.getText().toString();

        SharedPreferences nrbul_pfiz = getSharedPreferences("Nrbul_pfiz", MODE_PRIVATE);
        SharedPreferences.Editor nrbulpfiz_editor = nrbul_pfiz.edit();
        nrbulpfiz_editor.putString("key", strValue7);
        nrbulpfiz_editor.apply();

        //memoram loc de nastere

        EditText simpleEditText8 = (EditText) findViewById(R.id.LocNastere);
        String strValue8 = simpleEditText8.getText().toString();

        SharedPreferences locnastere_pfiz = getSharedPreferences("Locnastere_pfiz", MODE_PRIVATE);
        SharedPreferences.Editor locnasterepfiz_editor = locnastere_pfiz.edit();
        locnasterepfiz_editor.putString("key", strValue8);
        locnasterepfiz_editor.apply();

        //memoram E-mail

        EditText simpleEditText9 = (EditText) findViewById(R.id.Email);
        String strValue9 = simpleEditText9.getText().toString();

        SharedPreferences email_pfiz = getSharedPreferences("Email_pfiz", MODE_PRIVATE);
        SharedPreferences.Editor emailpfiz_editor = email_pfiz.edit();
        emailpfiz_editor.putString("key", strValue9);
        emailpfiz_editor.apply();


        //memorare parola

        EditText simpleEditText11 = (EditText) findViewById(R.id.Parola);
        String strValue11 = simpleEditText11.getText().toString();

        SharedPreferences parola = getSharedPreferences("Parola", MODE_PRIVATE);
        SharedPreferences.Editor parola_editor = parola.edit();
        parola_editor.putString("key", strValue11);
        parola_editor.apply();




        //mergem la prima activitate
        Intent i = new Intent(date_pfizica.this, MainActivity.class);       // Specify any activity here e.g. home or splash or login etc
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.putExtra("EXIT", true);
        startActivity(i);
        finish();

    }

}
