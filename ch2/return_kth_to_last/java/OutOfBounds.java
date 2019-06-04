class OutOfBounds extends Exception{
    int id;
    public OutOfBounds(int n){
        id = n;
    }
    public String toString(){
        return "OutOfBounds: " + id;
    }
}
