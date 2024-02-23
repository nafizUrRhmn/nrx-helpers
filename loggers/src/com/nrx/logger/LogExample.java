package com.nrx.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogExample {

    private static Logger logger = Logger.getLogger(LogExample.class.getName());

    public static void main(String args[]){

        Handler handler = new ConsoleHandler();

        logger.addHandler(handler);
        logger.setLevel(Level.INFO);
        logger.warning("ddd");
        logger.log(Level.INFO, "koni chiyua");
        logger.fine("hhhh");

    }
}
