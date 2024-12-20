package com.xantrix.webapp.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/* @@@ @Entity and @Table */
@Entity
@Table(name = "CLIENTI")    // this annotation is optional
public class Clienti  implements Serializable
{
	private static final long serialVersionUID = -6994272792307526864L;
	
	@Id       // @@@ primary key
	@Column(name = "CODFIDELITY")    // optional
	private String codFidelity;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "COGNOME")
	private String cognome;
	
	@Column(name = "INDIRIZZO")
	private String indirizzo;
	
	@Column(name = "COMUNE")
	private String comune;
	
	@Column(name = "CAP")
	private String cap;
	
	@Column(name = "PROV")
	private String prov;
	
	@Column(name = "TELEFONO")
	private String telefono;
	
	@Column(name = "MAIL")
	private String mail;
	
	@Column(name = "STATO")
	private String stato;

	// @@@ Date column
	@Temporal(TemporalType.DATE)
	@Column(name = "DATACREAZ")
	private Date dataCreaz;


	// @@@ OneToOne
	// @@@ FetchType - LAZY o EAGER (default)
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn   // @@@ Join with primary key - The binding is done with the primary key of the cards table
	private Cards card;

	@OneToOne(mappedBy = "clienti", cascade = CascadeType.ALL, orphanRemoval = true) // orphanRemoval = true if we delete a client then the system will even delete the 'utente'
	private Utenti utenti;
	
	public Clienti() { }

	public String getCodFidelity() {
		return codFidelity;
	}

	public void setCodFidelity(String codFidelity) {
		this.codFidelity = codFidelity;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getProv() {
		return prov;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public Date getDataCreaz() {
		return dataCreaz;
	}

	public void setDataCreaz(Date dataCreaz) {
		this.dataCreaz = dataCreaz;
	}
	
	
	public Cards getCard() {
		return card;
	}

	public void setCard(Cards card) {
		this.card = card;
	}

	public Utenti getUtenti() {
		return utenti;
	}

	public void setUtenti(Utenti utenti) {
		this.utenti = utenti;
	}

}
