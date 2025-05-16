/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class Node {
    
    private Patients item = null;
    private Node next = null;
    
    public Node(Patients insert){
        this.item = insert;
    }
    
    public Patients getItem(){
        return this.item;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
   
}
