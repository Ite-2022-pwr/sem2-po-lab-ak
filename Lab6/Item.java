import java.util.Date;

public class Item {

    private class ExpiryDate {
    
        private int day, month, year;
    
        public ExpiryDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    
        public String toString() {
            String expiryDate = this.day + "/";
            expiryDate += this.month + "/" + this.year;
            return expiryDate;
        }
    }

    private static int countStatic_ = 0;
    //public int countNonStatic_ = 0;

    //public static int idStatic_ = 0;
    private int idNonStatic_ = 0;

    private String name;            // nazwa
    private Integer price;          // cena
    private Category category;      // kategoria produktu
    private ExpiryDate expiryDate;  // data przydatności do spożycia

    // konstruktor domyślny
    public Item() {
        this.name = "ERROR";
        this.price = -1;
        this.category = Category.Error;
        this.expiryDate = new ExpiryDate(-1, -1, -1);

        countStatic_++;
        //countNonStatic_++;

        //idStatic_ = hashCode();
        this.idNonStatic_ = hashCode();

        System.out.println("[ Wywołanie konstruktora domyślnego ]");
    }

    // konstruktor z parametrami
    public Item(String productName, Integer productPrice, Category productCategory, int expiryDateDay, int expiryDateMonth, int expiryDateYear) {
        this.name = productName;
        this.price = productPrice;
        this.category = productCategory;
        this.expiryDate = new ExpiryDate(expiryDateDay, expiryDateMonth, expiryDateYear);

        countStatic_++;
        //countNonStatic_++;

        //idStatic_ = hashCode();
        idNonStatic_ = hashCode();

        System.out.println("[ Wywołanie konstruktora z parametrami ]");
    }

    // konstruktor kopiujący
    public Item(Item obj) {
        this.name = obj.name;
        this.price = obj.price;
        this.category = obj.category;
        this.expiryDate = obj.expiryDate;

        countStatic_++;
        //countNonStatic_++;

        //idStatic_ = hashCode();
        idNonStatic_ = hashCode();

        System.out.println("[ Wywołanie konstruktora kopiującego ]");
    }

    public void printFields() {
        System.out.println("[ Wywołanie metody printFields ]");
        System.out.println("{");
        System.out.println("  ID: " + this.idNonStatic_);
        System.out.println("  Name: " + this.name);
        System.out.println("  Category: " + this.category);
        System.out.println("  Price: " + this.price);
        System.out.println("  Expiry date: " + this.expiryDate);
        System.out.println("}");
    }

    @Override
    public String toString() {
        String stringItem = "{ " + this.idNonStatic_;
        stringItem += ", name=" + this.name;
        stringItem += ", price=" + this.price;
        stringItem += ", category=" + this.category;
        stringItem += ", expiryDate=" + this.expiryDate + " }";
        return stringItem;
    }

    @Override
    public int hashCode() {
        final int prime = 104729;
        int hash = 0;
        for (int i = 0; i < this.name.length(); i++) {
            hash += this.name.charAt(i);
            hash %= prime;
        }

        hash += this.price;
        hash %= prime;

        hash += (int) new Date().getTime() % prime;
        hash += countStatic_;
        hash %= prime;

        return Math.abs(hash);
    }

    public int getId() {
        return this.idNonStatic_;
    }

    public static int getCount() {
        return countStatic_;
    }
}

