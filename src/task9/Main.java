package task9;

public class Main {
    public static void main(String[] args) {

        String s="";
        boolean b=palindromeString(s);
        if (b==true){
            System.out.println(" String is palindrome");
        }else
            System.out.println("String is not palindrome");
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

}
