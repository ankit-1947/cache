package com.ankit.cache.store;

import com.ankit.cache.Cache;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class LRUCache<K,V> implements Cache<K,V> {

    private int size;
    private ConcurrentMap<K,V> store;

    LRUCache(int size)
    {
        store = new ConcurrentHashMap<>(size);
        this.size = size;
    }

    @Override
    public V put(K key, V value) {
        return store.put(key,value);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> cache) {
        store.putAll(cache);
    }

    @Override
    public V get(K key) {
        return store.get(key);
    }

    @Override
    public Map<K, V> getAll(Set<? extends K> keys) {
        return keys.stream().collect(Collectors.toMap(key -> key , this::get));
    }

    @Override
    public V remove(K key) {
        return store.remove(key);
    }

    @Override
    public void close() {
        store.clear();
    }
}
