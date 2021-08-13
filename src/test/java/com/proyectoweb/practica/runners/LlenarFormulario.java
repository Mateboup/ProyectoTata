package com.proyectoweb.practica.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features =
        "src/test/resources/features/llenar_formulario_contacto.feature",
    glue =
        "com.proyectoweb.practica.stepdefinitions",
    snippets =
        SnippetType
            .CAMELCASE
    )
public class LlenarFormulario {}
