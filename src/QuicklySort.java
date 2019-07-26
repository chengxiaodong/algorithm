/**
 * @Author:陈晓东
 * @Date:2019/7/22 00:40
 * @Email:2775398338@qq.com
 * @Description:
 *      对数组中的数字快速排序
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
class QuickSort{
    /*
     * @Author 陈晓东
     * @Description
     *     快速排序的简单实现，在方法中会有三个ArrayList额外的内存开销
     * @Date 2019/7/23 9:33
     * @Param [items]
     * @return void
     **/
    public void simpleSort(ArrayList<Integer> items){
        if (items.size()>1){
            ArrayList<Integer> smaller = new ArrayList<>();
            ArrayList<Integer> same = new ArrayList<>();
            ArrayList<Integer> largger = new ArrayList<>();
            //中间位置基准的值
            Integer cv=items.get(items.size()/2);
            for (Integer e :
                    items) {
                if (e<cv){
                    smaller.add(e);
                }else if (e==cv){
                    same.add(e);
                }else{
                    largger.add(e);
                }
            }
            simpleSort(smaller);
            simpleSort(largger);
            //将排序结果返回到调用方法中
            items.clear();
            items.addAll(smaller);
            items.addAll(same);
            items.addAll(largger);
        }
    }
    /*
     * @Author 陈晓东
     * @Description
     *      标准版的快速排序，使用数组的下标为0的元素存放标准值，对SimpleSort进行了改进
     * @Date 2019/7/23 9:32
     * @Param [items]
     * @return void
     **/
 public int getMiddle(int [] items,int low,int high){
     int temp=items[low];//做基准
     while(low<high){
         while (low<high&&items[high]>=temp){
             high--;
         }
         items[low]=items[high];
         while (low<high&&items[low]<=temp){
             low++;
         }
         items[high]=items[low];
     }
     items[low]=temp;
     return low;
 }

    public void quicksort(int[] items,int low,int high){
        if(low<high) {
            int middle = getMiddle(items, low, high);
            quicksort(items, low, middle - 1);
            quicksort(items, middle + 1, high);
        }
    }

}
public class QuicklySort {
    public static void main(String [] args){
         /*ArrayList<Integer> data= new ArrayList<>();
        data.addAll(Arrays.asList(1,34,2,44,324,2,34,65,23,62,42,3,124,5));
        QuickSort quickSort = new QuickSort();
        quickSort.simpleSort(data);
       System.out.println(data);*/

        /**
         * 标准快速排序
         */
      /*  QuickSort quickSort = new QuickSort();
        Integer[] data = {-1,8,1,4,9,6,3,5,2,7,0};
       quickSort.standardSort(data,1,data.length-1);
        for (Integer e:data
             ) {
            System.out.println(e);
        }*/

        QuickSort quickSort = new QuickSort();
        int [] data = {8,1,4,9,6,3,5,2,7,0};
       quickSort.quicksort(data,0,data.length-1);
        for (int e :
                data) {
            System.out.println(e);
        }
    }
}
