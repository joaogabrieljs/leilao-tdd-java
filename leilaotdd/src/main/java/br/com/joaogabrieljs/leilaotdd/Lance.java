/**
 * Desenvolvido em: 27/09/2017
 * @author joaogabrieljs
 */

package br.com.joaogabrieljs.leilaotdd;

public class Lance {

	private Usuario usuario;
	private double valor;
	
	public Lance(Usuario usuario, double valor) {
		this.usuario = usuario;
		this.valor = valor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public double getValor() {
		return valor;
	}
	
	
	
}
