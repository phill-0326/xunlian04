package OverLoad.morining;

/**
 *
 * 创造三个方法分别实现返回姓名和两门课的总分，返回姓名和两门课的总分，返回姓名和两门课的总分。封装成一个可变参数的方法
 * author:phil
 */
public class varParamemter {
    public static void main(String[] args) {
       HspMethods methods = new HspMethods();
        System.out.println( methods.showScore("李东",67.5,88));
        System.out.println( methods.showScore("赵柳",67.5,77.5,87));
        System.out.println( methods.showScore("王五",67.5,91,89.5,96.5,87.5));
    }

}
 class HspMethods{
    public String showScore(String str,double... nums){
        String str1 = str;
        double res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }

        return str1+"的"+nums.length+"门课的总成绩为："+res;

    }
}
