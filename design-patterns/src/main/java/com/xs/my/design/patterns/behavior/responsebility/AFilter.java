package com.xs.my.design.patterns.behavior.responsebility;

public class AFilter implements Filter{

	public void doFilter(Request req, Response rep, FilterChain chain) {
		System.out.println("a过滤器执行===");
		chain.doFilter(req, rep, chain);
	}

}
