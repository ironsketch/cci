public class Pair<T, T2>{
    private int count;
    private T data;
    private T data2;
    Pair(T newData){
        data = newData;
        data2 = null;
        count = 0;
    }
    Pair(T newData1, T newData2){
        data = newData1;
        data2 = newData2;
        count = 0;
    }
    public int getCount(){return count;}
    public T one(){return data;}
    public T two(){return data2;}
}
