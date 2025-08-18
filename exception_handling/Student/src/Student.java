//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Student {
    public static void main(String[] args) {
       int[] num={10,200,300,40};
       int[] den={1,2,0,4};
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(divide(num[i],den[i]));
            }catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Good Job");
    }
    public static int divide(int a, int b){
        try {
            return a/b;
        }catch (ArithmeticException e){
            System.out.println("AE");
            return -1;
        }catch (Exception e)
        {
            System.out.println(e);
            return -1;
        }
    }
}