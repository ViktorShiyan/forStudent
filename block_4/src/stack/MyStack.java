package stack;

public class MyStack {
    private int position = -1;
    private String[] stack;

    public MyStack(int size) {
        this.stack = new String[size];
    }

    public void Push(String item) throws Exception {
        if (position < this.stack.length - 1) {
            stack[++position] = item;
            System.out.println("Удачно");
        } else {
            throw new Exception("Стек переполнен");
        }
    }

    public String Pop() throws Exception {
        String result;
        if (position < 0) {
            throw new Exception("Стек пуст");
        } else {
            result = this.stack[position--];
        }
        return result;
    }

}
