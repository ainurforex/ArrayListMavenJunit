package ru.ainurforex.arraylist;

import ru.ainurforex.arraylist.exceptions.*;
import ru.ainurforex.arraylist.exceptions.ArrayIndexOutOfBoundsException;

import java.util.Arrays;

public class StringList implements StringListInterface {
    private String[] arrayList;
    private int size;

    public StringList() {
        size = 0;
        arrayList = new String[10];
    }

    public StringList(int initSize) {
        size =0;
        arrayList = new String[initSize];
    }

    @Override
    public String toString() {
        String arrayString = "";
        if (size == 0) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            arrayString = arrayString + arrayList[i] + " ";
        }
        return arrayString;
    }

    @Override
    public String add(String item) {
        validateSize();
        validateItem(item);
        arrayList[size++] = item;
        return item;
    }

    @Override
    public String add(int index, String item) {
        validateSize();
        validateItem(item);
        validateIndex(index);
        if (index == size) {
            arrayList[size++] = item;
            return item;
        }

        System.arraycopy(arrayList, index, arrayList, index + 1, size - index);
        arrayList[index] = item;
        size++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        validateSize();
        validateItem(item);
        validateIndex(index);
        arrayList[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        validateItem(item);
        int index = indexOf(item);
        if (index == -1) {
            throw new NotSuchElementException();
        }

        if (index != size) {
            System.arraycopy(arrayList, index + 1, arrayList, index, size - index);
        }
        size--;
        return item;
    }

    @Override
    public String remove(int index) {
        validateIndex(index);
        String item = arrayList[index];
        if (index != size) {
            System.arraycopy(arrayList, index + 1, arrayList, index, size - index);
        }
        size--;
        return item;
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (arrayList[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = arrayList.length - 1; i >= 0; i--) {
            if (arrayList[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        validateIndex(index);
        return arrayList[index];
    }

    @Override
    public boolean equals(StringListInterface otherList) {
        if (otherList.toString() == null) {
            throw new ArrayListIsEmptyException();
        }
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String[] toArray() {
        String[]result=new String[size];
        System.arraycopy(arrayList,0,result,0,size);
        return result;
    }


    private void validateIndex(int index) {
        if (index > size - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void validateItem(String item) {
        if (item == null) {
            throw new NullItemException();
        }
    }

    private void validateSize() {
        if (size == arrayList.length) {
            String[]arrayListCopy=arrayList;
            arrayList=new String[size+1+Math.abs(size/3)];
           System.arraycopy(arrayListCopy, 0, arrayList, 0, arrayListCopy.length);
        }
    }
}
