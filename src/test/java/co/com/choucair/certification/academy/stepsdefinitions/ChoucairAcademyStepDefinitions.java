package co.com.choucair.certification.academy.stepsdefinitions;

import co.com.choucair.certification.academy.Login;
import co.com.choucair.certification.academy.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import tasks.OpenUp;
import questions.Answer;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation al the academy Choucair$")
    public void thanBrandonwantsToLearnAutomationAtTheAcademyChoucair(){
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));

    }


    @When("^he search for the course (.*) in the choucair academy platform$")
    public void hesearchForTheCourseAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(String course){
       OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));


    }


    @Then("^he finds the course called resources (.*)$")
    public void hefindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia(String question){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));


    }

}
