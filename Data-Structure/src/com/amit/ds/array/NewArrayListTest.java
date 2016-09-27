package com.amit.ds.array;

import org.junit.Assert;
import org.junit.Test;

public class NewArrayListTest {

	NewArrayList arrayList = null;

	@Test
	public void testAdd() {

		NewArrayList arrayList = getTestData();
		Assert.assertEquals(arrayList.size(), 15);
	}

	@Test
	public void testSize() {
		NewArrayList arrayList = getTestData();
		Assert.assertEquals(arrayList.size(), 15);

	}
	
	
	@Test
	public void   testFetchData(){
		NewArrayList arrayList = getTestData();
		Assert.assertEquals(arrayList.fetchData().length,20 );
		Assert.assertEquals(arrayList.fetchData()[1], 20);
		Assert.assertEquals(arrayList.fetchData()[14], 150);
		Assert.assertEquals(arrayList.size(), 15);
	}

	private NewArrayList getTestData() {
		NewArrayList arrayList = new NewArrayList();
		int element = 10;
		for (int i = 0; i < 15; i++) {

			arrayList.add(element);
			element = element +10;
		}

		return arrayList;
	}

}
