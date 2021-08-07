import java.util.HashMap;
import java.util.LinkedList;

public class CustomHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap;
        LinkedList<String> strings;


        MyHashMap<String, Integer> stringHashMap = new MyHashMap<>();

        stringHashMap.put("a", 1);
        stringHashMap.put("b", 2);
        stringHashMap.put("c", 3);
        stringHashMap.put("d", 4);
        stringHashMap.put("e", 6);
        stringHashMap.put("f", 7);
        stringHashMap.put("g", 8);
        stringHashMap.put("h", 9);
        stringHashMap.put("i", 10);
        stringHashMap.put("j", 11);
        stringHashMap.put("k", 12);
        stringHashMap.put("l", 13);
        stringHashMap.put("m", 14);
        stringHashMap.put("n", 15);
        stringHashMap.put("o", 16);
        stringHashMap.put("p", 17);
        stringHashMap.put("q", 18);


    }

}

class MyHashMap<K, V>{

    private int capacity = 16;
    private Entry<K, V>[] table;

    public MyHashMap(){
        table = new Entry[capacity];
    }

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        table = new Entry[capacity];
    }

    public int getIndex(K key){
        if(key == null){
            return 0;
        }
        return key.hashCode() & (capacity - 1);
    }

    public void put(K key, V value){
        int index = getIndex(key);
        Entry entry = new Entry(key, value, null);
        if(table[index] == null){
            table[index] = entry;
        } else {
            Entry<K, V> currentNode = table[index];
            Entry<K, V> previousNode = null;
            while (currentNode != null){
                if(currentNode.getKey().equals(key)){
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }

            if(previousNode != null){
                previousNode.setNext(entry);
            }
        }
    }

    public V  get(K key){
        V value = null;
        int index = getIndex(key);
        Entry <K, V> currentNode = table[index];
        while(currentNode != null){
            if(currentNode.getKey().equals(key)){
                value = currentNode.getValue();
                break;
            }
            currentNode = currentNode.getNext();
        }
        return value;
    }

    public V remove(K key){
        V value = null;
        int index = getIndex(key);
        Entry<K, V> currentNode = table[index];
        Entry<K, V> previousNode = null;

        while (currentNode != null){
            if(currentNode.getKey().equals(key)){
                if(previousNode == null){
                    currentNode = currentNode.getNext();
                    table[index] = currentNode;
                } else {
                    previousNode.setNext(currentNode.getNext());
                }
                value = currentNode.getValue();
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        return value;
    }

}

class Entry<K, V> {
    private K key;
    private V value;
    private Entry<K, V> next;

    public Entry(K key, V value, Entry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
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

    public Entry<K, V> getNext() {
        return next;
    }

    public void setNext(Entry<K, V> next) {
        this.next = next;
    }
}

