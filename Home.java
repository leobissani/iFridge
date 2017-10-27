package ifridge.ifridge;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    private Button procuraReceita;
    private Button adicionaReceita;
    private Button receitaFavorita;
    private Button configButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /*
        try {
            // Criação do banco de dados
            SQLiteDatabase bancoDeReceitas = openOrCreateDatabase("iFridge", MODE_PRIVATE, null);

            // Criação da tabela do banco de dados
            bancoDeReceitas.execSQL("CREATE TABLE IF NOT EXISTS receitas(nome VARCHAR, ingredientes VARCHAR, preparo VARCHAR)");
            bancoDeReceitas.execSQL("CREATE TABLE IF NOT EXISTS favoritos(nome VARCHAR, ingredientes VARCHAR, preparo VARCHAR)");
            bancoDeReceitas.execSQL("INSERT INTO receitas(nome, ingredientes, preparo) VALUES('Strogonoff de Frango', 'Molho de Tomate, Sal, Mostarda, Creme de Leite, Filé de Frango, Champignon, Manteiga, Cebola', 'Modo de Preparo')");
            // bancoDeReceitas.execSQL("DROP TABLE receitas");

            Cursor cursorReceitas = bancoDeReceitas.rawQuery("SELECT nome, ingredientes, preparo FROM receitas", null);
            Cursor cursorFavoritos = bancoDeReceitas.rawQuery("SELECT nome, ingredientes, preparo FROM favoritos", null);

            int indiceColunaNome = cursorReceitas.getColumnIndex("nome");

            cursorReceitas.moveToFirst();

            while (cursorReceitas != null) {
                Log.i("Resultado: ", cursorReceitas.getString(indiceColunaNome));
                cursorReceitas.moveToNext();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        */

        // Por default, a interface inicial é a 1, que é a que permite o usuário selecionar múltiplos ingredientes
        Intent intent = getIntent();
        // Neste caso, interfaceConfig recebe o valor escolhido nas configurações. Caso o usuário ainda não tenha
        // alterado a interface nas configurações, então o valor padrão 0 é passado adiante (interface 1)
        final int interfaceConfig = intent.getIntExtra("config", 0);

        procuraReceita = (Button) findViewById(R.id.searchID);
        adicionaReceita = (Button) findViewById(R.id.addRecipeID);
        receitaFavorita = (Button) findViewById(R.id.favoriteID);
        configButton = (Button) findViewById(R.id.configID);

        // Abaixo seguem os listeners dos botões, que ficam a espera de toque para chamar suas respectivas activities
        procuraReceita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interfaceConfig == 0) {
                    // Se a interface 1 foi a selecionada, chama sua activity
                    startActivity(new Intent(Home.this, Search.class));
                }
                // Se a interface 2 foi a selecionada, chama sua activity
                else startActivity(new Intent(Home.this, Search2.class));
            }
        });

        adicionaReceita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, AddRecipe.class));
            }
        });

        receitaFavorita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, FavoriteRecipes.class));
            }
        });

        configButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Configurations.class));
            }
        });
    }
}