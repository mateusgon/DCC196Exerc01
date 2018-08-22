package br.ufjf.dcc196.dcc196_exerc01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView merge_Mensagem;
    private Button confirma_Button;
    private EditText nome;
    private EditText sobrenome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        confirma_Button = (Button) findViewById(R.id.confirmaButton);
        nome = (EditText) findViewById(R.id.nomeText);
        sobrenome = (EditText) findViewById(R.id.sobrenomeText);
        confirma_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor;
                valor = nome.getText().toString();
                valor = valor.concat(" ");
                valor = valor.concat(sobrenome.getText().toString());
                merge_Mensagem = (TextView) findViewById(R.id.mergeText);
                merge_Mensagem.setText(valor);
            }
        });
    }
}
