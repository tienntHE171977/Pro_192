
/**
 *
 * @author khoai2601
 */
public class MyString implements IString{

    @Override
    public int sum(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                if (Integer.parseInt(String.valueOf(string.charAt(i))) % 2 == 0) {
                    sum += Integer.parseInt(String.valueOf(string.charAt(i)));
                }
            }
        }
        return sum;
    }

    @Override
    public String getCode(String string) {
        String ans = "";
        for (int i = 0; i < string.length(); i++) {
            if (String.valueOf(string.charAt(i)).matches("^[^0-9A-Z]+$")) {
                continue;
            }
            ans += string.charAt(i);
        }
        return ans;
    }
    
}
