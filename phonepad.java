import java.util.*;
//printing combinations when we press "12" keys in oldtype of keypads 
//when 1->"abc" 2->"def" 3->"ghi" 4->"jkl" 5->"mno" 6->"pqr" 7->"stu" 8->"vwx" 9->"yz"

class phonepad{
    public static void main(String [] args){
        keyboard("","12");
    }
    static void keyboard(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            keyboard(p+ch,up.substring(1));
        }
    }
}