import java.util.*;
//skiping app string from the given string not apple

class removeappnotapplefromstring{
    public static void main(String [] args){
        skipappnotApple("", "bharwantappnotapples");
    }
    static void skipappnotApple(String p,String up)
    {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(up.startsWith("app") && !up.startsWith("apple")){
            skipappnotApple(p,up.substring(3));
        }
        else{
            skipappnotApple(p+ch,up.substring(1));
        }

    }
}