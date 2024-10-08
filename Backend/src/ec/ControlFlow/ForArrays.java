package ec.ControlFlow;

import java.util.Scanner;

public class ForArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] users = {"LuigiLp","AnthonyP","DianaR","AndresMon" , "Admin"};
        int userCount = users.length;
        for(int i =0 ; i < userCount;i++){

            if (users[i].equalsIgnoreCase("Admin")){
                continue;
            }
            if (users[i].toLowerCase().contains("DianaR".toLowerCase())){
                continue;
            }
            System.out.printf("The users in the index is %d and his name is %s %n", i ,users[i]);
        }

        System.out.println("Insert a user that you like to search like \"Pepe123\":");
        String searchUsername = sc.nextLine();

        boolean isSearch = false;
        for (int i = 0; i < userCount; i++) {
            if (users[i].equalsIgnoreCase(searchUsername)) {
                isSearch = true;
                break;
            }
        }
        if (isSearch){
            System.out.printf("The user %s was found.\n", searchUsername);
        }else{
            System.out.printf("The user %s was not found.\n", searchUsername);
        }

    }
}
