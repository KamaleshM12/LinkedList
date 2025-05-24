public class LinkedList<T>{
    node head;
    class node{
        T data;
        node next;
        public T val;
        public node(T val) {
            data = val;
            next = null;
        }  
    }

    public LinkedList() {
        head=null;
    }

    public void InsertAtBeg(T val){
        node newNode = new node(val);

        if(head==null){
            head=newNode;
        }
        else{
            newNode.next = head;
            head=newNode;
        }
    }

    public void IsertAtAnyPos(int pos,T val){
        if(pos == 0){
            InsertAtBeg(val);
        }
        node newNode = new node(val);
        node temp = head;
        for(int i = 1;i<pos;i++){
            temp=temp.next;
            if(temp==null){
                System.err.println("Invalid pos");
                return;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }

    public void deleteAtAnyPos(int pos){
        if(pos==0){
            head = head.next;
            return;
        }
        node temp = head;
        node prev = null;
        
        for(int i = 1;i<=pos;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }
    
    public void get(int pos){
        node temp = head;
        if(pos==0){
            System.out.println(temp.data);
            return;
        }
        for(int i=1;i<=pos;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public void update(int pos,T val){
        node temp = head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        temp.data=val;
    }

    public int search(T val){
        node temp = head;
        int index = 0;
        while(temp!=null){
            
            if (val.equals(temp.data)){
                return index;
                
            }
            temp = temp.next;
            index++;
        }
        throw new IllegalAccessError("Not in the list");
    }
}