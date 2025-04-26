/**
 * Licensee: 
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateAmpianaro3Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = class_diagram_orm.Ampianaro3PersistentManager.instance().getSession().beginTransaction();
		try {
			class_diagram_orm.Utilisateur lclass_diagram_ormUtilisateur = class_diagram_orm.Utilisateur.createUtilisateur();
			// Initialize the properties of the persistent object here
			lclass_diagram_ormUtilisateur.save();
			class_diagram_orm.Donateur lclass_diagram_ormDonateur = class_diagram_orm.Donateur.createDonateur();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : dons
			lclass_diagram_ormDonateur.save();
			class_diagram_orm.Eleve lclass_diagram_ormEleve = class_diagram_orm.Eleve.createEleve();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : projetEducatifs
			lclass_diagram_ormEleve.save();
			class_diagram_orm.Administrateur lclass_diagram_ormAdministrateur = class_diagram_orm.Administrateur.createAdministrateur();
			// Initialize the properties of the persistent object here
			lclass_diagram_ormAdministrateur.save();
			class_diagram_orm.Don lclass_diagram_ormDon = class_diagram_orm.Don.createDon();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : dateEnvoi, montant, donateur, projetEducatif
			lclass_diagram_ormDon.save();
			class_diagram_orm.ProjetEducatif lclass_diagram_ormProjetEducatif = class_diagram_orm.ProjetEducatif.createProjetEducatif();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : dons, montantCollecte, montantObjectif, eleve
			lclass_diagram_ormProjetEducatif.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateAmpianaro3Data createAmpianaro3Data = new CreateAmpianaro3Data();
			try {
				createAmpianaro3Data.createTestData();
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
