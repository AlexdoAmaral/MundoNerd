package alex.amaral.mundonerd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class FrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases);
    }
    public void gerarNovaFrase(View view){
        String[] frases = {
                "Frase teste 1",
                "Frase teste 2",
                "Frase teste 3",
                "Frase teste 4",
                "Frase teste 5"
        };

        int numero = new Random().nextInt(5);
        TextView frase = findViewById(R.id.txtFraseGerada);
        frase.setText(frases[numero]);
    }
}