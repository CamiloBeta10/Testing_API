package co.com.apitesting.questions;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static model.DatosPrueba.getDatosPrueba;
import static org.hamcrest.Matchers.hasItem;

public class EmpleadoEncontrado implements Question<ValidatableResponse> {

    public static EmpleadoEncontrado Exitosamente() {
        return new EmpleadoEncontrado();
    }

    @Override
    public ValidatableResponse answeredBy(Actor actor) {
        return SerenityRest.then().statusCode(Integer.parseInt(getDatosPrueba().get("codigoRespuesta").toString()))
                .body("data.employee_name",hasItem(getDatosPrueba().get("nombre").toString())).and()
                .body("data.employee_salary",hasItem(Integer.parseInt(getDatosPrueba().get("salario").toString()))).and()
                .body("data.employee_age",hasItem(Integer.parseInt(getDatosPrueba().get("edad").toString())));
    }
}
