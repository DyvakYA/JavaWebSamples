/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.training.def;

/**
 *
 * @author Денис
 */
public interface Car {
    default int getSpeed(){
        move();
        return 60;
    }
    
    void move();
}
