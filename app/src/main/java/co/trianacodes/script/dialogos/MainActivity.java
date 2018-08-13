package co.trianacodes.script.dialogos;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void llamaDialogo(View v){

        //Creo un objeto de la clase en la que defino el cuadro de diálogo
        cuadroDialogo dialogoPersonalizado = new cuadroDialogo();
        /*Muestro el cuadro de diálogo pasándo como parámetros el manejador de fragmentos y una
        etiqueta que se va a suar para locarlizar el cuadro de diálogo para hacer tareas con el
        cuadro de diálogo.*/
        dialogoPersonalizado.show(getSupportFragmentManager(), "personalizado");
        // Creo un objeto de tipo Fragment para almacenar en él el cuadro de diálogo
        Fragment fragmento = getSupportFragmentManager().findFragmentByTag("personalizado");

        // Borro el cuadro de diálogo si no se está mostrando
        if (fragmento != null){

            getSupportFragmentManager().beginTransaction().remove(fragmento).commit();

        }

    }

}
