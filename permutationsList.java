import java.util.*;

class permutationsList{
    public static void main(String [] args){
        System.out.println(permulist("","abc"));
    }
    static ArrayList<String> permulist(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list; 
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permulist(f+ch+s, up.substring(1)));
        }
        return ans;
    }
}