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

    public void sort(ArrayList<Integer> items){
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
            sort(smaller);
            sort(largger);
            //将排序结果返回到调用方法中
            items.clear();
            items.addAll(smaller);
            items.addAll(same);
            items.addAll(largger);
        }
    }

}
public class QuicklySort {
    public static void main(String [] args){
         ArrayList<Integer> data= new ArrayList<>();
        data.addAll(Arrays.asList(1,34,2,44,324,2,34,65,23,62,42,3,124,5));
        QuickSort quickSort = new QuickSort();
        quickSort.sort(data);
       System.out.println(data);
    }
}
