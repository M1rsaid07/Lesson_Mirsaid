public class User {

    public String firstName = "Name";
    public String lastName = " LastName";
    public String login = " user123";
     public String parol = " 12345678";

     User () { // default constructor
     }

    public void salomlashish1() {
        System.out.println(" Salom " + firstName + " " + lastName );
    }
    public void loginParol () {
            System.out.println(" Your login " + login + " " + " \n" + " Your pasword " + parol );
    }

}
