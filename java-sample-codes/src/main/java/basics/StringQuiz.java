package basics;

public class StringQuiz {
    // Write a pgm to remove all spaces from a string
    
    public static void main(String[] args) {
        String str = "This is a sentence";
        char[] charArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : charArr) {
            if(c != ' ') {
                sb.append(c);
            }
        }
        str = sb.toString();
        System.out.println(str);
    }

}
