public class StrComp{
    public static String StrComp(String s){
        String tmp = "";
        if(s.isEmpty()){
            return "";
        }
        int count = 1;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                count++;
            } else {
                tmp += s.charAt(i) + String.valueOf(count);
                count = 1;
            }
        }
        tmp += s.charAt(s.length() - 1) + String.valueOf(count);
        return tmp;
    }
    
    public static void main(String[] args){
        String a = "abc";
        String b = "aabcccccaaa";
        String c = "";
        System.out.println(StrComp(c));
        System.out.println(StrComp(b));
        System.out.println(StrComp(a));
    }
}
