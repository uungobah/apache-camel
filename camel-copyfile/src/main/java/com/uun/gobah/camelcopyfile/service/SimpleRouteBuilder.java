package com.uun.gobah.camelcopyfile.service;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:D:/Camel Test/inputFolder?noop=true").to("file:D:/Camel Test/outputFolder");
    }
}
