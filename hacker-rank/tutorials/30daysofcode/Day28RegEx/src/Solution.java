import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String name;
        String email;
        
        scanner.nextInt();
        
        while(scanner.hasNext()) {
            name = scanner.next();
            email = scanner.next();
            
            if (email.endsWith("@gmail.com"))
            {
                users.add(name);                
            }
        }
        
        scanner.close();        
        
        Collections.sort(users);
        
        for (String user : users) { 
            System.out.println(user);
        }        
    }
}