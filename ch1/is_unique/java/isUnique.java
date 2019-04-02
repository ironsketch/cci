public class isUnique {
    public static boolean isUn(String word){
        for(int i = 0; i < word.length(); i++){
            for(int j = i + 1; j < word.length(); j++){
                if(word.charAt(i) == word.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Usage! java isUnique word1 word2 etc");
        } else {
            for(int i = 0; i < args.length; i++){
                System.out.println(isUn(args[i]));
            }
        }
    }
}
