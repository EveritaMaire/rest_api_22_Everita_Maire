package rest_api.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class ClickUpSteps {

    @Given("Folder is created")
    public void createFolder(){
        System.out.print(" Execution of first step");
    }
    @When("I create new List {string}")
    public void iCreateNewList(String list){
        System.out.print("New list is created" + list );
    }

    @And("Verify that the List name is correct")
    public void verifyTheListname(){
        System.out.print("List name is verified");
    }
    @Then("I create Task in the List")
    public void iCreateNewTask(){
        System.out.print("New Task is created");
    }
    @And("Verify that Task name is correct")
    public void verifyTheTaskname(){
        System.out.print("Task name is verified");
    }
    @And("I remove the Task from the List")
    public void iRemoveTheList(){
        System.out.print("Task is removed");
    }
}
