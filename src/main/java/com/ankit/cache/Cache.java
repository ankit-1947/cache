package com.ankit.cache;

import java.util.Map;
import java.util.Set;

public interface Cache<K,V> {
    V put(K key,V value);
    void putAll(Map<? extends K,? extends V> cache);
    V get(K key);
    Map<K,V> getAll(Set<? extends K> keys);
    V remove(K key);
    void close();
}
