package com.xs.my.design.patterns.behavior.responsebility;

public class Client {

	public static void main(String[] args) {
		FilterChain chain = new FilterChain();
		chain.addChain(new AFilter());
		chain.addChain(new BFilter());
		
		chain.doFilter(new Request(), new Response(), chain);
				
	}
}
