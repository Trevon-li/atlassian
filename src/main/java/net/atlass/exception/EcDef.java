package net.atlass.exception;

import java.security.PublicKey;

public class EcDef extends Exception{
    static final long serialVersionUID = -33875169124229948L;

    public EcDef(){

    }

    public EcDef(String msg){
        super(msg);
    }
}
