import java.util.*;
import java.io.*;

class Solution{
   
    public static void main(String []argh){
        
        Solution solution = new Solution();
        Solution.PhoneBook phoneBook = solution.new PhoneBook();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.addPhoneBookEntry(name, Integer.toString(phone));
        }
        
        while(in.hasNext()){
            String s = in.next();
            System.out.println(phoneBook.findPhoneBookEntry(s));
        }
        
        in.close();
    }

    public class PhoneBook {

        private HashMap<String,String> phoneBook;

        public PhoneBook(){
            phoneBook = new HashMap<String,String>();
        }        

        public void addPhoneBookEntry(String name, String number){
            phoneBook.put(name, number);
        }

        public String findPhoneBookEntry(String name){
            String entry = "Not found";

            if (phoneBook.containsKey(name)){
                entry = name + "=" + phoneBook.get(name);
            }

            return entry;
        }
    }
}