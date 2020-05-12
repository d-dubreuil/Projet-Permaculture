package flore.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class CompteUtilisateur {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String identifiant;
	private String motDePasse;
	private String mail;
	private String nom;
	private String rue;
	private String complement;
	private String codePostal;
	private String ville;
	private String telephone;
	private String informationsBancaires;
	@OneToMany (mappedBy = "compte")
	private List<Historique> historiques = new ArrayList<Historique>();
	@OneToOne (mappedBy = "compteUtilisateur")
	private Utilisateur utilisateur;
	@OneToMany (mappedBy = "compteUtilisateur")
	private List <ReferentielUtilisateur> referentielUtiliseurs = new ArrayList<ReferentielUtilisateur>();
	@OneToMany (mappedBy = "compteUtilisateur")
	private List <Favoris> favoris = new ArrayList<Favoris>();
	@OneToOne (mappedBy = "compteUtilisateur")
	private Jardin jardin;	
	
	
	public CompteUtilisateur() {
		super();
	}
	public CompteUtilisateur(String identifiant, String motDePasse, String mail, String nom, String rue,
			String complement, String codePostal, String ville, String telephone) {
		super();
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.mail = mail;
		this.nom = nom;
		this.rue = rue;
		this.complement = complement;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRue() {
		return rue;
	}
	public String getInformationsBancaires() {
		return informationsBancaires;
	}
	public void setInformationsBancaires(String informationsBancaires) {
		this.informationsBancaires = informationsBancaires;
	}
	public List<Historique> getHistoriques() {
		return historiques;
	}
	public void setHistoriques(List<Historique> historiques) {
		this.historiques = historiques;
	}
	public List<ReferentielUtilisateur> getReferentielUtiliseurs() {
		return referentielUtiliseurs;
	}
	public void setReferentielUtiliseurs(List<ReferentielUtilisateur> referentielUtiliseurs) {
		this.referentielUtiliseurs = referentielUtiliseurs;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public List<Historique> getHistorique() {
		return historiques;
	}
	public void setHistorique(List<Historique> historique) {
		this.historiques = historique;
	}
	public void addHistorique (Historique historique) {
		this.historiques.add(historique);
	}
	public List<ReferentielUtilisateur> getReferentielUtilisateur() {
		return referentielUtiliseurs;
	}
	public void setReferentielUtilisateur(List<ReferentielUtilisateur> referentielUtilisateur) {
		this.referentielUtiliseurs = referentielUtilisateur;
	}
	public void addReferentielUtilisateur (ReferentielUtilisateur referentielUtiliseur) {
		this.referentielUtiliseurs.add(referentielUtiliseur);
	}
	public List<Favoris> getFavoris() {
		return favoris;
	}
	public void setFavoris(List<Favoris> favoris) {
		this.favoris = favoris;
	}
	public void addFavoris (Favoris favori) {
		this.favoris.add(favori);		
	}
	public Jardin getJardin() {
		return jardin;
	}
	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}
	@Override
	public String toString() {
		return "CompteUtilisateur [id=" + id + ", identifiant=" + identifiant + ", motDePasse=" + motDePasse + ", mail="
				+ mail + ", nom=" + nom + ", rue=" + rue + ", complement=" + complement + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", telephone=" + telephone + "]";
	}
	
	
	
	
}
