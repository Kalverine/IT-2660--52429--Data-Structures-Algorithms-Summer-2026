import java.util.LinkedList;

public class MyHashMap<K, V> implements MyMap<K, V> {
private int capacity = 4, size = 0;
  private LinkedLost<MyMap.Entry<K, V>>[] table = new LinkedList[capacity];
  
@Override public V put(K k, V v) {
  int i = k.hashCode() & (capacity - 1);
