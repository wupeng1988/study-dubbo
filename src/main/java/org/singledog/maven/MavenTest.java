package org.singledog.maven;

import org.apache.maven.shared.invoker.*;

import java.io.File;
import java.util.Collections;

/**
 * @author wupeng
 * @version 1.0
 * @date 2016-02-23
 * @modify
 * @copyright Navi Tsp
 */
public class MavenTest {

    public static void main(String[] args) throws MavenInvocationException {

        InvocationRequest request = new DefaultInvocationRequest();
//        request.setPomFile(new File("D:\\java\\opentsp-service\\opentsp-user\\pom.xml"));
        request.setBaseDirectory(new File("D:\\java\\opentsp-service\\opentsp-user"));
        request.setGoals(Collections.singletonList("clean package -DskipTests"));
        request.setProfiles(Collections.singletonList("local"));
//        request.setOutputHandler(new InvocationOutputHandler() {
//            @Override
//            public void consumeLine(String s) {
//                System.out.println(s);
//            }
//        });

        Invoker invoker = new DefaultInvoker();
        invoker.setMavenHome(new File("D:\\java\\apache-maven-3.2.5"));
        InvocationResult result = invoker.execute(request);

        if (result.getExitCode() != 0) {
            throw new IllegalStateException("Build failed.");
        }

    }

}
