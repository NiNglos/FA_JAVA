
public class Reader {
    private String fio;
    private int number;
    private String facul;
    private String HB;
    private String phone;

    public Reader(String fio, int number, String facul, String HB, String phone) {
        this.fio = fio;
        this.number = number;
        this.facul = facul;
        this.HB = HB;
        this.phone = phone;
    }

    public Reader() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFacul() {
        return facul;
    }

    public void setFacul(String facul) {
        this.facul = facul;
    }

    public String getHB() {
        return HB;
    }

    public void setHB(String HB) {
        this.HB = HB;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(int number) {
        System.out.println(this.fio + " взял " + number + " книги.");
    }

    public void takeBook(String... books) {
        System.out.println(this.fio + " взял следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.fio + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor());
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println(this.fio + " вернул " + number + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(this.fio + " вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.fio + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor());
        }
        System.out.println();
    }

    public String getInfo() {
        return "{" +
                "fio='" + fio + '\'' +
                ", number=" + number +
                ", facul='" + facul + '\'' +
                ", HB='" + HB + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
