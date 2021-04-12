
import { Component, OnInit, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material';
import {KanbanService} from "../../service/kanban-service.service";

@Component({
  selector: 'app-delete-confirm-dialog',
  templateUrl: './delete-confirm-dialog.component.html',
  styleUrls: ['./delete-confirm-dialog.component.css']
})
export class DeleteConfirmDialogComponent implements OnInit {

  message: String;
  kanbanId: number;
  title: String

  constructor(private dialogRef: MatDialogRef<DeleteConfirmDialogComponent>,
              @Inject(MAT_DIALOG_DATA) data: ConfirmDialogModel,
              private kanbanService: KanbanService) {
    this.message = data.message;
    this.kanbanId = data.id;
    this.title = data.title;
  }

  ngOnInit() {
  }

  onConfirmClick(){
    this.kanbanService.deleteKanban(this.kanbanId).subscribe();
    window.location.reload();
  }

}

export class ConfirmDialogModel {

  constructor(public title: string, public message: string, public id: number,) {
  }
}
