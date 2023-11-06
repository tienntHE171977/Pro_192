import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyCarp implements ICarp{
 //đếm số phần tử của Pond khi có char thứ 2 là số chẵn và đưa ra count
    @Override
    public int f1(List<Carp> t) {
        int count =0;
        for(int i=0; i<t.size();i++){
            if(Character.isDigit(t.get(i).getPond().charAt(1))){
                int c = Character.getNumericValue(t.get(i).getPond().charAt(1));
                if(c%2==0) count++;
            }
        }
        return count;
    }
//tìm phần tử đầu tiên của Pond là Palindrom String và thay đổi nó thành 99
    public static boolean isPalindrome(String pond) {
        int left = 0;
        int right = pond.length() - 1;
        while (left < right) {
        if (pond.charAt(left) != pond.charAt(right)) {
            return false;
        }
        left++;
        right--;
        }
    return true;
    }
    @Override
    public void f2(List<Carp> t) {
        for(Carp carp : t){
            String p = carp.getPond();
            if(isPalindrome(p)){
                carp.setState(99);
                break;
            } 
                    
            
        }
    }

    @Override
    public void f3(List<Carp> t) {
        Collections.sort(t.subList(0, 5), new Comparator<Carp>() {
            @Override
            public int compare(Carp o1, Carp o2) {
               int comp = Integer.compare(o1.getState(), o2.getState());
                if (comp==0) {
                    comp = o1.getPond().substring(1, 2).compareTo(o2.getPond().substring(1, 2));
                }
                return comp;
            }
        });
    }
        
    
    
}