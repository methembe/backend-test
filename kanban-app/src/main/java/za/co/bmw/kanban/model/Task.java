package za.co.bmw.kanban.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "task")
@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class, 
    property = "id")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(position = 1)
    private Long id;

    @ApiModelProperty(position = 2)
    private String title;

    @ApiModelProperty(position = 3)
    private String description;

    @ApiModelProperty(position = 4)
    private String color;

    @ApiModelProperty(position = 5)
    private Long kanban_id;

    @Enumerated(EnumType.STRING)
    @ApiModelProperty(position = 6)
    private TaskStatus status;

    @ApiModelProperty(position = 7)
    private String tags;

    @ApiModelProperty(position = 8)
    private LocalDateTime localDateTime;



}
