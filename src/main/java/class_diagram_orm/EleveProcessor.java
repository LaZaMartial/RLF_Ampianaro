/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Purchased
 */
package class_diagram_orm;

import org.orm.PersistentException;
public class EleveProcessor {
	private int ID;
	
	private String nom;
	
	private String email;
	
	private String motDePasse;
	
	private String biographie;
	
	private String niveauScolaire;
	
	private String dateNaissance;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom == null ? "" : nom;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email == null ? "" : email;
	}
	
	public void setMotDePasse(String value) {
		this.motDePasse = value;
	}
	
	public String getMotDePasse() {
		return motDePasse == null ? "" : motDePasse;
	}
	
	public void setBiographie(String value) {
		this.biographie = value;
	}
	
	public String getBiographie() {
		return biographie == null ? "" : biographie;
	}
	
	public void setNiveauScolaire(String value) {
		this.niveauScolaire = value;
	}
	
	public String getNiveauScolaire() {
		return niveauScolaire == null ? "" : niveauScolaire;
	}
	
	public void setDateNaissance(String value) {
		this.dateNaissance = value;
	}
	
	public String getDateNaissance() {
		return dateNaissance == null ? "" : dateNaissance;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				class_diagram_orm.Eleve _eleve = class_diagram_orm.Eleve.loadEleveByORMID(getID());
				if (_eleve!= null) {
					copyFromBean(_eleve);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				class_diagram_orm.Eleve _eleve = class_diagram_orm.Eleve.createEleve();
				copyToBean(_eleve);
				if (_eleve.save()) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				class_diagram_orm.Eleve _eleve= class_diagram_orm.Eleve.loadEleveByORMID(getID());
				if (_eleve != null) {
					copyToBean(_eleve);
					if (_eleve.save()) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				class_diagram_orm.Eleve _eleve = class_diagram_orm.Eleve.loadEleveByORMID(getID());
				if (_eleve != null && _eleve.deleteAndDissociate()) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(class_diagram_orm.Eleve _eleve) {
		setNom(_eleve.getNom());
		setEmail(_eleve.getEmail());
		setMotDePasse(_eleve.getMotDePasse());
		setBiographie(_eleve.getBiographie());
		setNiveauScolaire(_eleve.getNiveauScolaire());
		setDateNaissance(_eleve.getDateNaissance());
		setID(_eleve.getORMID());
	}
	
	private void copyToBean(class_diagram_orm.Eleve _eleve) {
		_eleve.setNom(getNom());
		_eleve.setEmail(getEmail());
		_eleve.setMotDePasse(getMotDePasse());
		_eleve.setBiographie(getBiographie());
		_eleve.setNiveauScolaire(getNiveauScolaire());
		_eleve.setDateNaissance(getDateNaissance());
	}
	
}

