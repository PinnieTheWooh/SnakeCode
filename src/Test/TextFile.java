package Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TextFile {
    public static void main(String[] args) throws IOException
    {
        int teller=0;
        List<String> list=new ArrayList<>();
        //met dit systeem kan er geschiedenis worden bijgehouden
        FileWriter fw= new FileWriter("test.txt",false);
        PrintWriter out = new PrintWriter(fw);
        for (int i=0;i<10;i++){
            out.println("lijnnummer:"+teller);//hier komt in de plaats de High Score van de speler
            teller+=1;
        }
        out.close();
        //String directory=System.getProperty("user.dir","test.txt");
        //Scanner scanner= new Scanner(new File("Path");

        Scanner scanner=new Scanner(new File("test.txt"));
        while (scanner.hasNextLine()) {
            String lijn=scanner.nextLine();
            System.out.println(lijn);
            list.add(lijn);
            //Collections.addAll(list,st);
        }
        /*
        for (String[] s:list){
            System.out.println(s);
        }

         */
    }
}
