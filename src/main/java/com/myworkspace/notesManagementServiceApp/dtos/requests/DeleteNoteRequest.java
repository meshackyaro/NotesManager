package com.myworkspace.notesManagementServiceApp.dtos.requests;

import lombok.Data;

@Data
public class DeleteNoteRequest {
    private String id;
    private String author;
    private String title;
}
