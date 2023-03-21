package jp.teav.teavbackend.project.model;

public class Project {

    private Long id;
    private String projectName;
    private String projectOverview;

    public Project(Long id, String projectName, String projectOverview) {
        this.id = id;
        this.projectName = projectName;
        this.projectOverview = projectOverview;
    }

    public Long getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectOverview() {
        return projectOverview;
    }
}
