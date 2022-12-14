package HomeWork8;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Уильям", "Шекспир");
        Author author2 = new Author("Джордж", "Байрон");
        Author author3 = new Author("Уильям", "Шекспир");
        Book book1 = new Book("Ромео и Джульетта", author1, 1597);
        Book book2 = new Book("Дон Жуан", author2, 1787);
        Book book3 = new Book("Ромео и Джульетта", author1, 1597);
        book1.setYearPublication(1597);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.equals(book2)); //false
        System.out.println(book1.equals(book3)); //true
        System.out.println(author1.equals(author2)); //false
        System.out.println(author1.equals(author3)); //true
    }

    public static class Book {
        private String title;
        private Author name;
        private int yearPublication;

        public Book(String title, Author name, int yearPublication) {
            this.title = title;
            this.name = name;
            this.yearPublication = yearPublication;
        }

        public String getTitle() {
            return title;
        }

        public Author getName() {
            return name;
        }

        public int getYearPublication() {
            return yearPublication;
        }

        public void setYearPublication(int yearPublication) {
            this.yearPublication = yearPublication;
        }

        @Override
        public String toString() {
            return "Заголовок: " + title + "\n" + "Автор: " + name + "\n" + "Год публикации: " + yearPublication + "\n";
        }
        @Override
        public boolean equals(Object other){
            Book book = (Book) other;
            if (this.getTitle().equals(book.getTitle())) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(title, name, yearPublication);
        }

    }

    public static class Author {
        private String authorName;
        private String authorSecondName;

        public Author(String authorName, String authorSecondName) {
            this.authorName = authorName;
            this.authorSecondName = authorSecondName;
        }

        public String getAuthorName() {
            return authorName;
        }

        public String getAuthorSecondName() {
            return authorSecondName;
        }

        @Override
        public String toString(){
            return authorName + " " + authorSecondName;
        }

        @Override
        public boolean equals(Object other) {
            Author author = (Author) other;
            if (this.getAuthorName().equals(((Author) other).getAuthorName())) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(authorName,authorSecondName);
        }

    }


}
