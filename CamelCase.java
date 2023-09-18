package Solutions;

public class CamelCase{
    public static void main(String[] args) {
        findSolution("saveTheCamelsForGodSake");
        System.out.println("---------------------------");
        findSecondSolution("saveTheCamelsForGodSake");
    }

    public static void findSolution(String s){
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                str.append(Character.toUpperCase(s.charAt(i)));
            }else{
                str.append(" ");
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        String res = str.toString();
        String[] ans = res.split(" ");

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static void findSecondSolution(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                System.out.print(Character.toUpperCase(s.charAt(i)));
            }else{
                System.out.println();
                System.out.print(Character.toLowerCase(s.charAt(i)));
            }
        }
    }
}
