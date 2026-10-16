
package poo.ejemplo1;

/**
 *
 * @author ESTUDIANTES 2026
 */
public class Inicio {
    public static void main(String[] args) {
//        MiClaseCoche cocheDemo1 = new MiClaseCoche();
          MiClaseCoche cocheDemo1 = new MiClaseCoche("BMW","Black",2500);
//        cocheDemo1.marca="BMW";
//        cocheDemo1.color="Black";
//        cocheDemo1.matricula="ABC123";
//        cocheDemo1.cilindrada=2500;
        System.out.println("Marca: "+cocheDemo1.marca);
        System.out.println("Color: "+cocheDemo1.color);
        System.out.println("Cilindrada: "+cocheDemo1.cilindrada);
        cocheDemo1.dimeSiEsMetalizado();
        
        cocheDemo1.color="Red";
        cocheDemo1.dimeSiEsMetalizado();
        
        
        System.out.println("la matricula actual es: "+cocheDemo1.matricula);
        cocheDemo1.matricularCoche("ZYX789");
        System.out.println("la nueva matricula es: "+cocheDemo1.matricula);

    }
    
}
