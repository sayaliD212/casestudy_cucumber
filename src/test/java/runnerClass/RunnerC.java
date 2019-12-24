package runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PDC3B-TRAINING.PDC3B\\eclipse-NamrataMS\\Case_study_cucumber\\MyFeatureFolder\\TestMeApp.feature",glue= {"stepDefs"})
public class RunnerC {

}
