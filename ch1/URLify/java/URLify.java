public class URLify{
    public static char[] URLify(char[] url){
        for(int i = 0; i < url.length; i++){
            if(url[i] == ' '){

            }
        }
        return url;
    }

    public static void main(String[] args){
        String a = "Mr John Smith      ";
        char[] b = a.toCharArray();
        System.out.println(URLify(b));
    }
}
