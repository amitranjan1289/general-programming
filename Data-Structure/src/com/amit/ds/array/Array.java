package com.amit.ds.array;

import java.util.ArrayList;
import java.util.List;

public class Array {
	int[] array = null;
	int i=0;
	int j=5;
	
	public Array() {
		array = new int[5];
	}
/**
 * This method add the integer element.
 * @param element
 */
	public void add(int element) {
		if(size()<array.length){
			array[i++]=element;
			
		}
		else{
			copyArray(element);
		}
	}
	private void copyArray(int element){
		int[] temp=new int[size()*2];
		for(int i=0;i<size();i++){
			temp[i]=array[i];
		}
		array=temp;
		array[i++]=element;
	}
	
	private int size(){		
		return i;
	}
	
	public void show(){
		for(int i=0;i<size();i++){
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		Array array=new Array();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		array.add(50);
		array.add(60);
		array.add(70);
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		array.add(50);
		array.add(60);
		array.show();	
		List e=new ArrayList();
   
	}

}
