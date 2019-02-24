

/**
 *
 * @author Luis Carlos Hatum Clavijo
 */
public class Concurso {
     public char nombre;
     private int nproblemas;
     private int nquipos;
     
     
     Concurso(char nombre, int nproblemas){
         this.nombre=nombre;
         this.nproblemas=nproblemas;
     }
     
     Concurso(char nombre,int nproblemas,int nequipos){
         
         nproblemas=5;
         this.nombre=nombre;
         this.nquipos=nequipos;
     
     
    
}
     
  
    public void anadirequipo(char nom,int pro,int equi){
         
         
     }
     
      public boolean eliminarequipo(char nombre)
    {
        boolean eliminar = false;
        if(nombre == this.nombre)
        {
            eliminar= true;
        }
        else
        {
            eliminar = false;
        }
        return eliminar;
    }
         
  }

