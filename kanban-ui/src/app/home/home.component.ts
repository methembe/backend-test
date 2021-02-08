import { Component, OnInit } from '@angular/core';
import { Kanban } from '../model/kanban/kanban';
import { KanbanService } from '../service/kanban-service.service';
import { MatDialog, MatDialogConfig } from '@angular/material';
import { KanbanDialogComponent } from '../kanban-dialog/kanban-dialog.component';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  kanbanList: Kanban[];
  kanban: Kanban;

  constructor(
    private kanbanService: KanbanService,
    private dialog: MatDialog
  ) { }

  ngOnInit() {
    this.retrieveAllKanbanBoards();
  }

  openDialogForNewKanban(): void {
    const dialogConfig = new MatDialogConfig();
    dialogConfig.autoFocus = true;
    dialogConfig.data = {
      kanban: new Kanban()
    };
    this.dialog.open(KanbanDialogComponent, dialogConfig)
  }

  private retrieveAllKanbanBoards(): void {
    this.kanbanService.retrieveAllKanbanBoards().subscribe(

      response => {
        this.kanbanList = response;
      }
    )
  }

  delete(kanbanId:number) {
    this.kanbanService.deleteKanban(kanbanId).subscribe();
    window.location.reload();
  }

  confirmDelete(name: number) {
    if(confirm("Are you sure to delete "+name)) {
      this.delete(name);
    }
  }
}
