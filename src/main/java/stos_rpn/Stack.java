package stos_rpn;

public class Stack {
	private String [] elements = new String[0];
	public void push(String element){
		int new_length = elements.length+1;
		String [] new_Array = new String[new_length];
		System.arraycopy(elements, 0, new_Array, 0, new_length-1);
		elements = new_Array;
		elements[new_length-1] = element;

	 }

	public String pop(){
		int new_length = elements.length -1;
		String temp = elements[new_length];
		String[] newArray = new String[new_length];
		System.arraycopy(elements, 0, newArray, 0, new_length);
		elements = newArray;
		return temp;
	}

	public String peek(){
		String temp = elements[elements.length-1];
		return temp;

	}
}	
