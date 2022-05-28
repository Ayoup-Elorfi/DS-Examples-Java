package com.mycompany.linkedlist;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkList list1 = new LinkList();
        int choice, number;
        String name;
        double mark;
        
        list1.CreateList();
        
        while(true){
            
            displayMenu();
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter number: ");
                    number = sc.nextInt();
                    System.out.println("Name = ");
                    name = sc.next(); 
                    System.out.println("Mark = "); 
                    mark = sc.nextDouble();
                    list1.InsertElement(number, name, mark);
                    break;
                    
                case 2:
                    if(list1.Emptylist()==true)
                        System.out.println("The list is empty!");
                    else{
                        System.out.println("Enter number: ");
                        number = sc.nextInt();
                        list1.RetrieveElement(number);
                    }
                    break;
                    
                case 3:
                    if(list1.Emptylist()==true)
                        System.out.println("The list is empty!");
                    else{
                        System.out.println("Enter number: ");
                        number = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Modified Name: ");
                        name = sc.nextLine(); 
                        list1.ModifyElement(number, name);
                        }
                    break;
                    
                case 4:
                    if(list1.Emptylist()==true)
                        System.out.println("The list is empty!");
                    else{
                        System.out.println("Enter number: ");
                        number = sc.nextInt();
                        list1.DeleteElement(number);
                    }
                    break;
                    
                case 5: 
                    if(list1.Emptylist()==true)
                        System.out.println("The list is empty");
                    else
                        list1.PrintList();
                        
                    break;
                    
                case 6:
                    System.out.println("Good Bye!");
                    System.exit(0);
                    
                case 7:
                    list1.movelist(list1);
                    break;
                    
                default: 
                    System.out.println("Invalid choice. Try again!");
            }
            
    }
    }
    
    public static void displayMenu(){
        System.out.println();
        System.out.println("1. Insert Element");
        System.out.println("2. Retrieve Element");
        System.out.println("3. Modify Element");
        System.out.println("4. Delete Element");
        System.out.println("5. Print List");
        System.out.println("6. Exi");
        System.out.println("Your choice: ");
    }
}

