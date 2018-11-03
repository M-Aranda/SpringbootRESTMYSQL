/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@SpringBootApplication
@ComponentScan({"src.main.model"})//Escanear componentes en este paquete
@EntityScan("src.main.model")//escanear entidades en este paquete
@EnableJpaRepositories("src.main.model")//habilitar repositorios jpa viniendo de este paquete
public class Aplicacion {

    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
    }
}