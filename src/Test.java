
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enrique
 */
public class Test {
    
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            al.add(Integer.toHexString(i));
        }
        
        Iterator it = al.iterator();
        
        Predicate p = new Predicate() {
            @Override
            public boolean test(Object t) {
                String s = (String)t;
                if (s.startsWith("1")) return true;
                else return false;
            }
        };
        al.removeIf(p);
        
        
        for (String s: al){
            System.out.println(s);
        }
        
        
    }
    
}
