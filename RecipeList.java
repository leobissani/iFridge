package ifridge.ifridge;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RecipeList extends AppCompatActivity {

    private ListView listaDeReceitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        ArrayList<ArrayList> receitas = new ArrayList<ArrayList>();

        // Achocolatado
        ArrayList<String> achocolatado = new ArrayList<String>();
        achocolatado.add("Achocolatado");
        achocolatado.add("Este é o mais famoso achocolatado de Porto Alegre");
        achocolatado.add("Leite");
        achocolatado.add("Chocolate em Pó");

        // Almôndegas de Carne Moída
        ArrayList<String> almondegasCarneMoida = new ArrayList<String>();
        almondegasCarneMoida.add("Almôndegas de Carne Moída");
        almondegasCarneMoida.add("Este é a mais famosa almôndegas de carne moída de Porto Alegre");
        almondegasCarneMoida.add("Carne Moída");
        almondegasCarneMoida.add("Farinha de Trigo");
        almondegasCarneMoida.add("Alho");
        almondegasCarneMoida.add("Cheiro Verde");
        almondegasCarneMoida.add("Cebola");
        almondegasCarneMoida.add("Caldo de Carne");
        almondegasCarneMoida.add("Pimentão");
        almondegasCarneMoida.add("Sal");
        almondegasCarneMoida.add("Tomate");

        // Arroz ao Vinho Branco
        ArrayList<String> arrozaovinho = new ArrayList<String>();
        arrozaovinho.add("Arroz ao Vinho Branco");
        arrozaovinho.add("Este é o mais famoso arroz ao vinho branco de Porto Alegre");
        arrozaovinho.add("Manteiga");
        arrozaovinho.add("Cebola");
        arrozaovinho.add("Arroz");
        arrozaovinho.add("Vinho Branco");
        arrozaovinho.add("Caldo de Carne");
        arrozaovinho.add("Parmesão");
        arrozaovinho.add("Salsa");
        arrozaovinho.add("Sal");
        arrozaovinho.add("Pimenta do Reino");

        // Arroz à Parmegiana
        ArrayList<String> arrozAparmegiana = new ArrayList<String>();
        arrozAparmegiana.add("Arroz à Parmegiana");
        arrozAparmegiana.add("Este é o mais famoso arroz à parmegiana de Porto Alegre");
        arrozAparmegiana.add("Arroz");
        arrozAparmegiana.add("Azeite");
        arrozAparmegiana.add("Azeite de Oliva");
        arrozAparmegiana.add("Mussarela");
        arrozAparmegiana.add("Parmesão");
        arrozAparmegiana.add("Pimenta do Reino");
        arrozAparmegiana.add("Salsa");
        arrozAparmegiana.add("Sal");
        arrozAparmegiana.add("Tomate");

        // Arroz Branco
        ArrayList<String> arrozbranco = new ArrayList<String>();
        arrozbranco.add("Arroz Branco");
        arrozbranco.add("Este é o mais famoso arroz branco de Porto Alegre");
        arrozbranco.add("Arroz");
        arrozbranco.add("Água");
        arrozbranco.add("Alho");
        arrozbranco.add("Cebola");
        arrozbranco.add("Azeite");
        arrozbranco.add("Sal");

        // Arroz de Forno
        ArrayList<String> arrozdeforno = new ArrayList<String>();
        arrozdeforno.add("Arroz de Forno");
        arrozdeforno.add("Este é o mais famoso arroz de forno de Porto Alegre");
        arrozdeforno.add("Arroz");
        arrozdeforno.add("Filé de Frango");
        arrozdeforno.add("Requeijão");
        arrozdeforno.add("Parmesão");
        arrozdeforno.add("Maionese");
        arrozdeforno.add("Mussarela");
        arrozdeforno.add("Sal");
        arrozdeforno.add("Cheiro Verde");

        // Batata Frita
        ArrayList<String> batatafrita = new ArrayList<String>();
        batatafrita.add("Batata Frita");
        batatafrita.add("Este é a mais famosa batata frita de Porto Alegre");
        batatafrita.add("Batata");
        batatafrita.add("Azeite");
        batatafrita.add("Sal");

        // Bife à Cavalo
        ArrayList<String> bifeacavalo = new ArrayList<String>();
        bifeacavalo.add("Bife à Cavalo");
        bifeacavalo.add("Este é o mais famoso bife à cavalo de Porto Alegre");
        bifeacavalo.add("Alcatra");
        bifeacavalo.add("Azeite");
        bifeacavalo.add("Batata");
        bifeacavalo.add("Ovos");
        bifeacavalo.add("Sal");
        bifeacavalo.add("Pimenta do Reino");

        // Bife Acebolado
        ArrayList<String> bifeacebolado = new ArrayList<String>();
        bifeacebolado.add("Bife Acebolado");
        bifeacebolado.add("Este é o mais famoso bife acebolado de Porto Alegre");
        bifeacebolado.add("Margarina");
        bifeacebolado.add("Cebola");
        bifeacebolado.add("Pimentão");
        bifeacebolado.add("Carne");
        bifeacebolado.add("Sal");
        bifeacebolado.add("Pimenta do Reino");

        // Bife a Rolê
        ArrayList<String> bifearole = new ArrayList<String>();
        bifearole.add("Bife a Rolê");
        bifearole.add("Este é o mais famoso bife a rolê de Porto Alegre");
        bifearole.add("Alcatra");
        bifearole.add("Bacon");
        bifearole.add("Azeite");
        bifearole.add("Cebola");
        bifearole.add("Molho de Tomate");
        bifearole.add("Manjerona");
        bifearole.add("Cheiro Verde");
        bifearole.add("Sal");
        bifearole.add("Pimenta do Reino");

        // Bife em Camadas com Cebola
        ArrayList<String> bifeEmCamadasComCebola = new ArrayList<String>();
        bifeEmCamadasComCebola.add("Bife em Camadas com Cebola");
        bifeEmCamadasComCebola.add("Este é o mais famoso bife em camadas com cebola de Porto Alegre");
        bifeEmCamadasComCebola.add("Alho");
        bifeEmCamadasComCebola.add("Cebola");
        bifeEmCamadasComCebola.add("Salsa");
        bifeEmCamadasComCebola.add("Carne");
        bifeEmCamadasComCebola.add("Sal");
        bifeEmCamadasComCebola.add("Batata");
        bifeEmCamadasComCebola.add("Azeite de Oliva");
        bifeEmCamadasComCebola.add("Cheiro Verde");
        bifeEmCamadasComCebola.add("Orégano");
        bifeEmCamadasComCebola.add("Pimenta do Reino");

        // Bife à Parmegiana
        ArrayList<String> bifeparmegiana = new ArrayList<String>();
        bifeparmegiana.add("Bife à Parmegiana");
        bifeparmegiana.add("Este é o mais famoso bife à parmegiana de Porto Alegre");
        bifeparmegiana.add("Farinha de Rosca");
        bifeparmegiana.add("Farinha de Trigo");
        bifeparmegiana.add("Pimenta do Reino");
        bifeparmegiana.add("Alcatra");
        bifeparmegiana.add("Tomate");
        bifeparmegiana.add("Extrato de Tomate");
        bifeparmegiana.add("Ovos");
        bifeparmegiana.add("Vinagre Branco");
        bifeparmegiana.add("Cebola");
        bifeparmegiana.add("Água");
        bifeparmegiana.add("Sal");
        bifeparmegiana.add("Alho");
        bifeparmegiana.add("Azeite");

        // Café Capuccino
        ArrayList<String> cafecapuccino = new ArrayList<String>();
        cafecapuccino.add("Capuccino");
        cafecapuccino.add("Este é o mais famoso capuccino de Porto Alegre");
        cafecapuccino.add("Leite em Pó");
        cafecapuccino.add("Açúcar");
        cafecapuccino.add("Café Solúvel");
        cafecapuccino.add("Chocolate em Pó");
        cafecapuccino.add("Canela");

        // Calabresa Acebolada
        ArrayList<String> calabresaacebolada = new ArrayList<String>();
        calabresaacebolada.add("Calabresa Acebolada");
        calabresaacebolada.add("Este é a mais famosa calabresa acebolada de Porto Alegre");
        calabresaacebolada.add("Calabresa");
        calabresaacebolada.add("Cebola");
        calabresaacebolada.add("Azeite");
        calabresaacebolada.add("Sal");
        calabresaacebolada.add("Pimenta do Reino");

        // Carne de Panela
        ArrayList<String> carnedepanela = new ArrayList<String>();
        carnedepanela.add("Carne de Panela");
        carnedepanela.add("Este é a mais famosa carne de panela de Porto Alegre");
        carnedepanela.add("Cebola");
        carnedepanela.add("Carne");
        carnedepanela.add("Caldo de Carne");

        // Chocolate Quente
        ArrayList<String> chocolatequentecremoso = new ArrayList<String>();
        chocolatequentecremoso.add("Chocolate Quente Cremoso");
        chocolatequentecremoso.add("Este é o mais famoso chocolate quente cremoso de Porto Alegre");
        chocolatequentecremoso.add("Leite");
        chocolatequentecremoso.add("Amido de Milho");
        chocolatequentecremoso.add("Açúcar");
        chocolatequentecremoso.add("Canela");
        chocolatequentecremoso.add("Creme de Leite");
        chocolatequentecremoso.add("Chocolate em Pó");

        // Costela com Batata
        ArrayList<String> costelacombatata = new ArrayList<String>();
        costelacombatata.add("Costela com Batata");
        costelacombatata.add("Este é a mais famosa costela com batata de Porto Alegre");
        costelacombatata.add("Costela de Boi");
        costelacombatata.add("Batata");
        costelacombatata.add("Cebola");
        costelacombatata.add("Carne");
        costelacombatata.add("Limão");
        costelacombatata.add("Tempero para Carnes");
        costelacombatata.add("Alho");
        costelacombatata.add("Azeite");
        costelacombatata.add("Pimenta Calabresa");

        // Feijoada
        ArrayList<String> feijoada = new ArrayList<String>();
        feijoada.add("Feijoada");
        feijoada.add("Este é a mais famosa feijoada de Porto Alegre");
        feijoada.add("Feijão Preto");
        feijoada.add("Carne Seca");
        feijoada.add("Orelha de Porco");
        feijoada.add("Rabo de Porco");
        feijoada.add("Costelinha de Porco");
        feijoada.add("Linguiça");
        feijoada.add("Alho");
        feijoada.add("Louro");
        feijoada.add("Cebolinha Verde");
        feijoada.add("Pimenta do Reino");
        feijoada.add("Cebola");
        feijoada.add("Alho");
        feijoada.add("Laranja");
        feijoada.add("Pinga");
        feijoada.add("Sal");

        // Frango à Parmegiana
        ArrayList<String> frangoparmegiana = new ArrayList<String>();
        frangoparmegiana.add("Frango à Parmegiana");
        frangoparmegiana.add("Este é o mais famoso frango à parmegiana de Porto Alegre");
        frangoparmegiana.add("Maionese");
        frangoparmegiana.add("Molho de Tomate");
        frangoparmegiana.add("Farinha de Rosca");
        frangoparmegiana.add("Filé de Frango");
        frangoparmegiana.add("Mussarela");
        frangoparmegiana.add("Orégano");
        frangoparmegiana.add("Ovos");
        frangoparmegiana.add("Limão");
        frangoparmegiana.add("Cheiro Verde");
        frangoparmegiana.add("Molho Shoyu");
        frangoparmegiana.add("Cebola");
        frangoparmegiana.add("Alho");

        // Fricassê de Carne Moída com Requeijão
        ArrayList<String> fricassecarnemoida = new ArrayList<String>();
        fricassecarnemoida.add("Fricassê de Carne Moída");
        fricassecarnemoida.add("Este é o mais famoso fricassê de carne moída de Porto Alegre");
        fricassecarnemoida.add("Carne Moída");
        fricassecarnemoida.add("Azeitonas");
        fricassecarnemoida.add("Creme de Leite");
        fricassecarnemoida.add("Requeijão");
        fricassecarnemoida.add("Cebola");
        fricassecarnemoida.add("Batata Palha");
        fricassecarnemoida.add("Mussarela");

        // Gelo
        ArrayList<String> gelo = new ArrayList<String>();
        gelo.add("Gelo");
        gelo.add("Este é o mais famoso gelo de Porto Alegre");
        gelo.add("Água");

        // Gemada
        ArrayList<String> gemada = new ArrayList<String>();
        gemada.add("Gemada");
        gemada.add("Este é a mais famosa gemada de Porto Alegre");
        gemada.add("Ovos");
        gemada.add("Açúcar");
        gemada.add("Leite");

        // Lasanha 4 Queijos
        ArrayList<String> lasanhaQuatroQueijos = new ArrayList<String>();
        lasanhaQuatroQueijos.add("Lasanha de 4 Queijos");
        lasanhaQuatroQueijos.add("Este é a mais famosa lasanha 4 queijos de Porto Alegre");
        lasanhaQuatroQueijos.add("Massa de Lasanha");
        lasanhaQuatroQueijos.add("Mussarela");
        lasanhaQuatroQueijos.add("Manteiga");
        lasanhaQuatroQueijos.add("Farinha de Trigo");
        lasanhaQuatroQueijos.add("Leite");
        lasanhaQuatroQueijos.add("Gorgonzola");
        lasanhaQuatroQueijos.add("Provolone");
        lasanhaQuatroQueijos.add("Parmesão");
        lasanhaQuatroQueijos.add("Creme de Leite");

        // Macarrão com Requeijão e Maionese
        ArrayList<String> macarraoComRequeijao = new ArrayList<String>();
        macarraoComRequeijao.add("Macarrão com Requeijão");
        macarraoComRequeijao.add("Este é o mais famoso macarrão com requeijão de Porto Alegre");
        macarraoComRequeijao.add("Macarrão");
        macarraoComRequeijao.add("Azeite de Oliva");
        macarraoComRequeijao.add("Cebola");
        macarraoComRequeijao.add("Molho de Tomate");
        macarraoComRequeijao.add("Pimentão");
        macarraoComRequeijao.add("Mussarela");
        macarraoComRequeijao.add("Requeijão");
        macarraoComRequeijao.add("Maionese");

        // Molho Bolonhesa
        ArrayList<String> molhoBolonhesa = new ArrayList<String>();
        molhoBolonhesa.add("Molho Bolonhesa");
        molhoBolonhesa.add("Este é o mais famoso molho bolonhesa de Porto Alegre");
        molhoBolonhesa.add("Azeite");
        molhoBolonhesa.add("Cebola");
        molhoBolonhesa.add("Alho");
        molhoBolonhesa.add("Água");
        molhoBolonhesa.add("Carne Moída");
        molhoBolonhesa.add("Sal");

        // Molho de Tomate
        ArrayList<String> molhoDeTomate = new ArrayList<String>();
        molhoDeTomate.add("Molho de Tomate");
        molhoDeTomate.add("Este é o mais famoso molho de tomate de Porto Alegre");
        molhoDeTomate.add("Azeite");
        molhoDeTomate.add("Cebola");
        molhoDeTomate.add("Alho");
        molhoDeTomate.add("Cominho");
        molhoDeTomate.add("Manjeiricão");
        molhoDeTomate.add("Sal");

        // Omelete
        ArrayList<String> omelete = new ArrayList<String>();
        omelete.add("Omelete");
        omelete.add("Este é o mais famoso omelete de Porto Alegre");
        omelete.add("Azeite");
        omelete.add("Sal");
        omelete.add("Ovos");
        omelete.add("Presunto");
        omelete.add("Queijo");
        omelete.add("Caldo de Galinha");

        // Ovos Fritos
        ArrayList<String> ovosfritos = new ArrayList<String>();
        ovosfritos.add("Ovos Fritos");
        ovosfritos.add("Este é o mais famoso ovo frito de Porto Alegre");
        ovosfritos.add("Azeite");
        ovosfritos.add("Sal");
        ovosfritos.add("Ovos");

        // Panqueca de Batata
        ArrayList<String> panquecaBatata = new ArrayList<String>();
        panquecaBatata.add("Panqueca de Batata");
        panquecaBatata.add("Este é a mais famosa panqueca de batata de Porto Alegre");
        panquecaBatata.add("Batata");
        panquecaBatata.add("Ovos");
        panquecaBatata.add("Manteiga");
        panquecaBatata.add("Farinha de Trigo");
        panquecaBatata.add("Leite");
        panquecaBatata.add("Sal");

        // Penne com Molho Branco
        ArrayList<String> penneComMolhoBranco = new ArrayList<String>();
        penneComMolhoBranco.add("Penne com Molho Branco");
        penneComMolhoBranco.add("Este é o mais famoso penne expresso de Porto Alegre");
        penneComMolhoBranco.add("Penne");
        penneComMolhoBranco.add("Manteiga");
        penneComMolhoBranco.add("Creme de Leite");
        penneComMolhoBranco.add("Sal");
        penneComMolhoBranco.add("Requeijão");
        penneComMolhoBranco.add("Caldo de Galinha");

        // Risoto de Camarão
        ArrayList<String> risotocamarao = new ArrayList<String>();
        risotocamarao.add("Risoto de Camarão");
        risotocamarao.add("Este é o mais famoso risoto de camarão de Porto Alegre");
        risotocamarao.add("Arroz");
        risotocamarao.add("Azeite");
        risotocamarao.add("Alho");
        risotocamarao.add("Cebola");
        risotocamarao.add("Manteiga");
        risotocamarao.add("Vinho Branco");
        risotocamarao.add("Parmesão");
        risotocamarao.add("Caldo de Peixe");
        risotocamarao.add("Tomate");
        risotocamarao.add("Camarão");
        risotocamarao.add("Salsa");
        risotocamarao.add("Manjeiricão");
        risotocamarao.add("Sal");

        // Risoto de Carne
        ArrayList<String> risotocarne = new ArrayList<String>();
        risotocarne.add("Risoto de Carne");
        risotocarne.add("Este é o mais famoso risoto de carne de Porto Alegre");
        risotocarne.add("Arroz");
        risotocarne.add("Água");
        risotocarne.add("Maionese");
        risotocarne.add("Extrato de Tomate");
        risotocarne.add("Cebola");
        risotocarne.add("Carne");
        risotocarne.add("Orégano");
        risotocarne.add("Azeite");
        risotocarne.add("Sal");
        risotocarne.add("Tomilho");

        // Risoto de Frango
        ArrayList<String> risotofrango = new ArrayList<String>();
        risotofrango.add("Risoto de Frango");
        risotofrango.add("Este é o mais famoso risoto de frango de Porto Alegre");
        risotofrango.add("Arroz");
        risotofrango.add("Peito de Frango");
        risotofrango.add("Pimenta do Reino");
        risotofrango.add("Parmesão");
        risotofrango.add("Cebola");
        risotofrango.add("Manteiga");
        risotofrango.add("Caldo de Frango");
        risotofrango.add("Azeite de Oliva");
        risotofrango.add("Sal");
        risotofrango.add("Salsa");

        // Salsichão com Bacon
        ArrayList<String> salsichaoBacon = new ArrayList<String>();
        salsichaoBacon.add("Salsichão com Bacon");
        salsichaoBacon.add("Este é o mais famoso salsichão com bacon de Porto Alegre");
        salsichaoBacon.add("Salsichão");
        salsichaoBacon.add("Bacon");
        salsichaoBacon.add("Mussarela");

        // Sopa de Legumes
        ArrayList<String> sopaDeLegumes = new ArrayList<String>();
        sopaDeLegumes.add("Sopa de Legumes");
        sopaDeLegumes.add("Este é a mais famosa sopa de legumes de Porto Alegre");
        sopaDeLegumes.add("Batata");
        sopaDeLegumes.add("Cenoura");
        sopaDeLegumes.add("Azeite");
        sopaDeLegumes.add("Cebola");
        sopaDeLegumes.add("Alho");
        sopaDeLegumes.add("Sal");
        sopaDeLegumes.add("Caldo de Galinha");

        // Strogonoff de Carne
        ArrayList<String> strogonoffCarne = new ArrayList<String>();
        strogonoffCarne.add("Strogonoff de Carne");
        strogonoffCarne.add("Este é o mais famoso strogonoff de carne de Porto Alegre");
        strogonoffCarne.add("Molho de Tomate");
        strogonoffCarne.add("Sal");
        strogonoffCarne.add("Creme de Leite");
        strogonoffCarne.add("Carne");
        strogonoffCarne.add("Champignon");
        strogonoffCarne.add("Manteiga");
        strogonoffCarne.add("Cebola");

        // Strogonoff de Frango
        ArrayList<String> strogonoffFrango = new ArrayList<String>();
        strogonoffFrango.add("Strogonoff de Frango");
        strogonoffFrango.add("Este é o mais famoso strogonoff de frango de Porto Alegre");
        strogonoffFrango.add("Molho de Tomate");
        strogonoffFrango.add("Sal");
        strogonoffFrango.add("Mostarda");
        strogonoffFrango.add("Creme de Leite");
        strogonoffFrango.add("Filé de Frango");
        strogonoffFrango.add("Champignon");
        strogonoffFrango.add("Manteiga");
        strogonoffFrango.add("Cebola");
        strogonoffFrango.add("Pimenta do Reino");
        strogonoffFrango.add("Conhaque");

        // Vaca Atolada
        ArrayList<String> vacaatolada = new ArrayList<String>();
        vacaatolada.add("Vaca Atolada");
        vacaatolada.add("Este é a mais famosa vaca de atolada de Porto Alegre");
        vacaatolada.add("Mandioca");
        vacaatolada.add("Tomate");
        vacaatolada.add("Cebola");
        vacaatolada.add("Cheiro Verde");
        vacaatolada.add("Caldo de Costela");
        vacaatolada.add("Costela de Boi");
        vacaatolada.add("Pimenta do Reino");

        receitas.add(achocolatado);
        receitas.add(almondegasCarneMoida);
        receitas.add(arrozaovinho);
        receitas.add(arrozAparmegiana);
        receitas.add(arrozbranco);
        receitas.add(arrozdeforno);
        receitas.add(batatafrita);
        receitas.add(bifeacavalo);
        receitas.add(bifeacebolado);
        receitas.add(bifearole);
        receitas.add(bifeEmCamadasComCebola);
        receitas.add(bifeparmegiana);
        receitas.add(cafecapuccino);
        receitas.add(calabresaacebolada);
        receitas.add(carnedepanela);
        receitas.add(chocolatequentecremoso);
        receitas.add(costelacombatata);
        receitas.add(feijoada);
        receitas.add(frangoparmegiana);
        receitas.add(fricassecarnemoida);
        receitas.add(gemada);
        receitas.add(gelo);
        receitas.add(lasanhaQuatroQueijos);
        receitas.add(macarraoComRequeijao);
        receitas.add(molhoBolonhesa);
        receitas.add(molhoDeTomate);
        receitas.add(omelete);
        receitas.add(ovosfritos);
        receitas.add(panquecaBatata);
        receitas.add(penneComMolhoBranco);
        receitas.add(risotocamarao);
        receitas.add(risotocarne);
        receitas.add(risotofrango);
        receitas.add(salsichaoBacon);
        receitas.add(sopaDeLegumes);
        receitas.add(strogonoffCarne);
        receitas.add(strogonoffFrango);
        receitas.add(vacaatolada);

        ArrayList<String> listaReceitas = new ArrayList<String>();
        ArrayList<String> receitaEscolhida = new ArrayList<String>();
        ArrayList<String> ingredientesSelecionados = (ArrayList<String>) getIntent().getSerializableExtra("ingredientesSelecionados");

        int tamanhoListaReceitas = receitas.size();
        for(int i=0; i<tamanhoListaReceitas; i++) {

            ArrayList receitaTemporaria = receitas.get(i);
            int tamanhoLista = receitaTemporaria.size();

            Boolean verificador = true;

            for(int j=2; j<tamanhoLista; j++){
                if(ingredientesSelecionados != null){
                    if(!(ingredientesSelecionados.contains(receitaTemporaria.get(j)))) {
                        verificador = false;
                    }
                }
                else {
                    verificador = false;
                }
            }

            if(verificador == true) {

                listaReceitas.add(receitaTemporaria.get(0).toString());

                listaDeReceitas = (ListView) findViewById(R.id.listaDeReceitasID);

                ArrayAdapter<String> adaptadorReceitas = new ArrayAdapter<String>(
                        this,
                        android.R.layout.select_dialog_item,
                        listaReceitas
                );

                listaDeReceitas.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
                listaDeReceitas.setAdapter(adaptadorReceitas);

                listaDeReceitas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        int codigoPosicao = position;
                        String valorClicado = listaDeReceitas.getItemAtPosition(codigoPosicao).toString();
                        //Toast.makeText(RecipeList.this, "Strogonoff de Frango", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(RecipeList.this, Recipe.class);
                        intent.putExtra("receita", valorClicado);
                        startActivity(intent);
                    }
                });
            }
            if(ingredientesSelecionados.isEmpty()) {
                TextView receitaNaoEncontrada = (TextView) findViewById(R.id.receitaNaoEncontradaID);

                receitaNaoEncontrada.setText(
                        "Ops, parece que faltou algum ingrediente em casa, não é mesmo!?" +
                                "\n\nTente ir a vendinha mais próxima, ou quem sabe ao mercado."

                );
            }
        }
    }
}
