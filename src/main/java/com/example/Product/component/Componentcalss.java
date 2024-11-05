package com.example.Product.component;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;
@Component

public class Componentcalss {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(Componentcalss.class);

    public void logproductAction(String action, Long Id) {
        logger.info("Action: {} for product ID: {}", action, Id);
    }

   
    public void validateproductData(String name, String description) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("product name cannot be empty.");
        }

        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("product description cannot be empty.");
        }
    }


}
