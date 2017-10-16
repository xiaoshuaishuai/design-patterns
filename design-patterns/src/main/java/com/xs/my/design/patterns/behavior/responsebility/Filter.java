package com.xs.my.design.patterns.behavior.responsebility;

public interface Filter {
	public void doFilter(Request req, Response rep, FilterChain chain);
}
