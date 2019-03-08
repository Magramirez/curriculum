package com.edu.appswbd.practica.dos.curriculum.controller;

import com.edu.appswbd.practica.dos.curriculum.model.CurriculumVitae;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cv")
public class CVController {

    @GetMapping(value = "/datos")
    public String obtenerDatos(Model model) {
        CurriculumVitae vitae = new CurriculumVitae();
        vitae.setApellidoMaterno("Ramirez");
        vitae.setApellidoPaterno("Espinoza");
        vitae.setNombre("Maria Guadalupe");
        vitae.setCorreo("mramirez2@uabc.edu.mx");
        vitae.setDireccion("Avenida 83 # 1467 Colonia Venustiano Carranza");
        vitae.setIdiomaNat("Español");
        vitae.setIdiomas("Ingles");
        vitae.setTelefono("(686) 2992165");
        vitae.setPreparatoria("Colegio de Bachilleres del Estado de Baja California");
        vitae.setUniversidad("Universidad Autónoma de Baja California");
        vitae.setCapacitacion("Soporte tecnico");
        vitae.setCarrera("Lic. Sistemas Computacionales");
        vitae.setDescripcion(" Empleos Anteriores: LG Electronics , Intelligent Solutions y Telvista");
        model.addAttribute("cv",vitae);

        return "cv";
    }
}

