package com.hasbi.springaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(value = {"com.hasbi.springaop.service","com.hasbi.springaop.aspects"})
public class AppConfig {
}

