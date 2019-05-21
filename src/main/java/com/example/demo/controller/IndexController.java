package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Karyawan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * IndexController
 */
@Controller
public class IndexController {

	@GetMapping("/")
	public String index(Model model) {

		List<Karyawan> karyawan = new ArrayList<Karyawan>();
		karyawan.add(new Karyawan(1, "Bowo", "Test"));
		karyawan.add(new Karyawan(2, "Fill", "Test"));
		karyawan.add(new Karyawan(3, "Mean", "Test"));
		karyawan.add(new Karyawan(4, "Asp", "Test"));
		karyawan.add(new Karyawan(5, "Foo", "Test"));
		karyawan.add(new Karyawan(6, "John", "Test"));

		model.addAttribute("karyawan", karyawan);

		return "index";
	}

}