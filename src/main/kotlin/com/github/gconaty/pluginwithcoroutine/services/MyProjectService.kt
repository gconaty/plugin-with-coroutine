package com.github.gconaty.pluginwithcoroutine.services

import com.github.gconaty.pluginwithcoroutine.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
