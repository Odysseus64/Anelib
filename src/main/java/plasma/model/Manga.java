package plasma.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "manga")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String alter_name;
    private String genre;
    private String date_of_appearance;
    private String status;
    private String author;
    private String type;
}
