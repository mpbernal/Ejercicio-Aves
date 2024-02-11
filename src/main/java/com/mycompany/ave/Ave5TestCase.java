/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ave;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;

/**
 *
 * @author wsant
 */
public class Ave5TestCase {
    
    public static final Logger logger = LoggerFactory.getLogger(Ave5TestCase.class);
    
    public void CanarioTestCase(){
        Canario canario = new Canario();
        Assert.assertNotNull(canario);
        
        logger.debug("canario realizaVuelo");
        System.out.println("Canario realizaVuelo");
        canario.realizaVuelo();
        logger.debug("canario realizaSonido");
        System.out.println("Canario realizaSonido");
        canario.realizaSonido();
        System.out.println("Canario cambiando sonido ave");
        canario.setTipoSonido(new Grasnido());
        System.out.println("Canario realizaSonido");
        canario.realizaSonido();
    }
}
