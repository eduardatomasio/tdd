package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1")); //valor do bônus (10%)
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionários com salário acima de R$10.000 não podem receber bônus."); //se o bônus do funcionário passar de mil reias, o valor assumirá 0
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
