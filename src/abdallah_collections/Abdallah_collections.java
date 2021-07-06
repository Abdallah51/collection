/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdallah_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 *
 * @author 1
 */
public class Abdallah_collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         List<String> a = new LinkedList<>();
         a.add("A");
         a.add("B");
         a.add("C");
         List<String> b = new LinkedList<>();
         b.add("D");
         b.add("E");
         b.add("F");
         b.add("G");
         
         System.out.println("  a = " + a);
         System.out.println("  b = " + b);
         ListIterator<String> aIter = a.listIterator();
         Iterator<String> bIter = b.iterator();
         while(bIter.hasNext()){
             if (aIter.hasNext()) aIter.next();
             aIter.add(bIter.next());
         }
         System.out.println(" map a = " + a);
    bIter = b.iterator();
     while(bIter.hasNext()){
         bIter.next();
         if(bIter.hasNext()){
             bIter.next();
             bIter.remove();
         }
     }
     System.out.println("  b after removing = " + b);
     a.removeAll(b);
     System.out.println(" a after remove : "+a);
  
     System.out.println(" -------------- mapping ------------------");
     
     Map<String,Employee> staff = new HashMap<>();
     staff.put("100", new Employee("Abdallah"));
     staff.put("200", new Employee("Elsayed"));
     staff.put("300", new Employee("Abdalaal"));
     staff.put("400", new Employee("ALy"));
     
     System.out.println(" Staff = " + staff);
     staff.remove("100");
     System.out.println(" Staff = " + staff);
     staff.put("400", new Employee("hussain"));
     System.out.println(" Staff = " + staff);
          System.out.println(" Staff 400 = " + staff.get("400"));
     staff.forEach((k, v) -> 
System.out.println("key=" + k + ", value=" + v));
 
     System.out.println(" --------------- lambda test -----------------------");
     MyValue myval;
     myval = () -> 99.99 ;
     System.out.println("myval = : "+myval.getValue());
     
     MyParamValue myparaval;
     myparaval = (n) -> n/5.0 ;
     System.out.println("n 1  = : "+myparaval.getValue(20.0));
     System.out.println("n 2  = : "+myparaval.getValue(200.0));

     
          



     
     
    
}
}