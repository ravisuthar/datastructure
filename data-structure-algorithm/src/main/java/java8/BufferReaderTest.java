package java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReaderTest {
    public static void main(String[] args) throws  Exception {

        int ch;
        FileReader bf = new FileReader( "C:\\Users\\sutha\\Documents\\The Power of Habit.txt");
        while( (ch =bf.read())!=-1){
            System.out.print((char)ch);
            System.exit(-1);
        }
    }
}
