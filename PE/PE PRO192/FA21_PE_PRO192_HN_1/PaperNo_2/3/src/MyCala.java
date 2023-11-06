
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




public class MyCala implements ICala{

    @Override
    public int f1(List<Cala> t) {
        int count =0;
        for (int i = 0; i < t.size(); i++) {
            if(Character.isDigit(t.get(i).getOwner().charAt(1))){
                count++;
            }
            
        }
        return count;
        
    }

    @Override
    public void f2(List<Cala> t) {
        int count =0;
        int pos=0;
        int max = t.get(0).getPrice();
        for (int i = 0; i <t.size(); i++) {
            if(t.get(i).getPrice()> max) {
                max = t.get(i).getPrice();
                
               
                   
               }
          
            
            
            
        }
        for (int i = 0; i < t.size(); i++) {
            if(max== t.get(i).getPrice()){
                count++;
                if(count==2){
                    t.remove(i);
                    break;
                }
                
                
                
              
            }
            
        }
    }

    @Override
    public void f3(List<Cala> t) {
        Collections.sort(t, new Comparator<Cala>() {
            @Override
            public int compare(Cala t, Cala t1) {
                String s1 = t.getOwner().substring(1,2);
                String s2 = t1.getOwner().substring(1,2);
                return s1.compareTo(s2);
            }
        });
    }

}
