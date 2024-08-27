class SwapValues {
    int a;
    int b;

    SwapValues(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class SwapExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        SwapValues values = new SwapValues(5, 10);

        // Swap by value
        System.out.println("Before swap by value: a = " + a + ", b = " + b);
        swapByValue(a, b);
        System.out.println("After swap by value: a = " + a + ", b = " + b);

        // Swap by reference 
        System.out.println("Before swap by reference: a = " + values.a + ", b = " + values.b);
        swapByReference(values);
        System.out.println("After swap by reference: a = " + values.a + ", b = " + values.b);

        // Swap without using a third variable
        System.out.println("Before swap without temp: a = " + a + ", b = " + b);
        swapWithoutTemp(a, b);
        System.out.println("After swap without temp: a = " + a + ", b = " + b);
    }

    public static void swapByValue(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void swapByReference(SwapValues values) {
        int temp = values.a;
        values.a = values.b;
        values.b = temp;
    }

    public static void swapWithoutTemp(int x, int y) {
        x = x + y; 
        y = x - y; 
        x = x - y; 
    }
}
