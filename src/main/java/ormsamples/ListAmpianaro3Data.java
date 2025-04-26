/**
 * Licensee: 
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListAmpianaro3Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Utilisateur...");
		class_diagram_orm.Utilisateur[] class_diagram_ormUtilisateurs = class_diagram_orm.Utilisateur.listUtilisateurByQuery(null, null);
		int length = Math.min(class_diagram_ormUtilisateurs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(class_diagram_ormUtilisateurs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Donateur...");
		class_diagram_orm.Donateur[] class_diagram_ormDonateurs = class_diagram_orm.Donateur.listDonateurByQuery(null, null);
		length = Math.min(class_diagram_ormDonateurs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(class_diagram_ormDonateurs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Eleve...");
		class_diagram_orm.Eleve[] class_diagram_ormEleves = class_diagram_orm.Eleve.listEleveByQuery(null, null);
		length = Math.min(class_diagram_ormEleves.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(class_diagram_ormEleves[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrateur...");
		class_diagram_orm.Administrateur[] class_diagram_ormAdministrateurs = class_diagram_orm.Administrateur.listAdministrateurByQuery(null, null);
		length = Math.min(class_diagram_ormAdministrateurs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(class_diagram_ormAdministrateurs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Don...");
		class_diagram_orm.Don[] class_diagram_ormDons = class_diagram_orm.Don.listDonByQuery(null, null);
		length = Math.min(class_diagram_ormDons.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(class_diagram_ormDons[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ProjetEducatif...");
		class_diagram_orm.ProjetEducatif[] class_diagram_ormProjetEducatifs = class_diagram_orm.ProjetEducatif.listProjetEducatifByQuery(null, null);
		length = Math.min(class_diagram_ormProjetEducatifs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(class_diagram_ormProjetEducatifs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Utilisateur by Criteria...");
		class_diagram_orm.UtilisateurCriteria lclass_diagram_ormUtilisateurCriteria = new class_diagram_orm.UtilisateurCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lclass_diagram_ormUtilisateurCriteria.ID.eq();
		lclass_diagram_ormUtilisateurCriteria.setMaxResults(ROW_COUNT);
		class_diagram_orm.Utilisateur[] class_diagram_ormUtilisateurs = lclass_diagram_ormUtilisateurCriteria.listUtilisateur();
		int length =class_diagram_ormUtilisateurs== null ? 0 : Math.min(class_diagram_ormUtilisateurs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(class_diagram_ormUtilisateurs[i]);
		}
		System.out.println(length + " Utilisateur record(s) retrieved."); 
		
		System.out.println("Listing Donateur by Criteria...");
		class_diagram_orm.DonateurCriteria lclass_diagram_ormDonateurCriteria = new class_diagram_orm.DonateurCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lclass_diagram_ormDonateurCriteria.ID.eq();
		lclass_diagram_ormDonateurCriteria.setMaxResults(ROW_COUNT);
		class_diagram_orm.Donateur[] class_diagram_ormDonateurs = lclass_diagram_ormDonateurCriteria.listDonateur();
		length =class_diagram_ormDonateurs== null ? 0 : Math.min(class_diagram_ormDonateurs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(class_diagram_ormDonateurs[i]);
		}
		System.out.println(length + " Donateur record(s) retrieved."); 
		
		System.out.println("Listing Eleve by Criteria...");
		class_diagram_orm.EleveCriteria lclass_diagram_ormEleveCriteria = new class_diagram_orm.EleveCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lclass_diagram_ormEleveCriteria.ID.eq();
		lclass_diagram_ormEleveCriteria.setMaxResults(ROW_COUNT);
		class_diagram_orm.Eleve[] class_diagram_ormEleves = lclass_diagram_ormEleveCriteria.listEleve();
		length =class_diagram_ormEleves== null ? 0 : Math.min(class_diagram_ormEleves.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(class_diagram_ormEleves[i]);
		}
		System.out.println(length + " Eleve record(s) retrieved."); 
		
		System.out.println("Listing Administrateur by Criteria...");
		class_diagram_orm.AdministrateurCriteria lclass_diagram_ormAdministrateurCriteria = new class_diagram_orm.AdministrateurCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lclass_diagram_ormAdministrateurCriteria.ID.eq();
		lclass_diagram_ormAdministrateurCriteria.setMaxResults(ROW_COUNT);
		class_diagram_orm.Administrateur[] class_diagram_ormAdministrateurs = lclass_diagram_ormAdministrateurCriteria.listAdministrateur();
		length =class_diagram_ormAdministrateurs== null ? 0 : Math.min(class_diagram_ormAdministrateurs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(class_diagram_ormAdministrateurs[i]);
		}
		System.out.println(length + " Administrateur record(s) retrieved."); 
		
		System.out.println("Listing Don by Criteria...");
		class_diagram_orm.DonCriteria lclass_diagram_ormDonCriteria = new class_diagram_orm.DonCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lclass_diagram_ormDonCriteria.ID.eq();
		lclass_diagram_ormDonCriteria.setMaxResults(ROW_COUNT);
		class_diagram_orm.Don[] class_diagram_ormDons = lclass_diagram_ormDonCriteria.listDon();
		length =class_diagram_ormDons== null ? 0 : Math.min(class_diagram_ormDons.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(class_diagram_ormDons[i]);
		}
		System.out.println(length + " Don record(s) retrieved."); 
		
		System.out.println("Listing ProjetEducatif by Criteria...");
		class_diagram_orm.ProjetEducatifCriteria lclass_diagram_ormProjetEducatifCriteria = new class_diagram_orm.ProjetEducatifCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lclass_diagram_ormProjetEducatifCriteria.ID.eq();
		lclass_diagram_ormProjetEducatifCriteria.setMaxResults(ROW_COUNT);
		class_diagram_orm.ProjetEducatif[] class_diagram_ormProjetEducatifs = lclass_diagram_ormProjetEducatifCriteria.listProjetEducatif();
		length =class_diagram_ormProjetEducatifs== null ? 0 : Math.min(class_diagram_ormProjetEducatifs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(class_diagram_ormProjetEducatifs[i]);
		}
		System.out.println(length + " ProjetEducatif record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListAmpianaro3Data listAmpianaro3Data = new ListAmpianaro3Data();
			try {
				listAmpianaro3Data.listTestData();
				//listAmpianaro3Data.listByCriteria();
			}
			finally {
				class_diagram_orm.Ampianaro3PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
