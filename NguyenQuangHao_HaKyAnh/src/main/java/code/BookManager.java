/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<Book> bookList = new ArrayList<>();

    public BookManager() {
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public boolean addBookItem(Book foI) {
        for (Book fi : bookList) {
            if (fi.getBookId().equalsIgnoreCase(foI.getBookId())) {
                return false;
            }
        }
        return true;
    }

    public boolean editBookItem(Book foI) {
        for (Book fi : bookList) {
            if (fi.getBookId().equalsIgnoreCase(foI.getBookId())) {
                return true;
            }
        }
        return false;
    }

    public boolean deleteBookItem(Book foI) {
        for (Book fi : bookList) {
            if (fi.getBookId().equalsIgnoreCase(foI.getBookId())) {
                return true;
            }
        }
        return false;
    }

    public Book findBookItemById(String id) {
        for (Book fi : bookList) {
            if (fi.getBookId().equalsIgnoreCase(id)) {
                return fi;
            }
        }
        return null;
    }

    public Book findBookItemByName(String name) {
        for (Book fi : bookList) {
            if (fi.getBookName().equalsIgnoreCase(name)) {
                return fi;
            }
        }
        return null;
    }


}
