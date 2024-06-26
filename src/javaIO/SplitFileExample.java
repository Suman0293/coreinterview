package javaIO;

import java.io.*;
import java.util.Scanner;

public class SplitFileExample {
    public static void main(String[] args) throws IOException {

        //find no of lines
        String s = "E:\\IoFiles\\new.txt";
        int count = 0;
        int nol = 2;

        File f = new File(s);
        Scanner sc = new Scanner(f);

        while (sc.hasNext()) {
            sc.next();
            count++;
        }
        System.out.println("no of lines = " + count);

        //no of files
        int temp = count / nol;
        int rem = count % nol;
        int nof = 0;
        if (temp != 0) {
            nof = temp;
            if (rem != 0) {
                nof++;
            } else {
                nof = temp;
            }
        }
        System.out.println("No of file = " + nof);

        //create file and write data
        BufferedReader br = new BufferedReader(new FileReader(s));
        String str;
        for (int j = 1; j <= nof; j++) {
            BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\IoFiles\\Aftersplit" + j + ".txt"));
            str = br.readLine();

            for (int i = 0; i <= nol; i++) {
                if (str != null) {
                    bw.write(str);
                    str = br.readLine();
                    if (i != nol) {
                        bw.newLine();
                    }
                }
            }
            bw.close();
        }
        br.close();

    }
}
