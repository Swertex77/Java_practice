package Practice_2;

public class Author {
    private String email;
    private String name;
    private char gender;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;

    }

    @Override
    public String toString() {
        return name + " " + "(" + gender + ")"  + " " + "at" + " " + email;
    }
}
 class TestAuthor {
     public static void main(String[] args) {
         Author author = new Author("Egor", "Egor54@mail.ru", 'M');

         author.getEmail();
         author.getName();
         author.getGender();
         author.setEmail("Egorik81@mail.ru");
         System.out.println(author.toString());
     }
 }