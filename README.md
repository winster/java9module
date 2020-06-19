# java9module
Sample application which hosts legacy servlet application and new spring boot application as separate modules

ibetms_project :  a servlet based application  
api_project: a spring boot based application  

This project is supposed to run them in separate modules so that api_project depends on ibetms_project module

### ibetms_project run
cd ibetms_project  
gradle war  

### api_project run
cd api_project  
gradle bootRun  

Note: This project was created as a reference application to the spring boot team when spring boot app was not working. There was an issue reported https://github.com/spring-projects/spring-boot/issues/22013. But it is an invalid issue, rather a fix required on the ibetms_project module build

### gradle support for Java9
https://discuss.gradle.org/t/gradle-doesnt-add-modules-to-module-path-during-compile/27382  
