package com.hand.syb.day02;


/*
 * 采用快速排序的方法对拿到的数组元素进行排序
 * 快速排序算法的时间复杂度为 O(n*log2n),是一种不稳定的排序算法
 */

public class MySortDemo {	
	
	public static void main(String[] args) {
		
		MySortDemo m1 = new MySortDemo();
		
		int [] a = { 3,2,5,8,4,7,6,1,9,0 }; 
		int left = 0;
		int right = a.length-1;
		
		m1.printOrigin(a);              	//输出原始无序的序列
		m1.quickSort(a, left, right);   	//调用排序方法对无序序列进行排序
		m1.printResult(a);             	    //输出已经经过排序的序列
	}

	public void printOrigin(int[] a) {
		System.out.print("原始无序的序列为： ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	//采用递归方式编写快速排序算法
	public void quickSort(int[] a,int left,int right) {
		//此时表示一趟排序已经完成
		if(left >= right) return; 
		
		int i = left;
		int j = right;
		int key = a[left];
	     
	    while(i < j){
	    	
	        while(i < j && key <= a[j])   j--;
	       
	        a[i] = a[j];
	         
	        while(i < j && key >= a[i] )  i++;
	        
	        a[j] = a[i];
	    }
	    
	    a[i] = key;           			//当在当组内找完一遍以后就把中间数key回归
	    quickSort(a, left, i - 1);      //对左边进行排序
	    quickSort(a, i + 1, right);
	    
	}

	public void printResult(int[] a) {
		System.out.print("按从小到大排序的序列为： ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
