import java.util.LinkedList;

/**
 * Created by svetlana on 6/6/16.
 */
public class Task1 {
 public static void main(String args[]) {
     LinkedList<String> linkedlistist = new LinkedList<String>();
     linkedlistist.add("Item1");
     linkedlistist.add("Item2");
     linkedlistist.add("Item3");
     linkedlistist.add("Item4");
     System.out.println("before: " + linkedlistist);
     linkedlistist.addFirst(linkedlistist.removeLast());
     System.out.println("after : " + linkedlistist);

     }
 }

