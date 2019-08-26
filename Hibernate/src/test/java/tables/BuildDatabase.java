package tables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import util.HibernateUtilities;

public class BuildDatabase {
    @Test
    public void createDB() {
        HibernateUtilities.getSessionFactory();
    }
}
