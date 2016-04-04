package com.heyucool.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> collection = Arrays.asList(1,2,3);
		Collection<Integer> ext = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		ext.addAll(list);
		ext.addAll(collection);
		
		for(Integer num : collection){
			System.out.println(num);
		}
		for(Integer num : ext){
			System.out.println(num);
		}
	}

}
