

import java.util.Collections;
import java.util.List;


public class MyCar implements ICar{

    @Override
    public int f1(List<Car> t) {
        if(t.isEmpty()){
            return 0;
        }
        int sum =0;
        for(Car car : t){
            sum += car.getRate();
        }
        return sum / t.size();
    }

    @Override
    public void f2(List<Car> t) {
       if(t.isEmpty()){
           return;
       }
       int max =0;
       int min =0;
       for(int i =1; i< t.size(); i++){
           if(t.get(i).getRate()> t.get(max).getRate()){
               max = i;
           }
           if(t.get(i).getRate()< t.get(min).getRate()){
               min =i;
           }
       }
       Collections.swap(t, max, min);
    }

    @Override
    public void f3(List<Car> t) {
        Collections.sort(t, (car1,car2) -> {
            int makerComparison = car1.getMaker().compareTo(car2.getMaker());
            if(makerComparison != 0){
                return makerComparison;
            }else{
                return car2.getRate() - car1.getRate();
            }
        });
    }
    
}
