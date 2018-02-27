package aytar;

import java.util.ArrayList;
import java.util.Iterator;


public class Book {
    private int id;
    private String title;
    private String author;
    private int pageNumber;
    private int publishYear;
    private String language;
    private String category;
    private int numCopy;
    private static ArrayList<Integer> idList = new ArrayList();

    public Book(int id, String title, String author, int pageNumber, int publishYear, String language, String category, int numCopy) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
        this.publishYear = publishYear;
        this.language = language;
        this.category = category;
        this.numCopy = numCopy;
        idList.add(Integer.valueOf(id));
    }

    public static int getNewId() {
        int max = 0;
        Iterator var2 = idList.iterator();

        while(var2.hasNext()) {
            int id = ((Integer)var2.next()).intValue();
            if(id > max) {
                max = id;
            }
        }

        return max + 1;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumCopy() {
        return this.numCopy;
    }

    public void setNumCopy(int numCopy) {
        this.numCopy = numCopy;
    }

    public String toString() {
        return "Book [id=" + this.id + ", title=" + this.title + ", author=" + this.author + ", pageNumber=" + this.pageNumber + ", publishYear=" + this.publishYear + ", language=" + this.language + ", category=" + this.category + "]";
    }
}
