/**
 * Licensee: 
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateAmpianaro3Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = class_diagram_orm.Ampianaro3PersistentManager.instance().getSession().beginTransaction();
		try {
			class_diagram_orm.Utilisateur lclass_diagram_ormUtilisateur = class_diagram_orm.Utilisateur.loadUtilisateurByQuery(null, null);
			// Update the properties of the persistent object
			lclass_diagram_ormUtilisateur.save();
			class_diagram_orm.Donateur lclass_diagram_ormDonateur = class_diagram_orm.Donateur.loadDonateurByQuery(null, null);
			// Update the properties of the persistent object
			lclass_diagram_ormDonateur.save();
			class_diagram_orm.Eleve lclass_diagram_ormEleve = class_diagram_orm.Eleve.loadEleveByQuery(null, null);
			// Update the properties of the persistent object
			lclass_diagram_ormEleve.save();
			class_diagram_orm.Administrateur lclass_diagram_ormAdministrateur = class_diagram_orm.Administrateur.loadAdministrateurByQuery(null, null);
			// Update the properties of the persistent object
			lclass_diagram_ormAdministrateur.save();
			class_diagram_orm.Don lclass_diagram_ormDon = class_diagram_orm.Don.loadDonByQuery(null, null);
			// Update the properties of the persistent object
			lclass_diagram_ormDon.save();
			class_diagram_orm.ProjetEducatif lclass_diagram_ormProjetEducatif = class_diagram_orm.ProjetEducatif.loadProjetEducatifByQuery(null, null);
			// Update the properties of the persistent object
			lclass_diagram_ormProjetEducatif.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Utilisateur by UtilisateurCriteria");
		class_diagram_orm.UtilisateurCriteria lclass_diagram_ormUtilisateurCriteria = new class_diagram_orm.UtilisateurCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lclass_diagram_ormUtilisateurCriteria.ID.eq();
		System.out.println(lclass_diagram_ormUtilisateurCriteria.uniqueUtilisateur());
		
		System.out.println("Retrieving Donateur by DonateurCriteria");
		class_diagram_orm.DonateurCriteria lclass_diagram_ormDonateurCriteria = new class_diagram_orm.DonateurCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lclass_diagram_ormDonateurCriteria.ID.eq();
		System.out.println(lclass_diagram_ormDonateurCriteria.uniqueDonateur());
		
		System.out.println("Retrieving Eleve by EleveCriteria");
		class_diagram_orm.EleveCriteria lclass_diagram_ormEleveCriteria = new class_diagram_orm.EleveCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lclass_diagram_ormEleveCriteria.ID.eq();
		System.out.println(lclass_diagram_ormEleveCriteria.uniqueEleve());
		
		System.out.println("Retrieving Administrateur by AdministrateurCriteria");
		class_diagram_orm.AdministrateurCriteria lclass_diagram_ormAdministrateurCriteria = new class_diagram_orm.AdministrateurCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lclass_diagram_ormAdministrateurCriteria.ID.eq();
		System.out.println(lclass_diagram_ormAdministrateurCriteria.uniqueAdministrateur());
		
		System.out.println("Retrieving Don by DonCriteria");
		class_diagram_orm.DonCriteria lclass_diagram_ormDonCriteria = new class_diagram_orm.DonCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lclass_diagram_ormDonCriteria.ID.eq();
		System.out.println(lclass_diagram_ormDonCriteria.uniqueDon());
		
		System.out.println("Retrieving ProjetEducatif by ProjetEducatifCriteria");
		class_diagram_orm.ProjetEducatifCriteria lclass_diagram_ormProjetEducatifCriteria = new class_diagram_orm.ProjetEducatifCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lclass_diagram_ormProjetEducatifCriteria.ID.eq();
		System.out.println(lclass_diagram_ormProjetEducatifCriteria.uniqueProjetEducatif());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateAmpianaro3Data retrieveAndUpdateAmpianaro3Data = new RetrieveAndUpdateAmpianaro3Data();
			try {
				retrieveAndUpdateAmpianaro3Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateAmpianaro3Data.retrieveByCriteria();
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
