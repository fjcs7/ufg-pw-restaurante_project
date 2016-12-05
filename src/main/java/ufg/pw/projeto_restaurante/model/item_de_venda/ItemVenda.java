package ufg.pw.projeto_restaurante.model.item_de_venda;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "itemvenda")

public class ItemVenda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;	
	
	@Column
	private Double preco;
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	@Column
	private TipoItemVenda tipo;
	
	public ItemVenda(String nome, String descricao, Double preco, TipoItemVenda tipo) {
			
			this.nome      = nome;
			this.descricao = descricao;
			this.preco     = preco;
			this.tipo      = tipo;
	}
	
	public ItemVenda() {	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TipoItemVenda getTipo() {
		return tipo;
	}
	public void setTipo(TipoItemVenda tipo) {
		this.tipo = tipo;
	}	
	
}