/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.entity.Persona;
import com.tienda.service.IPersonaService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author vicjc
 */
/*fd*/
@Controller
public class PersonaController {
   @Autowirred
   private IPersonaService personaService;
    private Object listaPersona;
   
   @getMapping("/persona")
   public String index (Model model){
       List<Persona>listPersona=personaService.GetAllPersona();
       model.addAttribute("titulo","Tabla Personas");
        model.addAttribute("personas",listaPersona);
        return"personas";
   }
}
