/*
package ProjectJavaOOPS;


    //Create Registration Class in which you would have variables such as email, userName and password that have
    // an access scope only within its own class. After creating an object of the class, the user should be able to call
    // methods and in each method separately pass values to set users email, username and password.
    //Requirements:
    //● Valid email consider to be only yahoo
    //● Valid userName and password cannot be empty and should be of
    //length larger than 6 characters. Also valid passwords cannot contain userName.
    public class Q14 {
        private String email;
        private String userName;
        private String password;
        //Constructor

        public Q14(String email, String userName, String password) {
            this.email = email;
            this.userName = userName;
            this.password = password;
        }

        //set methods with validation

        public void setEmail(String email) {
            if (email.toLowerCase().endsWith("@yahoo.com")) {
                this.email = email;
            } else {
                System.out.println("Invalid email format. Please use a Yahoo email.");
            }

        }

        public void setUserName(String userName) {
            if (userName.length() > 6) {
                this.userName = userName;
            } else {
                System.out.println("Invalid username. User name should be longer than 6 characters");
            }

        }

        public void setPassword(String password) {

            if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
                this.password = password;
            } else {
                System.out.println("Invalid password. Password should be longer than 6 characters and not contain the username");

            }
        }


     //   Getter methods

        public String getEmail(){return email;}

        public String getUserName(){return userName;}
        public String getPassword(){return password;}

    }

    class RegistrationTester {

        public static void main(String[] args) {
        Q14 q14 = new Q14("gulizar@yahoo.com", "Alin2023", "Monday123");
            System.out.println("Email: " +q14.getEmail());
            System.out.println("Username: " + q14.getUserName());
            System.out.println("Password: " + q14.getPassword());

        }
    }

}
*/