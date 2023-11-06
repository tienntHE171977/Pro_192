
import java.util.List;


/**
 *
 * @author khoai2601
 */
public class MyFan implements IFan{

    @Override
    public void f1(List<Fan> a, String code) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getCode().startsWith(code)) {
                a.remove(i);
            }
        }
    }

    @Override
    public int f2(List<Fan> a, double price) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getPrice() <= price) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f3(List<Fan> a, double price) {
        int k = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getPrice() >= price) {
                a.add(k, a.get(i));
                a.remove(i+1);
                k++;
            }
        }
    }
    
}
