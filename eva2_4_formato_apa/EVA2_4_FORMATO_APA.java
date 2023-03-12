/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_4_formato_apa;

/**
 *
 * @author eduar
 */
public class EVA2_4_FORMATO_APA {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setAutor("Eduardo Muñoz");
        libro1.setAño(2015);
        libro1.setCiudad("Chihuahua");
        libro1.setDia(22);
        libro1.setMes("Agosto");
        libro1.setTitulo("Código Da Vinci");
        libro1.setEditor("Lalo R");
        libro1.setEditorial("Penguin Editorial");
        System.out.println("LIBRO");
        System.out.println("AUTOR:"+libro1.getAutor());
        System.out.println("AÑO:"+libro1.getAño());
        System.out.println("CIUDAD:"+libro1.getCiudad());
        System.out.println("DÍA:"+libro1.getDia());
        System.out.println("MES:"+libro1.getMes());
        System.out.println("TITULO:"+libro1.getTitulo());
        System.out.println("EDITOR: "+libro1.getEditor());
        System.out.println("EDITORIAL: "+libro1.getEditorial());
        
        Articulo art1 = new Articulo();
        art1.setAutor("Ruben N");
        art1.setAño(2019);
        art1.setCiudad("Chihuahua");
        art1.setDia(29);
        art1.setMes("Diciembre");
        art1.setTitulo("Animales y sus formas de cazar");
        art1.setNoPag(500);
        
        Informe inf1 = new Informe ();
        inf1.setAutor("Javir L");
        inf1.setAño(2010);
        inf1.setCiudad("Londres");
        inf1.setDia(30);
        inf1.setMes("Enero");
        inf1.setTitulo("Textos Expositivos");
        inf1.setInstitucion("UACH");
        inf1.setTipoInforme("Informe expositivo");
        
        SitioWeb sitio1 = new SitioWeb();
        sitio1.setAutor("Gonzalo M");
        sitio1.setAño(2017);
        sitio1.setCiudad("Los Ángeles");
        sitio1.setDia(10);
        sitio1.setMes("Marzo");
        sitio1.setTitulo("NBA: últimas noticias");
        sitio1.setNombreSitio("ESPN");
        sitio1.setUrl("www.espnmx.com");
        
    }
}
