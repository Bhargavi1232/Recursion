import java.util.*;
//skiping apple string from a given string

class removeapplefromstring{
    public static void main(String [] args){
        remove("","bharapplegavi");
    }
    static void remove(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple")){
            remove(p,up.substring(5));
        }
        else{
            remove(p+ch,up.substring(1));
        }
    }
}