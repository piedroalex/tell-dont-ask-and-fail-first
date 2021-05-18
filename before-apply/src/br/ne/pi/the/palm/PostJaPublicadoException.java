package br.ne.pi.the.palm;

public class PostJaPublicadoException extends Exception {

    private static final long serialVersionUID = 1L;

    public PostJaPublicadoException() {
        System.out.println("Esse post já foi publicado.");
    }  
}
