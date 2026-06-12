import java.util.LinkedList;

public class MyHashMap<K, V> implements MyMap<K, V> {
private static int DEFAULT_INITIAL_CAPACITY = 4;
private static int MAXIMUM_CAPACITY =1 << 30;
private int capacity;
  private float loadFactorThreshold;
  private int size = 0;
  private LinkedList<Entry<K, V>>[] table;

  @Override
  public V put(K key, V value) {
    return null;
}

@Override
  public V get(K key) {
    return null;
  }

}
