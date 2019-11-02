package com.javase._50.generics;

public class GenericsTest07 {

    public static void main(String[] args) {
        GenericClass<Integer> object = new GenericClass<>(2000);
        GenericClass<String> object2 = new GenericClass<>("key");
        GenericClassV2<String, Boolean> object3 = new GenericClassV2<>("mert", true);
    }
}

class GenericClass<T> {
    // T, type parameter
    private T ref;

    public GenericClass(T ref) {
        this.ref = ref;
    }

    public T getRef() {
        return ref;
    }

    public void setRef(T ref) {
        this.ref = ref;
    }
}

class GenericClassV2<K, V> {
    // instance değişken
    private K key;
    private V value;

    public GenericClassV2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
