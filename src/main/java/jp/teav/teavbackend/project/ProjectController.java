package jp.teav.teavbackend.project;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@Tag(name = "Project", description = "プロジェクトの情報を取得したり、プロジェクトの作成更新する際に使用するAPIです。")
public class ProjectController {

    @GetMapping("/projects")
    @Operation(summary = "プロジェクトの一覧を取得する", description = "検索結果に該当するプロジェクトの一覧を取得する")
    public List<Project> projects() {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1L, "テストプロジェクト", "テスト用のプロジェクトです。"));
        return projects;
    }

}
