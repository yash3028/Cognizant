public class string_space {
    public static void main(String args[]) {
        String str = "hello this is yashwanth";
        String[] words = str.split("\\s"); 
        for (int i = 0; i < words.length; i++) {  
            System.out.println(words[i]);
        }
    }
}
