/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managercontact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author phamq
 */
public class PhoneBook extends Phone implements Comparable<PhoneBook>{
    private String name;
    private String phone;
    ArrayList<PhoneBook> phoneList = new ArrayList<>(); 
    Scanner in = new Scanner(System.in);
    
    public void viewPhoneList(){
        for (PhoneBook phoneBook : this.phoneList) {
            System.out.println(phoneBook.toString());
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //overloading
    public PhoneBook(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    
    public PhoneBook(){
        
    }
    
    @Override
    public String toString(){
        return this.name +", "+ this.phone;
    }
   
    @Override
    void insertPhone(String name, String phone) {
        System.out.print("Input Name: ");
        name = in.nextLine();
        System.out.print("Input Phone: ");
        phone = in.nextLine();
        PhoneBook phoneBook = new PhoneBook(name, phone);
        if (phoneList.size() == 0) {
            phoneList.add(phoneBook);
        } else {
            System.out.println(phoneList.size());
            for (int i = 0; i<phoneList.size(); i++) {
                if (!phoneList.get(i).getName().equals(name)){
                    phoneList.add(phoneBook);
                    break;
                } else if (phoneList.get(i).getName().equals(name) && !phoneList.get(i).getPhone().equals(phone)) {
                    
                    phoneList.get(i).setPhone(phoneList.get(i).getPhone() +" : "+phone);
                    break;
                } else if (phoneList.get(i).getName().equals(name) && phoneList.get(i).getPhone().equals(phone)){
                    System.out.println("Duplication phone");
                    break;
                }
            }
        }
    }

    @Override
    void removePhone(String name) {
        ArrayList<PhoneBook> phoneListRemove = new ArrayList<>();
        System.out.print("Input Phone Name need remove: ");
        name = in.nextLine();
        if (phoneList.size()==0){
            System.out.println("Phone Book is emty");
        } else {
            for (PhoneBook phoneBook2 : phoneList) {
                if(phoneBook2.getName().equals(name)){
                    phoneListRemove.add(phoneBook2);
                    break;
                }
            }
            phoneList.removeAll(phoneListRemove);
            System.out.println("Success!!!");
        }
    }

    @Override
    void updatePhone(String phone, String newPhone) {
        System.out.print("Input Name need update Phone: ");
        name = in.nextLine();
        System.out.print("Input New Phone: ");
        newPhone = in.nextLine();
        if (phoneList.size()==0){
            System.out.println("Phone Book is emty");
        } else {
            for (PhoneBook phoneBook2 : phoneList) {
               if(phoneBook2.getName().equals(name)){
                   phoneBook2.setPhone(newPhone);
                   break;
               }
            }
            System.out.println("Success!!!");
        }
    }

    @Override
    void searchPhone(String name) {
        System.out.print("Input Name need Search: ");
        name = in.nextLine();
        if (phoneList.size()==0){
            System.out.println("Phone Book is emty");
        } else {
            for (PhoneBook phoneBook2 : phoneList) {
               if(phoneBook2.getName().equals(name)){
                   System.out.println(phoneBook2.toString());
                   break;
               }
            }
        }
    }

    @Override
    void sort() {
        Collections.sort(phoneList);
    }

    @Override
    public int compareTo(PhoneBook phoneBook) {
        return this.getName().compareTo(phoneBook.getName());
    }

}
