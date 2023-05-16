/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya130423;

/**
 *
 * @author Marsya Missendhi
 */
public abstract class LivingThing { 
    public void breath(){ 
        System.out.println("Living Thing breathing..."); 
    } 
    
     public void eat(){ 
        System.out.println("Living Thing eating..."); 
    } 
     
    /** 
     * abstract method walk 
     * Kita ingin method ini di-overridden oleh subclasses 
     * override = 
     */ 
     public abstract void walk(); 
     }  