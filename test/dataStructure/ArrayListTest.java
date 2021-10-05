package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    List myArrayList;
    @BeforeEach
    void setUp() {
        myArrayList = new ArrayList();
    }
    @Test
    void arrayListCanBeCreatedTest(){
        assertNotNull(myArrayList);
    }
    @Test
    void newArrayListTest() {
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    void addElement_ArrayListShouldNotBeEmpty() {
        myArrayList.add(34);
        assertFalse(myArrayList.isEmpty());
    }
    @Test
    void addXRemoveX_ArrayListShouldBeEmpty(){
        myArrayList.add(34);
        myArrayList.remove(34);
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    void addXAndY_RemoveY_arrayShouldNotBeEmpty(){
        myArrayList.add(34);
        myArrayList.add(99);
        myArrayList.remove(99);
        assertFalse(myArrayList.isEmpty());
    }
    @Test
    void removeFromEmptyArrayList_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, ()-> myArrayList.remove(34));
    }
    @Test
    void addOneElement_ArrayListSizeIsOne(){
        myArrayList.add(34);
        assertEquals(2, myArrayList.size());
    }
    @Test
    void replaceElementInArratList(){
        myArrayList.add();
        myArrayList.add(94, );
    }
    @Test
    void addThreeElement_getSecondByIndex(){
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);

        assertEquals(32, myArrayList.get(1));
    }
    @Test
    void getIndexOfElementTest(){
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);

        assertEquals(1, myArrayList.getIndexOf(32));
    }
    @Test
    void arrayListIsElasticTest(){
        assertEquals(3, myArrayList.getCapacity());
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);
        myArrayList.add(99);
        myArrayList.add(45);
        assertEquals(6, myArrayList.getCapacity());
        assertEquals(5, myArrayList.getCapacity());
        myArrayList.add(43);
        myArrayList.add(21);
        assertEquals(21, myArrayList.getCapacity());
        assertEquals(7, myArrayList.getCapacity());
    }
}