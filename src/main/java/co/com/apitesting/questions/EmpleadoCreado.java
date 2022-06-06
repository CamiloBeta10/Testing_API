package co.com.apitesting.questions;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static org.hamcrest.Matchers.*;

import static model.DatosPrueba.getDatosPrueba;

public class EmpleadoCreado implements Question<ValidatableResponse> {

    public static EmpleadoCreado Exitosamente() {
        return new EmpleadoCreado();
    }

    @Override
    public ValidatableResponse answeredBy(Actor actor) {
        return SerenityRest.then().statusCode(Integer.parseInt(getDatosPrueba().get("codigoRespuesta").toString()))
                .body("status",is("success"))
                .body("message",is("Successfully! Record has been added."))
                .body("data.id",not(isEmptyString()));
                //.body("data.name",is(Integer.parseInt(getDatosPrueba().get("salario").toString()));
               // .body("salary",is(Integer.parseInt(getDatosPrueba().get("salario").toString())))
              // .body("age",is(Integer.parseInt(getDatosPrueba().get("edad").toString())))
               // .body("profile_image",not(isEmptyString()));
    }
}
