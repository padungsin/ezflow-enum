package com.aviva.documentroute.constant.example;

import java.util.List;

import com.aviva.documentroute.constant.jpa.manager.EnumerationConstantManager;

public class SimpleExample {

	public static void main(String[] args) {
		EnumerationConstantManager dtm = new EnumerationConstantManager();
		List<String> documentTypeList = dtm.getEnumerationList("DocumentRoute", "docTypeCd");

		for (String string : documentTypeList) {
			System.out.println(string);
		}

	}

}
