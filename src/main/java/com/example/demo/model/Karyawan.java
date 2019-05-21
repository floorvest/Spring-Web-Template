package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Karyawan
 */
public class Karyawan {

	public Karyawan() {

	}

	public Karyawan(int id, String name, String alamat) {
		this.id = id;
		this.nama = name;
		this.alamat = alamat;
	}

	@Getter
	@Setter
	int id;

	@Getter
	@Setter
	private String nama;

	@Getter
	@Setter
	private String alamat;

}