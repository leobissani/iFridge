package ifridge.ifridge;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Recipe extends AppCompatActivity {

    private Button confirmaReceita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        Intent intent = getIntent();
        String receita = intent.getStringExtra("receita");

        // Criação do banco de dados
        SQLiteDatabase bancoDeReceitas = openOrCreateDatabase("iFridge", MODE_PRIVATE, null);

        // Criação da tabela do banco de dados
        bancoDeReceitas.execSQL("CREATE TABLE IF NOT EXISTS receitas(nome VARCHAR, ingredientes VARCHAR, preparo VARCHAR)");
        bancoDeReceitas.execSQL("INSERT INTO receitas(nome, ingredientes, preparo) VALUES('Strogonoff de Frango', 'Molho de Tomate, Sal, Mostarda, Creme de Leite, Filé de Frango, Champignon, Manteiga, Cebola', 'Modo de Preparo')");

        // Recebe a string com o nome da receita (receita clicada, seja favorita ou do BD)
        // Vai buscar a receita que foi clicada na lista dentro do banco de dados
        // Assim ele vai jogar as informações de modo de preparo, nome, na tela

        TextView nomeReceita = (TextView) findViewById(R.id.nomeReceitaID);
        TextView modoPreparo = (TextView) findViewById(R.id.modoDePreparoID);

        confirmaReceita = (Button) findViewById(R.id.botaoConfirmaID);

        switch(receita) {

            // ACHOCOLATADO
            case "Achocolatado":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView achocolatado = (ImageView) findViewById(R.id.imagemReceita);
                achocolatado.setImageResource(R.drawable.achocolatado);
                modoPreparo.setText(
                        "- Tempo de Preparo: 2 minutos\n" +
                        "- Rendimento: 1 copo\n\n" +
                        "Ingredientes:\n" +
                        "• Leite\n" +
                        "• Chocolate em pó\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Encha um copo com leite\n" +
                        "2) Adicione o chocolate em pó a gosto\n" +
                        "3) Mexa bem para diluir o pó\n" +
                        "4) Saúde"
                ); break;

            // ALMÔNDEGAS DE CARNE MOÍDA
            case "Almôndegas de Carne Moída":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView almondegasCarneMoida = (ImageView) findViewById(R.id.imagemReceita);
                almondegasCarneMoida.setImageResource(R.drawable.almondegascarnemoida);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 8 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 1 kg de carne moída\n" +
                        "• 3 colheres (sopa) de farinha de trigo\n" +
                        "• Alho socado e cheiro-verde, picado a gosto\n" +
                        "• 1 cebola ralada ou socada\n" +
                        "• Sal a gosto\n" +
                        "OPCIONAL: Hortelã a gosto\n\n" +
                        "Ingredientes para o Molho:\n" +
                        "• Alho e cebola picados a gosto\n" +
                        "• 1 caldo de carne\n" +
                        "• Tomate e pimentão em tiras a gosto\n" +
                        "OPCIONAL: Molho de tomate\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Misture todos os primeiros ingredientes, amassando bem, faça bolinhas e reserve\n" +
                        "2) Numa panela, refogue alho e cebola, não doure tanto\n" +
                        "3) Coloque as bolinhas de carne e refogue, mexendo levemente, para não desfazer\n" +
                        "4) Quando o tempero estiver bem douradinho, vá pingando água aos poucos, conforme for secando\n" +
                        "5) Quando as bolinhas estiverem bem coradinhas, coloque um pouco mais de água e o caldo de carne\n" +
                        "6) Deixe cozinhar um pouco, até quase secar a água, coloque o pimentão e o tomate, tampe a panela\n" +
                        "7) Apague o fogo e deixe abafado por alguns minutos, coloque numa travessa e sirva acompanhado como quiser"
                ); break;

            // ARROZ Á PARMEGIANA
            case "Arroz à Parmegiana":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView arrozAparmegiana = (ImageView) findViewById(R.id.imagemReceita);
                arrozAparmegiana.setImageResource(R.drawable.arrozaovinhobranco);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 4 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 3 arroz cozido al dente\n" +
                        "• 4 tomates cortados em rodelas\n" +
                        "• 250g de queijo mussarela fatiada\n" +
                        "• 1 queijo parmesão ralado\n" +
                        "• Sal a gosto\n" +
                        "• Azeite de oliva a gosto\n" +
                        "• Azeite para fritar\n" +
                        "• Pimenta-do-reino a gosto\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Deixe as berinjelas de molho na água com sal por alguns minutos. Escorra e esprema para retirar o excesso de água.\n" +
                        "2) No óleo quente frite as fatias de berinjelas e coloque sobre papel absorvente para retirar o excesso de gordura.\n" +
                        "3) Em um refratário alterne camadas de arroz, berinjela, tomate e mussarela temperadas com sal, pimenta e regadas com azeite.\n" +
                        "4) Termine com uma camada de arroz e polvilhe o queijo ralado.\n" +
                        "5) Leve ao forno, preaquecido a 200 °C, até dourar."
                ); break;

            // ARROZ AO VINHO BRANCO
            case "Arroz ao Vinho Branco":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView arrozaovinhobranco = (ImageView) findViewById(R.id.imagemReceita);
                arrozaovinhobranco.setImageResource(R.drawable.arrozaovinhobranco);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 4 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 3 colheres (sopa) de manteiga\n" +
                        "• 2 colheres (sopa) de cebola picada\n" +
                        "• 1 xícara (chá) de arroz\n" +
                        "• 1 xícara (chá) de vinho branco seco\n" +
                        "• 1/3 xícara (chá) de caldo de carne\n" +
                        "• 3 colheres (sopa) de queijo parmesão ralado\n" +
                        "• Salsa (ou salsinha) a gosto\n" +
                        "• Sal a gosto\n" +
                        "• Pimenta-do-reino a gosto\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Em uma panela, derreta a manteiga e junte a cebola. Frite, mexendo sempre, até ficar macia.\n" +
                        "2) Junte o arroz e refogue por alguns minutos.\n" +
                        "3) Em outra panela, aqueça o vinho e o caldo de carne e despeje sobre o arroz. Tempere com sal e pimenta.\n" +
                        "4) Tampe e cozinhe em fogo baixo por 20 minutos ou até o arroz ficar macio. Polvilhe com queijo parmesão.\n" +
                        "5) Decore com salsa grosseiramente cortada e sirva."
                ); break;

            // ARROZ BRANCO
            case "Arroz Branco":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView arrozbranco = (ImageView) findViewById(R.id.imagemReceita);
                arrozbranco.setImageResource(R.drawable.arrozbranco);
                modoPreparo.setText(
                        "- Tempo de Preparo: 20 minutos\n" +
                        "- Rendimento: 3 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 1 xícara de arroz lavado\n" +
                        "• 2 xícaras de água fervente\n" +
                        "• 1 dente de alho amassado\n" +
                        "• 1/4 de cebola picada\n" +
                        "• 1 colher de sopa de azeite\n" +
                        "• Sal a gosto\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Refogue o alho e a cebola no azeite\n" +
                        "2) Coloque o arroz e deixe fritar por cerca de 30 segundos\n" +
                        "3) Adicione a água fervente e o sal\n" +
                        "4) Abaixe o fogo e deixe cozinhar até a água ter quase secado\n" +
                        "5) Tampe a panela e aguarde cerca de 20 minutos antes de servir\n" +
                        "6) Se desejar fazer mais, é só seguir as proporções, principalmente da água"
                ); break;

            // ARROZ DE FORNO
            case "Arroz de Forno":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView arrozdeforno = (ImageView) findViewById(R.id.imagemReceita);
                arrozdeforno.setImageResource(R.drawable.arrozdeforno);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 6 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 4 xícaras (chá) de arroz cozido\n" +
                        "• 2 xícaras (chá) de frango desfiado e temperado a gosto\n" +
                        "• 1/2 copo de requeijão light\n" +
                        "• 200 gramas de queijo parmesão ralado\n" +
                        "• 1 xícara (chá) de maionese\n" +
                        "• 2 xícaras (chá) de queijo mussarela ralado\n" +
                        "• Cheiro-verde picado a gosto\n" +
                        "OPCIONAL: 1 xícara (chá) de legumes ( brócolis, couve-flor, vagem, milho e cenoura) cozidos\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Em um refratário, faça camadas com metade do arroz, o frango misturado com o requeijão, o queijo ralado, a maionese, o cheiro-verde e os legumes.\n" +
                        "2) Por cima, disponha o arroz restante e cubra com a mussarela.\n" +
                        "3) Leve ao forno, preaquecido, até dourar e o queijo derreter.\n" +
                        "4) Sirva em seguida."
                ); break;

            // BATATA FRITA
            case "Batata Frita":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView batatafrita = (ImageView) findViewById(R.id.imagemReceita);
                batatafrita.setImageResource(R.drawable.batatafrita);
                modoPreparo.setText(
                        "- Tempo de Preparo: 20 minutos\n" +
                        "- Rendimento: 1 porção \n\n" +
                        "Ingredientes:\n" +
                        "• 2 Batatas cortadas em palitos\n" +
                        "• Sal\n" +
                        "• Azeite\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Corte as batatas em palito e seque-as com papel toalha\n" +
                        "2) Coloque azeite para esquentar em uma frigideira (o suficiente para cobrir as batatas)\n" +
                        "3) Coloque as batatas e frite em fogo médio até dourarem\n" +
                        "4) Bom apetite\n\n" +
                        "Dica: experimente combinar com ketchup, maionese, mostarda ou qualquer " +
                        "outro tipo de molho a sua escolha."
                ); break;

            // BIFE À CAVALO
            case "Bife à Cavalo":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView bifeacavalo = (ImageView) findViewById(R.id.imagemReceita);
                bifeacavalo.setImageResource(R.drawable.bifeacavalo);
                modoPreparo.setText(
                        "- Tempo de Preparo: 10 minutos\n" +
                                "- Rendimento: 6 porções\n\n" +
                                "Ingredientes:\n" +
                                "• 8 bifes grandes de alcatra\n" +
                                "• Sal e pimenta do reino à gosto\n" +
                                "• 10 ovos\n" +
                                "• Azeite para fritar\n" +
                                "• 3 Batatas\n\n" +
                                "Modo de Preparo:\n" +
                                "1) Tempere os bifes com sal, alho e pimenta do reino\n" +
                                "2) Deixe descansar por 30 minutos\n" +
                                "3) Leve ao fogo em uma frigideira com pouco óleo/azeite\n" +
                                "4) Quando estiver bem quente, coloque o bife e deixe dourar\n" +
                                "5) Frite um bife de cada vez, para não juntar água\n" +
                                "6) Frite a seguir os ovos sem perfurar as gemas e coloque-os sobre os bifes\n" +
                                "7) Depois corte as batatas em tiras, frite e coloque sobre os ovos\n" +
                                "8) Sirva a seguir"
                ); break;

            // BIFE ACEBOLADO
            case "Bife Acebolado":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView bifeacebolado = (ImageView) findViewById(R.id.imagemReceita);
                bifeacebolado.setImageResource(R.drawable.bifeacebolado);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 6 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 6 bifes de carne desejada\n" +
                        "• 2 colheres (sopa) de margarina\n" +
                        "• 3 unidades de cebola cortadas em rodelas\n" +
                        "• 2 unidades de pimentão sem sementes cortados em tiras\n" +
                        "• Sal a gosto\n" +
                        "• Pimenta-do-reino a gosto\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Tempere os bifes com o sal e a pimenta-do-reino.\n" +
                        "2) Em uma frigideira, derreta metade da margarina e frite os bifes, um de cada vez, até o ponto desejado.\n" +
                        "3) Retire da frigideira e reserve aquecido.\n" +
                        "4) Na mesma frigideira, refogue a cebola e o pimentão até dourarem.\n" +
                        "5) Retire do fogo, sirva imediatamente sobre os bifes quentes."
                ); break;

            // BIFE A ROLÊ
            case "Bife a Rolê":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView bifearole = (ImageView) findViewById(R.id.imagemReceita);
                bifearole.setImageResource(R.drawable.bifearole);
                modoPreparo.setText(
                        "- Tempo de Preparo: 40 minutos\n" +
                        "- Rendimento: 8 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 6 bifes de alcatra\n" +
                        "• 6 tiras de bacon\n" +
                        "• Azeite\n" +
                        "• 1 cebola picada\n" +
                        "• 1 lata de purê de tomate\n" +
                        "• Manjerona, cheiro verde, sal e pimenta do reino a gosto\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Tempere os bifes e coloque a fartia de bacon no meio\n" +
                        "2) Enrole e prenda com um palito\n" +
                        "3) Em uma panela de pressão frite os bifes, todos juntos, virando de vez em quando\n" +
                        "4) Frite em seguida a cebola\n" +
                        "5) Acrescente o molho de tomate, a manjerona, o sal e a pimenta\n" +
                        "6) Coloque água e deixe cozinhar por 30 minutos\n" +
                        "7) Abra a panela, veja se o molho está denso e a carne macia\n" +
                        "8) Ferva mais um pouco com a panela aberta\n" +
                        "9) Acrescente o cheiro verde\n" +
                        "10) Sirva com arroz e legumes"
                ); break;

            // BIFE EM CAMADAS COM CEBOLA
            case "Bife em Camadas com Cebola":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView bifeEmCamadasComCebola = (ImageView) findViewById(R.id.imagemReceita);
                bifeEmCamadasComCebola.setImageResource(R.drawable.bifeemcamadascomcebola);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 4 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 4 bifes de carne de sua preferência\n" +
                        "• 2 dentes de alho picados\n" +
                        "• 1 colher (chá) de sal\n" +
                        "• 2 unidades de batata médias cortadas em rodelas finas\n" +
                        "• 4 colheres (sopa) de azeite de oliva\n" +
                        "• 2 unidades de cebola em rodelas\n" +
                        "• 4 unidades de tomate maduros cortados em rodelas\n" +
                        "• 4 colheres (sopa) de cheiro-verde picado\n" +
                        "• Orégano a gosto\n" +
                        "• Salsa (ou salsinha) para polvilhar\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Tempere os bifes com alho e sal e a batata com sal e orégano.\n" +
                        "2) Em uma panela antiaderente, espalhe 1 colher (sopa) de azeite, faça camadas de bife, cebola, tomate e cheiro-verde.\n" +
                        "3) Regue com uma colher (sopa) de azeite, distribua as fatias de batata e regue com o restante do azeite.\n" +
                        "4) Tampe a panela e leve ao fogo baixo até que a batata e os bifes estejam cozidos.\n" +
                        "5) Polvilhe salsa e sirva em seguida."
                ); break;

            // BIFE À PARMEGIANA
            case "Bife à Parmegiana":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView bifeparmegiana = (ImageView) findViewById(R.id.imagemReceita);
                bifeparmegiana.setImageResource(R.drawable.bifeparmegiana);
                modoPreparo.setText(
                        "- Tempo de Preparo: -\n" +
                        "- Rendimento: 12 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 12 bifes de alcatra \n" +
                        "• 3 dentes de alho picados\n" +
                        "• Sal e pimenta-do-reino moídos \n" +
                        "• 1 colher (sopa) de vinagre branco \n" +
                        "• 300 g de farinha de trigo 12\n" +
                        "• Ovos batidos \n" +
                        "• 300 g de farinha de rosca\n\n" +
                        "Para o molho de tomate\n" +
                        "• 1 fio de azeite\n" +
                        "• 6 cebolas picadas\n" +
                        "• 1 pimentão verde picado\n" +
                        "• 6 tomates sem pele e sem sementes picados\n" +
                        "• 2 extratos de tomate com 340 g cada\n" +
                        "• Sal a gosto\n" +
                        "• 300 ml de água\n\n" +
                        "Preparando o molho de tomate:\n" +
                        "1) Em uma panela, refogue a cebola com o óleo por 10 minutos\n" +
                        "2) Junte o pimentão, os tomates, os extratos, o sal e a água\n" +
                        "3) Mexa bem e deixe no fogo médio por 40 minutos, adicionando água, se necessário\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Tempere os bifes com alho, sal, pimenta-do-reino e vinagre\n" +
                        "2) Passe cada bife na farinha de trigo, depois nos ovos batidos e na farinha de rosca\n" +
                        "3) Acomode os bifes em uma assadeira untada\n" +
                        "4) Leve ao forno a 180 graus por 30 minutos\n" +
                        "5) Em um refrátario, coloque os bifes assados\n" +
                        "6) Faça uma camada de presunto e outra de muçarela\n" +
                        "7) Regue o molho de tomate\n" +
                        "8) Leve ao forno pré-aquecido a 180 graus por 10 minutos\n" +
                        "9) Sirva com fettuccine ao alho e óleo\n"
                ); break;

            // CAFÉ CAPUCCINO
            case "Capuccino":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView capuccino = (ImageView) findViewById(R.id.imagemReceita);
                capuccino.setImageResource(R.drawable.capuccino);
                modoPreparo.setText(
                        "- Tempo de Preparo: 15 minutos\n" +
                        "- Rendimento: 15 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 400 g de leite em pó integral\n" +
                        "• 230 g de açúcar\n" +
                        "• 50 g de café solúvel\n" +
                        "• 5 colheres (sopa) de chocolate em pó\n" +
                        "• 1 colher (chá) de canela em pó\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Misture no liquidificador o leite em pó e o café solúvel (para triturar o café)\n" +
                        "2) Coloque a mistura em um recipiente com tampa e acrescente os outros ingredientes\n" +
                        "3) Agite vigorosamente o recipiente até que a mistura esteja homogênea\n" +
                        "4) Ferva 180 ml de água\n" +
                        "5) Coloque a água em um copo alto (vai dobrar de volume)\n" +
                        "6) Acrescente 3 colheres (sopa) bem cheias de capuccino e misture bem até ficar cremoso\n" +
                        "7) Pronto. A dica é colocar por cima chantili e cobertura de chocolate"
                ); break;

            // CALABRESA ACEBOLADA
            case "Calabresa Acebolada":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView calabresaacebolada = (ImageView) findViewById(R.id.imagemReceita);
                calabresaacebolada.setImageResource(R.drawable.calabresaacebolada);
                modoPreparo.setText(
                        "- Tempo de Preparo: 15 minutos\n" +
                        "- Rendimento: 1 porção\n\n" +
                        "Ingredientes:\n" +
                        "• 2 linguiças de calabresa\n" +
                        "• 2 cebolas\n" +
                        "• Azeite\n" +
                        "• Sal\n" +
                        "• Pimenta do Reino\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Coloque azeite em uma frigideira, o suficiente para fritar a linguiça e leve ao fogo\n" +
                        "2) Corte a linguiça em rodelas finas e ponha na frigideira com o azeite\n" +
                        "3) Corte a cebola também em rodelas e coloque na frigideira junto com a linguiça e um pouco de pimenta-do-reino\n" +
                        "4) Mexa tudo junto e adicione sal a gosto\n" +
                        "5) Bom apetite"
                ); break;

            // CARNE DE PANELA
            case "Carne de Panela":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView carneDePanela = (ImageView) findViewById(R.id.imagemReceita);
                carneDePanela.setImageResource(R.drawable.carnedepanela);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 6 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 2 kg de alcatra\n" +
                        "• 1 cebola grande cortada em pedaços\n" +
                        "• 2 caldos de carne\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Em uma panela de pressão, coloque a cebola picada e o caldo de carne.\n" +
                        "2) Coloque a carne picada e mais um caldo de carne por cima.\n" +
                        "3) Tampe a panela e deixe cozinhar em fogo médio por 30 minutos."
                ); break;

            // CHOCOLATE QUENTE CREMOSO
            case "Chocolate Quente Cremoso":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView chocolatequentecremoso = (ImageView) findViewById(R.id.imagemReceita);
                chocolatequentecremoso.setImageResource(R.drawable.chocolatequentecremoso);
                modoPreparo.setText(
                        "- Tempo de Preparo: 10 minutos\n" +
                        "- Rendimento: 4 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 2 xícaras (chá) de leite\n" +
                        "• 1 colher (sopa) de amido de milho\n" +
                        "• 3 colheres (sopa) de chocolate em pó\n" +
                        "• 4 colheres (sopa) de açúcar\n" +
                        "• 1 canela em pau\n" +
                        "• 1 caixinha de creme de leite\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Em um liquidificador, bata o leite, o amido de milho, o chocolate em pó e o açúcar\n" +
                        "2) Despeje a mistura em uma panela com a canela e leve ao fogo baixo, mexendo sempre até ferver\n" +
                        "3) Desligue, adicione o creme de leite e mexa bem até obter uma mistura homogênea\n" +
                        "4) Retire a canela e sirva quente"
                ); break;

            // COSTELA COM BATATA
            case "Costela com Batata":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView costelacombatata = (ImageView) findViewById(R.id.imagemReceita);
                costelacombatata.setImageResource(R.drawable.costelacombatata);
                modoPreparo.setText(
                        "- Tempo de Preparo: 45 minutos\n" +
                        "- Rendimento: 3 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 600 g de costela\n" +
                        "• 4 batatas médias\n" +
                        "• 2 cebolas\n" +
                        "• 2 tabletes de carne\n" +
                        "• 2 limões\n" +
                        "• 1 sachê de tempero para carnes\n" +
                        "• 2 dentes de alho pequenos\n" +
                        "• 2 colheres de sopa de óleo\n" +
                        "• pimenta calabresa a gosto\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Em uma panela de pressão coloque o óleo e deixe esquentar\n" +
                        "2) Coloque o alho picado e deixe fritar até dourar\n" +
                        "3) Desligue o fogo e forre o fundo d panela com a cebola corta em rodelas\n" +
                        "4) Coloque a costela picada em pedaços, o sazón, a pimenta calabresa a gosto, os tabletes de carne e esprema os dois limões\n" +
                        "5) Tampe a panela e quando pegar a pressão abaixe o fogo e deixe cozinhar por 30 minutos\n" +
                        "6) Enquanto a carne cozinha, pique as batatas e deixe em um recipiente com água e sal\n" +
                        "8) Quando a carne estiver cozida, abra a panela e coloque as batatas sem a aguá e deixe por mais 10 minutos\n" +
                        "9) Se desejar dobrar a receita é só dobrar todos os ingredientes\n."
                ); break;

            // FRANGO À PARMEGIANA
            case "Feijoada":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView feijoada = (ImageView) findViewById(R.id.imagemReceita);
                feijoada.setImageResource(R.drawable.feijoada);
                modoPreparo.setText(
                        "- Tempo de Preparo: 140 minutos\n" +
                        "- Rendimento: 20 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 1 Kg de feijão preto\n" +
                        "• 100 g de carne seca\n" +
                        "• 70 g de orelha de porco\n" +
                        "• 70 g de rabo de porco\n" +
                        "• 70 g de pé de porco\n" +
                        "• 100 g de costelinha de porco\n" +
                        "• 50 g de lombo de porco\n" +
                        "• 100 g de paio\n" +
                        "• 150 g de lingüiça portuguesa\n\n" +
                        "Ingredientes para o Tempero:\n" +
                        "• 2 cebolas grandes picadinhas\n" +
                        "• 1 maço de cebolinha verde picadinha\n" +
                        "• 3 folhas de louro\n" +
                        "• 6 dentes de alho\n" +
                        "• Pimenta do reino a gosto\n" +
                        "• 1 ou 2 laranjas\n" +
                        "• 40 ml de de pinga\n" +
                        "• Sal se precisar\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Coloque as carnes de molho por 36 horas ou mais, vá trocando a água várias vezes, se for ambiente quente ou verão, coloque gelo por cima ou em camadas frias\n" +
                        "2) Coloque para cozinhar passo a passo: as carnes duras, em seguida as carnes moles\n" +
                        "3) Quando estiver mole coloque o feijão, e retire as carnes\n" +
                        "4) Finalmente tempere o feijão"
                ); break;

            // FRANGO À PARMEGIANA
            case "Frango à Parmegiana":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView frangoparmegiana = (ImageView) findViewById(R.id.imagemReceita);
                frangoparmegiana.setImageResource(R.drawable.frangoparmegiana);
                modoPreparo.setText(
                        "- Tempo de Preparo: 1 hora\n" +
                        "- Rendimento: 6 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 1 kg de filé de frango\n" +
                        "• 2 ovos\n" +
                        "• Farinha de rosca\n" +
                        "• 200 g de mussarela em fatias\n\n" +
                        "Tempero para o frango:\n" +
                        "• Suco de um limão\n" +
                        "• 1 colher de sobremesa de sal\n" +
                        "• Cheiro verde a gosto\n" +
                        "• Orégano a gosto\n" +
                        "• 2 colheres de shoyu\n\n" +
                        "Ingredientes para o molho:\n" +
                        "• 1/2 cebola\n" +
                        "• 1 lata de molho de tomate\n" +
                        "• 1 colher de (sobremesa) rasa de sal\n" +
                        "• 1 colher de (sobremesa) rasa de alho amassado\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Temperar os filés de frango\n" +
                        "2) Quebre os ovos em um prato fundo, colocar uma colher de café de sal e mexer bem\n" +
                        "3) Passar os filés pelo ovos e pela farinha de rosca, deixar bem empanado\n" +
                        "4) Unte uma marinex, adicione os filés e asse por 20 minutos, vire e asse por mais vinte minutos\n" +
                        "5) Prepare o molho enquanto os filés estão no forno, corte a cebola e o tomate em cubos\n" +
                        "6) Refogue com o tomate, a cebola, o alho e o cheiro verde\n" +
                        "7) Acrescente o molho de tomate pronto\n" +
                        "8) Sobre os filés assados, coloque a mussarela e cubra como o molho\n" +
                        "9) Leve ao forno por 5 minutos para gratinar\n" +
                        "10 Servir com arroz e batata palha\n"
                ); break;

            // FRICASSÊ DE CARNE MOÍDA COM REQUEIJÃO
            case "Fricassê de Carne Moída":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView fricassecarnemoida = (ImageView) findViewById(R.id.imagemReceita);
                fricassecarnemoida.setImageResource(R.drawable.fricassecarnemoida);
                modoPreparo.setText(
                        "- Tempo de Preparo: 40 minutos\n" +
                        "- Rendimento: 6 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 400 g de carne moída\n" +
                        "• 1 pacote de 100 g de azeitonas em conserva sem caroço\n" +
                        "• 1/2 caixa de creme de leite\n" +
                        "• 1 copo de requeijão\n" +
                        "• 1/2 cebola picada\n" +
                        "• 1 pacote de 200 g de batata palha\n" +
                        "• 200 g de mussarela fatiada\n" +
                        "• Tempero a gosto\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Tempere a seu gosto e cozinhe a carne moída, após cozida separe a carne do caldo (é necessário durante a separação que a carne fique bem seca) e deixe esfriar\n" +
                        "2) Bata no liquidificador o caldo, o requeijão, a cebola, o creme de leite e a azeitona (caso você não goste de azeitona pode trocar a mesma quantidade por milho verde)\n" +
                        "3) Em uma travessa misture a carne com a batata palha despeje por cima o creme e cubra com mussarela\n" +
                        "4) Leve ao forno por cerca de 15 minutos\n" +
                        "5) Sirva com arroz branco"
                ); break;

            // GELO
            case "Gelo":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView gelo = (ImageView) findViewById(R.id.imagemReceita);
                gelo.setImageResource(R.drawable.gelo);
                modoPreparo.setText(
                        "- Tempo de Preparo: -\n" +
                        "- Rendimento: A quantidade de cubos da forma\n\n" +
                        "Ingredientes:\n" +
                        "• 1 forma de gelo\n" +
                        "• Água suficiente para encher a forma\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Encha a forma de gelo com água\n" +
                        "2) Leve a forma ao congelador e deixe até congelar\n" +
                        "3) Pronto, você tem uma forma de gelo"
                ); break;

            // GEMADA
            case "Gemada":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView gemada = (ImageView) findViewById(R.id.imagemReceita);
                gemada.setImageResource(R.drawable.gemada);
                modoPreparo.setText(
                        "- Tempo de Preparo: 5 minutos\n" +
                        "- Rendimento: 1 porção\n\n" +
                        "Ingredientes:\n" +
                        "• 1 copo americano de leite fervente\n" +
                        "• 1 gema\n" +
                        "• 1 colher de sopa rasa de açúcar\n" +
                        "OPCIONAL: Canela a gosto\n\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Em uma caneca bata a gema com o açúcar até tirar o cheiro de ovo\n" +
                        "2) Junte o leite fervendo, polvilhe com canela e beba"
                ); break;

            // LASANHA 4 QUEIJOS
            case "Lasanha de 4 Queijos":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView lasanhaQuatroQueijos = (ImageView) findViewById(R.id.imagemReceita);
                lasanhaQuatroQueijos.setImageResource(R.drawable.lasanhaquatroqueijos);
                modoPreparo.setText(
                        "- Tempo de Preparo: +45 minutos\n" +
                        "- Rendimento: 6 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 500 gramas de massa de lasanha cozida\n" +
                        "• 250 gramas de queijo mussarela em fatias\n" +
                        "• 3 colheres (sopa) de manteiga\n" +
                        "• 2 colheres (sopa) de farinha de trigo\n" +
                        "• 3 xícaras (chá) de leite\n" +
                        "• 50 gramas de queijo gorgonzola esfarelado\n" +
                        "• 100 gramas de queijo provolone ralado\n" +
                        "• 50 gramas de queijo parmesão ralado\n" +
                        "• 1 lata de creme de leite\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Para fazer o molho, em uma panela, doure a farinha com a manteiga. Espere amornar.\n" +
                        "2) No liquidificador, bata a mistura de farinha e manteiga, o leite, o gorgonzola, o provolone, o parmesão e o creme de leite.\n" +
                        "3) Transfira para uma panela e leve ao fogo brando, a 160 ºC, mexendo sempre até engrossar.\n" +
                        "4) Em um refratário, alterne camadas de massa, molho e mussarela.\n" +
                        "5) Termine com molho, polvilhe queijo parmesão e leve ao forno alto, preaquecido, a 200 ºC, até derreter o queijo e dourar.\n" +
                        "Dica: varie de queijos. Substitua o provolone por queijo prato e o gorgonzola por queijo meia cura."
                ); break;

            // MACARRÃO COM REQUEIJÃO E MAIONESE
            case "Macarrão com Requeijão":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView macarraoComRequeijao = (ImageView) findViewById(R.id.imagemReceita);
                macarraoComRequeijao.setImageResource(R.drawable.macarraocomrequeijao);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 6 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 500 gramas de macarrão longo cozido al dente\n" +
                        "• 2 colheres (sopa) de azeite de oliva\n" +
                        "• 1 unidade de cebola picada\n" +
                        "• 1 lata de molho de tomate\n" +
                        "• 1/2 unidade de pimentão picado\n" +
                        "• 100 gramas de queijo mussarela ralado\n" +
                        "• 1 copo de requeijão\n" +
                        "• 4 colheres (sopa) de maionese\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Em uma panela, aqueça o azeite e doure a cebola.\n" +
                        "2) Junte o molho de tomate e o pimentão e cozinhe por 5 minutos em fogo brando (160 ºC).\n" +
                        "3) Misture a mussarela, o requeijão e a maionese.\n" +
                        "4) Deixe no fogo até a mussarela derreter.\n" +
                        "5) Envolva a massa e sirva em seguida.\n" +
                        "Dica: Acrescente ao molho 100g de presunto ralado."
                ); break;

            // MOLHO BOLONHESA
            case "Molho Bolonhesa":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView molhoBolonhesa = (ImageView) findViewById(R.id.imagemReceita);
                molhoBolonhesa.setImageResource(R.drawable.molhobolonhesa);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 1 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 1 cebola ralada\n" +
                        "• 1 lata de molho de tomate de sua preferência\n" +
                        "• A mesma medida de água\n" +
                        "• 1/2 kg de carne moída\n" +
                        "• 2 dentes de alho amassados\n" +
                        "• 4 colheres (sopa) de azeite\n" +
                        "• Sal e (opcionalmente: pimenta) a gosto\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Em uma panela, aqueça o óleo e refogue a cebola e o alho\n" +
                        "2) Junte a carne moída e deixe cozinhar\n" +
                        "3) Acrescente o molho, a água e deixe apurar por 15 minutos, até ficar cremoso\n" +
                        "4) Bom apetite"
                ); break;

            // MOLHO DE TOMATE
            case "Molho de Tomate":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView molhoDeTomate = (ImageView) findViewById(R.id.imagemReceita);
                molhoDeTomate.setImageResource(R.drawable.molhotomate);
                modoPreparo.setText(
                        "- Tempo de Preparo: 50 minutos\n" +
                        "- Rendimento: 4 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 2 kg de tomate maduro (débora ou italiano) cortado ao meio,sem semente\n" +
                        "• 6 colheres (sopa) de azeite\n" +
                        "• 1 cebola pequena picada\n" +
                        "• 2 dentes de alho amassados\n" +
                        "• 1 pitada de cominho\n" +
                        "• Folhas de manjericão a gosto\n" +
                        "• Sal à gosto\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Numa panela, coloque 2 kg de tomate maduro sem sementes e deixe até amolecer\n" +
                        "2) Depois, passe pelo passador de legumes ou numa peneira\n" +
                        "3) Leve ao fogo 6 colheres (sopa) de azeite e refogue 1 cebola pequena picada, 2 dentes de alho amassados\n" +
                        "4) Junte o tomate processado e 1 pitada de cominho\n" +
                        "5) Cozinhe por 15 min em fogo baixo\n" +
                        "6) Acerte o sal e finalize com folhas de manjericão à gosto"
                ); break;

            // OMELETE
            case "Omelete":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView omelete = (ImageView) findViewById(R.id.imagemReceita);
                omelete.setImageResource(R.drawable.omelete);
                modoPreparo.setText(
                        "- Tempo de Preparo: 5 minutos\n" +
                        "- Rendimento: 1 porção\n\n" +
                        "Ingredientes:\n" +
                        "• 2 ovos\n" +
                        "• 1 pitada de sal\n" +
                        "• 1 fatia de presunto\n" +
                        "• 2 fatias de queijo\n" +
                        "• Azeite\n" +
                        "• Caldo de galinha a gosto\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Unte uma frigideira com azeite\n" +
                        "2) Bata os 2 ovos, pode ser na batedeira ou na mão\n" +
                        "3) Pique o presunto e o queijo em pequenos pedaços\n" +
                        "4) Coloque os ovos, o presunto e o queijo na frigideira\n" +
                        "5) Deixe tudo em fogo baixo e espere ficar firme\n" +
                        "6) Bom apetite\n\n" +
                        "Dica: acrescentar temperos verdes, tomates, pimentão e etc"
                ); break;

            // OVOS FRITOS
            case "Ovos Fritos":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView ovosfritos = (ImageView) findViewById(R.id.imagemReceita);
                ovosfritos.setImageResource(R.drawable.ovosfritos);
                modoPreparo.setText(
                        "- Tempo de Preparo: +5 minutos\n" +
                        "- Rendimento: 1 porção/ovo\n\n" +
                        "Ingredientes:\n" +
                        "• Ovos\n" +
                        "• 1 colher de sopa de azeite\n" +
                        "• Sal\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Coloque o azeite em uma frigideira e a deixe em fogo baixo\n" +
                        "2) Em seguida quebre o ovo dentro da frigideira\n" +
                        "3) Coloque uma pitada de sal (a gosto)\n" +
                        "4) Tampe a frigideira e deixe fritar a seu gosto\n" +
                        "5) Bom apetite\n\n" +
                        "Dica: você pode acrescentar os temperos que quiser"
                ); break;

            // PANQUECA DE BATATA
            case "Panqueca de Batata":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView panquecaBatata = (ImageView) findViewById(R.id.imagemReceita);
                panquecaBatata.setImageResource(R.drawable.panquecabatata);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 5 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 4 batatas descascadas e raladas\n" +
                        "• 2 ovos\n" +
                        "• 4 colheres (sopa) de manteiga\n" +
                        "• 2 colheres (sopa) de farinha de trigo\n" +
                        "• 2 colheres (sopa) de leite\n" +
                        "• 1 colher (café) de sal\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Numa tigela, colocar os ovos e bater ligeiramente, juntar a metade da manteiga, a farinha, o leite e mexer bem.\n" +
                        "2) Juntar as batatas e o sal.\n" +
                        "3) Numa frigideira, colocar o restante da manteiga, acrescentar a massa de batatas e deixar no fogo brando até dourar.\n" +
                        "4) Virar e dourar o outro lado."
                ); break;

            // PENNE COM MOLHO BRANCO
            case "Penne com Molho Branco":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView penneComMolhoBranco = (ImageView) findViewById(R.id.imagemReceita);
                penneComMolhoBranco.setImageResource(R.drawable.pennemolhobranco);
                modoPreparo.setText(
                        "- Tempo de Preparo: 20 minutos\n" +
                        "- Rendimento: 6 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 500g de macarrão tipo Penne\n" +
                        "• 1 lata de creme de leite com soro\n" +
                        "• 220g de requeijão cremoso\n" +
                        "• 1 colher de sopada de caldo liquido de galinha\n" +
                        "• 1 colher de sopa de manteiga\n" +
                        "• Salsa e sal à gosto\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Cozinhe o penne ao seu gosto e reserve.\n" +
                        "2) Em uma panela derreta a manteiga junte o caldo liquido, creme de leite e a salsa, " +
                        "mexa até começar a levantar fervura.\n" +
                        "3) Pronto."
                ); break;

            // RISOTO DE CAMARÃO
            case "Risoto de Camarão":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView risotocamarao = (ImageView) findViewById(R.id.imagemReceita);
                risotocamarao.setImageResource(R.drawable.risotocamarao);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 4 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 400 g de arroz\n" +
                        "• Azeite\n" +
                        "• 1 dente de alho\n" +
                        "• 120 g de cebola bem picada\n" +
                        "• 120 g de manteiga\n" +
                        "• 400 ml de vinho branco seco\n" +
                        "• 50 g de queijo parmesão ralado\n" +
                        "• 2 litros de caldo de peixe\n" +
                        "• 3 tomates sem pele e sem sementes, picados\n" +
                        "• 4 camarões grandes, temperados com sal e pimenta\n" +
                        "• 2 camarões grandes picados, temperados com sal e pimenta\n" +
                        "• Salsa bem picada\n" +
                        "• Folhas de manjericão\n" +
                        "• Sal\n\n" +
                        "Modo de Preparo:\n" +
                        "1)  Para o arroz\n" +
                        "Em uma panela de fundo grosso, coloque duas colheres de sopa de azeite. Frite o alho e retire. Coloque as cebolas e, quando estiverem transparentes, junte o arroz. No momento em que os grãos começarem a grudar na panela, acrescente o vinho, mexendo sempre.\n" +
                        "Junte, aos poucos, o caldo de peixe fervendo. Repita a operação toda a vez que o arroz começar a pregar no fundo, mexendo continuamente, por cerca de 30 minutos. Quando o grão estiver quase al dente, colocar os tomates e os dois camarões picados. Acrescente a manteiga, a salsinha, o manjericão e o queijo parmesão. Prove para corrigir o sal, se necessário.\n" +
                        "Para o camarão\n" +
                        "Em uma frigideira antiaderente e de fundo grosso, coloque um fio de azeite e grelhe, separadamente, cada camarão.\n" +
                        "Para a montagem\n" +
                        "Monte os pratos, colocando uma porção do risoto e, por cima, o camarão. Decore com cenouras baby e aspargos."
                ); break;

            // RISOTO CARNE
            case "Risoto de Carne":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView risotocarne = (ImageView) findViewById(R.id.imagemReceita);
                risotocarne.setImageResource(R.drawable.risotocarne);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 8 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 2 colheres (sopa) de extrato de tomates\n" +
                        "• 4 xícaras (chá) de água\n" +
                        "• 1/2 colher (chá) de sal\n" +
                        "• 300 gramas de filé mignon em tiras\n" +
                        "• 1 xícara (chá) de maionese a base de leite\n" +
                        "• 2 colheres (sopa) de azeite de oliva\n" +
                        "• 1 cebola ralada\n" +
                        "• 1 1/2 xícara (chá) de arroz arbóreo\n" +
                        "• 1 colher (chá) de tomilho picado\n" +
                        "• 1 colher(chá) de orégano picado\n\n" +
                        "Modo de Preparo:\n" +
                        "1)  Em uma tigela pequena tempere a carne com o sal e reserve.\n" +
                        "2) Em uma panela média, ferva a água.\n" +
                        "3) Junte o extrato de tomate, e ferva por mais 2 minutos e reserve.\n" +
                        "4) À parte em uma panela grande aqueça o azeite e doure a cebola.\n" +
                        "5) Junte o filé e refogue até perder a cor avermelhada.\n" +
                        "6) Adicione o arroz e refogue por mais dois minutos.\n" +
                        "7) Adicione aproximadamente uma xícara (chá) da água com o extrato de tomate reservada e cozinhe em fogo baixo até secar.\n" +
                        "8) Repita a operação até terminar o líquido.\n" +
                        "9) Acrescente a maionese e misture até o risoto ficar cremoso.\n" +
                        "10) Retire do fogo, adicione o tomilho, o orégano, tampe a panela e reserve por 5 minutos.\n" +
                        "11) Sirva em seguida."
                ); break;

            // RISOTO FRANGO
            case "Risoto de Frango":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView risotofrango = (ImageView) findViewById(R.id.imagemReceita);
                risotofrango.setImageResource(R.drawable.risotofrango);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 4 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 3 xícaras de arroz para risoto\n" +
                        "• 1 peito de frango grande cozido e desfiado\n" +
                        "• 1 cebola picadinha\n" +
                        "• 4 colheres de sopa de azeite de oliva\n" +
                        "• ½ xícara de salsinha\n" +
                        "• 1 xícara de queijo parmesão\n" +
                        "• 2 colheres de sopa de manteiga gelada\n" +
                        "• 10 xícaras de caldo de frango\n" +
                        "• Sal à gosto\n" +
                        "• Pimenta do reino à gosto\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Numa panela com azeite refogue a cebola e acrescente o frango desfiado, deixe refogar por alguns minutos;\n" +
                        "2) Junte o arroz e o caldo de frango aos poucos, conforme for secando acrescente mais caldo, mexendo sempre para desenvolver o amido e deixar o risoto cremoso;\n" +
                        "3) Quando estiver bem cremoso, acrescente o queijo parmesão;\n" +
                        "4) Tire a panela do fogo e finalize com a manteiga; Misture bem e sirva ainda quente;\n" +
                        "5) Sirva com salsinha por cima.\n" +
                        "6) Com as sobras do risoto, aproveite para fazer deliciosos bolinhos de arroz frito, deixe o risoto na geladeira antes e usar para fazer os bolinhos."
                ); break;

            // SALSICHÃO COM BACON
            case "Salsichão com Bacon":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView salsichaoBacon= (ImageView) findViewById(R.id.imagemReceita);
                salsichaoBacon.setImageResource(R.drawable.salsichaobacon);
                modoPreparo.setText(
                        "- Tempo de Preparo: 30 minutos\n" +
                        "- Rendimento: 1 porção\n\n" +
                        "Ingredientes:\n" +
                        "• Salsichão\n" +
                        "• Canudo\n" +
                        "• Queijo mussarela\n" +
                        "• Bacon em fatias\n" +
                        "• Palitos de dentes (para prender)\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Retire as pontas do salsichão.\n" +
                        "2) Em seguida, com o auxílio de um canudo, retire o miolo do salsichão e adicione fatias de queijo mussarela no interior.\n" +
                        "3) Enrole fatias de bacon no salsichão.\n" +
                        "4) Em seguida, prenda as bordas que retirou do salsichão com a ajuda de um palito (aproveite para prender palitos também nas fatias de bacon) e leve ao forno até dourar.\n" +
                        "5) Retire os palitos e sirva"
                ); break;

            // SOPA DE LEGUMES
            case "Sopa de Legumes":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView sopaDeLegumes= (ImageView) findViewById(R.id.imagemReceita);
                sopaDeLegumes.setImageResource(R.drawable.sopalegumes);
                modoPreparo.setText(
                        "- Tempo de Preparo: 50 minutos\n" +
                                "- Rendimento: 6 porções\n\n" +
                                "Ingredientes:\n" +
                                "• Água\n" +
                                "• 1 caldo de galinha\n" +
                                "• 1 cebola\n" +
                                "• 1 dente de alho\n" +
                                "• 2 batatas\n" +
                                "• 2 cenouras\n" +
                                "• Sal\n\n" +
                                "Modo de Preparo:\n" +
                                "1) Coloque um fio de óleo na panela de pressão\n" +
                                "2) Acrescente a cebola e deixe dourar\n" +
                                "3) Coloque o caldo de galinha\n" +
                                "4) Junte as batatas e as cenouras deixe refogar por 3 minutinhos (sempre mexendo para não grudar no fundo da panela)\n" +
                                "5) Adicione o sal e, por último, a água\n\n" +
                                "Obs:\n" +
                                "A água deve ser adicionada até que ultrapasse um pouco mais da metade da panela\n"
                ); break;

            // STROGONOFF DE CARNE
            case "Strogonoff de Carne":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView strogonoffCarne= (ImageView) findViewById(R.id.imagemReceita);
                strogonoffCarne.setImageResource(R.drawable.strogonoffcarne);
                modoPreparo.setText(
                        "- Tempo de Preparo: 1 hora\n" +
                        "- Rendimento: 4 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 1 colher (sopa) de manteiga\n" +
                        "• 1 kg de filé mignon (ou alcatra ou patinho) cortado em tiras finas (emince) temperadas com sal e pimenta a gosto\n" +
                        "• 2 colheres (sopa) de manteiga\n" +
                        "• 1 cebola grande picada\n" +
                        "• 200 g de champignon laminado\n" +
                        "• 1 lata de creme de leite sem soro\n" +
                        "• 5 colheres de (sopa) de catchup\n" +
                        "• 2 colheres (sopa) de mostarda\n" +
                        "• Sal e pimenta do reino a gosto\n" +
                        "• 1 colher (sopa) de farinha de trigo dissolvida em 1 lata e meia de leite " +
                        "(utilize a mesma lata do creme de leite)\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Numa frigideira em fogo médio com manteiga frite aos poucos o filé mignon " +
                        "(ou alcatra ou patinho) cortado em tiras finas temperadas com sal e pimenta " +
                        "a gosto. Reserve.\n" +
                        "2) Numa panela grande com manteiga doure uma cebola grande picada. Assim que " +
                        "dourar acrescente o champignon laminado e a carne (reservada acima). " +
                        "Refogue por mais uns 5 minutos.\n" +
                        "3) Flambe o refogado.\n" +
                        "4) Num recipiente misture o creme de leite sem soro, o catchup, mostarda, " +
                        "sal e pimenta-do-reino a gosto e farinha de trigo dissolvida em uma lata de " +
                        "leite (utilize a mesma lata do creme de leite).\n" +
                        "5) Coloque esta mistura na panela (que está a carne refogada) e cozinhe por mais " +
                        "5 minutos em fogo médio.\n" +
                        "6) Retire do fogo e sirva acompanhado de batata palha, arroz branco e salada de folhas."
                ); break;

            // STROGONOFF DE FRANGO
            case "Strogonoff de Frango":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView strogonoffFrango = (ImageView) findViewById(R.id.imagemReceita);
                strogonoffFrango.setImageResource(R.drawable.strogonofffrango);
                modoPreparo.setText(
                        "- Tempo de Preparo: 1 hora\n" +
                        "- Rendimento: 6 porções\n\n" +
                        "Ingredientes:\n" +
                        "• 4 colheres (sopa) de manteiga\n" +
                        "• 1 kg de filé de frango em tiras finas\n" +
                        "• 1 cebolas picadas\n" +
                        "• 1/2 colher (sopa) de sal\n" +
                        "• 1 pitada de pimenta-do-reino moída\n" +
                        "• 1/2 xícara (chá) de conhaque\n" +
                        "• 200 g de champignons em conserva fatiados\n" +
                        "• 1 lata de molho de tomate (cerca de 300g)\n" +
                        "• 1 colher (sopa) de mostarda\n" +
                        "• 2 colheres (sopa) de catchup\n" +
                        "• 1 lata de Creme de Leite\n\n" +
                        "Modo de Preparo:\n" +
                        "1) Em uma frigideira grande doure a cebola na manteiga, junte o frango, " +
                        "tempere com o sal e a pimenta.\n" +
                        "2) Despeje o conhaque, espere aquecer e incline " +
                        "levemente a frigideira para que o conhaque incendeie.\n" +
                        "3) Aguarde acabar a chama. Junte os champignons, tampe a frigideira e deixe por alguns minutos.\n" +
                        "4) Acrescente o purê de tomate, a mostarda e o catchup, misture bem.\n" +
                        "5) Abaixe o fogo, deixe por cerca de 5 minutos, com a frigideira tampada.\n" +
                        "6) Incorpore delicadamente o creme de leite e retire do fogo antes de ferver.\n" +
                        "7) Sirva com arroz branco e batata palha."
                ); break;

            // STROGONOFF DE FRANGO
            case "Vaca Atolada":
                modoPreparo.setMovementMethod(new ScrollingMovementMethod());
                nomeReceita.setText(receita);
                // Altera a imagem da receita
                ImageView vacaatolada = (ImageView) findViewById(R.id.imagemReceita);
                vacaatolada.setImageResource(R.drawable.vacaatolada);
                modoPreparo.setText(
                        "- Tempo de Preparo: 50 minutos\n" +
                                "- Rendimento: 5 porções\n\n" +
                                "Ingredientes:\n" +
                                "• 1 kg de mandioca descascada e picada\n" +
                                "• 4 tomates\n" +
                                "• 3 cebolas\n" +
                                "• Cheiro verde a vontade\n" +
                                "• 3 tabletes de caldo de costela\n" +
                                "• 1,5 Kg de costela de boi cozida\n" +
                                "• Pimenta do reino a gosto\n" +
                                "• Tempero a gosto\n\n" +
                                "• Modo de Preparo:\n" +
                                "1) Refogue a mandioca e deixe cozinhar.\n" +
                                "2) Quando já estiver macia, acrescente o tomate picado, a cebola, o caldo de costela e deixe cozinhar mais um pouco.\n" +
                                "3) Acrescente a costela de boi, deixe apurar mais um pouco.\n" +
                                "4) Cozinhe por aproximadamente 40 minutos.\n" +
                                "5) Salpique o cheiro verde e a pimenta de sua preferência.\n" +
                                "6) Bom apetite"
                ); break;
            default:
                /*
                TextView naoEncontrou = (TextView) findViewById(R.id.nomeReceitaID);
                TextView textoNaoEncontrou = (TextView) findViewById(R.id.modoDePreparoID);
                naoEncontrou.setText("Nenhuma receita encontrada");
                textoNaoEncontrou.setText(
                        "Ops, parece que faltou algum ingrediente em casa, não é mesmo!?" +
                        "\n\nTente ir a vendinha mais próxima, ou quem sabe ao mercado."
                );
                */
        }

        confirmaReceita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Recipe.this, Home.class));
            }
        });
    }
}
