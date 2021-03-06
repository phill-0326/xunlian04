package OverLoad.morining;

/**
 * 1.定义一个max方法返回两个int值中的最大值 可以用三元表达式
 * 2.创建一个方法返回两个double值中的最大值 可以用三元表达式
 * 3.创建一个max方法求出三个double数的最大值
 * author :phil
 */
public class overLoad02 {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.max(2,5);
        methods.max(2.2,4.1);
        System.out.println("最大值："+methods.max(2.1,3.4,7.8));
    }
    //创建一个Method是的类
    static class Methods{
        //定义一个max方法返回两个int值中的最大值 可以用三元表达式
        public void  max(int n1, int n2){
            if (n1>n2){
                System.out.println("最大值："+n1);
            }else{
                System.out.println("最大值："+n2);
            }
        }
        //创建一个方法返回两个double值中的最大值 可以用三元表达式
        public void max(double n1,double n2){
            if (n1>n2){
                System.out.println("最大值："+n1);
            }else{
                System.out.println("最大值："+n2);
            }
        }
        //创建一个max方法求出三个double数的最大值
        public double max(double n1, double n2, double n3){
         //   double temp = n1;//假设n1就是最大值
           /* if (n2 > n3){
                if (n1 >n2){
                    System.out.println("最大值："+ n1);
                }else{
                    System.out.println("最大值："+ n2);
                }
            }else {
                if (n1 >n3){
                    System.out.println("最大值："+ n1);
                }else{
                    System.out.println("最大值："+ n3);
                }
            }*/
            //三元表达式求三个数的最大值
            double max1 = n1 > n2 ? n1 : n2;
            return max1 > n3 ? max1 : n3;
        }
    }
}
