package controladora;
import modelo.*;
import java.util.*;

/**
 * Write a description of class Manejadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Manejadora
{
    Alumno alumno1,alumno2;

    PriorityQueue<Alumno> mane = new PriorityQueue<Alumno>(10, new Comparator<Alumno>() 
            {
                public int compare(Alumno alumno1,Alumno alumno2) {
                    return (alumno1.getAprueba()== alumno2.getAprueba()) ? (Integer.valueOf(alumno1.getEdad()).compareTo(alumno2.getEdad()))
                    : (alumno1.getAprueba() ? -1 : 1);
                }
            });

    public Manejadora()
    {
        //mane=new PriorityQueue<Alumno>();
    }

   
    public PriorityQueue<Alumno> getMane()
    {
        return mane;
    }

    public void ingresarAlumno(String nombre,String rut,int edad,double nota,boolean aprueba)
    {

        mane.add(new Alumno(nombre,rut,edad,nota,aprueba));
    }

    public Alumno buscarPorRut(String rut)
    {
        for(Alumno alu:mane)
        {
            if(alu.getRut().compareToIgnoreCase(rut)==0)
            {
                return alu;
            }
        }
        return null;
    }

    public void eliminarAlumno(String rut)
    {
        Alumno alu=buscarPorRut(rut);
        mane.remove(alu);
    }

   

}
