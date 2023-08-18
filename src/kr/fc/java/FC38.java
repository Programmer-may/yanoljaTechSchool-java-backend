package kr.fc.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FC38 {
    public static void main(String[] args) {
        /*
        try {
            FileInputStream fi = new FileInputStream("pic.jpg");
            //0~255(픽셀)
            int data;
            int cnt=0;
            while ((data = fi.read()) != -1) {
                System.out.println(data);
                cnt++;
            }
            System.out.println(cnt);
        } catch (Exception e) {
            e.printStackTrace();
        }

         */
        try {
            FileInputStream fi = new FileInputStream("pic.jpg");
            BufferedInputStream bis = new BufferedInputStream(fi);
            //0~255(픽셀)

            FileOutputStream fo= new FileOutputStream("newpic.jpg");
            BufferedOutputStream bo = new BufferedOutputStream(fo);
            int data;
            int cnt=0;
            while ((data = bis.read()) != -1) {
                System.out.println(data);
                cnt++;
                bo.write(data);
            }
            bis.close();
            bo.flush();
            bo.close();
            System.out.println(cnt);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
