/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midocumento;

import java.util.Date;

/**
 *
 * @author George Rodriguez
 */
public class documentDatabase {
    private Long id;
    private String title;
    private Date date;

    public documentDatabase(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public void seetTitle(String title) {
        this.title = title;
    }
    
}
