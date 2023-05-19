import java.util.*;
//printing subsequneces of string and Ascii values of Subsequences in the Arraylist

class subsequenceinlist{
    public static void main(String args[]){
        System.out.println(sequence("","abc"));
    }
    static ArrayList<String> sequence(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=sequence(p+ch,up.substring(1));
        ArrayList<String> right=sequence(p,up.substring(1));
        ArrayList<String> third =sequence(p+(ch+0),up.substring(1));
        left.addAll(right);
        left.addAll(third);
        return left;
    }
} 