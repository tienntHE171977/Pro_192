package slot12;

import java.util.*;
//HashSet;
//import java.util.Iterator;
//import java.util.TreeSet;

class MySet extends TreeSet {

    public boolean isEmpty() {
        return (super.isEmpty());
    }

    void add(A x) {
        super.add(x);
    }

    void addMany(String[] a, int[] p, int n) {
        A x;
        for (int i = 0; i < n; i++) {
            x = new A(a[i], p[i]);
            add(x);
        }

    }

    void display() {
        System.out.println("The elements of te list:");
        Iterator c = iterator();
        while (c.hasNext()) {
            System.out.println(c.next());
        }
    }

    
}
