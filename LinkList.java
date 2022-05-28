package com.mycompany.linkedlist;


public class LinkList {
    Node list;
    private Node location;
    private Node predloc;
    
    void CreateList(){
//        function to create new list 

        list = null;
    }
    
    void DestroyList(){
//        funciton to destroy all the list

        list = null;
    }
    
    boolean Emptylist(){
//        function to check if the list is empty
        if(list==null) 
            return true;
        else
            return false;
    }
    
    void PrintList(){
//      function to print all the list

        Node ptr = list;
        while(ptr != null){
            System.out.println(ptr.no + "\t" + ptr.name + "\t" + ptr.mark);
            ptr = ptr.next;
        }
    }
  
    void FindElement(int key) {
//        function to search for an element using a given key
        location = list;
        predloc = null;
        while(location != null){
            if (location.no == key) break;
            else
                if(location.no > key) location = null;
                else {
                    predloc = location;
                    location = location.next;
                }
        }
    }
    
    void InsertElement(int key, String name, double mark){  
//      function to insert new node to the list

        Node ptr;
        FindElement(key);
        if(location != null) 
            System.out.println("This Element Is Found");
        else{
            ptr = new Node();
            ptr.no = key;
            ptr.name = name;
            ptr.mark = mark;
            System.out.println("Added Successfully!");
            if (predloc == null){
                ptr.next = list;
                list = ptr;
            }
            else{
                ptr.next = predloc.next;
                predloc.next = ptr;
            }
        }
    }
    
    void DeleteElement(int key){
//      function to delete an element from the list

        FindElement(key);
        if(location == null)
            System.out.println("This Element Is Not Found");
        else {
            if(predloc == null)
                list=location.next;
            else
                predloc.next = location.next;
        }
    }
    
    void RetrieveElement(int key){
//      function to retrieve element from the list

        FindElement(key);
        if(location == null)
            System.out.println("This Element Is Not Found");
        else
            System.out.println(location.no + "\t" + location.name + "\t" + location.mark);
    }
    
    void ModifyElement(int key, String na){
//        function to modify a given element to the list

        FindElement(key);
        if(location == null)
            System.out.println("This Element Is Not Found'");
        else{
            location.name = na;
            System.out.println("Student Edited Successfully!");
        }   

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // example 1 solution
    void OddAndEven(){
        Node tail = list;
        Node ptr = list;
        
        while(tail.next != null)
            tail = tail.next;
        
        if(list.no %2 != 0 && tail.no %2 != 0){
            while(ptr!=null){
                if(ptr.no %2 == 0)
                    ptr.no += 1;
                ptr = ptr.next;
            }
        }
        
        else{
            while(ptr != null){
                if(ptr.no %2 != 0)
                    DeleteElement(ptr.no);
                ptr = ptr.next;
        }
        }
        
    }
            
    // example 2 solution 
    void DeleteEndOrStart(int key){
        Node tail = list;
        
        while(tail.next != null)
            tail = tail.next;
       
        if((list.no + tail.no) >= key)
            DeleteElement(list.no);
        
        else
            DeleteElement(tail.no);
        
    }
  
    // final homework q1
    void movelist(LinkList list1){
        LinkList list2 = new LinkList();
        LinkList list3 = new LinkList();
        int count1 = 0;
        int count2 = 0;
        list2.CreateList();
        list3.CreateList();
        
        Node ptr = list1.list;
        
        while(ptr!=null){
            if(ptr.no >= 0)
                count1++;
            else
                count2++;
            
            ptr = ptr.next;
        }
        
        if(count1 > count2){
            while(ptr!=null){
                list2.InsertElement(ptr.no, ptr.name, ptr.mark);
                ptr = ptr.next;
            }
            list1.DestroyList();
            list2.PrintList();
        }
        else{
            while(ptr!=null){
                list3.InsertElement(ptr.no, ptr.name, ptr.mark);
                ptr = ptr.next;
            }
            list1.DestroyList();
            list3.PrintList();
        }
        
        
    }
    
    void studentcheck(LinkList stdlist){
        Node ptr = stdlist.list;
        while(ptr!=null){
            if(ptr.mark > 3)
                stdlist.DeleteElement(ptr.no);
        }
        
        stdlist.PrintList();
    }

    
    

}