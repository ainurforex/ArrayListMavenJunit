package ru.ainurforex.arraylist;
public class Save {}

/*
public class Save {
    @Override
    public String add(String item) {
        validateItem(item);
        if (size() == 0) {
            arrayList = new String[1];
            arrayList[0] = item;
            return item;
        } else {
            String[] arrayListCopy = arrayList;
            int arrayListSize = arrayList.length;
            arrayList = new String[arrayListSize + 1];
            System.arraycopy(arrayListCopy, 0, arrayList, 0, arrayListCopy.length);
            arrayList[arrayList.length - 1] = item;
            return item;
        }

    }

    @Override
    public String add(int index, String item) {
        validateItem(item);
        validateIndex(index);
        String[] arrayListCopy = arrayList;
        int arrayListSize = arrayList.length;
        arrayList = new String[arrayListSize + 1];
        System.arraycopy(arrayListCopy, 0, arrayList, 0, index);
        System.arraycopy(arrayListCopy, index, arrayList, index + 1, arrayListCopy.length - index);
        arrayList[index] = item;
        return item;
    }

    @Override
    public String set(int index, String item) {
        validateItem(item);
        validateIndex(index);
        arrayList[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        int index = indexOf(item);
        if (index == -1) {
            throw new NotSuchElementException();
        }
        String[] arrayListCopy = arrayList;
        int arrayListSize = arrayList.length;
        arrayList = new String[arrayListSize - 1];
        System.arraycopy(arrayListCopy, 0, arrayList, 0, index);
        System.arraycopy(arrayListCopy, index + 1, arrayList, index, arrayListCopy.length - index - 1);
        return item;
    }

    @Override
    public String remove(int index) {
        validateIndex(index);
        String item = get(index);
        String[] arrayListCopy = arrayList;
        int arrayListSize = arrayList.length;
        arrayList = new String[arrayListSize - 1];
        System.arraycopy(arrayListCopy, 0, arrayList, 0, index);
        System.arraycopy(arrayListCopy, index + 1, arrayList, index, arrayListCopy.length - index - 1);
        return item;
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < arrayList.length; i++) {
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
        if (otherList.size() == 0 || size() == 0) {
            throw new ArrayListIsEmptyException();
        }
        if (arrayList.length != otherList.size()) {
            return false;
        }

        for (int i = 0; i < arrayList.length; i++) {
            if (!get(i).equals(otherList.get(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int size() {
        if (arrayList == null) {
            return 0;
        }
        return arrayList.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        arrayList = null;
    }

    @Override
    public String[] toArray() {
        return arrayList;
    }



    private void validateIndex(int index) {
        if (index > arrayList.length - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    private void validateItem(String item) {
        if (item == null) {
            throw new NullItemException();
        }
}
*/