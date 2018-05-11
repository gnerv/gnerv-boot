package com.gnerv.management.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 * 
 */
public class R extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	private Map<String,Object> data=new HashMap<String,Object>();
	public R() {
		put("code", 0);
		put("msg", "");
		put("data", data);
	}
	
	public static R error() {
		return error(500, "未知异常，请联系管理员");
	}
	
	public static R error(String msg) {
		return error(500, msg);
	}
	
	public static R error(int code, String msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static R ok(String msg) {
		R r = new R();
		r.put("msg", msg);
		return r;
	}
	
	public static R ok(Map<String, Object> map) {
		R r = new R();
		r.putAll(map);
		return r;
	}
	
	public static R ok() {
		return new R();
	}

	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}
	public R data(String key,Object value){
		data.put(key, value);
		return this;
	}
	public R data(Map<String,Object> map){
		data.putAll(map);
		return this;
	}

}
