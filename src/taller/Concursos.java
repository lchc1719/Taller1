package taller;


import java.util.ArrayList;
import java.util.Scanner;



/*
 * @author Luis Carlos Hatum Clavijo
 */

public class Concursos {
    
Scanner lectura = new Scanner(System.in);
     public char nombreconcurso;
     private int nproblemas;
     private int nquipos;
      String[] nomequi = new String[4];
       ArrayList<String> nombres = new ArrayList();
      int i = 0;

    public char getNombre() {
        return nombreconcurso;
    }

    public void setNombre(char nombre) {
        this.nombreconcurso = nombre;
    }

    public int getNproblemas() {
        return nproblemas;
    }

    public void setNproblemas(int nproblemas) {
        this.nproblemas = nproblemas;
    }

    public int getNquipos() {
        return nquipos;
    }

    public void setNquipos(int nquipos) {
        this.nquipos = nquipos;
    }
     
     
     
     Concursos(char nombre, int nproblemas){
         this.nombreconcurso=nombre;
         this.nproblemas=nproblemas;
     }
      Concursos(){
         
     }
     
     Concursos(char nombre,int nproblemas,int nequipos){
         
         nproblemas=5;
         this.nombreconcurso=nombre;
         this.nquipos=nequipos;
     
     
    
}
     
     public void llamada(){

            
                System.out.println("Ingrese el nombre del equipo");
                    
     }
      public void repetidos(String p){
          String color = p;


 
 for (int x = 0; i < nombres.size(); x++) {
     
 if(nombres.get(x).equals(color)){
 System.out.println("El nombre del  "+color+" esta repetido!");
 }
 nombres.add(p);
 }
      }
       public void anadirequipo(){

           
            String n;
        
            System.out.println("Introduce el nombre del equipo: ");
            n = lectura.next();
            nombres.add(n);
            
               
        }
               /* System.out.println("Ingrese el nombre del equipo");
    
                    //int i =0;
                    nomequi[i]=lectura.next();
                    i++;
           
		}*/
       
        public void verequipo(){

          
            for(int j = 0;j<nombres.size();j++){
            System.out.println("Equipo: " + "[" + j + "] = "+nombres.get(j));
}
     }
       public boolean eliminarequipo() {
        boolean eliminar = false;
        for(int j = 0; j<nombres.size(); j++){
                System.out.println("Ingrese el nombre del equipo a eliminar");
        if(nombres.size() == this.nombreconcurso)
        {
            eliminar= true;
            System.out.println("El equipo a sido eliminado con exito");
        }
        else{
                eliminar = false;
                    System.out.println("el equipo no fue encontrado");
            }
        }
        return eliminar;
    }
       }
       
       
         


     
      

   
  



