/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.curs2.ssatr.ia;

/**
 *
 * @author andreig
 */
public class OttoClass extends Car { //clasa derivata  

    
    public OttoClass(String name, int speed) {
        super(name, speed); //apelare constructor din calsa de baza
    }
    
    void accelerate(){ //suprascriere metoda
        speed+=3;
        System.out.println("OttoCar car speed is "+speed);
    }
    
}