# SocialInteractionManagementApp_REPL

To run this application 

1. Open Jshell(It is in <jdk path>/bin/) Only available in java 9 and above.

2. Run the follwoing command remember to update the path all the jars used in below command is in dependency-jars folder inside target folder and SocialInteractionManagementApp.jar is target folder. 

/env -class-path D:\Application\antlr-2.7.7.jar;D:\Application\SocialInteractionManagementApp.jar;D:\Application\commons-csv-1.5.jar;D:\Application\dom4j-1.6.1.jar;D:\Application\hamcrest-core-1.3.jar;D:\Application\hibernate-commons-annotations-4.0.5.Final.jar;D:\Application\hibernate-core-4.3.11.Final.jar;D:\Application\hibernate-jpa-2.1-api-1.0.0.Final.jar;D:\Application\hsqldb-1.8.0.10.jar;D:\Application\jandex-1.1.0.Final.jar;D:\Application\javassist-3.18.1-GA.jar;D:\Application\jaxb-api-2.2.11.jar;D:\Application\jboss-logging-3.1.3.GA.jar;D:\Application\jboss-logging-annotations-1.2.0.Beta1.jar;D:\Application\jboss-transaction-api_1.2_spec-1.0.0.Final.jar;D:\Application\junit-4.12.jar;D:\Application\log4j-1.2.17.jar;D:\Application\xml-apis-1.0.b2.jar;

3. Run the follwoing command import com.dinesh.org.SocialInteractionManagementApp.*;

For Add operation run follwoing command 
App.Add(<Url>)
Example : App.Add("https://www.rte.ie/news/ulster/2018/1004/1000952-moanghan-mine/ 30");

Note: This is not working and there is an issue while reading the hibernate.cfg.xml file. I would have fixed it if had more time.

For Add operation run follwoing command 
App.Export();

Note: This is not working and there is an issue while reading the hibernate.cfg.xml file. I would have fixed it if had more time.

For Remove operation run follwoing command 
App.Remove(<Url>)
Example: App.Remove("https://www.rte.ie/news/ulster/2018/1004/1000952-moanghan-mine/"); 

