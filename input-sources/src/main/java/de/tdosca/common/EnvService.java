/*
 * EnvService.java of the project tdosca.tc05 is licensed under the terms of the BSD-2CL:
 *
 * Copyright (C) 2020 kreincke / Deutsche Telekom AG
 *
 */

package de.tdosca.common;

import java.util.Map;


public class EnvService {
    Map<String, String> env = System.getenv();
    String pwd = null;
    String inc = "------";
    public String info() {
        System.out.println(inc+"tdosca.all.EnvService(): 'hello'.");
        System.out.println(inc+"license(EnvService,B.S.D-2CL)");
        if (env != null) {
            pwd=env.get("PWD");
        }
        if (pwd!=null) {
            System.out.println(inc+"Program is started from " + pwd);
        } else {
            System.out.println(inc+"PWD not specified in the environment");
        }
        System.out.println(inc+"tdosca.all.EnvService(...): 'bye bye'");
        return "back0";
    }
}
