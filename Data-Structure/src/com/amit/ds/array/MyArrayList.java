package com.amit.ds.array;

public class MyArrayList {

	
	Object[] myArrayList= null;
	private int actSize=0;
	
	
	public MyArrayList(){
		myArrayList=new MyArrayList[10];
	}
	
	public void add(Object element){
		
		if (size()<myArrayList.length) {
			myArrayList[actSize++]=element;
		} else
			copyMyArrayList(element);		
	}
	
	public void copyMyArrayList(Object element){
		Object[] temp=new MyArrayList[actSize*2];
		
		for (int i = 0; i < size(); i++) {
			temp[i]=myArrayList[i];
		}
		myArrayList=temp;
		myArrayList[actSize++]=element;
	}
	
	public int size(){
		return actSize;
	}	
	
	public void display(){
		for (int i = 0; i < size(); i++) {
			System.out.println(myArrayList[i]);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyArrayList a=new MyArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(50);
		a.add(40);
        a.display();  
		
	}

}
