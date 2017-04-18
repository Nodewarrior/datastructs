/**
 * Created by akshay on 4/15/17.
 */
public class conCat {
    public static void main(String[] args){
        String str1 = "mava";

        char[] ch = str1.toCharArray();
        for(int i = 0; i< ch.length; i++) {
            for(int j = i+1; j<ch.length;j++) {
                if (ch[i] == ch[j]) {
                    System.out.println(ch[i]);
                }
            }
        }

    }
}
