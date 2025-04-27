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

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import class_diagram_orm.Utilisateur;

import java.time.LocalDate;

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

	public String process(HttpServletRequest request, HttpServletResponse response) throws IOException{
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
				copyToBean(_don, request, response);
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
					copyToBean(_don, request, response);
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

	private void copyToBean(class_diagram_orm.Don _don, HttpServletRequest request, HttpServletResponse response) throws IOException {

		_don.setMontant(getMontant());
		_don.setDateEnvoi(LocalDate.now().toString());
		try  {
			HttpSession session = request.getSession(false);
			if (session != null) {
				Utilisateur user = (Utilisateur) session.getAttribute("user");;
				System.out.println(user);
				if (user != null) {
					try {
						Donateur donateurFromDB = Donateur.loadDonateurByORMID(user.getORMID());
						_don.setDonateur(donateurFromDB);
					} catch (PersistentException e) {
						e.printStackTrace();  // À remplacer par une vraie gestion d'erreur plus tard
						response.sendRedirect("Login.jsp"); // Si on n'arrive pas à recharger, retour login
					}
				} else {
					response.sendRedirect("Login.jsp"); // Pas connecté
				}
			} else {
				response.sendRedirect("Login.jsp"); // Pas de session, donc pas connecté
			}
		}
		catch (IOException e) {
		}

		try  {
			//C'est ici qu'on met a jour le montant collecte
			class_diagram_orm.ProjetEducatif _projetEducatif = class_diagram_orm.ProjetEducatif.loadProjetEducatifByORMID(getProjetEducatif_projetEducatifID());
			System.out.println("montantCollecte = " + _projetEducatif.getMontantCollecte());
			System.out.println("montantDon = " +  _don.getMontant());
			float nouveauMontant = _projetEducatif.getMontantCollecte() + _don.getMontant();
			_projetEducatif.setMontantCollecte(nouveauMontant);
			_don.setProjetEducatif(_projetEducatif);
		}
		catch (PersistentException e) {
		}

	}

}