import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        print(1,true);
    }
    public static void print(int index,Object ob){
        System.out.print(String.format("%d,%s",index,ob.toString()));
        List<String> string=new ArrayList<String>(10);
        System.out.println(string.toString());
    }
    public static void tryCatch(){
        try {
            if (true){
                throw new Exception("woguyide");
            }
        }
        catch(Exception e){

        }finally {
            //无论有没有catch都会执行finally
        }
    }
}
