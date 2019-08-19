package com.learn.initialization_cleanup;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Auther: hl
 * @Date: 2019/7/29 10:21
 * @Description:
 */
public class Book {
    boolean checkedOut = false;


    public Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    public void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        System.out.print(checkedOut + "..........");
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
    }

    public static void main(String[] args) {
        Book book = new Book(true);
        book.checkIn();
        //book.finalize();
        int j = 0;
        while (j < 10) {
            new Book(true);
            j++;
        }
//        ArrayList<Book> books = new ArrayList<Book>();
        // while (true) {
        for (int i = 0; i < 10; i++) {
//                books.add(new Book(true));

        }
//        System.out.println(books.toString());
        //Arrays.toString(books);

        // }

    }
}
