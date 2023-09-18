package Solutions;

import java.util.HashMap;
import java.util.Scanner;

public class QueryParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Enter URL ---");
        String url = sc.next();

        int start = 0;
        int end = url.length();

        while (url.charAt(start) != '?'){
            start++;
        }

        String splitted = url.substring(start+1, end);
        System.out.println(splitted);

        String[] arr = splitted.split("&");
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String[] res = arr[i].split("=");
            map.put(res[0], res[1]);
        }

        System.out.println("--- Enter Total Test Parameters ---");
        int n = sc.nextInt();
        String[] param = new String[n];

        System.out.println("--- Enter Parameters ---");
        for (int i = 0; i < param.length; i++) {
            param[i] = sc.next();
        }

        for (int i = 0; i < param.length; i++) {
            if(map.containsKey(param[i])){
                System.out.println(param[i] + " --> " + map.get(param[i]));
            }else{
                System.out.println(param[i] + " --> " + -1);
            }
        }

    }
}
