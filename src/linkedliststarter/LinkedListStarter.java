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
        Patients p4 = new Patients(4, "muchen", "hou", 4);
        
        sli1.add(p1);
        sli1.add(p2);
        sli1.add(p3);
        sli1.add(p4,1);
        
        System.out.println("the index of wenxuan: "+sli1.indexOf(p1));
        System.out.println("the index of wuyang: "+sli1.indexOf(p2));
        System.out.println("the index of sunchang: "+sli1.indexOf(p3));
        System.out.println("the index of muchen: "+sli1.indexOf(p4));
        
        System.out.println("The patient with index of 0: " + sli1.get(0).toString());
        System.out.println("The patient with index of 1: " + sli1.get(1).toString());
        System.out.println("The patient with index of 2: " + sli1.get(2).toString());
        System.out.println("The patient with index of 3: " + sli1.get(3).toString());
                
        if(sli1.remove(2)){
            System.out.println("removed!");
            System.out.println(sli1.toString());
        }else{
            System.out.println("remove failed!");
        }
        
        System.out.println("size of link list: "+sli1.size());
        
        sli1.clear();
        System.out.println(sli1.toString());
        
    }
    
}
