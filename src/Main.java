public class Main {
    public static void main(String[] args) {
        Author joan = new Author("Джоан", "Pоулинг");
        Book harryPotter = new Book ("Гарри Поттер", joan , 1997);
        Author london = new Author("Джек", "Лондон");
        Book loveOflive = new Book("Любовь к жизни", london, 1905);
        harryPotter.setYearPublishing(2001);
        System.out.println(joan);
        System.out.println(harryPotter);
        System.out.println(harryPotter.equals(loveOflive));
        System.out.println(joan.equals(london));
    }
}