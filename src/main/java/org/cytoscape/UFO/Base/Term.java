/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cytoscape.UFO.Base;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author "MinhDA"
 */
public class Term {
    public String ID;
    public String Name;
    public boolean Obsolete;
    public String Type;
    public Set<String> MappedIDSet;
    
    public Term(){
        this.ID ="";
        this.Name = "";
        this.Obsolete = true;
        this.Type ="";
        this.MappedIDSet=new TreeSet<>();
    }
    
    public Term(String ID, String name, boolean obs, String type){
        this.ID = ID;
        this.Name = name;
        this.Obsolete = obs;
        this.Type = type;
    }
}
