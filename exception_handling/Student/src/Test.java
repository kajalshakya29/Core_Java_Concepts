public class Test {
    public static void main(String[] args){
        //level1();
        try {
            level1();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void level3(){
        int[] arr=new int[5];
        arr[5]=10;
    }
    public static void level2(){
      level3();
    }
    public static void level1(){
     level2();
    }
}
