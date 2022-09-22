package com.example.cadastro.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.cadastro.Model.CadastroModel;



public interface CadastroRepository extends CrudRepository <CadastroModel, Integer> {

}
