package jp.teav.teavbackend.project;

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

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectOverview() {
        return projectOverview;
    }

    public void setProjectOverview(String projectOverview) {
        this.projectOverview = projectOverview;
    }
}
