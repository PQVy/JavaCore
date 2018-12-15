/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managercontact;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phamq
 */
public class ManagerContact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhoneBook phoneBook = new PhoneBook();
        Scanner in = new Scanner(System.in);
        boolean i = true;
        String name="", phone="";
        do {
            System.out.println("=================");
            System.out.println("Manager Phone");
            System.out.println("1. Insert phone");
            System.out.println("2. Remove phone");
            System.out.println("3. Update phone");
            System.out.println("4. Search phone");
            System.out.println("5. Sort");
            System.out.println("6. Exit");
            System.out.print("Your choice: ");
            String choice = in.nextLine();
            switch (choice) {
                case "1":
                    phoneBook.insertPhone(name, phone);
                    break;
                case "2":
                    phoneBook.removePhone(name);
                    break;
                case "3":
                    phoneBook.updatePhone(name, phone);
                    break;
                case "4":
                    phoneBook.searchPhone(name);
                    break;
                case "5":
                    phoneBook.sort();
                    phoneBook.viewPhoneList();
                    break;
                case "6":
                    i = false;
                    break;
                default:
                    System.out.println("Please choice again!!!");
                    break;
            }
        }
        while (i);
        
        phoneBook.viewPhoneList();
    
//        

//        
//        phoneBook.viewPhoneList();
        
        
        
        
    }
    
}
