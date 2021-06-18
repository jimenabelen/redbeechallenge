
package redbeechallenges;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class CompareArrayNumbers {
    public static void main(String[] args) { 
    
    List<Integer> a = new ArrayList<>();
    a.add(34);
    a.add(45);
    a.add(459);
    a.add(390);
    a.add(1200);
  
    List<Integer> b = new ArrayList<>();
    b.add(890);
    b.add(56);
    b.add(99);
    b.add(678);
    b.add(230);
    
    List<Integer> maxList = new ArrayList<>();
    maxList.add(Collections.max(a));
    maxList.add(Collections.max(b));
    System.out.println(maxList);
    }  
   
    
  
} 
    


