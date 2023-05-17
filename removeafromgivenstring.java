import java.util.*;
//removing character a from the given string
//by passing answer string as arguments

class removeafromgivenstring{
    public static void main(String [] args){
        remove("","bhargavi");
    }

    static void remove(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            remove(p,up.substring(1));
        }
        else{
            remove(p+ch,up.substring(1));
        }
    }
}