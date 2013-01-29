package ru.nde.utils.logs;

import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.spi.ContextAwareBase;

/**
 * Author:      Dmitriy E. Nosov <br>
 * Date:        29.01.13, 12:32 <br>
 * Company:     Korus Consulting IT<br>
 * Description:  <br>
 */
public class CounterBasedEvaluator extends ContextAwareBase implements EventEvaluator {

    static int LIMIT = 10;
    int counter = 0;
    String name;
    boolean started;

    public boolean evaluate(Object event) throws NullPointerException, EvaluationException {
        counter++;

        if (counter == LIMIT) {
            counter = 0;

            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStarted() {
        return started;
    }

    public void start() {
        started = true;
    }

    public void stop() {
        started = false;
    }
}

