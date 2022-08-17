import java.util.Arrays;

public class Methods {

    public static int addOrMultiply(int a, int b, boolean multiply) {
        return multiply ? a*b :a+b;
    }

    public static String toRovarSprak(String sentence) {
        String vowel= "aeiou";
        String newSentence = "";
        for (int i=0;i<sentence.length(); i++) {
            String result = String.valueOf(sentence.charAt(i));
            if (vowel.contains(result)) {
                newSentence += result;
            } else {
                newSentence += result + "o" + result;
            }
        }
        return newSentence;
    }

    public static int[] bubbleSort(int[] data) {
        Arrays.sort(data);
              return data;
    }
}






















      /* String vowel= "aeiou";
        StringBuilder s= new StringBuilder();
        for (int i=0;i<sentence.length(); i++) {
            String result = String.valueOf(sentence.charAt(i));
            if(vowel.contains(result)){
                s.append(result);
            }else{
                s.append(result+ "o"+ result);
            }
        }return s.toString();*/
