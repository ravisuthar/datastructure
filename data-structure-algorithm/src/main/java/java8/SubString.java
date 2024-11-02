package java8;

public class SubString {
    public static void main(String[] args) {
        System.out.println(getMaxSubstrings("aababaabce", 3));
    }

    public static int getMaxSubstrings(String s, int k) {

    /*
        int count=0;
        int startIndex=0;
        int endIndex=k-1;
        while(endIndex < s.length()){

            String subString = s.substring(startIndex, endIndex+1);
            boolean isPolindrom = checkPolindrom(subString);
            System.out.println("subString: "+subString+",  isPolindrom:"+isPolindrom);
            if(isPolindrom){
                count++;
            }

            startIndex++;
            endIndex++;
        }*/

        int count=0;

        for(int i=0; i<s.length(); i++){

            for(int j=i+1; j<=s.length(); j++){

                String subString = s.substring(i, j);
                //System.out.println("subString: "+subString+",  isPolindrom:"+checkPolindrom(subString));
                if(subString.length() >=k && checkPolindrom(subString)){
                    System.out.println("subString: "+subString+",  isPolindrom:"+checkPolindrom(subString));
                    count++;
                }
            }
        }


        return count;

    }


    private static boolean checkPolindrom(String s){

        char[] charArray = s.toCharArray();

        int i=0;
        int j=s.length()-1;

        while(i<=j){
            if(charArray[i]!=charArray[j]){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
