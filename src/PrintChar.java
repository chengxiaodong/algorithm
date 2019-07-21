/**
 * @Author:陈晓东
 * @Date:2019/7/20 21:27
 * @Email:2775398338@qq.com
 * @Description:
 *      1、问题：打印
 *                  A
 *               A  B  A
 *           A   B  C  B  A
 *           。。。
 */

/** 第一行：1；第一列：1；
 * f(n)=2*i-1   第i行的个数
 * f(center)=((2*i-1)+1)/2=i       中央的下标
 * f(space)=number-i    空格的个数
 */
public class PrintChar {
    public void print(int number){
        for (int i = 1; i <= number; i++) {
            //输出空格
            for (int j = 1,len=number-i;j<=len  ; j++) {
                System.out.print("\t");
            }
            //前半段递增1
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)('A'+j-1));
                System.out.print("\t");
            }
            //后半段递减1
            for (int j = i-1; j >=1 ; j--) {
                System.out.print((char)('A'+j-1));
                System.out.print("\t");
            }
            //换行
            System.out.println();
        }
    }
    public static void main(String[] args){
        PrintChar printChar = new PrintChar();
        printChar.print(26);
    }
}
