package com.everis.proyect.models;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AtmDepositRequest {
  //@Size(min=8, max =8, message = "Numero de documento Incorrecto")
  //@NotNull(message = "Debe ingresar numero de documento")
  
  private String documentNumber;
}
