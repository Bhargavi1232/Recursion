import java.util.*;
//printing subsequences of string "abc" and ascii values of subseuences

class subseqAscii{
    public static void main(String args[]){
        sequence("","abc");
    }
    static void sequence(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        sequence(p+ch,up.substring(1));
        sequence(p,up.substring(1));
        sequence(p+(ch+0),up.substring(1));
    }
}