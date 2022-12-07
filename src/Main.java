import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String username, password;
        Scanner  input=new Scanner(System.in);
        System.out.print("Enter the username: ");
        username=input.nextLine();

        System.out.print("Enter the password: ");
        password=input.nextLine();

        if(username.equals("muhammedslmz")&&password.equals("thanksalot"))
        {
            System.out.println("Login successful.");
        }

        else
        {
            System.out.println("Login failed");
        }
    }
}
