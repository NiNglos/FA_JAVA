public class ReaderCheck {
     public static void main(String[] args) {
            Reader reader1 = new Reader("Ивановик В.В.", 1, "ИФ", "11.11.2000", "+799999999");
            Reader reader2 = new Reader("Иванов И.И.", 2, "ИФ", "12.11.2001", "+799999999");
            Reader reader3 = new Reader("Иванова А.А.", 3, "ИФ", "13.04.2002", "+799999999");
            Reader[] readers = {reader1, reader2, reader3};

            Book book1 = new Book("Война и Мир", "Лев Толстой");
            Book book2 = new Book("Гарри Поттер", "Джоан Роулин");
            Book book3 = new Book("Мастер и Маргарита", "Михаил Булгаков");
            Book[] books = {book1, book2, book3};

            printReaders(readers);
            printBooks(books);

            reader1.takeBook(5);
            reader2.takeBook("1234, 1234", "Вы призвали не того!, Алитбаев");
            reader3.takeBook(book1, book2, book3);

            reader1.returnBook(1);
            reader2.returnBook("Вы призвали не того!, Алитбаев");
            reader3.returnBook(book3);
        }

        private static void printBooks(Book[] books) {
            System.out.println("Список книг:");
            for (Book book : books) {
                System.out.println(book.getInfo());
            }
            System.out.println();
        }

        private static void printReaders(Reader[] readers) {
            System.out.println("Список читателей:");
            for (Reader reader : readers) {
                System.out.println(reader.getInfo());
            }
            System.out.println();
        }
    }

