import java.util.*;
//printing  count of combinations when we press "12" keys in oldtype of keypads 
//when 1->"abc" 2->"def" 3->"ghi" 4->"jkl" 5->"mno" 6->"pqr" 7->"stu" 8->"vwx" 9->"yz"

class phonepadCount{
    public static void main(String [] args){
        System.out.println(keyboard("","12"));
    }
    static int keyboard(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<(digit*3);i++){
            char ch=(char)('a'+i);
            count=count+keyboard(p+ch,up.substring(1));
        }
        return count;
    }
}