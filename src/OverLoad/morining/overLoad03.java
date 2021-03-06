package OverLoad.morining;

/**
 * 设置可变参数int... 把num作为一个数组来使用，把同一类型的计算只是参数不同可以当做一种方法来看
 * author: phil
 */
public class overLoad03 {
    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println("结果是："+ methods.sum(20,11,23,44,55,66,76,325,535,3));
    }
    static class Methods{
        public int sum(int... num){//int... 表示接受可变参数，类型是int ， 即可以接受多个int（0-多）
            int res = 0;
            for (int i = 0; i < num.length; i++) {//使用可变参数时，可以当做数组来使用 即 nums可以当做数组
                res += num[i];
            }
            return res;
        }
    }
}
