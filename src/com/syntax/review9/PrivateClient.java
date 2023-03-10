package com.syntax.review9;

public class PrivateClient {

    // using constructor
    private String name;
    private long ssn;


    // creating constructor
    PrivateClient(String name,long ssn){
        if(name!=null && !name.isEmpty()){
            this.name=name;  // initialization
        }

        if(ssn!=0){
            this.ssn=ssn;
        }
    }

    public String getName(){
        return name;
    }

    public long getSsn(){
        return ssn;
    }
}
