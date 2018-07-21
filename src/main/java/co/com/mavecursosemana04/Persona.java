
package co.com.mavecursosemana04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data // setter-getter-toString-hascodeequals
@AllArgsConstructor // crea constructor con todos los argumentos
@ NoArgsConstructor // es un constructor vacio 
@RequiredArgsConstructor // Constructor requiere algun o algunos argumentos
public class Persona {

        
@NonNull @EqualsAndHashCode.Include
private String codigo;
@EqualsAndHashCode.Exclude // excluir los hascode y equals
private String nombre, apellidos;
    
}
