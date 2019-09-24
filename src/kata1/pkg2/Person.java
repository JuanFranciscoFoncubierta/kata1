/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1.pkg2;

import java.util.Date;

/**
 *
 * @author juanf
 */
public class Person {
    private String name;
    private Date birthday;
    public Person(String name,Date birthday) {
        this.name=name;
        this.birthday=birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime() - birthday.getTime())/31536000000L);
    }
    
}
