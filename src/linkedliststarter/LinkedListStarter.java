/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class LinkedListStarter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This is a shared space for you to do some testing  It will also likely be the source of lots of conflicts if you're not careful.
        SinglyLinkedList sli1 = new SinglyLinkedList();
        
        Patients p1 = new Patients(1, "wenxuan", "tan", 1);
        Patients p2 = new Patients(2, "yang", "wu", 2);
        Patients p3 = new Patients(3, "chang", "sun", 3);
        
        sli1.add(p1);
        sli1.add(p2);
        sli1.add(p3);
        
        System.out.println(sli1);
        
    }
    
}
