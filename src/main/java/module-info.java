module ape.tomato {
    requires springboot.javafx.support;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.beans;
    requires spring.aop;
    requires spring.context;
    requires spring.core;
    requires javafx.graphics;
    requires org.slf4j;
    requires org.slf4j.simple;
    requires javafx.controls;
    requires java.desktop;
    requires java.sql;
    requires java.base;
    requires jdk.jdwp.agent;

    exports org.ocean.ape.tomato;
    exports org.ocean.ape;
//    opens org.ocean.ape.tomato;
//    opens org.ocean.ape;
    opens org.ocean.ape.tomato to javafx.graphics, spring.context, spring.core, spring.beans;
    opens org.ocean.ape to javafx.graphics, spring.beans, spring.context, spring.core;

}
