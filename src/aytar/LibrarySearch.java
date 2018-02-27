package aytar;

import java.util.Scanner;
import aytar.Book;

public class LibrarySearch {
    public LibrarySearch() {
    }

    public static void method(Book[] bookArr) {
        try {
            Scanner scan = new Scanner(System.in);
            boolean item = false;

            int var12;
            do {
                printMenu();
                var12 = scan.nextInt();
                Scanner scan2;
                String category;
                boolean partial;
                int count;
                Book b;
                int b1;
                int var9;
                Book[] var10;
                if (var12 == 1) {
                    scan2 = new Scanner(System.in);
                    System.out.println("Use * (in the end) for partially matching");
                    System.out.print("search title: ");
                    category = scan2.nextLine();
                    partial = false;
                    if (category.substring(category.length() - 1, category.length()).equals("*")) {
                        if (category.length() - 1 < 3) {
                            System.out.println("The keyword must have 3 characters at least!");
                            continue;
                        }

                        partial = true;
                        category = category.substring(0, category.length() - 1);
                    }

                    count = 0;
                    var10 = bookArr;
                    var9 = bookArr.length;

                    for (b1 = 0; b1 < var9; ++b1) {
                        b = var10[b1];
                        if (partial && b.getTitle().contains(category)) {
                            ++count;
                            System.out.println("(" + count + ") " + b);
                        } else if (!partial && b.getTitle().equals(category)) {
                            ++count;
                            System.out.println("(" + count + ") " + b);
                        }
                    }

                    System.out.println(count + " records found");
                    System.out.print("Do you want to continue for searching (y/n): ");
                    if (!scan2.next().equals("y")) {
                        return;
                    }
                } else if (var12 == 2) {
                    scan2 = new Scanner(System.in);
                    System.out.println("Use * (in the end) for partially matching");
                    System.out.print("search author: ");
                    category = scan2.nextLine();
                    partial = false;
                    if (category.substring(category.length() - 1, category.length()).equals("*")) {
                        if (category.length() - 1 < 3) {
                            System.out.println("The keyword must have 3 characters at least!");
                            continue;
                        }

                        partial = true;
                        category = category.substring(0, category.length() - 1);
                    }

                    count = 0;
                    var10 = bookArr;
                    var9 = bookArr.length;

                    for (b1 = 0; b1 < var9; ++b1) {
                        b = var10[b1];
                        if (partial && b.getTitle().contains(category)) {
                            ++count;
                            System.out.println("(" + count + ") " + b);
                        } else if (!partial && b.getTitle().equals(category)) {
                            ++count;
                            System.out.println("(" + count + ") " + b);
                        }
                    }

                    System.out.println(count + " records found");
                    System.out.print("Do you want to continue for searching (y/n): ");
                    if (!scan2.next().equals("y")) {
                        return;
                    }
                } else {
                    Book[] var11;
                    String var13;
                    int var14;
                    Book var15;
                    int var16;
                    if (var12 == 3) {
                        scan2 = new Scanner(System.in);
                        System.out.print("page number | upper limit: <[number], lower limit: >[number] ");
                        category = scan2.nextLine();
                        var13 = "";
                        if (!category.substring(0, 1).equals("<") && !category.substring(0, 1).equals(">")) {
                            System.out.println("first character must be < or >");
                        } else {
                            var13 = category.substring(0, 1);
                        }

                        count = Integer.valueOf(category.substring(1)).intValue();
                        var14 = 0;
                        var11 = bookArr;
                        var16 = bookArr.length;

                        for (var9 = 0; var9 < var16; ++var9) {
                            var15 = var11[var9];
                            if (var13.equals("<")) {
                                if (var15.getPageNumber() <= count) {
                                    ++var14;
                                    System.out.println("(" + var14 + ") " + var15);
                                }
                            } else if (var13.equals(">") && var15.getPageNumber() >= count) {
                                ++var14;
                                System.out.println("(" + var14 + ") " + var15);
                            }
                        }

                        System.out.println(var14 + " records found");
                        System.out.print("Do you want to continue for searching (y/n): ");
                        if (!scan2.next().equals("y")) {
                            return;
                        }
                    } else if (var12 == 4) {
                        scan2 = new Scanner(System.in);
                        System.out.print("publish year | upper limit: <[number], lower limit: >[number] ");
                        category = scan2.nextLine();
                        var13 = "";
                        if (!category.substring(0, 1).equals("<") && !category.substring(0, 1).equals(">")) {
                            System.out.println("first character must be < or >");
                        } else {
                            var13 = category.substring(0, 1);
                        }

                        count = Integer.valueOf(category.substring(1)).intValue();
                        var14 = 0;
                        var11 = bookArr;
                        var16 = bookArr.length;

                        for (var9 = 0; var9 < var16; ++var9) {
                            var15 = var11[var9];
                            if (var13.equals("<")) {
                                if (var15.getPublishYear() <= count) {
                                    ++var14;
                                    System.out.println("(" + var14 + ") " + var15);
                                }
                            } else if (var13.equals(">") && var15.getPublishYear() >= count) {
                                ++var14;
                                System.out.println("(" + var14 + ") " + var15);
                            }
                        }

                        System.out.println(var14 + " records found");
                        System.out.print("Do you want to continue for searching (y/n): ");
                        if (!scan2.next().equals("y")) {
                            return;
                        }
                    } else if (var12 == 5) {
                        scan2 = new Scanner(System.in);
                        System.out.println("Use * (in the end) for partially matching");
                        System.out.print("search language: ");
                        category = scan2.nextLine();
                        partial = false;
                        if (category.substring(category.length() - 1, category.length()).equals("*")) {
                            if (category.length() - 1 < 3) {
                                System.out.println("The keyword must have 3 characters at least!");
                                continue;
                            }

                            partial = true;
                            category = category.substring(0, category.length() - 1);
                        }

                        count = 0;
                        var10 = bookArr;
                        var9 = bookArr.length;

                        for (b1 = 0; b1 < var9; ++b1) {
                            b = var10[b1];
                            if (partial && b.getLanguage().contains(category)) {
                                ++count;
                                System.out.println("(" + count + ") " + b);
                            } else if (!partial && b.getLanguage().equals(category)) {
                                ++count;
                                System.out.println("(" + count + ") " + b);
                            }
                        }

                        System.out.println(count + " records found");
                        System.out.print("Do you want to continue for searching (y/n): ");
                        if (!scan2.next().equals("y")) {
                            return;
                        }
                    } else if (var12 == 6) {
                        scan2 = new Scanner(System.in);
                        System.out.println("Use * (in the end) for partially matching");
                        System.out.print("search category: ");
                        category = scan2.nextLine();
                        partial = false;
                        if (category.substring(category.length() - 1, category.length()).equals("*")) {
                            if (category.length() - 1 < 3) {
                                System.out.println("The keyword must have 3 characters at least!");
                                continue;
                            }

                            partial = true;
                            category = category.substring(0, category.length() - 1);
                        }

                        count = 0;
                        var10 = bookArr;
                        var9 = bookArr.length;

                        for (b1 = 0; b1 < var9; ++b1) {
                            b = var10[b1];
                            if (partial && b.getCategory().contains(category)) {
                                ++count;
                                System.out.println("(" + count + ") " + b);
                            } else if (!partial && b.getCategory().equals(category)) {
                                ++count;
                                System.out.println("(" + count + ") " + b);
                            }
                        }

                        System.out.println(count + " records found");
                        System.out.print("Do you want to continue for searching (y/n): ");
                        if (!scan2.next().equals("y")) {
                            return;
                        }
                    }
                }
            } while (var12 != 0);

        }
        catch (Exception e) {
            System.out.println("*********** \n" + "Your Library is Empty, Please Insert a Book" + "\n***********" );
        }
    }


    public static void printMenu() {
        System.out.println("===SEARCHING MENU===");
        System.out.println("[1]___by title");
        System.out.println("[2]___by author");
        System.out.println("[3]___by pageNumber");
        System.out.println("[4]___by publishYear");
        System.out.println("[5]___by language");
        System.out.println("[6]___by category");
        System.out.println("[0]___top menu");
        System.out.print("Please choose the one: ");
    }
}