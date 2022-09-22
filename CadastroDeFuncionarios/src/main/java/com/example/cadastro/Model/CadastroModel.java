package com.example.cadastro.Model;

import javax.persistence.Entity;


import org.springframework.data.annotation.Id;




@Entity
public class CadastroModel {
	
	@Id
	
	
	private int id;
	
	private String name;
	
	private int CPF;
	
	private int RG;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public int getRG() {
		return RG;
	}

	public void setRG(int rG) {
		RG = rG;
	}
	
	
}
