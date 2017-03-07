package com.hand.syb.day01;

import java.util.ArrayList;
import java.util.List;

public class MyPrimeNumber {

	public  List<Integer> getPrimeNumber(){
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 100; i < 201; i++) {
			int j = 2;
			while(j <= i){
				if(i%j==0)
					break;
				else j++;
			}
			if(i == j)  list.add(i);
		}
		
		return list;
	}
	
	public void printNumber(List<Integer> list){
		
		System.out.print("100--200之间的素数为：<");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if(i == list.size() - 1) break;
			else System.out.print(",");
		}
		System.out.println(">");
		
	}
	
	public static void main(String[] args) {
		
		MyPrimeNumber m1 = new MyPrimeNumber();
		
		List<Integer> list = m1.getPrimeNumber();   //得到素数的集合
		
		m1.printNumber(list);                       //按格式打印素数
		
	}
}
