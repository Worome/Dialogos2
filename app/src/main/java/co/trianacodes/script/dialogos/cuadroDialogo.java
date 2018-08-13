package co.trianacodes.script.dialogos;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class cuadroDialogo extends DialogFragment {

    /* La siguiente definición de la interfaz es por si se quiere pasar algún parámetro desde el
        fragment a la actividad desde la que se le llama. */
    public interface devuelveDato{

        void FinalizaCuadroDialogo(String texto);

    }

    // El constructor que creo es obligatorio para los DialogFragment
    public cuadroDialogo(){

    }

    /*En los fragments siempre es necesario sobreescribir el método onCreateView*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        // Creo una vista en la que voy a inflar el xml del cuadro personalizado
        View view = inflater.inflate(R.layout.dialogo, container);
        TextView mensaje = view.findViewById(R.id.textView2);
        Button boton = view.findViewById(R.id.button2);
        getDialog().setTitle("Nuevo título");
        mensaje.setText("Este es un Nuevo mensaje de aviso para probar que \n el cuadro de diálogo funciona perfectamente");
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cierraDialogo();

            }

        });

        return view;

    }


    /* Estas líneas son para definir un cuadro de diálogo stándard de Android sin personalizar:
    @Override

    public Dialog onCReateDialog(Bundle savedInstanceState){

        AlertDialog.Builder cuadro = new AlertDialog.Builder(getActivity());
        cuadro.setTitle("Aviso")
                .setMessage("Mensaje de aviso")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        return cuadro.create();

    }*/

    public void cierraDialogo(){

        // Cierro el cuadro de diálogo
        this.dismiss();

    }

}
