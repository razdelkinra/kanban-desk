package com.rra.project.kanbandesk.entity

enum class Status(var statusName: String) {

    OPEN("Open"),
    CLOSED("Closed"),
    PENDING("Pending"),
    CANCELED("Canceled")
}