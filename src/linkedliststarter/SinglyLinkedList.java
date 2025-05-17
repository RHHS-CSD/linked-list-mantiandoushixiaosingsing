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
        this.size = 0;
        Node current = head;
        while(current != null){
            this.size++;
            current = current.getNext();
        }
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
        if (head == null){
            return false;
        }
        
        if (head.getItem().equals(item)){
            head = head.getNext();
            if (head == null){
                tail = null;
            }
            return true;
        }
        
        Node current = head;
        while(current.getNext() != null){
            if (current.getNext().getItem().equals(item)){
                current.setNext(current.getNext().getNext());
                if (current.getNext() == null){
                    tail = current;
                }
                size--;
                return true;
            }
            current = current.getNext();
        }
        return false;
        
    }


    /**
     * Remove the item from the particular index
     * @param index The index of the item to remove
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= size || head == null){
            return false;
        }
        
        if (index == 0){
            head = head.getNext();
            if (head == null){
                tail = null;
            }
            size--;
            return true;
        }
        
        Node current = head;
        for (int i = 0; i < index - 1; i++){
            if (current.getNext() == null){
                return false;
            }
            current = current.getNext();
        }
        
        if (current.getNext() == null){
            return false;
        }
        
        current.setNext(current.getNext().getNext());
        if (current.getNext() == null){
            tail = current;
        }
        size--;
        return true;
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
     * @return true if successfully added, false otherwise
     */
    @Override
    public boolean add(Patients item) {
        if (item == null){
            return false;
        }
        
        Node newNode = new Node (item);
        
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }
        
        size++;
        return true;
        
    }

    /**
     * Add the gen item to  the linked list at the given position
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfully added, false otherwise
     */
    @Override
    public boolean add(Patients item, int index) {
        if (item == null || index < 0 || index > size){
            return false;
        }
        
        Node newNode = new Node (item);
        
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else if (index == 0){
            newNode.setNext(head);
            head = newNode;
        }
        else if (index == size){
            tail.setNext(newNode);
            tail = newNode;
        }
        else{
            Node current = head;
            for (int i = 0; i < index - 1; i++){
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
                   
        }
        size++;
        return true;
    }
    
    
}
