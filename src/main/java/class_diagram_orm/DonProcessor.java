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
public class DonProcessor {
	private int ID;
	
	private float montant;
	
	private String dateEnvoi;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setMontant(float value) {
		this.montant = value;
	}
	
	public float getMontant() {
		return montant;
	}
	
	public void setDateEnvoi(String value) {
		this.dateEnvoi = value;
	}
	
	public String getDateEnvoi() {
		return dateEnvoi == null ? "" : dateEnvoi;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int donateur_donateurID;
	
	public void setDonateur_donateurID(int value) {
		this.donateur_donateurID = value;
	}
	
	public int getDonateur_donateurID() {
		return donateur_donateurID;
	}
	
	private int projetEducatif_projetEducatifID;
	
	public void setProjetEducatif_projetEducatifID(int value) {
		this.projetEducatif_projetEducatifID = value;
	}
	
	public int getProjetEducatif_projetEducatifID() {
		return projetEducatif_projetEducatifID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				class_diagram_orm.Don _don = class_diagram_orm.Don.loadDonByORMID(getID());
				if (_don!= null) {
					copyFromBean(_don);
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
				class_diagram_orm.Don _don = class_diagram_orm.Don.createDon();
				copyToBean(_don);
				if (_don.save()) {
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
				class_diagram_orm.Don _don= class_diagram_orm.Don.loadDonByORMID(getID());
				if (_don != null) {
					copyToBean(_don);
					if (_don.save()) {
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
				class_diagram_orm.Don _don = class_diagram_orm.Don.loadDonByORMID(getID());
				if (_don != null && _don.deleteAndDissociate()) {
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
	
	private void copyFromBean(class_diagram_orm.Don _don) {
		setMontant(_don.getMontant());
		setDateEnvoi(_don.getDateEnvoi());
		setID(_don.getORMID());
		
		{
			class_diagram_orm.Donateur _donateur = _don.getDonateur();
			if (_donateur != null) {
				setDonateur_donateurID(_donateur.getORMID());
			}
		}
		
		
		{
			class_diagram_orm.ProjetEducatif _projetEducatif = _don.getProjetEducatif();
			if (_projetEducatif != null) {
				setProjetEducatif_projetEducatifID(_projetEducatif.getORMID());
			}
		}
		
	}
	
	private void copyToBean(class_diagram_orm.Don _don) {
		_don.setMontant(getMontant());
		_don.setDateEnvoi(getDateEnvoi());
		try  {
			class_diagram_orm.Donateur _donateur = class_diagram_orm.Donateur.loadDonateurByORMID(getDonateur_donateurID());
			_don.setDonateur(_donateur);
		}
		catch (PersistentException e) {
		}
		
		try  {
			class_diagram_orm.ProjetEducatif _projetEducatif = class_diagram_orm.ProjetEducatif.loadProjetEducatifByORMID(getProjetEducatif_projetEducatifID());
			_don.setProjetEducatif(_projetEducatif);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

