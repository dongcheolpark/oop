package com.Practice4;

public class Dictionary extends PairMap {
    class NoItemException extends Exception {
        public NoItemException() {
            super();
        }
    }

    private int size = 0;

    public Dictionary(int size) {
        keyArray = new String[size];
        valueArray = new String[size];
    }
    @Override
    String get(String key) {
        try {
            var index = find(key);
            var res = valueArray[index];
            return res;
        }
        catch (NoItemException e) {
            return null;
        }
    }
    @Override
    void put(String key, String value) {
        int index;
        try {
            index = find(key);
        }
        catch (NoItemException e) {
            index = size;
            size++;
        }
        keyArray[index] = key;
        valueArray[index] = value;
    }

    @Override
    String delete(String key) {
        try {
            var index = find(key);
            var res = valueArray[index];
            for(int i = index+1;i<size;i++) { // 원소를 한칸씩 앞으로 가져온다.
                valueArray[i-1] = valueArray[i];
                keyArray[i-1] = keyArray[i];
            }
            size--;
            return res;
        }
        catch (NoItemException e) {
            return null;
        }
    }

    @Override
    int length() {
        return size;
    }

    private int find(String key) throws NoItemException {
        for(int i = 0;i<size;i++) {
            if (keyArray[i].equals(key)) {
                return i;
            }
        }
        throw new NoItemException();
    }
}
