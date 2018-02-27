package aytar;

        import java.util.Scanner;
//        import aytar.Book;
//        import aytar.LibraryBorrow;
//        import aytar.LibraryInsert;
//        import aytar.LibraryRemove;
//        import aytar.LibrarySearch;
//        import aytar.Reader;

public class Console {
    public Console() {
    }

    public static void main(String[] args) {
        Book b1 = new Book(1, "on human nature", "edward o. wilson", 285, 2004, "english", "none", 1);
        Book b2 = new Book(2, "dada", "rudolf kuenzli", 204, 2015, "english", "art", 2);
        Book b3 = new Book(3, "meryl streep: anatomy of an actor", "karina longworth longworth", 192, 2014, "english", "cinema", 1);
        Book[] bookArr = new Book[]{b1, b2, b3};
        Reader r1 = new Reader(1, "Deena Zeller", "physics", 1991, "dzeller", "abc");
        Reader r2 = new Reader(2, "Rachal Santi", "literature", 1995, "rsanti", "123");
        Reader r3 = new Reader(3, "Britt Wall", "geology", 1989, "bwall", "www");
        Reader[] readerArr = new Reader[]{r1, r2, r3};
        System.out.println("*************************");
        System.out.println("LIBRARY MANAGEMENT SYSTEM");
        System.out.println("*************************");
        Scanner scan = new Scanner(System.in);
//        boolean item = false;
//        boolean item1 = false;
//        boolean item2 = false;
//        boolean item3 = false;

        int var23;
        do {
            Reader activeReader = null;
            printMainMenu();
            var23 = scan.nextInt();
            int var24;
            if(var23 == 1) {
                do {
                    printOperatorMenu();
                    var24 = scan.nextInt();
                    if(var24 == 1) {
                        bookArr = LibraryInsert.method(bookArr);
                    } else if(var24 == 2) {
                        bookArr = LibraryRemove.method(bookArr);
                    }
                } while(var24 != 0);
            } else {
                int var25;
                if(var23 == 2) {
                    do {
                        if(activeReader == null) {
                            int loginCount = 0;

                            do {
                                Scanner scan2 = new Scanner(System.in);
                                System.out.print("username: ");
                                String username = scan2.nextLine();
                                System.out.print("password: ");
                                String password = scan2.nextLine();
                                Reader[] var22 = readerArr;
                                int var21 = readerArr.length;

                                for(int var20 = 0; var20 < var21; ++var20) {
                                    Reader r = var22[var20];
                                    if(r.getUsername().equals(username) && r.getPassword().equals(password)) {
                                        System.out.println("You have logged in successfully.");
                                        System.out.println(r.getFullName() + ", Welcome!");
                                        activeReader = r;
                                        break;
                                    }
                                }

                                if(activeReader == null) {
                                    System.out.println("The username or password is incorrect.");
                                }

                                ++loginCount;
                                if(loginCount == 3) {
                                    System.out.println("You typed in the wrong password three times!");
                                    return ;
//                                    break;
                                }
                            } while(activeReader == null);
                        }

                        printReaderMenu();
                        var25 = scan.nextInt();
                        if(var25 == 1) {
                            LibrarySearch.method(bookArr);
                        } else if(var25 == 2) {
                            LibraryBorrow.method(activeReader, bookArr);
                        } else if(var25 == 3) {
                            activeReader = null;
                            break;
                        }
                    } while(var25 != 0);
                }
            }
        } while(var23 != 0);

    }

    public static void printMainMenu() {
        System.out.println("===MAIN MENU===");
        System.out.println("[1]___operator menu");
        System.out.println("[2]___reader menu");
        System.out.println("[0]___exit");
        System.out.print("Please choose the one: ");
    }

    public static void printOperatorMenu() {
        System.out.println("===OPERATOR MENU===");
        System.out.println("[1]___insert a book");
        System.out.println("[2]___remove all books");
        System.out.println("[0]___main menu");
        System.out.print("Please choose the one: ");
    }

    public static void printReaderMenu() {
        System.out.println("===READER MENU===");
        System.out.println("[1]___searching menu");
        System.out.println("[2]___borrowing menu");
        System.out.println("[3]___log out");
        System.out.println("[0]___main menu");
        System.out.print("Please choose the one: ");
    }
}
