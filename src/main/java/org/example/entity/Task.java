package org.example.entity;

import java.util.Objects;

public class Task {
    private String project;
    private String description;
    private String assignee;
    private Priority priority;
    private Status status;

    public Task(String project, String description, String assignee, Status status, Priority priority) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.status = status;
        this.priority = priority;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        return Objects.equals(assignee, task.assignee) &&
                Objects.equals(description, task.description) &&
                project == task.project && priority == task.priority &&
                status == task.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignee, description, project, priority, status);
    }



    public Object getAssignee() {
        return this.assignee;
    }

    public String getDescription() {
        return this.description;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getProject() {
        return this.project;
    }


}



