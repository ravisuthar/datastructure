package collections;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ExceptionHiearchy {
    public static void main(String[] args) {


      //  Set<? super IOException> s1 = new HashSet<? super IOException>(); compilation
        Set<? super IOException> s2 = new HashSet<IOException>();
        Set<? super IOException> s3 = new HashSet<Exception>();
        //Set<? super IOException> s4 = new HashSet<FileNotFoundException>(); //compilation
    }
}
