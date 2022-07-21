package modelo;

import java.util.Calendar;

public class ProfesorInterino extends Profesor 
{
    private Calendar fechaComienzoInterinidad;

    // Constructores

    public ProfesorInterino (Calendar fechaInicioInterinidad) 
    {
        super();
        fechaComienzoInterinidad = fechaInicioInterinidad;
    }

    public ProfesorInterino (String nombre, String apellidos, int edad, String id, Calendar fechaInicioInterinidad)
    {
        super(nombre, apellidos, edad, id);
        fechaComienzoInterinidad = fechaInicioInterinidad;
    }

    //Método
    public Calendar getFechaComienzoInterinidad () 
    {
        return fechaComienzoInterinidad;
    }


    // Sobreescritura del método
    public String toString () 
    { 
        return super.toString().concat (" Fecha comienzo interinidad: ").concat (fechaComienzoInterinidad.getTime().toString());
    }

    //Método abstracto sobreescrito en esta clase
    public float importeNomina ()
    {
        return 30f * 35.60f ;
    }

}