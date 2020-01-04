package org.launchcode.javawebdevtechjobsmvc.controllers;

import org.launchcode.javawebdevtechjobsmvc.models.JobData;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.HashMap;

public class TechJobsController {
    static HashMap<String,String> actionChoices = new HashMap<>();
    
    static HashMap<String,String> columnChoices = new HashMap<>();
    static HashMap<String,Object> tableChoices = new HashMap<>();
    static HashMap<String,String> descriptors = new HashMap<>();
    
    
    public TechJobsController(){
        actionChoices.put("search","Search");
        actionChoices.put("list","List");
        
        // refactor from ListController
        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");
    
        tableChoices.put("all", "View All");
        tableChoices.put("employer", JobData.getAllEmployers());
        tableChoices.put("location", JobData.getAllLocations());
        tableChoices.put("positionType", JobData.getAllPositionTypes());
        tableChoices.put("coreCompetency", JobData.getAllCoreCompetency());
    
        // initialize descriptors
        descriptors.put("id","id");
        descriptors.put("name","name");
        descriptors.put("employer","employer");
        descriptors.put("location","location");
        descriptors.put("positionType","position type");
        descriptors.put("coreCompetency","skill");
    }
    
    @ModelAttribute("actions")
    public static HashMap<String,String> getActionChoices(){
        return actionChoices;
    }
    
    @ModelAttribute("columns")
    public static HashMap<String,String> getColumnChoices(){return columnChoices;}
    
    @ModelAttribute("tableChoices")
    public static HashMap<String,Object> getTableChoices(){return tableChoices;}
    
    
    
    
}
