/**
 * Created by kuba on 19.06.17.
 */
public class Helper {
    public String reverseString(String inputString){
        String outputString = "";
        int start = 0;
        int end = 0;
        for(int i = 0; i < inputString.length(); i++){
            if(inputString.charAt(i) == ' '){
                outputString += reverse(inputString.substring(start, end)) + " ";
                end++;
                start = end;
            }
            else end++;

            if(end == inputString.length()) outputString += reverse(inputString.substring(start, end));
        }
        return outputString;
    }

    private String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }
}
