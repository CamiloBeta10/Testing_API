package co.com.apitesting.questions;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static model.DatosPrueba.getDatosPrueba;
import static org.hamcrest.Matchers.isEmptyString;

public class EmpleadoEliminado implements Question<ValidatableResponse> {

    public static EmpleadoEliminado conExito(){
        return new EmpleadoEliminado();
    }

    @Override
    public ValidatableResponse answeredBy(Actor actor) {
     return SerenityRest.then().statusCode(200)
                .body("status",is("success"))
                .body("message",is("Successfully! Record has been deleted"));
    }
}
