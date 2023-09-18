package Solutions;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        char x = 'a';
        System.out.println(x == 97);

        Set<Integer> set = new HashSet<>();
        set.add(7);
        set.remove(7);
        set.contains(7);

        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.get(0);
        list.remove(0);

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.get(1);

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.pop();
        st.peek();

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.poll();
        q.peek();

        StringBuilder str = new StringBuilder();
        str.append("da");
        str.reverse();

        Collections.sort(list);

    }
}
