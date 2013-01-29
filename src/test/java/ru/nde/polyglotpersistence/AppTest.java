package ru.nde.polyglotpersistence;

import org.testng.annotations.Test;

/**
 * Author:      Nosov Dmitriy <br>
 * Date:        11.12.12, 22:43 <br>
 * Company:     Home <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class AppTest {
    /**
     * RCS (CVS/SVN) information
     */
    @SuppressWarnings("unused")
    public static final String RCS_ID = "$Id$";

    @Test(enabled = false)
    public void start() {
        MongoDB mongoDB = new MongoDB();
        mongoDB.start();
    }

}
