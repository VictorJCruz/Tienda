/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
*
* @author josea
*/



@Entity
@Table(name="paises")
public class Pais implements Serializable {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String Pais;



public long getId() {
return id;
}



public void setId(long id) {
this.id = id;
}



public String getPais() {
return Pais;
}



public void setPais(String Pais) {
this.Pais = Pais;
}


}
