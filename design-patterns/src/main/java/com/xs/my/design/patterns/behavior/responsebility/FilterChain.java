package com.xs.my.design.patterns.behavior.responsebility;

import java.util.ArrayList;
import java.util.List;

/****
 * 
 * 执行顺序：
 * 
 * request-filterA-filterB-response
 * 
 */
public class FilterChain implements Filter {

	private List<Filter> lists = new ArrayList<Filter>();
	private int index = 0;
	private int resp = 0;

	public void addChain(Filter filter) {
		lists.add(filter);
	}

	public void doFilter(Request req, Response rep, FilterChain chain) {
		if (index == lists.size()) {
			return;
		} else {
			Filter f = lists.get(index);
			if (0 == index) {// 第一次请求执行request
				req.request();
			}
			index++;
			f.doFilter(req, rep, chain);
			if (index == lists.size() && 0 == resp) {
				rep.response();
				resp++;
			}
		}

	}

}
