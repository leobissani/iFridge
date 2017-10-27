package ifridge.ifridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class Search extends AppCompatActivity {

    private ListView listaIngredientes;
    private Button botaoProcura;

    // Ingredientes que irão estar no banco de dados
    private String[] ingredientes = {
            "Açúcar", "Água", "Alcatra", "Alho", "Amido de Milho", "Arroz", "Azeite", "Azeite de Oliva", "Azeitonas",
            "Bacon", "Batata", "Batata Palha", "Bicarbonato de Sódio",
            "Café Solúvel", "Calabresa", "Caldo de Carne", "Caldo de Costela",
            "Caldo de Frango", "Caldo de Galinha",
            "Caldo de Peixe", "Camarão",
            "Canela", "Carne", "Carne Moída", "Carne Seca", "Cebola", "Cebolinha Verde", "Cenoura",
            "Champignon", "Cheiro Verde",
            "Chocolate em Pó", "Coentro",
            "Cominho", "Conhaque", "Costela de Boi", "Costelinha de Porco", "Creme de Leite",
            "Extrato de Tomate",
            "Farinha de Rosca", "Farinha de Trigo", "Feijão Preto", "Fermento", "Filé de Frango",
            "Gorgonzola",
            "Ketchup",
            "Laranja", "Leite", "Leite em Pó", "Limão", "Linguiça", "Lombo de Porco", "Louro",
            "Macarrão", "Maionese", "Mandioca", "Manjeiricão", "Manjerona",
            "Manteiga", "Margarina", "Massa de Lasanha",
            "Molho de Tomate", "Molho Shoyu",
            "Mostarda", "Mussarela",
            "Orégano", "Orelha de Porco", "Ovos",
            "Parmesão", "Pé de Porco", "Peito de Frango", "Penne", "Pimenta Calabresa",
            "Pimenta do Reino", "Pimentão", "Pinga",
            "Presunto", "Provolone",
            "Queijo", "Queijo Prato",
            "Rabo de Porco", "Requeijão",
            "Sal", "Salsa", "Salsichão",
            "Tempero para Carnes", "Tomate", "Tomilho",
            "Vinagre Branco", "Vinho Branco", "Vinho Tinto"
    };

    // Ingredientes que vão ser selecionados pelo usuário
    private ArrayList ingredientesSelecionados = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        listaIngredientes = (ListView) findViewById(R.id.listaIngredientesID);

        // Adaptador para mostrar a lista de ingredientes do banco de dados na tela
        ArrayAdapter<String> adaptadorSearch = new ArrayAdapter<String>(
                this,
                android.R.layout.select_dialog_multichoice,
                ingredientes
        );

        // Seta a lista de ingredientes como uma lista de múltipla escolha (checkBox)
        listaIngredientes.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listaIngredientes.setAdapter(adaptadorSearch);

        // Verifica qual foi o ingrediente selecionado pelo usuário e salva no ArrayList ingredientesSelecionados
        listaIngredientes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosicao = position;
                String valorClicado = listaIngredientes.getItemAtPosition(codigoPosicao).toString();

                // Se o ingrediente já está na lista, então ele é removido, caso contrário, é adicionado
                if(ingredientesSelecionados.contains(valorClicado)) {

                    ingredientesSelecionados.remove(ingredientesSelecionados.indexOf(valorClicado));
                }
                else{

                    ingredientesSelecionados.add(valorClicado);
                }

                System.out.println(ingredientesSelecionados);
            }
        });

        botaoProcura = (Button) findViewById(R.id.botaoProcuraID);

        botaoProcura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Passa para o activity Recipe a lista de ingredientes selecionados, para assim buscar
                // no banco de dados se há uma receita com os itens selecionados pelo usuário
                Intent intent = new Intent(Search.this, RecipeList.class);
                intent.putExtra("ingredientesSelecionados", ingredientesSelecionados);
                startActivity(intent);
            }
        });
    }
}
