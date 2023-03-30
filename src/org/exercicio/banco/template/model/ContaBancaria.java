package org.exercicio.banco.template.model;

import java.util.Objects;

/**
*
* Nome: Fabio Rodrigues de Barros 
* Curso: IPI 2°P
* Matrícula: 20221INFIG0029
* 
*/
public class ContaBancaria {
	private int numeroConta;
	private double saldo;
	private String titular;
	private boolean status;

	/**
	 * Construtor recebe apenas numeroConta e titular. Saldo e status iniciam
	 * com valores padrão: saldo com 0 e status com true.
	 * @param numeroConta
	 * @param titular
	 */
	public ContaBancaria(int numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.status = true;
	}
	
	public ContaBancaria(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0;
		this.status = true;
	}

	/*
	 * OBS: RESPONDA A LISTA DE EXERCICIO COM A SEGUINTE SEQUENCIA:
	 * 1) DEPOSITAR
	 * 2) SACAR
	 * 3) FECHARCONTA
	 * 4) REABRIRCONTA
	 * 5) REALIZARTRANSFERENCIA
	 * 
	 * */
	
	/**
	 * O metodo deve receber um valor a ser acrescido ao saldo. No entanto, deve-se
	 * checar se o valor passado como argumento é maior que 0 (zero). Caso nao seja,
	 * a seguinte mensagem deve ser impressa no console: "Valor invalido para
	 * deposito." Utilize o System.out.print()
	 * 
	 * @param valor
	 */
	public void depositar(double valor) {
		if (valor < 0) {
			System.out.println("Valor invalido para deposito.");
		}else if (valor > 0 && status) {
			this.saldo += valor;
		}
		
	}

	/**
	 * Metodo sacar deve descrementar do saldo o valor passado como argumento.
	 * Deve-se verificar primeiramente se a conta esta ativa, caso nao esteja a msg
	 * "Conta inativa." deve ser impressa no console. Em seguida, caso o argumento
	 * valor seja menor ou igual a 0 (zero), a seguinte msg deve ser impressa no
	 * console "Valor inválido para saque." Por fim, caso o valor solicitado para o
	 * saque seja maior que o saldo disponivel, a msg "Saldo insuficiente." deve ser
	 * exibida no console. Caso as checagens sejam atendidas, decremente o valor
	 * solicitado do saldo. Utilize System.out.print();
	 * 
	 * @param valor
	 */
	public void sacar(double valor) {
		if ( status == false) {
			System.out.println("Conta inativa.");
		}else if(valor <= 0) {
			System.out.println("Saldo invalido para saque");
		}else if(status == true && valor > 0 && valor <= this.saldo) {
			
		}
		this.saldo -= valor;
	}

	/**
	 * O metodo fechar conta verifica se a conta ja esta inativa, caso esteja a msg
	 * "Conta ja inativa." deve ser exibida no console. Caso o saldo nao esteja
	 * zerado, nao eh possivel fechar a conta e a msg "Conta com saldo. Nao eh
	 * possivel fecha-la." deve ser exibida no console. Com as condicoes de
	 * verificacao atendidas, a flag ativa deve ser ajustada para false, a fim de
	 * fechar a conta. Utilize System.out.print();
	 */
	public void fecharConta() {
		if (status == false) {
			System.out.println("Conta ja inativa.");
		}else if (this.saldo > 0 && status == true) {
			
		}else if (status == true && this.saldo == 0) {
			status = false;
		}
		
	}

	/**
	 * O metodo marca a flag ativa para true, caso a conta esteja desativada. No
	 * entanto, caso o metodo seja executado com a conta ja ativa, a msg "Conta já
	 * ativa." deve ser exibida no console. Utilize System.out.print();
	 */
	public void reabrirConta() {
		if (status == false) {
			
		}else {
			System.out.println("Conta já inativa");
		}

	}

	/**
	 * Metodo exige que seja passado o parametro quantia e contadestino, o qual ira
	 * decrementar a quantia do saldo da conta que executa o metodo e incrementa a
	 * mesma quantia no saldo da conta destino. Trate as condicoes na seguinte ordem:
	 * Caso a conta de origem esteja desativada, exiba a msg no console:
	 * "Conta de origem inativa.". Em seguida, verifique se a conta destino
	 * tambem esta ativa, caso nao esteja exiba no console: 
	 * "Conta de destino inativa.". Por fim, caso a quantia passada seja maior
	 * que o saldo disponivel na conta de origem, a msg "Saldo insuficiente para
	 * transferencia." deve ser exibida no console. Utilize System.out.print();
	 * 
	 * @param quantia
	 * @param destino
	 */
	public void realizarTransferencia(double quantia, ContaBancaria destino) {
		if (status == false) {
			System.out.println("Conta de origem inativa");
		}else if(destino.status == false) {
			
		}else if(quantia > saldo) {
			
		}else {
			saldo -= quantia;
			destino.saldo += quantia;
		}

	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean isAtiva() {
		return status;
	}

	/**
	 * Implemente o mehtodo hashCode
	 */
	@Override
	public int hashCode() {
		return 0;
	}

	/**
	 * Implemente o mehtodo equals
	 */
	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
	
}
