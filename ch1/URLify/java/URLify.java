public class URLify{
    public static String URLify(String url){
        String tmp = "";
        for(int i = 0; i < url.length(); i++){
            if(url.charAt(i) == ' '){
                tmp += "%20";
            } else {
                tmp += url.charAt(i);
            }
        }
        return tmp;
    }

    public static void main(String[] args){
        String a = "Mr John Smith";
        System.out.println(URLify(a));
    }
}
