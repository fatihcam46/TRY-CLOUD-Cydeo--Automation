package com.tryCloudCydeoAutomation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {

                "html:target/cucumber-reports.html",
                "json:target/cucumber.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/main/java/resources",
        glue="com/tryCloudCydeoAutomation/step_definitions",
        dryRun = false,
        tags = "@wip" //test execution ticket number copy here
)

public class CukesRunner {
}