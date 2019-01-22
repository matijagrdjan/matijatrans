package com.example.matijatrans.templeteObjects;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class StationsTemplate {

   @NotBlank(message="Unesi stanicu")
   private String firstStation;

   @NotBlank(message="Unesi stanicu")
   private String lastStation;

   @NotBlank(message = "Odaberi datum")
   private String tripDate;

}
