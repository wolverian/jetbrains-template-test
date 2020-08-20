package com.github.wolverian.jetbrainstemplatetest.services

import com.intellij.openapi.project.Project
import com.github.wolverian.jetbrainstemplatetest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
