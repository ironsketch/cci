public class checkPerm{
    public static boolean checkPerm(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            if(s2.indexOf(c) >= 0){
                s2 = removeCharAt(s2,s2.indexOf(c));
            } else {
                return false;
            }
        }
        return !(s2.length() > 0);
    }

    public static String removeCharAt(String s, int i){
        return s.substring(0,i) + s.substring(i + 1);
    }

    public static void main(String[] args){
        String a = "abcda";
        String b = "bacda";
        String c = "abcde";
        System.out.println(Boolean.toString(checkPerm(a, b)) + " <- should be True!");
        System.out.println(Boolean.toString(checkPerm(a, c)) + " <- should be False!");
    }
}
