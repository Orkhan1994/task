package task9;

import java.util.List;

public class Main {
    public static void main(String[] args) {



    }

    public static boolean palindromeString(String string){
        int midd=string.length()/2;
        for (int i=0;i<midd;i++){
            if (!(string.charAt(i) == string.charAt(string.length() - 1 - i))) {
                return  false;
            }
        }
              return true;
    }

    public  void cutStringGivenInt(String s,int number){
        char [] chars=new char[number];
        for (int i=0;i<chars.length;i++){
            chars[i]=s.charAt(i);
        }
        for (int i=0;i<chars.length;i++){
            System.out.print(chars[i]);
        }
        System.out.print(" ");
    }


    public  void  takeListFromStringsAndCutGivenInt(int number, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.length() < number) {
                String s = "0";

                while (str.length() < number) {
                    str = s + str;
                }
                System.out.print(str + " ");
            } else if (str.length() > number) {
                cutStringGivenInt(str,number);

            } else {

                System.out.print(str + " ");
            }


        }
    }

}
