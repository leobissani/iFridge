package ifridge.ifridge;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class AddIngredients extends AppCompatActivity {

    private EditText adicionarIngredientesText;
    private EditText mostraIngredientes;
    private Button adicionaIngrediente;
    private Button finalizaReceita;
    private Button receitaAdicionada;

    public void openDialog() {

        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_message);
        dialog.setTitle(R.string.dialog_string);
        dialog.show();
    }

    public void openDialogOK() {

        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_message_ok);
        dialog.setTitle(R.string.dialog_string_ok);
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ingredients);

        mostraIngredientes = (EditText) findViewById(R.id.mostraIngredientesID);
        mostraIngredientes.setEnabled(false);
        // final String mostraIngredientesVazio = mostraIngredientes.getText().toString();

        // Cria um EditText que não é editável, apenas para mostrar ao usuário
        // os ingredientes que ele já adicionou em sua receita

        // Adiciona os ingredientes no view para saber quais já foram
        adicionaIngrediente = (Button) findViewById(R.id.botaoAdicionarIngredientesID);
        adicionaIngrediente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Coloca no TextView
                adicionarIngredientesText = (EditText) findViewById(R.id.adicionarIngredientesID);
                String ingredientes = adicionarIngredientesText.getText().toString();
                mostraIngredientes.append(ingredientes + "\n");

                // Limpa o TextView do Ingrediente
                adicionarIngredientesText.setText("");
            }
        });

        finalizaReceita = (Button) findViewById(R.id.finalizarReceitaID);
        finalizaReceita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Testar se o view que mostra os ingredientes é vazio
                // Se ele for, então mostra mensagem que não pode estar vazio
                String caixaIngredientes = mostraIngredientes.getText().toString();

                if(caixaIngredientes.equals("")) {
                    openDialog();
                }
                else {
                    System.out.println("Receita adicionada no banco de dados");
                    openDialogOK();
                    // Caso haja uma lista de itens válida
                    // Adiciona a lista de ingredientes no banco de dados
                }
            }
        });

        /*
         // Ao clicar em OK na caixa de diálogo, a receita é finalmente
        // adicionada completamente ao banco de dados
        receitaAdicionada = (Button) findViewById(R.id.dialog_ok);

        receitaAdicionada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(AddIngredients.this, Home.class);
                // home.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(home);
            }
        });
        */
    }
}
