package cracking.the.coding.interview.string;

/*
String Rotation; Assume you have a method isSubstring which checks if one word is a substring
of another. Given two strings, si and s2, write code to check if s2 is a rotation of si using only one
call to isSubstrin g (e.g.,"waterbottle"isa rotation of'erbottlewat").
 */
public class SubString {

    //erbottlewat
    //erbottlewaterbottlewat

    //waterbottlewaterbottle
    //   erbottlewat
    public static void main(String[] args) {

        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        String s1s1 = s1 + s1;
        String s2s2 = s2 + s2;

        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s1s1="+s1s1);
        System.out.println("s2s2="+s2s2);


        System.out.println(s1s1.contains(s2));
        System.out.println(s2s2.contains(s1));
    }
}
