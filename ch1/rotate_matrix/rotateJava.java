public class rotateJava{
    
    public static void print(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }

    public static int[][] rotate(int[][] arr){
        int[][] tmp = new int[arr[0].length][arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                tmp[j][arr.length - i - 1] = arr[i][j];
            }
        }
        return tmp;
    }

    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("Usage: $ java rotateJava num1 num2");
        } else {
            int[][] arr = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[0].length; j++){
                    arr[i][j] = (i * 4) + j;
                }
            }
            print(arr);
            int[][] tmp = rotate(arr);
            print(tmp);
        }
    }
}
