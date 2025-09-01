class Book {
    
    private int bookId;
    private String title;
    private double price;
    private double discountPer;

    
    public Book() {
        this(0, "Unknown", 0.0, 0.0); // chaining
    }

    
    public Book(int bookId, String title) {
        this(bookId, title, 0.0, 0.0); // chaining
    }

    
    public Book(int bookId, String title, double price, double discountPer) {
        setBookId(bookId);
        setTitle(title);
        setPrice(price);
        setDiscountPer(discountPer);
    }

    
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        if (bookId > 0) {
            this.bookId = bookId;
        } else {
            System.out.println("Invalid bookId! Must be greater than 0.");
            this.bookId = 0;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Invalid title! Cannot be null/empty.");
            this.title = "Unknown";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Must be >= 0.");
            this.price = 0.0;
        }
    }

    public double getDiscountPer() {
        return discountPer;
    }

    public void setDiscountPer(double discountPer) {
        if (discountPer >= 0 && discountPer <= 100) {
            this.discountPer = discountPer;
        } else {
            System.out.println("Invalid discount! Must be between 0 and 100.");
            this.discountPer = 0.0;
        }
    }

    
    public String getBookInfo() {
        return "Book ID: " + bookId + ", Title: " + title + ", Price: " + price + ", Discount: " + discountPer + "%";
    }

    
    public String getBookInfo(boolean applyDiscount) {
        if (applyDiscount) {
            double discountedPrice = price - (price * discountPer / 100);
            return "Book: " + title + " | Original Price: " + price + " | Discount: " + discountPer + "%" + " | Final Price: " + discountedPrice;
        } else {
            return getBookInfo(); 
        }
    }
}

public class Book_details {
    public static void main(String[] args) {
        
        Book b1 = new Book(101, "Operating System by Galvin and jk publisher", 500.0, 10.0);
        System.out.println(b1.getBookInfo());
        System.out.println(b1.getBookInfo(true));

        
        Book b2 = new Book();
        b2.setBookId(102);
        b2.setTitle("Python Basics by balagurusamy");
        b2.setPrice(400.0);
        b2.setDiscountPer(15.0);

        System.out.println(b2.getBookInfo());
        System.out.println(b2.getBookInfo(true));
    }
}

