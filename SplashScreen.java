package ifridge.ifridge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

    // Duração do tempo de espera da tela splash
    private final int SPLASH_DISPLAY_LENGTH = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Handler pra startar a splashscreen e depois de alguns segundos fechá-la
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                // Intent que chama a tela inicial
                Intent telaInicial = new Intent(SplashScreen.this, Home.class);

                SplashScreen.this.startActivity(telaInicial);
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}
