module PertaCalcApp {
    requires spring.context;
    requires spring.beans;
    requires java.sql;
    requires org.slf4j;

    opens PertaCalcApp;
    opens PertaCalcApp.entities;
    opens PertaCalcApp.config;
    opens PertaCalcApp.views;
    opens PertaCalcApp.services;
    opens PertaCalcApp.repositories;



}