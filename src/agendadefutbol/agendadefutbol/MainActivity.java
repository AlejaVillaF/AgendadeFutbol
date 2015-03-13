package agendadefutbol.agendadefutbol;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity implements Button.OnClickListener {

    private ImageView fondo;
    private Button equipos, partidos, estadios, premios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fondo= (ImageView)findViewById(R.id.fondo);
        equipos=(Button)findViewById(R.id.equipos);
        equipos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               fondo.setImageResource(R.drawable.equipos);
            }
        });
        partidos=(Button) findViewById(R.id.partidos);
        partidos.setOnClickListener(this);
        estadios=(Button)findViewById(R.id.estadios);
        estadios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fondo.setImageResource(R.drawable.estadios);
            }
        });
        premios=(Button)findViewById(R.id.premios);
        premios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fondo.setImageResource(R.drawable.premios);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void btninicio(View view){
        fondo.setImageResource(R.drawable.inicio);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        fondo.setImageResource(R.drawable.partidos);
    }
}
