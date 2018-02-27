package aytar;


import aytar.Book;

public class Reader {
    public static final int limitBorrowing = 3;
    private int id;
    private String fullName;
    private String department;
    private int birthYear;
    private String username;
    private String password;
    private int numBorrowing;
    private Book[] borrowed;

    public Reader(int id, String fullName, String department, int birthYear, String username, String password) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.birthYear = birthYear;
        this.username = username;
        this.password = password;
        this.numBorrowing = 0;
        this.borrowed = new Book[3];
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Book[] getBorrowed() {
        return this.borrowed;
    }

    public void setBorrowed(Book[] borrowed) {
        this.borrowed = borrowed;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumBorrowing() {
        return this.numBorrowing;
    }

    public void setNumBorrowing(int numBorrowing) {
        this.numBorrowing = numBorrowing;
    }

    public String toString() {
        return "Reader [id=" + this.id + ", fullName=" + this.fullName + ", department=" + this.department + ", birthYear=" + this.birthYear + "]";
    }
}
