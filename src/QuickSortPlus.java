/**
 * @Author:陈晓东
 * @Date:2019/7/26 09:12
 * @Email:2775398338@qq.com
 * @Description:
 *         快速排序，以中间位置为基准（即使预排序有序效率也会高），对实现Comparable接口的类都可以排序
 */
/**
 * 数据结构
 */
 class User implements  Comparable<User> ,Cloneable{
    private Integer id;
    private String name;
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //按id从小到大排列
    public int compareTo(User o) {
        return this.getId().compareTo(o.getId());
    }
}

public class QuickSortPlus {
    //一趟排序，返回最终基准所在位置
    public <S extends Comparable<S>>   int getMiddle(S[] items, int low, int high){
        //分离基准到最后
        S temp=items[(low+high)/2];
        items[(low+high)/2]=items[high];
        items[high]=temp;
        while (low<high){
            while (low<high&&(items[low].compareTo(temp)<=0)){
                low++;
            }
            items[high]=items[low];
            while (low<high&&(items[high].compareTo(temp)>=0)){
                high--;
            }
            items[low]=items[high];
        }
        items[low]=temp;
        return low;
    }
    //划分小子集
    public  <S extends Comparable<S> > void quicksort(S[] items,int low,int high){
        if(low<high){
            int middle = getMiddle(items, low, high);
            quicksort(items,low,middle-1);
            quicksort(items,middle+1,high);
        }
    }



    public static void main(String[] args){
        QuickSortPlus quickSortPlus = new QuickSortPlus();
        User xiaoming = new User(3, "xiaoming");
        User xiaohong = new User(2, "小红");
        User laozhang = new User(4, "laozhang");
        User[] users= {
                xiaohong,xiaoming,laozhang
        };
      /*  Integer[] data={
          2,5,23,52,2,3,12,5,3,4,23,42,656,2,3,5,345,3,34
        };*/
        quickSortPlus.quicksort(users,0,users.length-1);
        for (User e:
                users) {
            System.out.println(e);
        }
    }
}
