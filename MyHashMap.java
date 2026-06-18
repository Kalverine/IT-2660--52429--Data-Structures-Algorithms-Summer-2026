import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("unchecked")
  
public class MyHashMap<K, V> implements MyMap<K, V> {
private int capacity = 4, size = 0;
  private LinkedList<MyMap.Entry<K, V>>[] table = new LinkedList[capacity];
  
@Override public V put(K k, V v) {
  int i = k.hashCode() & (capacity - 1);
if (table[i] == null) table[i] = new LinkedList<>();
  for (var e : table[i]) if (e.key.equals(k)) { V old = e.value; e.value = v; return old; }
  table[i].add(new MyMap.Entry<>(k, v)); size++; return v;
}

@Override public V get(K k) {
  int i = k.hashCode() & (capacity - 1);
  if (table[i] != null) for (var e : table[i]) if (e.key.equals(k)) return e.value;
  return null;
}

@Override public void remove(K k) {
  int i = k.hashCode() & (capacity - 1);
  if (table[i] != null) for (var e : table[i]) if (e.key.equals(k)) { table[i].remove(e); size--; break; }
}

@Override public boolean containsKey(K k) { return get(k) != null; }
@Override public void clear() { size = 0; Arrays.fill(table, null); }
@Override public boolean isEmpty() { return size == 0; }
@Override public int size() { return size; }
@Override public String toString() { return entrySet().toString(); }

@Override public Set<MyMap.Entry<K, V>> entrySet() {
  Set<MyMap.Entry<K, V>> s = new HashSet<>(); for (var b : table) if (b != null) s.addAll(b); return s;
}
  @Override public Set<K> keySet() {
    Set<K> s = new HashSet<>(); for (var e : entrySet()) s.add(e.key); return s;
  }
  @Override public Collection<V> values() {
    List<V> l = new ArrayList<>(); for (var e : entrySet()) l.add(e.value); return l;
  }
  @Override public boolean containsValue(V v) {
    for (var e : entrySet()) if (e.value.equals(v)) return true; return false;
  }
}
