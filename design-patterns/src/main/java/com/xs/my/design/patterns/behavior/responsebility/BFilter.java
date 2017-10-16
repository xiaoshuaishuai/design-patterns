package com.xs.my.design.patterns.behavior.responsebility;

public class BFilter implements Filter{

	public void doFilter(Request req, Response rep, FilterChain chain) {
		System.out.println("b过滤器执行===");
		chain.doFilter(req, rep, chain);
	}

}
