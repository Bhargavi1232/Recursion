import java.util.*;
//removing character a from the given string
//by not passing answer string as arguments

class removeafromstring2{
    public static void main(String [] args){
        System.out.println(remove("bhargavi"));
    }
    static String remove(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return remove(up.substring(1));
        }
        else{
            return ch+remove(up.substring(1));
        }
    }
}