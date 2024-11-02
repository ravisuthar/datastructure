package leetcode.must.doo;

//https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4425/
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class LeetCode1342 {
    public static void main(String[] args) {

        int n=123;
        int step=0;
        do{
            if(n%2==0){
                n=n/2;
            }else{
                n=n-1;
            }
            step++;
        }while(n!=0);

        System.out.println(step);
    }
}
