package com.amit.ds.array;

public class NewArrayList {
	
	
	private int size=0;
	private int[] array=null;
	
	public NewArrayList() {
      array= new int[10];		
	}
	
	public void add(int element){
      if (size()<array.length) {
    	  array[size++]=element;
	    }else
	    {
	    	copyArray(element);
	    }	
	}
	
	
	public int[] fetchData(){
		return array;
	}
		
	private void copyArray(int element) {
		int[] temp=new int[size*2];
		for (int i = 0; i <size(); i++) {
			temp[i]	=array[i];
		}
		array=temp;
		add(element);
	}

	public int size() {
		return size;		
	}
	
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
