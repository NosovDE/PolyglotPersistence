package ru.nde.polyglotpersistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Author:      Nosov Dmitriy <br>
 * Date:        11.12.12, 22:43 <br>
 * Company:     Home <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class AppTest {
    final static Logger logger = LoggerFactory.getLogger(AppTest.class);

    @Test(enabled = true)
    public void start() {
        for (int i = 0; i < 20; i++) {
            logger.info("" + i + "). Test");
        }
    }

}
