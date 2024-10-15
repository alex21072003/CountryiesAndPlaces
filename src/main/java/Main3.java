import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        String[] words = {"my","name" , "is", "Alex", "EOS","i'm", "from","Moscow"};
        String text = "";
        for (int i = 0; i <= words.length-1; i++) {
            if(words[i].equals("EOS")){
                text+=".";
            } else if (i ==0) {
                text += words[i];
            } else {
                text +=" " + words[i];
            }

        }
        System.out.println(text);
    }
}
