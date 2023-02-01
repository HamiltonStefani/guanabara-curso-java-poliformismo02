/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13.polimorfismo02;

/**
 *
 * @author hamil
 */
public class Aula13Polimorfismo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Programa principal
        Cachorro c = new Cachorro();
        c.reagir("Olá");
        c.reagir("Vai Apanhar");
        c.reagir(11,45);
        c.reagir(19,00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        
    }
    
}
