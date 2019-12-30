package org.launchcode.javawebdevtechjobsmvc.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Form {
    private String searchType = "all";
    private String searchTerm;
    
    public String getSearchType() {
        return searchType;
    }
    
    public Form setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    
    public String getSearchTerm() {
        return searchTerm;
    }
    
    public Form setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
        return this;
    }
    
    //    private ArrayList<String> columns = new ArrayList<>();
    
//    public Form(){
//        columns.add("all");
//        columns.add("employer");
//        columns.add("location");
//        columns.add("positionType");
//        columns.add("coreCompetency");
//    }
}
