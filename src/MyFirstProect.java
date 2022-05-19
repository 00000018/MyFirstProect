import java.io.*;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.FileReader;

public class MyFirstProect {
    public static void main(String[] args) throws FileNotFoundException {

        StringBuffer stringBuffer = new StringBuffer();

        try {
            FileInputStream fileInputStream = new FileInputStream("NewFile.txt");
            int i = -1;
            while ((i = fileInputStream.read()) != -1){

                stringBuffer.append((char) i);

            }
        }catch (Exception e){}


        System.out.println(stringBuffer);
        char[] chars = new char[stringBuffer.length()];

        int key = 5;  // ключ сдвига букв, с минусом будет расшифровывать

        for (int n = 0; n < stringBuffer.length(); n++){
            if (Character.isLetter(stringBuffer.charAt(n))){
                chars[n] = (char) ((((int)(stringBuffer.charAt(n)) - 1040 + key)%64) + 1040);
                //1040 буква А в аски, 64 количество букв больших и маленьких

            }else chars[n] = stringBuffer.charAt(n);
        }
        System.out.println(chars);
        try {
            PrintStream printStream = new PrintStream("File.txt");
            printStream.println(chars);

        }catch (Exception ex){}
        }
    }






