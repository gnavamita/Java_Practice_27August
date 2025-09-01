package date_270825;

public class Child extends Parent {


    //Calling variables and methods of parent class into child  class

    void Calling_variables_and_methods_of_parent_class_into_child_class() {
        System.out.println(a);
        System.out.println(b);
        india();
        subtractionOf2Nos(2, 4);
        india(3, 5);
        System.out.println(c);
        int d = a + b;
        System.out.println(d);

    }

    void india(int a, int b) {

        System.out.println("Multiply " + a * b);
    }

    public static void main(String[] args) {
        Child ob1 = new Child();
        ob1.india(2, 20);

        Parent p = new Child();
        p.india(2, 4);


        Parent p1 = new Parent();
        p1.india(3, 5);

        ob1.Calling_variables_and_methods_of_parent_class_into_child_class();

    }
}
