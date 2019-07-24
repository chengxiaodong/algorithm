import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:陈晓东
 * @Date:2019/7/24 11:43
 * @Email:2775398338@qq.com
 * @Description:
 *      @OverWrite:重写
 *             （1）方法名以及参数需要完全一致
 *             （2）子类方法抛出的异常应该是父类方法的子类
 *             （3）子类方法返回的类型应该是父类方法返回类型的子类
 */
class A {
    private Integer e;
    public Number write(Integer t) throws IOException{
        return null;
    }

}
class B extends A{
    @Override
    public Integer write(Integer t) throws FileNotFoundException{
        return null;
    }
}
public class _OverWrite
{
    public void test01(){

    }
    public static void main(String[] args){

    }
}
