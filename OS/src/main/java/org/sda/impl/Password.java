package org.sda.impl;

import org.sda.api.IPassword;

public class Password implements IPassword {
    
    private String key;
    
    public Password(String password) {
        this.key = password;
    }

    @Override
    public String getKey() {
        return key;
    }
}
