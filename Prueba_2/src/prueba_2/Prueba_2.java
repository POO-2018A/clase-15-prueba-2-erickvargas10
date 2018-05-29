
package prueba_2;
import java.util.Scanner;
public class Prueba_2 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
 
    int numEstudiantes=5;
    int numMaterias=2;
         Estudiante listaEstudiante[]=new Estudiante[numEstudiantes];
         Materias listaMaterias[]=new Materias[numMaterias];
    
  System.out.println("Lista de estudiantes");
    
  System.out.println("INGRESE LA SIGUIENTE IN FORMACION DE 5 ESTUDIANTES");
  
       
   for(int i=0; i<listaEstudiante.length; i++){
   System.out.println("Ingrese el nombre del estudiante : "+ (i+1));
   scan.nextLine();
   String nombre=scan.nextLine();
   System.out.println("Ingrese la edad del estudiante : ");
   int edad=scan.nextInt();
   System.out.println("Ingrese las 2 materias que toma el estudiante : ");
      
        for(int j=0; j<numMaterias; j++){
        scan.nextLine();
        System.out.print("M"+(j+1)+" : ");
        String nombreMateria=scan.nextLine();
        }
        
      System.out.println("Ingrese el nivel en el que se encuentra del estudiante : ");
       int nivel=scan.nextInt();
       
       System.out.println(" se ha ingresado el estudiante con los siguientes datos :");
       Estudiante estudiante =new Estudiante(nombre,edad,materias);
       System.out.println(estudiante);  
   }
   
   }
    
   }

  