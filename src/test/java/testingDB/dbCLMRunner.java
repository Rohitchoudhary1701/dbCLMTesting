package testingDB;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/main/resources/NACE",
                  plugin= {"pretty","html:target/report.html"
                	},
                  glue= {"testingDB"},
                  tags="@dbCLM_get"		
)
public class dbCLMRunner {

	
			
}
