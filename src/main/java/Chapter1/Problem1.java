package Chapter1;

public class Problem1 {
    public static void main(String[] args) {
        Problem1 p = new Problem1();
        String[] words = {"abcde", "aaaaa", "ertyuio"};
        for (String str : words) {
            System.out.println("'" + str + "' is " + (p.isUnique(str) ? " unique" : " not unique"));
        }
    }

    private boolean isUnique(String str){
        int checker = 0;
        for (int i=0; i<str.length(); i++){
            int val = str.charAt(i) - 'a';

            if ((checker & (1<<val)) > 0)
                return false;

            checker = checker | (1<<val);
        }

        return true;
    }
}
