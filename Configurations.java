package ifridge.ifridge;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Configurations extends AppCompatActivity {

    private ListView configuracoes;
    private final int WAIT_TIME = 5000;

    // Array pra guardar as duas configurações da list view
    private String[] configInterfaces = {
            "Interface 1", "Interface 2"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurations);

        configuracoes = (ListView) findViewById(R.id.configuracoesID);

        // Adaptador para mostrar as configurações na tela
        ArrayAdapter<String> adaptadorSearch = new ArrayAdapter<String>(
                this,
                android.R.layout.select_dialog_singlechoice,
                configInterfaces
        );

        // Seta as configurações como single choice
        configuracoes.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        configuracoes.setAdapter(adaptadorSearch);

        configuracoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosicao = position;
                Intent intent = new Intent(Configurations.this, Home.class);

                System.out.println(codigoPosicao);

                // Dependendo da interface selecionada, ele modificara a tela de procura de receitas (ingredientes)
                if(codigoPosicao == 0) {
                    Toast.makeText(Configurations.this, "Você selecionou a Interface #1", Toast.LENGTH_SHORT).show();
                    intent.putExtra("config", codigoPosicao);
                }
                else {
                    Toast.makeText(Configurations.this, "Você selecionou a Interface #2", Toast.LENGTH_SHORT).show();
                    intent.putExtra("config", codigoPosicao);
                }

                startActivity(intent);
            }
        });
    }
}
