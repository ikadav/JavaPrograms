package examples.java;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListLinkedListExample {
    
    public static void main(String[] args) { 
 
           
  
        ArrayList<String> arrlistobj = new ArrayList<String>();
        arrlistobj.add("one");
        arrlistobj.add("two");
        arrlistobj.add("three");
        arrlistobj.add("four");
        arrlistobj.add("two");
       // System.out.println("ArrayList object output :"+ arrlistobj);
        
        Iterator i = arrlistobj.iterator();
        
        while (i.hasNext()) {
        		System.out.println(i.next());
        }
 
         
 
        LinkedList<String> llobj = new LinkedList<String>();
        llobj.add("one");
        llobj.add("three");
        llobj.add("two");
        llobj.add("four");
        llobj.add("two"); 
       // System.out.println("LinkedList object output :"+llobj);  
        
        Iterator j = llobj.iterator();
        
        while (j.hasNext()) {
        		System.out.println(j.next());
        }
 
 }
}