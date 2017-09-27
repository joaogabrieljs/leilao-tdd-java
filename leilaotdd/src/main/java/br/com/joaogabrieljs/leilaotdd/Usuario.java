/**
 * Desenvolvido em: 27/09/2017
 * @author joaogabrieljs
 */

package br.com.joaogabrieljs.leilaotdd;

public class Usuario {

	private int id;
	private String nome;
	
	public Usuario(String nome) {
		this(0, nome);
	}

	public Usuario(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}	
}
