package OverLoad.morining;

/**
 * 创建方法输出结果，方法的重载
 */
public class overLoad01 {
    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println(methods.m(1));
        System.out.println(methods.m(2,5));
        System.out.println(methods.m("Come on!!!!"));
    }
    static class Methods{
        //接受一个参数执行平方运算
        public int m(int n){
            return n*n;
        }
        //接受两个int整数进行相乘
        public int m(int n1, int n2){
            return n1 * n2;
        }
        //接受一个字符串并且输出
        public String m (String s){
            return s;
        }
    }
}
