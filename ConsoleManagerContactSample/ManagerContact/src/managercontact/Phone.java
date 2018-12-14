/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managercontact;

/**
 *
 * @author phamq
 */
public abstract class Phone {
    abstract void insertPhone(String name, String phone);
    abstract void removePhone (String name);
    abstract void updatePhone(String phone, String newPhone);
    abstract void searchPhone(String name);
    abstract void sort();
}
