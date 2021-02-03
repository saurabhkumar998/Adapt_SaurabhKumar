class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
        int count=0;
        while(count != 3){
            if(user == userId && pass == password){
                return "Welcome "+user;
            }
            else if(user != userId || pass != password){
                count++;
                return "You have entered wrong credentials ,please enter the right credentials.";
            }
        }

            return "You have entered wrong credentials 3 times\n" +
                    "\n" +
                    "Contact Admin\n" ;


    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
        Login obj = new Login();
        System.out.println(obj.loginUser("ajay", "password"));

    }
}

