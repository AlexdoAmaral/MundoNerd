package alex.amaral.mundonerd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class RolarDadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolar_dado);
    }

    public  void sortearZeroAoSeis(View view){
        TextView texto = findViewById(R.id.txtResultadoDado);
        int num = new Random().nextInt(7);
        texto.setText("O numero sorteado foi: "+ num);
    }
    public  void sortearZeroAoDoze(View view){
        TextView texto = findViewById(R.id.txtResultadoDado);
        int num = new Random().nextInt(13);
        texto.setText("O numero sorteado foi: "+ num);
    }
    public  void sortearZeroAoVinte(View view){
        TextView texto = findViewById(R.id.txtResultadoDado);
        int num = new Random().nextInt(21);
        texto.setText("O numero sorteado foi: "+ num);
    }
    public  void sortearZeroAteCem(View view){
        TextView texto = findViewById(R.id.txtResultadoDado);
        int num = new Random().nextInt(101);
        texto.setText("O numero sorteado foi: "+ num);
    }
}