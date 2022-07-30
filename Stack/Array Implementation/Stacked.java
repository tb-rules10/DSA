public class Stacked {
    int[] arr;
    int size, top;
    Stacked(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    boolean isFull(){
        return top == size - 1;
    }
    boolean isEmpty(){
        return top == -1;
    }

    void push(int x){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        arr[++top] = x;
        System.out.printf("%d pushed\n",arr[top]);
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -999;
        }
        System.out.printf("%d popped\n",arr[top]);
        return arr[top--];
    }

    void peek(){
        if(isEmpty()){
            System.out.println("Underflow");
        }
        System.out.printf("Element at top - %d\n",arr[top]);
    }

    public static void main(String[] args) {
        Stacked ob = new Stacked(5);
        ob.push(4);
        ob.push(5);
        ob.push(6);
        ob.peek();
        ob.pop();
        ob.peek();
//        ob.push(7);
//        ob.push(8);
//        ob.push(9);
    }
}
