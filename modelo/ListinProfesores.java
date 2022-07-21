package modelo;

import java.util.ArrayList; import java.util.Iterator;

public class ListinProfesores
{
    //Campo de la clase 
    private ArrayList <Profesor> listinProfesores;

    //Constructor
    public ListinProfesores ()
    {  
        listinProfesores = new ArrayList <Profesor> ();
    } 

    //Método
    public void addProfesor (Profesor profesor)
    {  
        listinProfesores.add(profesor); 
    } 

    //Método
    public void imprimirListin()
    {   
        //String temporal que usamos como auxiliar
        String tmpStr1 = ""; 
        System.out.println ("Se procede a mostrar los datos de los profesores existentes en el listín \n");

        for (Profesor tmp: listinProfesores)
        {          
            System.out.println (tmp.toString () );

            if (tmp instanceof ProfesorInterino)
            {
                tmpStr1 = "Interino";
            } 
            else 
            {
                tmpStr1 = "Titular";
            }
            System.out.println("-Tipo de este profesor:"+tmpStr1+" -Nómina de este profesor: "+(tmp.importeNomina())+ "\n");
        }

    }

    public float importeTotalNominaProfesorado() 
    {
        //Variable temporal que usamos como auxiliar
        float importeTotal = 0f;
        Iterator<Profesor> it = listinProfesores.iterator();

        while (it.hasNext())
        { 
            importeTotal = importeTotal + it.next().importeNomina();
        }

        return importeTotal;         
    }
    
} 
