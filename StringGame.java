package Solutions;

public class StringGame {
    public static void main(String[] args) {
        System.out.println(countSteps("AbcDef", 1, 2));
    }

    public static int countSteps(String s, int m, int n){
        String original = new String(s);
        int step = 0;
        // harry first chance
        s = Moves(s, m);
        step++;
        int chance = m;
        if(!s.equals(original)){
            while(!s.equals(original)){
                if(chance == m){
                    s = Moves(s, n);
                    chance = n;
                    step++;
                }else{
                    s = Moves(s, m);
                    chance = m;
                    step++;
                }
            }
        }

        return step;
    }

    public static String Moves(String s, int m) {
        String harry = s.substring(s.length() - m, s.length());
        s = harry + s;
        s = s.substring(0, s.length() - m);

        return s;
    }
}