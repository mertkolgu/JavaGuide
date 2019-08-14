package com.javase._33.exceptionhierarchy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHierarchyTest03 {

    public static void main(String[] args) throws IOException {

        // bir try ifadesi birden fazla catch ifadesi ile devam edebilir.
        // catch ifadesinde yer alan exceptionların hiyerarşisi/sırası önemlidir.

        // public FileReader(String fileName) throws FileNotFoundException
        // public int read() throws IOException {
        // public class FileNotFoundException extends IOException
        FileReader fr = null;

        try {
            fr = new FileReader("file.txt");
            fr.read();
        } catch (FileNotFoundException e) {
            //
        } catch (ArithmeticException e1) {
            // FileNotFoundException ya da IOException aralarında hiyerarşi yok
            // ArithmeticException IS-A Exception olduğu için önce yer almalıdır.
        } catch (IOException e2) {
            //
        } catch (Exception e3) {
            //
        } finally {
            fr.close();
        }

        // birden fazla catch bloğu olduğunda aralarında hiyerarşik bir bağlantı olduğunda
        // bu durumda alt sınıf/subclass önce yer almalıdır.
        // aralarında bir hiyerarşi yoksa hangisinin önce olduğu önemli değildir.

//        try {
//            FileReader fr = new FileReader("file.txt");
//            fr.read();
//        } catch (IOException e1) {
//            //
//        } catch (FileNotFoundException e2) {
//            //
//        }
    }
}