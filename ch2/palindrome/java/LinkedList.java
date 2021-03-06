import java.util.*;

public class LinkedList{
    private Node head;
    private int size;
    LinkedList(){
        head = null;
        size = 0;
    }
    LinkedList(int n){
        head = new Node(n);
        size = 1;
    }
    public void insert(int n){
        Node newNode = new Node(n);
        if(head == null){
            head = newNode;
        } else {
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        size++;
    }
    public void remove(int ithPosition){
        if(ithPosition >= size){
            return;
        }
        else if(ithPosition == 0){
            Node tmp = head.next;
            head = tmp;
            size--;
        } else {
            Node tmp = head;
            for(int i = 0; i < ithPosition - 1; i++){
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            size--;
        }
    }
    public void remDups(){
        Set<Integer> set = new HashSet<Integer>();
        Node tmp = head;
        if(this.size == 0){
            return;
        }
        tmp = head;
        set.add(tmp.data);
        while(tmp.next.next != null){
            if(!set.contains(tmp.next.data)){
                set.add(tmp.next.data);
                tmp = tmp.next;
            }
            else {
                tmp.next = tmp.next.next;
                size--;
            }
        }
        // Checking last node
        if(set.contains(tmp.next.data)){
            tmp.next = null;
            size--;
        }
    }
    public int kthLast(int n){
        int count = size - n - 1;
        if(count < 0){
            return -1;
        }
        Node tmp = head;
        while(count > 0){
            tmp = tmp.next;
            count--;
        }
        return tmp.data;
    }
    public void delMid(){
        if(size < 1){
            head = null;
        } else {
            int count = (size - 1) / 2;
            Node tmp = head;
            while(count > 0){
                tmp = tmp.next;
                count--;
            }
            tmp.next = tmp.next.next;
        }
    }
    public void partition(int p){
        Node tmp = head;
        int count = size;
        for(int i = 0; i < count; i++){
            if(tmp.next.data >= p){
                this.insert(tmp.next.data);
                tmp.next = tmp.next.next;
                size--;
            } else {
                tmp = tmp.next;
            }
        }
        tmp = head;
        if(tmp.data >= p){
            this.insert(tmp.data);
            head = tmp.next;
            size--;
        }
    }
    public LinkedList sumLists(LinkedList ll){
        Node tmp = head;
        String a = "";
        while(tmp != null){
            a = String.valueOf(tmp.data) + a;
            tmp = tmp.next;
        }
        Node tmp2 = ll.head;
        String b = "";
        while(tmp2 != null){
            b = String.valueOf(tmp2.data) + b;
            tmp2 = tmp2.next;
        }
        String answer = String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
        LinkedList newLL = new LinkedList();
        for(int i = 0; i < answer.length(); i++){
            newLL.insert(Integer.parseInt(String.valueOf(answer.charAt(i))));
        }
        return newLL;
    }
    public boolean palindrome(){
        Node tmp = head;
        int count = size / 2;
        ArrayList<Integer> front = new ArrayList<Integer>();
        for(int i = 0; i < count; i++){
            front.add(tmp.data);
            tmp = tmp.next;
        }
        if(size % 2 == 1){
            tmp = tmp.next;
        }
        for(int i = count - 1; i >= 0; i--){
            if(front.get(i) != tmp.data){
                return false;
            }
            tmp = tmp.next;
        }
        return true;
    }
    public void p(){
        Node tmp = head;
        while(tmp != null){
            System.out.print(String.valueOf(tmp.data) + " ");
            tmp = tmp.next;
        }
        System.out.println("");
    }
    public int size(){
        return size;
    }
}
