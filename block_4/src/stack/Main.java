package stack;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(4);
        try {
            myStack.Push("1");
            myStack.Push("2");
            myStack.Push("3");
            myStack.Push("4");
            myStack.Push("5");
        } catch (Exception e) {
            System.out.println("Стэк переполнен");
        }
        try {
            System.out.println(myStack.Pop());
            System.out.println(myStack.Pop());
            System.out.println(myStack.Pop());
            System.out.println(myStack.Pop());
            System.out.println(myStack.Pop());
        } catch (Exception e) {
            System.out.println("Стэк пуст");
        }
    }
}
