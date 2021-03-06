package com.hit.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MRUAlgoCacheImplTest {

    @Test
    void getElement() 
    {
    	MRUAlgoCacheImpl<Integer, Integer> mru = new MRUAlgoCacheImpl<>(3);
        Integer myInt;
        
    	myInt = mru.putElement(1,1);
        assertEquals(null,myInt);

         myInt = mru.putElement(2,2);
         assertEquals(null,myInt);

         myInt = mru.putElement(3,3);
         assertEquals(null,myInt);

         myInt = mru.putElement(4,4);
         assertEquals(3,myInt.hashCode());

         myInt = mru.putElement(5,5);
         assertEquals(2,myInt.hashCode());
         
         myInt = mru.getElement(1);
         assertEquals(1,myInt.hashCode());

    }

    @Test
    void putElement()
    {
        MRUAlgoCacheImpl<Integer, Integer> mru = new MRUAlgoCacheImpl<>(3);
        Integer myInt;

        myInt = mru.putElement(1,1);
        assertEquals(null,myInt);

        myInt = mru.putElement(2,2);
        assertEquals(null,myInt);

        myInt = mru.putElement(3,3);
        assertEquals(null,myInt);

        myInt = mru.putElement(4,4);
        assertEquals(3,myInt.hashCode());

        myInt = mru.putElement(5,5);
        assertEquals(2,myInt.hashCode());

        myInt = mru.putElement(6,6);
        assertEquals(1,myInt.hashCode());

        myInt = mru.putElement(7,7);
        assertEquals(6,myInt.hashCode());

        myInt = mru.putElement(8,8);
        assertEquals(5,myInt.hashCode());

        myInt = mru.putElement(9,9);
        assertEquals(4,myInt.hashCode());

        myInt = mru.putElement(10,10);
        assertEquals(9,myInt.hashCode());
    }

    @Test
    void removeElement() 
    {
    	MRUAlgoCacheImpl<Integer, Integer> mru = new MRUAlgoCacheImpl<>(3);
        Integer myInt;

        myInt = mru.putElement(1,1);
        assertEquals(null,myInt);

        myInt = mru.putElement(2,2);
        assertEquals(null,myInt);

        myInt = mru.putElement(3,3);
        assertEquals(null,myInt);
        
        mru.removeElement(2);
        assertEquals(null,myInt);
    }
}