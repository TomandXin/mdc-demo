package com.tom.mdc.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志打印
 *
 * @author tomxin
 * @since v1.0.0
 */
public class ChildMdcTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(ChildMdcTask.class);

    public ChildMdcTask() {
        
    }

    @Override
    public void run() {
        logger.info("child mdc task");
    }
}
