package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1")); //valor do bônus
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			valor = BigDecimal.ZERO;  //se o bônus do funcionário passar de mil reias, o valor assumirá 0
		}
		return valor;
	}

}
