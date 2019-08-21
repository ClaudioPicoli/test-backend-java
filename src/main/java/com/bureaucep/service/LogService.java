package com.bureaucep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bureaucep.builder.LogBuilder;
import com.bureaucep.entify.Log;
import com.bureaucep.repository.LogRepository;
import com.bureaucep.request.EnderecoRequest;
import com.bureaucep.response.EnderecoResponse;

@Service
public class LogService {

	@Autowired
	private LogRepository logRepository;

	public Log adicionaLog(EnderecoRequest request, EnderecoResponse response) {

		return logRepository.save(LogBuilder.build(request.getCep(), response.toString()));
	}
}
