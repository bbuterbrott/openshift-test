package com.openshift.test;

import javax.jws.WebService;

@WebService
public class OpenshiftTest {

	public String test1(String input) {
		String result = String.valueOf(Math.random());
		return result;
	}

	public String test2(String input) {
		String result = String.valueOf(Math.random());
		return result;
	}
}
