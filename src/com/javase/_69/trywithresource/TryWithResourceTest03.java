package com.javase._69.trywithresource;

import java.io.IOException;

public class TryWithResourceTest03 {

    public static void main(String[] args) {

        try (Computer computer = new Computer()) {
            //
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Computer implements AutoCloseable {

    @Override
    public void close() throws IOException {
        // override metotlarda yeni bir checked exception ekleyemeyiz.
        // ya da varolan checked exception'ın super type'ını yazamayız.
    }
}