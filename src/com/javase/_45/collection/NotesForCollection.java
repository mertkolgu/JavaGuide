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
// java.util.Iterator
// java.util.ListIterator

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
// java.util.Stack

// ArrayList, random access ve iteration söz konusu olduğunda daha hızlı çalışır.

// LinkedList, ekleme/çıkartma add/delete işlemi bol miktarda kullanılıyorsa daha verimli olacaktır.
// LinkedList aynı zamanda Queue interfacesini implement etmektedir.

// Vector, javanın 1.2 versiyonundan beri vardır.
// metotları synchronized özelliğe sahiptir. thread safetir.
// daha yavaş çalışır.

// Stack, LIFO (Last In First Out) şeklinde çalışır.
// bilgisayarlarda ve recursive fonksiyonlarda oldukça fazla kullanılır.

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
// ekleme, çıkarma ve arama methodları sabit zamanda (O(1)) çalışır.

// LinkedHashSet -> ordered bir yapıya sahiptir.
// elemanlar eklenildiği sırada TUTULUR!
// ekleme, çıkarma ve arama methodları sabit zamanda (O(1)) çalışır.

// TreeSet -> elemanlar sorted şekilde tutulur.
// ekleme, çıkarma ve arama methodları O(log(n)) zamanda çalışır.

// sıralı değer eklersek TreeSet, HashSet'e göre daha avantajlı
// normal değer eklersek HashSet, TreeSet'e göre daha avantajlı
// LinkedHashSet ise bunların ikisi arasında performanslı

//--------------------------------------------------------
// public interface Map<K, V> {

// K -> key (anahtar)
// V -> value (değer) çifti şeklinde tutulur.
// key unique (sadece bir kez var) olmak zorundadır.
// value unique olmak zorunda değildir.

// java.util.HashMap
// unordered bir yapıya sahiptir. elemanlar eklenildiği sırada tutulmaz.
// HashMap null key'e izin verir.
// value olarak da null eklenebilir.

// java.util.LinkedHashMap
// ordered bir yapıya sahiptir.
// elemanlar eklenildiği sırada TUTULUR!
// public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V> {

// java.util.Hashtable
// DİKKAT t küçük!
// Vector sınıfı gibi javanın eski versiyonlarından beri vardır.
// metotları synchronized özellik gösterir.
// Hashtable, null key ya da value eklenmesine izin vermez!

// java.util.TreeMap
// Sorted özelliğe sahiptir.
// elemanları sıralı şekilde tutulur. key'e göre sıralı şekilde!

//--------------------------------------------------------
// java.util.Queue
// public interface Queue<E> extends Collection<E> {
// FIFO (first in first out)
// add(eleman) -> elemanı kuyruğa ekler. ekleyemezse hata fırlatır.
// offer(eleman) -> elemanı kuyruğa ekler. eklerse true döner, ekleyemezse false döner.
// remove() -> kuyruğun en başındaki elemanı kuyruktan çıkarır. kuyruk boşsa hata fırlatır.
// poll() -> kuyruğun en başındaki elemanı kuyruktan çıkarır. kuyruk boşsa null döner.
// element() -> kuyruğun en başındaki elemanı döner. kuyruk boşsa hata fırlatır.
// peek() -> kuyruğun en başındaki elemanı döner. kuyruk boşsa null döner.

// java.util.PriorityQueue
// public interface Deque<E> extends Queue<E> {
// PriorityQueue normal Queue mantığı gibi davranmaz. Elemanlar öncelik sıralarına göre yüksek öncelik kazanıp;
// - Integer'larda en yüksek öncelik en küçük sayıda, en düşük öncelik en büyük sayıdadır.
// - String'lerde en yüksek öncelik alfabetik olarak sözlükte en önce gelen String'te,
//   en düşük öncelik alfabetik olarak sözlükte en son gelen String'tedir.
// kuyrukta önlere geçer.
// add() veya offer() -> kuyruğa eleman ekler
// clear() -> kuyruğu temizler
// contains(Object o) -> o objesi kuyruğun içindeyse true, değilse false döner.
// peek() -> kuyruğun en başındaki elemanı döner. kuyruk boşsa null döner.
// poll() -> kuyruğun en başındaki elemanı kuyruktan çıkarır ve değer olarak döner. kuyruk boşsa null döner.
// size() -> kuyruğun içindeki eleman sayısını döner.

//--------------------------------------------------------
// java.util.Iterator
// Set, Queue ve List interface'i implemente eden class'larda kullanılabilir.
// previous() metodu yoktur.

// java.util.ListIterator
// Sadece List interface'i implemente eden class'larda kullanılır.
// next() ve previous() metodu vardır.
// ekstradan add() metodu bulunur.