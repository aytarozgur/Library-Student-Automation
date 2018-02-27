package aytar;

import java.util.Scanner;
import aytar.Book;

public class LibraryInsert {
    public LibraryInsert() {
    }

    public static Book[] method(Book[] bookArr) {
        new Book(1, "on human nature", "edward o. wilson", 285, 2004, "english", "none", 1);
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.print("enter the title of book: ");
        String title = scan.nextLine();
        System.out.print("enter the author of book: ");
        String author = scan.nextLine();
        System.out.print("enter the page number of book: ");
        int pageNumber = scan2.nextInt();
        System.out.print("enter the publish year of book: ");
        int publishYear = scan2.nextInt();
        System.out.print("enter the language of book: ");
        String language = scan.nextLine();
        System.out.print("enter the category of book: ");
        String category = scan.nextLine();
        System.out.print("enter the copy number of book: ");
        int numCopy = scan2.nextInt();
        Book b = new Book(Book.getNewId(), title, author, pageNumber, publishYear, language, category, numCopy);
        Book[] newArr = new Book[bookArr.length + 1];

        for(int i = 0; i < bookArr.length; ++i) {
            newArr[i] = bookArr[i];
        }

        newArr[newArr.length - 1] = b;
        System.out.println("job done");
        return newArr;
    }
}
