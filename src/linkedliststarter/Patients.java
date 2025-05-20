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
        return this.number + ": " + this.firstName + " " + this.lastName + ", priority " + this.priority;
    }
    
    @Override
    public boolean equals(Object o){
        //anything not of type Patients is false
        if (! (o instanceof Patients))
            return false;
        
        Patients other = (Patients) o;
        return this.priority == other.priority && this.number == other.number && this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
        
    }

    @Override
    public int compareTo(Object o) {
        Patients other = (Patients) o;
        
        if (this.priority > other.priority){
            return -1;
        }
        else if (this.priority < other.priority){
            return 1;
        }
        
        int lastNameCompare = this.lastName.compareTo(other.lastName);
        if (lastNameCompare != 0){
            return lastNameCompare > 0 ? 1 : -1;
        }

        
        int firstNameCompare = this.firstName.compareTo(other.firstName);
        if (firstNameCompare != 0){
            return firstNameCompare > 0 ? 1 : -1;
        }

        
        if (this.number > other.number){
            return 1;
        }
        else if (this.number < other.number){
            return -1;
        }

        return 0;
    }
}
