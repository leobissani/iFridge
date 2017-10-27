package ifridge.ifridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class FavoriteRecipes extends AppCompatActivity {

    private ListView receitasFavoritas;

    // Receitas favoritas salvas no banco de dados
    private String[] receitasFavoritasDoBD = {
        // Sem receita favorita no momento (vetor de Strings)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_recipes);

        if(receitasFavoritasDoBD.length != 0) {
            // se a lista de receitas favoritas do banco de dados possuir ao menos
            // uma receita, então usa o list view para mostrar na tela estas receitas
            receitasFavoritas = (ListView) findViewById(R.id.listaDeReceitasFavoritasID);

            ArrayAdapter<String> adaptadorReceitasFavoritas = new ArrayAdapter<String>(
                    this,
                    android.R.layout.select_dialog_item,
                    receitasFavoritasDoBD
            );

            // modo single para que o usuário ao apenas clicar numa receita já a veja
            receitasFavoritas.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
            receitasFavoritas.setAdapter(adaptadorReceitasFavoritas);

            // A lista fica a espera do clique do usuário
            receitasFavoritas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    int codigoPosicao = position;
                    String valorClicado = receitasFavoritas.getItemAtPosition(codigoPosicao).toString();
                    //Toast.makeText(RecipeList.this, "Strogonoff de Frango", Toast.LENGTH_SHORT).show();

                    // Conforme o valor da lista que foi clicado, chama a activity Recipe
                    // Passando os dados da receita
                    Intent intent = new Intent(FavoriteRecipes.this, Recipe.class);
                    intent.putExtra("receita", valorClicado);
                    startActivity(intent);
                }
            });
        }
        else {
            // Caso não possua nenhuma receita favorita no banco de dados, devolve a mensagem
            // de não ter encontrado receitas favoritas salvas
            TextView receitaFavoritaNaoEncontrada = (TextView) findViewById(R.id.semReceitaFavoritaID);
            receitaFavoritaNaoEncontrada.setText(
                    "Você não possui receitas favoritas"
            );
        }
    }
}
