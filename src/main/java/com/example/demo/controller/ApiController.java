package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Karyawan;
import com.example.demo.model.Response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ApiController
 *
 */

@RestController
public class ApiController {

	@GetMapping("/karyawan")
	public Response<List<Karyawan>> index() {

		List<Karyawan> lists = new ArrayList<Karyawan>();

		Karyawan karyawan = new Karyawan();
		karyawan.setNama("test");
		karyawan.setAlamat("test12345");

		lists.add(karyawan);

		Response response = new Response();
		response.setData(lists);
		response.setCode(200);
		response.setMessage("Successs");

		return response;
	}

	@PostMapping("/karyawan")
	public Karyawan postKaryawan(Karyawan karyawan) {
		return karyawan;
	}

}