package com.everis.financial.persistence;

public interface ConnectionDB {
    public String openSession(String username, String password, String dataBase, String url);

    public String openSession(String username, String password, String dataBase);

    public void closeSession();
}


//~ Formatted by Jindent --- http://www.jindent.com
