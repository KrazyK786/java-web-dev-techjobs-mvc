package org.launchcode.javawebdevtechjobsmvc.controllers;

import org.launchcode.javawebdevtechjobsmvc.models.Form;
import org.launchcode.javawebdevtechjobsmvc.models.Job;
import org.launchcode.javawebdevtechjobsmvc.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static org.launchcode.javawebdevtechjobsmvc.controllers.ListController.columnChoices;
import static org.launchcode.javawebdevtechjobsmvc.controllers.ListController.descriptors;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController extends TechJobsController {

    @RequestMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        // add form-backing class instance to model
        model.addAttribute("form",new Form());
        return "search";
    }

    // TODOcommplete #3 - Create a handler to process a search request and render the updated search view.
    @PostMapping(value = "results")
    public String displaySearchResults(@ModelAttribute("form") Form form, Model model, @RequestParam String searchType, @RequestParam String searchTerm){
        ArrayList<Job> jobs;
        if (searchTerm.equals("") || searchTerm.equals("all")){
            jobs = JobData.findAll();
            model.addAttribute("title","All Jobs");
        }
        else{
            jobs = JobData.findByColumnAndValue(searchType,searchTerm);
            model.addAttribute("title","Jobs with " + columnChoices.get(searchType) + ": " + searchTerm);
        }
        model.addAttribute("jobs",jobs);
        model.addAttribute("columns",columnChoices);
        
        model.addAttribute("descriptors",descriptors);
        return "search";
    }
}
