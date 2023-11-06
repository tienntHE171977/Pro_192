
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class MyCar implements ICar{

    @Override
    public int f1(List<Car> t) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < t.size(); i++) {
            sum = sum + t.get(i).getRate();
            
        }
        average = sum/t.size();
        return average;
    }

    @Override
    public void f2(List<Car> t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void f3(List<Car> t) {
          Collections.sort(t, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int value = o1.getMaker().compareTo(o2.getMaker());
                if(value == 0){
                    value = o2.getRate() - o1.getRate();
                }
                return value;
            }
        });
    }
    
}
