package com.demo12;

import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Tondiyee on 2017/2/6.
 */
public class Boss {
    private List favourite;
    private Set family;
    private Properties mails;

    public Properties getMails() {
        return mails;
    }

    public void setMails(Properties mails) {
        this.mails = mails;
    }

    public Set getFamily() {
        return family;
    }

    public void setFamily(Set family) {
        this.family = family;
    }

    public List getFavourite() {
        return favourite;
    }

    public void setFavourite(List favourite) {
        this.favourite = favourite;
    }


    @Override
    public String toString() {
        String s="";
        for(Object x:favourite){
            s+=x+" ";
        }
        String t="";
        for(Object x:family){
            t+=x+" ";
        }
        return "Boss{" +
                "favourite=" + s +
                ", family=" + t +
                ", mails=" + mails +
                '}';
    }
}
