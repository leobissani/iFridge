package ifridge.ifridge;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddRecipe extends AppCompatActivity {

    private Button irParaIngredientes;
    private EditText nomeDaReceita;
    private EditText modoDePreparo;

    public void openDialog() {

        final Dialog dialog = new Dialog(this); // Context, this, etc.
        dialog.setContentView(R.layout.dialog_message);
        dialog.setTitle(R.string.dialog_string);
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);

        nomeDaReceita = (EditText) findViewById(R.id.nomeReceitaID);
        modoDePreparo = (EditText) findViewById(R.id.modoPreparoID);

        // Botão que confirma o nome da receita e seu modo de preparo e chama a próxima activity, de inserir ingredientes
        irParaIngredientes = (Button) findViewById(R.id.confirmaReceitaID);

        // Garante que que há algo digitado nos campos
        irParaIngredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = nomeDaReceita.getText().toString();
                String preparo = modoDePreparo.getText().toString();

                if(nome.equals("") || preparo.equals("")) {
                    openDialog();
                }
                else {
                    startActivity(new Intent(AddRecipe.this, AddIngredients.class));
                }
            }
        });

        // **** Salvar tanto nome como o modo de preparo em banco de dados aqui ****
    }
}
