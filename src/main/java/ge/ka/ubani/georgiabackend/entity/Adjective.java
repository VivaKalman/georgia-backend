package ge.ka.ubani.georgiabackend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "adjective")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Adjective {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column
    private String positive;
    @Column
    private String comparative;
    @Column
    private String superlative;

    @Column
    @CreationTimestamp
    private LocalDateTime creationDate;
    @Column
    @UpdateTimestamp
    private LocalDateTime updateDate;
}
