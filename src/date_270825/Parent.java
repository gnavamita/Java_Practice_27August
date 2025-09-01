package date_270825;

public class Parent {
    int a = 1;
    int b = 2;

    void india() {
        System.out.println(a + b);
    }

    void india(int a, int b) {
        System.out.println("Addition "+(a + b));
    }

    int subtractionOf2Nos(int a, int b) {
        System.out.println(a - b);
        return a - b;
    }
    void substration(int a, int b){
        System.out.println(a-b);
    }

    int c = a - b;
    int k;

    public static void main(String[] args) {
        Parent ob = new Parent();
        int x = ob.subtractionOf2Nos(1, 2);

x = ob.a;

    }
}