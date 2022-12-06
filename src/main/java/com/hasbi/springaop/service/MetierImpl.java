package com.hasbi.springaop.service;

import com.hasbi.springaop.aspects.Log;
import com.hasbi.springaop.aspects.SecuredByAspect;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    @Override
    @Log
    public void process() {
        System.out.println("Business processing ...");
    }
    @Override
    @SecuredByAspect(roles = {"ADMIN","USER"})
    public double compute() {
        double data=80;
        System.out.println("Business Computing and returning result ....");
        return data;
    }
}
