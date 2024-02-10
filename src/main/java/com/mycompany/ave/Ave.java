/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ave;
import com.mycompany.ave.TipoSonido;
/**
 *
 * @author wsant
 */
public abstract class Ave {

    TipoSonido tipoSonido;
    TipoVuelo tipoVuelo;
    
    
    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }
    
    public void realizaSonid(){
        tipoSonido.makeSound();
    }
    
    
    
}
