package com.tms.patterns.factory_method;

import com.tms.patterns.factory_method.factory.ITFactory;
import com.tms.patterns.factory_method.factory.impl.JuniorITFactory;
import com.tms.patterns.factory_method.factory.impl.MiddleITFactory;
import com.tms.patterns.factory_method.factory.impl.SeniorITFactory;
import com.tms.patterns.factory_method.model.Computer;
import com.tms.patterns.factory_method.model.Developer;
import com.tms.patterns.factory_method.model.Workplace;

public class Main {
    public static void main(String[] args) {
        String requestParameter = "junior";

        ITFactory factory;

        switch (requestParameter){
            case "senior" -> factory = new SeniorITFactory();
            case "junior" -> factory = new JuniorITFactory();
            case "middle" -> factory = new MiddleITFactory();
            default ->  factory = new JuniorITFactory();
        }

        System.out.println("We have developer with next skills:");
        Developer developer = factory.createDeveloper();
        developer.showYourSkill();

        System.out.println("he have computer with next hardware:");
        Computer computer = factory.createComputer();
        computer.printHardwareInfo();

        System.out.println("And developer work here:");
        Workplace workplace = factory.createWorkplace();
        workplace.work();
    }
}
