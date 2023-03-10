package com.syntax.review9;

public class Customer {
        // using methods
    private String name;
    private long ssn;

    // Setter = we use to access private variables in Tester
    public void setName(String name){
        if(name!=null && !name.isEmpty()){
            this.name=name;

        }
    }

    // Getter  = we use to access private variables in Tester
    public String getName(){
        return name;
    }

    public void setSsn(long ssn){
        if(ssn!=0){
            this.ssn=ssn;
        }
    }

    public long getSsn(){     // accessing method through variable
        return ssn;
    }

}
