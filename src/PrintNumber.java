/**
 * @Author:陈晓东
 * @Date:2019/7/20 20:45
 * @Email:2775398338@qq.com
 * @Description:
 *      1、问题：输入76234 打印机每次只能打印一个 数字 ，控制打印机输出76234。如已打出7623 再次打印应该为4（采用递归实现）
 *      2、小结：
 *              递归输出最高位数字。
 *              出口：number<10 直接输出number，已找到最高位。
 *                    number>10 去除个位后打印最高位
 *
 */
public class PrintNumber {
    //每次打印最高位
    public void printOut(int number){
        //number<10直接输出，打印结束
        if(number<10){
            System.out.println(number);
            return;
        }
        //调用printOout(number/10)
        printOut(number/10);
        //printOut(number/10);未执行完成将会挂起
        //打印number%10
        System.out.println(number%10);
    }
    public static void main(String[] args){
        PrintNumber printNumber = new PrintNumber();
        printNumber.printOut(76234);
    }
}
