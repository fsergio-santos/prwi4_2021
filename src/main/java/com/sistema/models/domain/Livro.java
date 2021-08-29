package com.sistema.models.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_LIVRO")
public class Livro {
	
	private Long id;
	private String tituloLivro;
	private Date dataPublicacao;
	private Integer numeroPaginas;
	private String area;
	
	public Livro() {
	}

	public Livro(Long id, String tituloLivro, Date dataPublicacao, Integer numeroPaginas, String area) {
		this.id = id;
		this.tituloLivro = tituloLivro;
		this.dataPublicacao = dataPublicacao;
		this.numeroPaginas = numeroPaginas;
		this.area = area;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_LIVRO")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "TITULO_LIVRO", length = 80, nullable = false )
	public String getTituloLivro() {
		return tituloLivro;
	}

	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}

	@Column(name = "DATA_PUBLICACAO_LIVRO", nullable = false )
	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	@Column(name = "TOTAL_PAGINAS_LIVRO", length = 4, nullable = false )
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Column(name = "AREA_LIVRO", length = 50, nullable = false )
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", tituloLivro=" + tituloLivro + ", dataPublicacao=" + dataPublicacao
				+ ", numeroPaginas=" + numeroPaginas + ", area=" + area + "]";
	} 
	
    	
	
	

}
