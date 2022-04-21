package com.company;
class library{
    String[] books;
    int no_of_books;
     library() {   // constructor ofr the class
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added");
    }
    void ShowAvailableBook(){
        System.out.println("The Available books are : ");
        for (String bookList:books) {
            if (bookList == null){  // with out this condition we will get null pointer exception
                continue;
            }
            System.out.println("* "+bookList);
        }
    }
    void issueBook(String book){
         for (int i=0; i<this.books.length; i++){
             if (this.books[i].equals(book)){
                 System.out.println("This book has been issued");
                 this.books[i]=null;
                 return;
             }
         }
        System.out.println("The book does not exist");
    }
    void returnBook(String book){
         addBook(book);
    }
}
public class practice_60 {
    public static void main(String[] args) {
        library lbr = new library();
        lbr.addBook("Gitanjali");
        lbr.addBook("Mahabharata");  // adding book by using add book method
        lbr.addBook("Bybel");

        lbr.ShowAvailableBook();  // showing the available list of book

        lbr.issueBook("Gitanjali");  // issues the book to customer
        lbr.ShowAvailableBook();

        lbr.returnBook("Gitanjali");  // return the book from customer
        lbr.ShowAvailableBook();
    }
}
