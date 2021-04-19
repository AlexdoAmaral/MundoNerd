package alex.amaral.mundonerd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class SortearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sortear);
    }

    public  void sortearZeroAoDez(View view){
        TextView texto = findViewById(R.id.txtResultado);
        int num = new Random().nextInt(11);
        texto.setText("O numero sorteado foi: "+ num);
    }

    public  void sortearZeroAoCem(View view){
        TextView texto = findViewById(R.id.txtResultado);
        int num = new Random().nextInt(101);
        texto.setText("O numero sorteado foi: "+ num);
    }

    public  void sortearZeroAoMil(View view){
        TextView texto = findViewById(R.id.txtResultado);
        int num = new Random().nextInt(1001);
        texto.setText("O numero sorteado foi: "+ num);
    }

    public  void sortearZeroAoDezMil(View view){
        TextView texto = findViewById(R.id.txtResultado);
        int num = new Random().nextInt(10001);
        texto.setText("O numero sorteado foi: "+ num);
    }

}