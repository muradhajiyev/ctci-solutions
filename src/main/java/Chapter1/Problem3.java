package Chapter1;

public class Problem3 {
    public static void main(String[] args) {
        Problem3 problem = new Problem3();
        String str = "Mr John Smith    ";
        int trueLength = 13;

        System.out.println(problem.URLify(str,trueLength));
    }


    public char[] URLify(String str, int trueLength){
        int spaceCount = 0, index = 0;

        char[] characters = str.toCharArray();

        for (int i=0; i <trueLength; i++){
            if (characters[i] == ' ')
                spaceCount++;
        }

        index = trueLength + spaceCount * 2;
        for(int i = trueLength - 1; i >= 0; i--){
            if (characters[i] == ' '){
                characters[index - 1] = '0';
                characters[index - 2] = '2';
                characters[index - 3] = '%';
                index -= 3;
            }else{
                characters[--index] = characters[i];
            }
        }

        return characters;
    }
}

