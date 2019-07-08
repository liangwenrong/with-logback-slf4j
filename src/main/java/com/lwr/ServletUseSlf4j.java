package com.lwr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 通过slf4j门面日志调用logback
 */
@WebServlet("/slf4j")
public class ServletUseSlf4j extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(ServletUseSlf4j.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.error("hello {},do you like {}", "jack", "apple");
        for (int i = 0; i < 1000000000; i++) {
            logger.info("this is info msg");
            logger.error("this is error msg");
        }
    }

}
