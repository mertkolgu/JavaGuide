package com.javase._54.staticnestedclass;

// singleton design pattern
public class BillPughSingleton {
    // amaç ilgili sınıftan sadece bir tane obje oluştuğunu garanti etmektir.
    private BillPughSingleton() {
        //
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
