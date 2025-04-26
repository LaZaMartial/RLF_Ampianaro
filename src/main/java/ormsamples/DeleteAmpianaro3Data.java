/**
 * Licensee: 
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteAmpianaro3Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = class_diagram_orm.Ampianaro3PersistentManager.instance().getSession().beginTransaction();
		try {
			class_diagram_orm.Utilisateur lclass_diagram_ormUtilisateur = class_diagram_orm.Utilisateur.loadUtilisateurByQuery(null, null);
			lclass_diagram_ormUtilisateur.delete();
			class_diagram_orm.Donateur lclass_diagram_ormDonateur = class_diagram_orm.Donateur.loadDonateurByQuery(null, null);
			lclass_diagram_ormDonateur.delete();
			class_diagram_orm.Eleve lclass_diagram_ormEleve = class_diagram_orm.Eleve.loadEleveByQuery(null, null);
			lclass_diagram_ormEleve.delete();
			class_diagram_orm.Administrateur lclass_diagram_ormAdministrateur = class_diagram_orm.Administrateur.loadAdministrateurByQuery(null, null);
			lclass_diagram_ormAdministrateur.delete();
			class_diagram_orm.Don lclass_diagram_ormDon = class_diagram_orm.Don.loadDonByQuery(null, null);
			lclass_diagram_ormDon.delete();
			class_diagram_orm.ProjetEducatif lclass_diagram_ormProjetEducatif = class_diagram_orm.ProjetEducatif.loadProjetEducatifByQuery(null, null);
			lclass_diagram_ormProjetEducatif.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteAmpianaro3Data deleteAmpianaro3Data = new DeleteAmpianaro3Data();
			try {
				deleteAmpianaro3Data.deleteTestData();
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
