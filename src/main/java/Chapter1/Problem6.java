package Chapter1;

public class Problem6 {
    public static void main(String[] args) {
        Problem6 problem = new Problem6();
        String str = "aabccaabbaababababababababababa";
        String str2 = "aabcccccaaa";
        System.out.println(problem.compression(str));
        System.out.println(problem.compression(str2));
    }

    public String compression(String str){
        StringBuilder builder = new StringBuilder();
        char lastChar = str.charAt(0);
        int occurrence = 1;

        for (int i=1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == lastChar)
                occurrence++;
            else{
                builder.append(lastChar);
                builder.append(occurrence);
                occurrence=1;
            }
            lastChar = c;
        }

        if (str.length() < builder.length())
            return str;
        else
            return builder.toString();
    }
}
