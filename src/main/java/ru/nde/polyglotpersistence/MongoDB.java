package ru.nde.polyglotpersistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author:      Nosov Dmitriy <br>
 * Date:        11.12.12, 22:44 <br>
 * Company:      <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class MongoDB {

    final static Logger logger = LoggerFactory.getLogger(MongoDB.class);


    public void start() {
        for (int i = 0; i < 50; i++) {
            Exception e = new Exception("ssss");
            logger.error("error: " + e, e);
        }
    }


}
