public class Example24 {
    static int findSum(int a, int b){
        return a+b;
    }
    static int findSum(int x, int y, int z){
        return x+y+z;
    }
    static double findSum(double c, double d){
        return c+d;
    }
    public static void main(String[] args){
        int sum1 = findSum(10,1);
        int sum2 = findSum(32,-2,10);
        double sum3 = findSum(5.23,45.10);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}