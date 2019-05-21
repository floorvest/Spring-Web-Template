package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Response
 */
public class Response<Any> {

	@Getter
	@Setter
	private int code;

	@Getter
	@Setter
	private String message;

	@Getter
	@Setter
	private Any data;
}