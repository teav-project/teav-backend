package jp.teav.teavbackend.project.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jp.teav.teavbackend.project.model.Project;
import jp.teav.teavbackend.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@Tag(name = "Project", description = "プロジェクトの情報を取得したり、プロジェクトの作成更新する際に使用するAPIです。")
public class ProjectController {

    ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    @Operation(summary = "プロジェクトの一覧を取得する", description = "検索結果に該当するプロジェクトの一覧を取得する")
    public List<Project> projects() {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1L, "テストプロジェクト", "テスト用のプロジェクトです。"));
        return projects;
    }

}
