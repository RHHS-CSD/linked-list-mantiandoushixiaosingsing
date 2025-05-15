/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class Patients implements Comparable{
    private int number;
    private String firstName;
    private String lastName;
    private int priority;
    
    
    public Patients(){
        this.number = 0;
        this.firstName = null;
        this.lastName = null;
        this.priority = 0;
    }
    
    
    public Patients(int number, String firstName, String lastName, int priority){
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.priority = priority;
    }
    
    @Override
    public String toString(){
        return null;
    }
    
    @Override
    public boolean equals(Object o){
        //anything not of type Patients is false
        if (! (o instanceof Patients))
            return false;
        //add code to properly compare
        
        return true;
        
    }

    @Override
    public int compareTo(Object o) {
        
        return 0;
    }
}
