package ArrayListSort;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBook {

    public static void main(String[] args) {

       List<Book> bookList = new ArrayList<>();
        

        Book book0 = new Book("abc", "xyz", 724276, 45.45);
        Book book1 = new Book("abc", "xyz", 724276, 46.45);
        Book book2 = new Book("abc", "xyz", 724276, 47.45);
        Book book3 = new Book("abc", "xyz", 724276, 49.45);
        Book book4 = new Book("abc", "xyz", 724276, 5.453);
        Book book5 = new Book("abc", "xyz", 724276, 415.45);
        Book book6 = new Book("abc", "xyz", 724276, 445.45);
        Book book7 = new Book("abc", "xyz", 724276, 465.45);
        Book book8 = new Book("abc", "xyz", 724276, 495.45);
        Book book9 = new Book("abc", "xyz", 724276, 455.45);

        bookList.add(book0);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);

        bookList.size();
        System.out.println("bookList = " + bookList);
        bookList.set(1,bookList.get(5));
        System.out.println("bookList.lastIndexOf(bookList.get(1)) = " + bookList.lastIndexOf(bookList.get(1)));
        System.out.println("bookList.remove(bookList.get(3)) = " + bookList.remove(bookList.get(3)));


        for (int i = 0; i <bookList.size() ; i++) {
        for (int j = 0; j < bookList.size()-1 ; j++) {
            if((bookList.get(j).getPrice()) > (bookList.get(j+1).getPrice())){
               Book temp = bookList.get(j);
               bookList.set(j,bookList.get(j+1));
               bookList.set(j+1,temp);
            }
        }
     }
        System.out.println("bookList.isEmpty() = " + bookList.isEmpty());
        System.out.println("bookList = " + bookList);
        System.out.println("bookList.size() = " + bookList.size());


    }
}
