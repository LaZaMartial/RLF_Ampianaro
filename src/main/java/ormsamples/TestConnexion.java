package ormsamples;

import class_diagram_orm.Ampianaro3PersistentManager;

public class TestConnexion {
    public static void main(String[] args) {
        try {
            Ampianaro3PersistentManager.instance().getSession();
            System.out.println("✅ PostgreSQL connection OK!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
