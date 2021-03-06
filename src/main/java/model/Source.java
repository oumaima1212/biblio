// default package
// Generated Mar 2, 2017 1:23:57 PM by Hibernate Tools 5.2.1.Final
package model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Source generated by hbm2java
 */
@Entity
@Table(name = "source", schema = "public")
public class Source implements java.io.Serializable {

	private int idSource;
	private Edition edition;
	private Type type;
	private String titre;
	private Date date;
	private String url;
	private Set editions = new HashSet(0);
	private Set categories = new HashSet(0);
	private Set auteurs = new HashSet(0);

	public Source() {
	}

	public Source(int idSource, Edition edition, Type type) {
		this.idSource = idSource;
		this.edition = edition;
		this.type = type;
	}

	public Source(int idSource, Edition edition, Type type, String titre, Date date, String url, Set editions,
			Set categories, Set auteurs) {
		this.idSource = idSource;
		this.edition = edition;
		this.type = type;
		this.titre = titre;
		this.date = date;
		this.url = url;
		this.editions = editions;
		this.categories = categories;
		this.auteurs = auteurs;
	}

	@Id

	@Column(name = "id_source", unique = true, nullable = false)
	public int getIdSource() {
		return this.idSource;
	}

	public void setIdSource(int idSource) {
		this.idSource = idSource;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_edition", nullable = false)
	public Edition getEdition() {
		return this.edition;
	}

	public void setEdition(Edition edition) {
		this.edition = edition;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_type", nullable = false)
	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Column(name = "titre")
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", length = 13)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "URL")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "source")
	public Set getEditions() {
		return this.editions;
	}

	public void setEditions(Set editions) {
		this.editions = editions;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "source_categorie", schema = "public", joinColumns = {
			@JoinColumn(name = "id_source", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_categorie", nullable = false, updatable = false) })
	public Set getCategories() {
		return this.categories;
	}

	public void setCategories(Set categories) {
		this.categories = categories;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "source_auteur", schema = "public", joinColumns = {
			@JoinColumn(name = "id_source", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_auteur", nullable = false, updatable = false) })
	public Set getAuteurs() {
		return this.auteurs;
	}

	public void setAuteurs(Set auteurs) {
		this.auteurs = auteurs;
	}

}
