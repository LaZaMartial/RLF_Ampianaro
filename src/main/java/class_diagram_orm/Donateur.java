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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Donateur extends class_diagram_orm.Utilisateur {
	public Donateur() {
	}
	
	public static Donateur loadDonateurByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return loadDonateurByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur getDonateurByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return getDonateurByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur loadDonateurByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return loadDonateurByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur getDonateurByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return getDonateurByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur loadDonateurByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Donateur) session.load(class_diagram_orm.Donateur.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur getDonateurByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Donateur) session.get(class_diagram_orm.Donateur.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur loadDonateurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Donateur) session.load(class_diagram_orm.Donateur.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur getDonateurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Donateur) session.get(class_diagram_orm.Donateur.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDonateur(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return queryDonateur(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDonateur(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return queryDonateur(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur[] listDonateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return listDonateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur[] listDonateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return listDonateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDonateur(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Donateur as Donateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDonateur(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Donateur as Donateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Donateur", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur[] listDonateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDonateur(session, condition, orderBy);
			return (Donateur[]) list.toArray(new Donateur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur[] listDonateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDonateur(session, condition, orderBy, lockMode);
			return (Donateur[]) list.toArray(new Donateur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur loadDonateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return loadDonateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur loadDonateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return loadDonateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur loadDonateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Donateur[] donateurs = listDonateurByQuery(session, condition, orderBy);
		if (donateurs != null && donateurs.length > 0)
			return donateurs[0];
		else
			return null;
	}
	
	public static Donateur loadDonateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Donateur[] donateurs = listDonateurByQuery(session, condition, orderBy, lockMode);
		if (donateurs != null && donateurs.length > 0)
			return donateurs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDonateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return iterateDonateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDonateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return iterateDonateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDonateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Donateur as Donateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDonateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Donateur as Donateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Donateur", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Donateur loadDonateurByCriteria(DonateurCriteria donateurCriteria) {
		Donateur[] donateurs = listDonateurByCriteria(donateurCriteria);
		if(donateurs == null || donateurs.length == 0) {
			return null;
		}
		return donateurs[0];
	}
	
	public static Donateur[] listDonateurByCriteria(DonateurCriteria donateurCriteria) {
		return donateurCriteria.listDonateur();
	}
	
	public static Donateur createDonateur() {
		return new class_diagram_orm.Donateur();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			class_diagram_orm.Don[] lDonss = dons.toArray();
			for(int i = 0; i < lDonss.length; i++) {
				lDonss[i].setDonateur(null);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			class_diagram_orm.Don[] lDonss = dons.toArray();
			for(int i = 0; i < lDonss.length; i++) {
				lDonss[i].setDonateur(null);
			}
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_DONATEUR_DONS) {
			return ORM_dons;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_dons = new java.util.HashSet();
	
	private void setORM_Dons(java.util.Set value) {
		this.ORM_dons = value;
	}
	
	private java.util.Set getORM_Dons() {
		return ORM_dons;
	}
	
	public final class_diagram_orm.DonSetCollection dons = new class_diagram_orm.DonSetCollection(this, _ormAdapter, ORMConstants.KEY_DONATEUR_DONS, ORMConstants.KEY_DON_DONATEUR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
