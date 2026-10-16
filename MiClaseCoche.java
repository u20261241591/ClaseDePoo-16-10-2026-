/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.ejemplo1;

/**
 *
 * @author ESTUDIANTES 2026
 */
public class MiClaseCoche {
    //ATRIBUTOS
    String marca;
    String color;
    String matricula;
    int cilindrada;
    //CONSTRUCTOR
    public MiClaseCoche(String ma, String co, int cil){
        marca=ma;
        color=co;
        cilindrada=cil;
    }
    //METODOS
    void dimeSiEsMetalizado(){
        if (color.equals("Black")){
            System.out.println("Es metalizado");
        }else{
            System.out.println("No es metalizado");
        }
    }
    
    void matricularCoche (String matriculaAPoner){
        matricula=matriculaAPoner;
    }
}
