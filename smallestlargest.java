import java.util.*;
public class smallestlargest{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str1=sc.nextLine();
        String[] sent=str1.split(" ");
        String small=sent[0];
        String larg=sent[0];
        for (int i=1;i<sent.length;i++) {
            if (sent[i].length()< small.length()) {
                small=sent[i];
            }
            if (sent[i].length()>larg.length()) {
                larg=sent[i];
            }
        }
        System.out.println("Small word: "+small);
        System.out.println("Larg word: "+larg);
    }
}