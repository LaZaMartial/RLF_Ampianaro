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
public class DonateurProcessor {
	private int ID;
	
	private String nom;
	
	private String email;
	
	private String motDePasse;
	
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
				class_diagram_orm.Donateur _donateur = class_diagram_orm.Donateur.loadDonateurByORMID(getID());
				if (_donateur!= null) {
					copyFromBean(_donateur);
					result = "Donateur trouve";
				}
				else {
					result = "Donateur pas trouve";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				class_diagram_orm.Donateur _donateur = class_diagram_orm.Donateur.createDonateur();
				copyToBean(_donateur);
				if (_donateur.save()) {
					result = "Donateur inserer";
				}
				else {
					result = "Donateur pas inserer";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				class_diagram_orm.Donateur _donateur= class_diagram_orm.Donateur.loadDonateurByORMID(getID());
				if (_donateur != null) {
					copyToBean(_donateur);
					if (_donateur.save()) {
						result = "Donateur modifie";
					}
					 else {
						result = "Donateur pas modifie";
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
				class_diagram_orm.Donateur _donateur = class_diagram_orm.Donateur.loadDonateurByORMID(getID());
				if (_donateur != null && _donateur.deleteAndDissociate()) {
					result = "Donateur supprime";
				}
				else {
					result = "Donateur non supprime";
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
	
	private void copyFromBean(class_diagram_orm.Donateur _donateur) {
		setNom(_donateur.getNom());
		setEmail(_donateur.getEmail());
		setMotDePasse(_donateur.getMotDePasse());
		setID(_donateur.getORMID());
	}
	
	private void copyToBean(class_diagram_orm.Donateur _donateur) {
		_donateur.setNom(getNom());
		_donateur.setEmail(getEmail());
		_donateur.setMotDePasse(getMotDePasse());
	}
	
}

