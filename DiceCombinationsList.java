import java.util.*;
//printing combinations of numbers on dice(sum of them can give given target number ) in a arraylist

class DiceCombinationsList{
    public static void main(String [] args){
        System.out.println(dice("",6));
    }
    static ArrayList<String> dice(String p,int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            list.addAll(dice(p+i,target-i));
        }
        return list;
    }
}