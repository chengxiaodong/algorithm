/**
 * @Author:陈晓东
 * @Date:2019/7/27 09:05
 * @Email:2775398338@qq.com
 * @Description:
 *      有字符串a:'abcddefabcabcdeedef'
 *              b:'abcabefg'
 *      求b在a中的最长相同子串长度
 */
//O(n^2)
public class MaxSubString {
    //穷举法，穷举出a中的字串序列跨度为b.length
    public int maxSubString(String a,String b){
        //穷举
        int maxMatch=0;
        for (int i = 0,len=a.length(); i<len; i++) {
            //穷举子串  ===>字串：[i,i+b.lenght-1]
            //substring [i,j）
            int next=i+b.length()-1;
            if (next>a.length()-1){
                next=a.length()-1;
            }
            String subString=a.substring(i,next+1);
            //subString与b匹配
            int match=0;
            out:for (int j = 0; j < b.length(); j++) {
                if(subString.charAt(j)==b.charAt(j)){
                    match++;
                }else
                    break out;
            }
            if (match>maxMatch){
                maxMatch=match;
                System.out.println("最大字串首指针："+(i+1));
            }
            //一次匹配结束
        }
        return maxMatch;
    }
    public static void main(String[] args){
        MaxSubString maxSubString = new MaxSubString();
        int i = maxSubString.maxSubString("abcddefabcabcdeedef", "abcabefg");
        System.out.println(i);
    }
}
