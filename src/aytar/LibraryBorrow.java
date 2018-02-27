package aytar;

import java.util.Scanner;
import aytar.Book;
import aytar.Reader;

public class LibraryBorrow {
    public LibraryBorrow() {
    }

    public static void method(Reader r, Book[] bookArr) {
        Scanner scan = new Scanner(System.in);
        boolean item = false;

        int var12;
        do {
            printMenu();
            var12 = scan.nextInt();
            if(var12 == 1) {
                Scanner scan2 = new Scanner(System.in);
                System.out.print("enter the book id: ");
                int id = scan2.nextInt();
                boolean found = false;
                Book activeBook = null;
                Book[] var11 = bookArr;
                int var10 = bookArr.length;

                for(int var9 = 0; var9 < var10; ++var9) {
                    Book bList = var11[var9];
                    if(bList.getId() == id) {
                        found = true;
                        activeBook = bList;
                        break;
                    }
                }

                if(!found) {
                    System.out.println("this is a wrong id!");
                } else if(activeBook.getNumCopy() == 0) {
                    System.out.println("there is no copy that you can borrow.");
                } else if(r.getNumBorrowing() < 3) {
                    System.out.println(activeBook);
                    System.out.print("Are you sure you want to borrow the above book (y/n): ");
                    if(!scan2.next().equals("y")) {
                        break;
                    }

                    Book[] var13 = r.getBorrowed();
                    var13[r.getNumBorrowing()] = activeBook;
                    r.setBorrowed(var13);
                    r.setNumBorrowing(r.getNumBorrowing() + 1);
                    activeBook.setNumCopy(activeBook.getNumCopy() - 1);
                    System.out.println("job done");
                } else {
                    System.out.println("You can borrow " + 3 + " books at most!");
                }
            } else if(var12 != 2) {
                ;
            }
        } while(var12 != 0);

    }

    public static void printMenu() {
        System.out.println("===BORROWING MENU===");
        System.out.println("[1]___borrow a book");
        System.out.println("[2]___return a book");
        System.out.println("[3]___list the borrowed items");
        System.out.println("[0]___top menu");
        System.out.print("Please choose the one: ");
    }
}
