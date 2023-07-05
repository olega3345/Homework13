public class Author {
    private String name;
    private String surname;
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String toString() {
        return "Имя: " + this.name + " Фамилия: " + this.surname;
    }
    public boolean equals(Object obj) {
        Author otherAuthor = (Author) obj;
        return this.name == otherAuthor.name;
    }
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
}
