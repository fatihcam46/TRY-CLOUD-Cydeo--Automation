package com.tryCloudCydeoAutomation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {

                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/main/resources/features",
        glue="com/tryCloudCydeoAutomation/step_definitions",
        dryRun = false,
        tags = ""
)

public class CukesRunner {
}