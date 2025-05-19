public class Stack {

    int size = -1;
    private final int DEFAULT_SIZE = 10;
    private int[] arr = new int[DEFAULT_SIZE];
    private int currentSize = DEFAULT_SIZE;

    public void push(int num) {
        if (currentSize == (size + 1)) {
            currentSize = currentSize * 2;
            int[] temp = new int[currentSize];
            for (int i = 0; i <= size; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[++size] = num;
    }

    public void print() {
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
