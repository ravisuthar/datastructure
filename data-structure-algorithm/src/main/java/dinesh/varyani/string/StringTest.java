package dinesh.varyani.string;

public class StringTest {
    public static void main(String[] args) {


        String s1="abc123";
        String s2="abc"+123;
        int i=123;
        String s3="abc"+i;

        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s2==s3);//false
    }
}
