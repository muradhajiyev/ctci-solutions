package Chapter1;

public class Problem4 {
    public static void main(String[] args) {
        Problem4 problem = new Problem4();
        String str1 = "Tact Coa";
        String str2 = "AbbCCdA";
        System.out.println(problem.isPermutationOfPalindrome(str1));
        System.out.println(problem.isPermutationOfPalindrome(str2));
    }



    public boolean isPermutationOfPalindrome(String phrase){
        int a = 0;
        for (char c : phrase.toCharArray()){
            int x = getNumericValue(c);
            if (x != -1){
                a ^= (1 << x);
            }
        }

        a = a & (a - 1);
        return a == 0;
    }


    public int getNumericValue(char c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int index = Character.getNumericValue(c);

        if (index >= a && index <= z){
            return index - a;
        }

        return -1;
    }
}
