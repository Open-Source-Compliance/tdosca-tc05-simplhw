/*
 * Copyright (C) 2020 Karsten Reincke, Deutsche Telekom AG
 *
 * tdosca-tc05.main is licensed under the terms of the MIT license.
 * For details see the file COPYING in the top directory.
 */

package de.tdosca.tc05;

public class Main {
    public static void main(String[] args) {
        GreetingService service = new GreetingService();
        System.out.println("tdosca.tc05.Main: 'hello'.");
        System.out.println("license(Main,M.I.T)");
        if ((args == null) || (args.length == 0)){
            service.greet();
        }
        else {
            service.greet(args[0]);
        }
        System.out.println("tdosca.tc05.Main: 'bye bye'");
    }
}
