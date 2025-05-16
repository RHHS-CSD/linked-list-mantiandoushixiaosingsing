/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class SinglyLinkedList implements ILinkedList{
    private Node head;
    private Node tail;
    private int size;

    /**
     * Return the size of the Linked List
     * @return an int representing the size
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Reset / Empty the LinkedList
     */
    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
                
    }

    /**
     * Remove the first instance of item from the linked list
     * @param item The item to be removed
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(Patients item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Remove the item from the particular index
     * @param index The index of the item to remove
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Returns the first found index of the given item
     * @param item The item to find
     * @return The index of the found item, or -1
     */
    @Override
    public int indexOf(Patients item) {
        Node current = head; 
        int i = 0;
        
        while(current != null){
            if(current.getItem().equals(item)){
                return i;
            }
            current = current.getNext();
            i++;
        }
        return -1;
    }

    /**
     * Retrieves the Patients at the given index
     * @param index The index to be retrieved
     * @return The data item, null if bad index
     */
    @Override
    public Patients get(int index) {
        Node current = head;
        
        if(index<0 || index>=size){
            return null;
        }
        for(int i=0;i<index;i++){
            current = current.getNext();
        }
        
        return current.getItem();
    }

    /**
     * Add the gen item to the end of the linked list
     * @param item Item to add
     * @return true if successfuuly added, false otherwise
     */
    @Override
    public boolean add(int number, String firstName, String lastName, int priority) {
        Patients newPatient = new Patients(number,firstName,lastName,priority);
        Node newNode = new Node(newPatient);
        
        if(head!=null){
            tail.setNext(newNode);
            tail = newNode;
        }else{
            head = newNode;
            tail = newNode;
        }
        
        size++;
        
        return true;
        
    }

    /**
     * Add the gen item to  the linked list at the given position
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfuuly added, false otherwise
     */
    @Override
    public boolean add(int number, String firstName, String lastName, int priority, int index) {
        if(index<0 || index>size) {
            return false;
        }
        
        Patients newPatient = new Patients(number,firstName,lastName,priority);
        Node newNode = new Node(newPatient);
        
        //adding @ beginning
        if(index==0){
            newNode.setNext(head);
            head = newNode;
            if(tail==null){//empty list
                tail=newNode;
            }
        //adding @ end
        }else if(index==size){
            tail.setNext(newNode);
            tail = newNode;
        }else{
            Node current = head;
            for(int i=0;i<index-1;i++){
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            
        }
        
        size++;
        
        return true;
    }
    
    
}
