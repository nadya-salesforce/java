
//find word with symbol
import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
list.add("Word");
list.add("World");
list.add("Will");
    
   for (int i = 0; i < list.size(); i++) {
        for (int j = 0; j <list.get(i).length(); j++) {
            if (list.get(i).charAt(j) == 'l') {
                System.out.println(list.get(i));
            }
        }
   }
    System.out.println("I rule the World!");
  }
