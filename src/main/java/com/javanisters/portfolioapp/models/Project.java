package com.javanisters.portfolioapp.models;

import lombok.Data;

@Data
public class Project {
    private int id;
    private String summary;
    private String details;
    private String github_link;
    private String site_link;
    private String tools_used;

}
