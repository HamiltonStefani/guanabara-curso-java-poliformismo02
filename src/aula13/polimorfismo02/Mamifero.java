/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13.polimorfismo02;

/**
 *
 * @author hamil
 */
public class Mamifero extends Animal {
    protected String corPelo;
    @Override
    public void emitirSom() {
        System.out.println("Som de mamidero"); 
    }
    
}
