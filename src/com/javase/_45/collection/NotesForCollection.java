package com.javase._45.collection;

public class NotesForCollection {
    //
}

// Collection
// java.util paketinde yer alırlar.

// java.util.Collection
// java.util.List
// java.util.Set
// java.util.Map
// java.util.Queue

// Ordered & Unordered
// ordered yapıda elemanlar belli bir sırada tutulur.
// java.util.ArrayList ordered bir yapıya sahiptir
// elemanlar eklediğimiz sırada tutulur. index based

// java.util.HashMap / java.util.HashSet ise unordered bir yapıya sahiptir.
// elemanlar eklediğimiz sırada TUTULMAZ.

// Sorted & UnSorted
// elemanların sıralı olması özelliği.

// Natural Order -> alfabetik sıralama ya da nümerik sıralama mantığı
// Integer, String...

// Her şeyin sıralı olmasını düşünemeyiz.
// kendimiz bir Person sınıfı oluşturduğumuzda ve objeler oluşturduğumuzda neye göre kime göre sıralanacak?
// bu durumda Comparable, Comparator gibi interfaceleri kullanırız.

// Car gibi sınıf olsun neye göre sıralanacaktır
// java bunu bilmez kendimiz ilgili sıralama mantığını implement ederiz.
// TreeSet ve TreeMap sorted özelliğe sahiptir.

//--------------------------------------------------------
// java.util.List

// public interface List<E> extends Collection<E> {
// List duplicate elemana izin verir, elemanlar index based olarak tutulur.

// java.util.ArrayList
// java.util.LinkedList
// java.util.Vector

// ArrayList, random access ve iteration söz konusu olduğunda daha hızlı çalışır.
// LinkedList, ekleme/çıkartma add/delete işlemi bol miktarda kullanılıyorsa daha verimli olacaktır.
// LinkedList aynı zamanda Queue interfacesini implement etmektedir.

// Vector, javanın 1.2 versiyonundan beri vardır.
// metotları synchronized özelliğe sahiptir. thread safetir.
// daha yavaş çalışır.

//--------------------------------------------------------
// java.util.Set
// public interface Set<E> extends Collection<E> {
// Set- > küme demek.
// duplicate elemana izin vermez!

// java.util.HashSet
// java.util.LinkedHashSet
// java.util.TreeSet

// HashSet -> unordered bir yapıya sahiptir.
// elemanlar eklenildiği sırada tutulmaz.

// LinkedHashSet -> ordered bir yapıya sahiptir.
// elemanlar eklenildiği sırada TUTULUR!

// TreeSet -> elemanlar sorted şekilde tutulur.

//--------------------------------------------------------
// public interface Map<K, V> {

// K -> key
// V -> value çifti şeklinde tutulur.
// key unique olmak zorundadır.
// value unique olmak zorunda değildir.

// java.util.HashMap
// unordered bir yapıya sahiptir. elemanlar eklenildiği sırada tutulmaz.
// HashMap null key'e izin verir.
// value olarak da null eklenebilir.

// java.util.Hashtable
// DİKKAT t küçük!
// Vector sınıfı gibi javanın eski versiyonlarından beri vardır.
// metotları synchronized özellik gösterir.
// Hashtable, null key ya da value eklenmesine izin vermez!

// java.util.TreeMap
// Sorted özelliğe sahiptir.
// elemanları sıralı şekilde tutulur. key'e göre sıralı şekilde!

// java.util.Queue
// public interface Queue<E> extends Collection<E> {
// FIFO (first in first out)

// java.util.PriorityQueue
// public interface Deque<E> extends Queue<E> {