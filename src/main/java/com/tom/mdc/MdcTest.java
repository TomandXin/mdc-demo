package com.tom.mdc;

import com.tom.mdc.thread.ChildMdcTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * MdcTest
 *
 * @author tomxin
 * @since v1.0.0
 */
public class MdcTest {

    private static Logger logger = LoggerFactory.getLogger(MdcTest.class);

    public static void main(String[] args) {
        MDC.put("traceId", UUID.randomUUID().toString());
        logger.info("MdcTest");
        MDC.clear();
        logger.info("MDC clear Test");
    }
}
