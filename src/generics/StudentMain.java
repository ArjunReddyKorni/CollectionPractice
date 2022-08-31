package generics;

public class StudentMain {


    public static void main(String[] args) {
        StudentGeneric<Integer,String> studentGeneric = new StudentGeneric<>(12,"arjun");

        System.out.println("studentGeneric = " + studentGeneric);
    }



}
