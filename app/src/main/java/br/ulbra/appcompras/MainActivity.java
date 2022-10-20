package br.ulbra.appcompras;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

        CheckBox charroz, chleite, chcarne, chfeijao;
        Button bttotal;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            charroz = (CheckBox) findViewById(R.id.chArroz);
            chleite = (CheckBox) findViewById(R.id.chLeite);
            chcarne = (CheckBox) findViewById(R.id.chCarne);
            chfeijao = (CheckBox) findViewById(R.id.chFeijão);
            Button bttotal = (Button) findViewById(R.id.bttotal);
            bttotal.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    double total = 0;
                    if (charroz.isChecked()) {
                        total += 2.69;
                    }
                    if (chleite.isChecked()) {
                        total += 5.00;
                    }
                    if (chcarne.isChecked()) {
                        total += 9.70;
                    }
                    if (chfeijao.isChecked()) {
                        total += 2.70;
                    }
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("Aviso");
                    dialogo.setMessage("Valor total da compra: " + String.valueOf(total));
                    dialogo.setNeutralButton("OK ",null);
                    dialogo.show();
                }
            });
        }
    }
