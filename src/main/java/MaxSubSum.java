/**
 * @Author:陈晓东
 * @Date:2019/7/27 08:35
 * @Email:2775398338@qq.com
 * @Description:
 *      找到数组的一个最大子序列
 *      1 3 -2 6 -1 9
 */
public class MaxSubSum {
    /**
     * @Author 陈晓东
     * @Description
     *      穷举法：
     *      分别找出以下标为i的子序列，将每一个子序列的和与maxSum比较，较大值放入maxSum
     * @Date 2019/7/27 8:38
     * @Param [items]
     * @return int
     *  O(n^3)
     **/
    public int mxSubSum(int [] items){
        int high=items.length-1;
        int maxSum=items[0];
        //遍历所有i开头子列
        for (int i = 0; i <= high; i++) {

            //遍历子列    i至j为一个子列
            for (int j = i; j <=high ; j++) {
                int sum=0;
                //子列求和
                for (int k = i; k <=j ; k++) {
                    sum+=items[k];
                }
                //交换最大子列和
                if(sum>maxSum){
                    System.out.println("从第"+(i+1)+"-"+(j+1)+"子列和为"+sum);
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String [] args){
        MaxSubSum maxSubSum = new MaxSubSum();
        int mxSubSum = maxSubSum.mxSubSum(new int[]{
                1, -4, 3, 9, -5, 6, 3, 6, -8
        });
        System.out.println(mxSubSum);
    }
}
























































