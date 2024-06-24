/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.util.ArrayList;

public class ManageUser {

    private ArrayList<User> listUser = new ArrayList<>();

    public ManageUser() {

    }

    public ArrayList<User> getListUser() {
        return listUser;
    }

    public void setListUser(ArrayList<User> listUser) {
        this.listUser = listUser;
    }

    public void addUser(User o) {
        listUser.add(o);
    }

    public void deleteUser(User o) {
        listUser.remove(o);
    }

    public boolean searchUsername(String username) {
        for (User user : listUser) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public boolean searchPassword(String password) {
        for (User user : listUser) {
            if (user.getPassword().equals(password)) {
                return false;
            }
        }
        return true;
    }
}
