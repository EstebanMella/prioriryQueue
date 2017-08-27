package modelo;


/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
   private String nombre,rut;
    private int edad;
    private double nota;
    boolean aprueba;
    public Alumno()
    {}
    
    public Alumno(String nombre,String rut,int edad,double nota,boolean aprueba)
    {
      this.nombre=nombre;
      this.rut=rut;
      this.edad=edad;
      this.nota=nota;
      this.aprueba=aprueba;
    }
    
    public boolean getAprueba()
    {
      return aprueba;
    }
    public void setAprueba(boolean aprueba)
    {
      this.aprueba=aprueba;
    }
    
    public String getNombre()
    {
      return nombre;
    }
    public void setNombre(String nombre)
    {
      this.nombre=nombre;
    }
    public String getRut()
    {
      return rut;
    }
    public void setRut(String rut)
    {
      this.rut=rut;
    }
    public int getEdad()
    {
      return edad;
    }
    public void setEdad(int edad)
    {
      this.edad=edad;
    }
    public double getNota()
    {
      return nota;
    }
    public void setNota(double nota)
    {
      this.nota=nota;
    }
    
    public String toString()
    {
       return " El nombre del alumno es :"+getNombre()+ 
              " El rut del alumno es   : "+getRut()+
              " La edad del alumno es  :"+ getEdad()+
              " La nota del alumno es  : "+getNota()+
              " El Alumno Aprueba  : "+getAprueba();
    }
}
