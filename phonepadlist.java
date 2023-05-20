import java.util.*;
//printing combinations when we press "12" keys in oldtype of keypads in the arraylist
//when 1->"abc" 2->"def" 3->"ghi" 4->"jkl" 5->"mno" 6->"pqr" 7->"stu" 8->"vwx" 9->"yz"

class phonepadlist{
    public static void main(String [] args){
        System.out.println(keyboardreturn("","12"));
    }
    static ArrayList<String> keyboardreturn(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> list=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            list.addAll(keyboardreturn(p+ch,up.substring(1)));
        }
        return list;
    }
}