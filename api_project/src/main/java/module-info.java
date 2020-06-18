module api_project {
    requires spring.web;
    requires spring.boot;
    requires spring.boot.starter.web;
    requires spring.boot.autoconfigure;

    opens net.ifao.api to spring.core;

    requires ibetms_project;

}