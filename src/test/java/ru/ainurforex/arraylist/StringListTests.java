package ru.ainurforex.arraylist;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import ru.ainurforex.arraylist.exceptions.ArrayIndexOutOfBoundsException;
import ru.ainurforex.arraylist.exceptions.ArrayListIsEmptyException;
import ru.ainurforex.arraylist.exceptions.NotSuchElementException;
import ru.ainurforex.arraylist.exceptions.NullItemException;

import static ru.ainurforex.arraylist.Constants.*;

public class StringListTests {
    @BeforeEach
    public StringList initialStringList() {
        StringList stringListExcepted = new StringList();
        stringListExcepted.add(A0);
        stringListExcepted.add(B1);
        stringListExcepted.add(C2);
        return stringListExcepted;
    }

    @Test
    public void shouldAddFirstItem() {
        StringList stringList = new StringList();
        stringList.add(A0);
        Assertions.assertEquals(A0, stringList.get(0));
    }

    @Test
    public void shouldAddMoreItem() {
        StringList stringList = new StringList();
        stringList.add(A0);
        Assertions.assertEquals(A0, stringList.get(0));
        stringList.add(B1);
        Assertions.assertEquals(B1, stringList.get(1));
        stringList.add(C2);
        Assertions.assertEquals(C2, stringList.get(2));
        Assertions.assertEquals(3, stringList.size());
    }

    @Test
    public void shouldAddItemInIndex0() {
        StringList stringListExcepted = initialStringList();
        stringListExcepted.add(0, A01);
        String[] stringArrayActual = {A01, A0, B1, C2};
        Assertions.assertEquals(stringArrayActual.length, stringListExcepted.size());
        Assertions.assertEquals(arrayToString(stringArrayActual), stringListExcepted.toString());
    }

    @Test
    public void shouldAddItemInIndexToEndArray() {
        StringList stringListExcepted = initialStringList();
        stringListExcepted.add(2, C21);
        String[] stringArrayActual = {A0, B1, C21, C2};
        Assertions.assertEquals(stringArrayActual.length, stringListExcepted.size());
        Assertions.assertEquals(arrayToString(stringArrayActual), stringListExcepted.toString());
    }

    @Test
    public void shouldAddItemInIndexToMiddleArray() {
        StringList stringListExcepted = initialStringList();
        stringListExcepted.add(1, B11);
        String[] stringArrayActual = {A0, B11, B1, C2};
        Assertions.assertEquals(stringArrayActual.length, stringListExcepted.size());
        Assertions.assertEquals(arrayToString(stringArrayActual), stringListExcepted.toString());

    }

    @Test
    public void shouldThrowArrayIndexOutOfBoundsExceptionByAddItemInArrayIndexOutOfBounds() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                stringListExcepted.add(3, D3));
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                stringListExcepted.add(-1, D3));
    }

    @Test
    public void shouldThrowNullItemExceptionByAddNullItem() {
        StringList stringList = new StringList();
        Assertions.assertThrows(NullItemException.class, () ->
                stringList.add(null));
    }

    @Test
    public void shouldSetItemInIndex() {
        StringList stringListExcepted = initialStringList();
        stringListExcepted.set(0, A01);
        String[] stringArrayActual = {A01, B1, C2};
        Assertions.assertEquals(stringArrayActual.length, stringListExcepted.size());
        Assertions.assertEquals(arrayToString(stringArrayActual), stringListExcepted.toString());
    }

    @Test
    public void shouldThrowArrayIndexOutOfBoundsExceptionBySetItemInArrayIndexOutOfBounds() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                stringListExcepted.set(3, D3));
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                stringListExcepted.set(-1, D3));
    }

    @Test
    public void shouldRemoveItemByItemZeroPositionInArray() {
        StringList stringListExcepted = initialStringList();
        stringListExcepted.remove(A0);
        String[] stringArrayActual = {B1, C2};
        Assertions.assertEquals(stringArrayActual.length, stringListExcepted.size());
        Assertions.assertEquals(arrayToString(stringArrayActual), stringListExcepted.toString());
    }

    @Test
    public void shouldRemoveItemByItemEndPositionInArray() {
        StringList stringListExcepted = initialStringList();
        stringListExcepted.remove(C2);
        String[] stringArrayActual = {A0, B1};
        Assertions.assertEquals(stringArrayActual.length, stringListExcepted.size());
        Assertions.assertEquals(arrayToString(stringArrayActual), stringListExcepted.toString());
    }

    @Test
    public void shouldRemoveItemByItemMiddlePositionInArray() {
        StringList stringListExcepted = initialStringList();
        stringListExcepted.remove(B1);
        String[] stringArrayActual = {A0, C2};
        Assertions.assertEquals(stringArrayActual.length, stringListExcepted.size());
        Assertions.assertEquals(arrayToString(stringArrayActual), stringListExcepted.toString());
    }

    @Test
    public void shouldThrowNotSuchElementExceptionByRemoveItemByNotSushItem() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertThrows(NotSuchElementException.class, () ->
                stringListExcepted.remove(D3));
    }

    @Test
    public void shouldRemoveItemByIndex0() {
        StringList stringListExcepted = initialStringList();
        stringListExcepted.remove(0);
        String[] stringArrayActual = {B1, C2};
        Assertions.assertEquals(stringArrayActual.length, stringListExcepted.size());
        Assertions.assertEquals(arrayToString(stringArrayActual), stringListExcepted.toString());
    }

    @Test
    public void shouldRemoveItemByIndexEndOfArray() {
        StringList stringListExcepted = initialStringList();
        stringListExcepted.remove(2);
        String[] stringArrayActual = {A0, B1};
        Assertions.assertEquals(stringArrayActual.length, stringListExcepted.size());
        Assertions.assertEquals(arrayToString(stringArrayActual), stringListExcepted.toString());
    }

    @Test
    public void shouldRemoveItemByIndexMiddleOfArray() {
        StringList stringListExcepted = initialStringList();
        stringListExcepted.remove(1);
        String[] stringArrayActual = {A0, C2};
        Assertions.assertEquals(stringArrayActual.length, stringListExcepted.size());
        Assertions.assertEquals(arrayToString(stringArrayActual), stringListExcepted.toString());
    }

    @Test
    public void shouldThrowArrayIndexOutOfBoundsExceptionByRemoveItemInArrayIndexOutOfBounds() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                stringListExcepted.remove(3));
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                stringListExcepted.remove(-1));
    }

    @Test
    public void shouldTrueContainsByItem() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertEquals(true, stringListExcepted.contains(A0));
    }

    @Test
    public void shouldFalseContainsByItem() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertEquals(false, stringListExcepted.contains(D3));
    }

    @Test
    public void shouldIndexOfItemPresentInArray() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertEquals(1, stringListExcepted.indexOf(B1));
    }

    @Test
    public void shouldIndexOfItemAbscentInArray() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertEquals(-1, stringListExcepted.indexOf(D3));
    }


    @Test
    public void shouldLastIndexOfItemPresentInArray() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertEquals(1, stringListExcepted.indexOf(B1));
    }

    @Test
    public void shouldLastIndexOfItemAbscentInArray() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertEquals(-1, stringListExcepted.indexOf(D3));
    }


    @Test
    public void shouldGetIndexByItem() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertEquals(C2, stringListExcepted.get(2));
    }

    @Test
    public void shouldThrowArrayIndexOutOfBoundsExceptionByGetIndexByItemInArrayIndexOutOfBounds() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                stringListExcepted.get(3));
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                stringListExcepted.get(-1));
    }


    @Test
    public void shouldSizeOfListArray() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertEquals(3, stringListExcepted.size());
    }


    @Test
    public void shouldFalseIsEmpyArray() {
        StringList stringListExcepted = initialStringList();
        Assertions.assertEquals(false, stringListExcepted.isEmpty());
    }

    @Test
    public void shouldTrueIsEmpyArray() {
        StringList stringListExcepted = new StringList();
        Assertions.assertEquals(true, stringListExcepted.isEmpty());
    }

    @Test
    public void shouldClearArray() {
        StringList stringListActual = new StringList();
        StringList stringListExcepted = initialStringList();
        stringListExcepted.clear();
        Assertions.assertEquals(stringListActual.toString(), stringListExcepted.toString());
    }

    @Test
    public void shouldStringArrayToArrayList() {
        StringList stringListExcepted = initialStringList();
        String[] actualArrayString = {A0, B1, C2};

        Assertions.assertEquals(arrayToString(actualArrayString), stringListExcepted.toString());
    }

    @Test
    public void shouldTrueEqualsTwoArrayList() {
        StringList stringListExcepted = initialStringList();
        StringList stringListActual = initialStringList();

        Assertions.assertEquals(true, stringListExcepted.equals(stringListActual));
    }

    @Test
    public void shouldFalseEqualsTwoArrayList() {
        StringList stringListExcepted = initialStringList();
        StringList stringListActual = new StringList();
        stringListActual.add(B1);
        stringListActual.add(C2);
        stringListActual.add(D3);

        Assertions.assertEquals(false, stringListExcepted.equals(stringListActual));
    }

    @Test
    public void shouldFalseBySizeEqualsTwoArrayList() {
        StringList stringListExcepted = initialStringList();
        StringList stringListActual = new StringList();
        stringListActual.add(A0);
        stringListActual.add(B1);
        stringListActual.add(C2);
        stringListActual.add(D3);

        Assertions.assertEquals(false, stringListExcepted.equals(stringListActual));
    }

    @Test
    public void shouldThrowArrayListIsEmptyExceptionByEqualsByArrayListIsEmpty() {
        StringList stringListNull = new StringList();
        StringList stringList = initialStringList();
        Assertions.assertThrows(ArrayListIsEmptyException.class, () ->
                stringList.equals(stringListNull));
    }

    private static String arrayToString(String[] array) {
        String arrayString = "";
        for (int i = 0; i < array.length; i++) {
            arrayString = arrayString + array[i] + " ";
        }
        return arrayString;
    }
}
