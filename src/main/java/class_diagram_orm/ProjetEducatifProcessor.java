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

public class ProjetEducatifProcessor {
	private int ID;
	
	private String titre;
	
	private String description;
	
	private float montantObjectif;
	
	private float montantCollecte;
	
	private String status;
	
	private String dateCreation;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setTitre(String value) {
		this.titre = value;
	}
	
	public String getTitre() {
		return titre == null ? "" : titre;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description == null ? "" : description;
	}
	
	public void setMontantObjectif(float value) {
		this.montantObjectif = value;
	}
	
	public float getMontantObjectif() {
		return montantObjectif;
	}
	
	public void setMontantCollecte(float value) {
		this.montantCollecte = value;
	}
	
	public float getMontantCollecte() {
		return montantCollecte;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return status == null ? "" : status;
	}
	
	public void setDateCreation(String value) {
		this.dateCreation = value;
	}
	
	public String getDateCreation() {
		return dateCreation == null ? "" : dateCreation;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int eleve_eleveID;
	
	public void setEleve_eleveID(int value) {
		this.eleve_eleveID = value;
	}
	
	public int getEleve_eleveID() {
		return eleve_eleveID;
	}
	
	public String process(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				class_diagram_orm.ProjetEducatif _projetEducatif = class_diagram_orm.ProjetEducatif.loadProjetEducatifByORMID(getID());
				if (_projetEducatif!= null) {
					copyFromBean(_projetEducatif);
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
				class_diagram_orm.ProjetEducatif _projetEducatif = class_diagram_orm.ProjetEducatif.createProjetEducatif();
				copyToBean(_projetEducatif, request, response);
				if (_projetEducatif.save()) {
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
				class_diagram_orm.ProjetEducatif _projetEducatif= class_diagram_orm.ProjetEducatif.loadProjetEducatifByORMID(getID());
				if (_projetEducatif != null) {
					copyToBeanUpdate(_projetEducatif, request, response);
					if (_projetEducatif.save()) {
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
				class_diagram_orm.ProjetEducatif _projetEducatif = class_diagram_orm.ProjetEducatif.loadProjetEducatifByORMID(getID());
				if (_projetEducatif != null && _projetEducatif.deleteAndDissociate()) {
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
	
	private void copyFromBean(class_diagram_orm.ProjetEducatif _projetEducatif) {
		setTitre(_projetEducatif.getTitre());
		setDescription(_projetEducatif.getDescription());
		setMontantObjectif(_projetEducatif.getMontantObjectif());
		setMontantCollecte(_projetEducatif.getMontantCollecte());
		setStatus(_projetEducatif.getStatus());
		setDateCreation(_projetEducatif.getDateCreation());
		setID(_projetEducatif.getORMID());
		
		{
			class_diagram_orm.Eleve _eleve = _projetEducatif.getEleve();
			if (_eleve != null) {
				setEleve_eleveID(_eleve.getORMID());
			}
		}
		
	}
	
	private void copyToBean(class_diagram_orm.ProjetEducatif _projetEducatif, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_projetEducatif.setTitre(getTitre());
		_projetEducatif.setDescription(getDescription());
		_projetEducatif.setMontantObjectif(getMontantObjectif());
		_projetEducatif.setMontantCollecte(0);
		_projetEducatif.setStatus("En attente");
		_projetEducatif.setDateCreation(LocalDate.now().toString());
		try  {
			HttpSession session = request.getSession(false);
			if (session != null) {
				Utilisateur user = (Utilisateur) session.getAttribute("user");;
				System.out.println(user);
				if (user != null) {
					try {
						Eleve eleveFromDB = Eleve.loadEleveByORMID(user.getORMID());
						_projetEducatif.setEleve(eleveFromDB);
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
		
	}

	private void copyToBeanUpdate(class_diagram_orm.ProjetEducatif _projetEducatif, HttpServletRequest request, HttpServletResponse response) throws PersistentException {
		_projetEducatif.setTitre(getTitre());
		_projetEducatif.setDescription(getDescription());
		_projetEducatif.setMontantObjectif(getMontantObjectif());
		_projetEducatif.setMontantCollecte(getMontantCollecte());
		_projetEducatif.setStatus(getStatus());
		_projetEducatif.setDateCreation(LocalDate.now().toString());
	}
	
}

