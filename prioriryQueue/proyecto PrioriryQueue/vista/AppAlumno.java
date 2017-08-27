package vista;
import modelo.*;
import controladora.*;
import java.util.*;

public class AppAlumno
{
    public static void main(String []args)
    {
        int op,op2,op3,edad,cant;
        String nombre,rut;
        double nota;
        boolean aprueba;

        Manejadora mane=new Manejadora();
        do{
            System.out.println("Seleccione una opcion");
            System.out.println("1.-Ingresar alumno");
            System.out.println("2.-Buscar alumno");
            System.out.println("3.-Eliminar alumno");
            System.out.println("4.-Ver todos");
            System.out.println("5.-Salir");
            op=Leer.datoInt();

            switch(op) 
            {
                case 1:

                System.out.println("Ingrese nombre del alumno ");
                nombre=Leer.dato();
                System.out.println("Ingrese rut del alumno ");
                rut=Leer.dato();
                System.out.println("Ingrese edad del alumno");
                edad=Leer.datoInt();
                System.out.println("Ingrese nota del alumno");
                nota=Leer.datoDouble();
                System.out.println("Alumno aprueba 1) Si 2)No");
                op2=Leer.datoInt();
                if(op2==1)
                {
                    aprueba = true;
                }
                else
                {
                    aprueba=false;
                }
                mane.ingresarAlumno( nombre,rut,edad,nota,aprueba);

                break;
                case 2:
                System.out.println("Ingrese rut del alumno");
                rut=Leer.dato();
                if(mane.buscarPorRut(rut)!=null)
                {
                    System.out.println("El alumno es : "+mane.buscarPorRut(rut));
                }
                else
                {
                    System.out.println("El alumno no existe ...");
                }
                break;
                case 3:
                System.out.println("Ingrese rut del alumno");
                rut=Leer.dato();
                if(mane.buscarPorRut(rut)!=null)
                {
                    mane.eliminarAlumno(rut);
                    System.out.println("El alumno fue eliminado");
                }
                else
                {
                    System.out.println("El alumno no existe ...");
                }

                break;
                case 4:
                PriorityQueue<Alumno>totalAlumno=mane.getMane();
                System.out.println("Los alumnos son: ");

                Alumno inprAlumno;
                for (Alumno alu:totalAlumno)
                {
                    System.out.println(alu);
                }

                //System.out.print(totalAlumno.toString()+"\n");

                break;
                default:
                System.out.println("");

            }
        }while(op!=5);
        System.out.println("-----------FIN DEL PROGRAMA-----------");

    }
}
