class Book {
    int id;
    String title, author;
    double price;

    Book() {
        id = 0;
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    Book(int i, String t, String a, double p) {
        id = i;
        title = t;
        author = a;
        price = p;
    }

    void discount(double percent) {
        price = price - (price * percent / 100);
    }

    void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book(101, "Java", "James", 500);
        b1.display();
        b2.display();
        b2.discount(10);
        System.out.println("After discount:");
        b2.display();
    }
}
