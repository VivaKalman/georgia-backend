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
@Table(name = "verb")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Verb {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;
    @Column
    private String presentOneSingle;
    @Column
    private String presentTwoSingle;
    @Column
    private String presentThreeSingle;
    @Column
    private String presentOnePlural;
    @Column
    private String presentTwoPlural;
    @Column
    private String presentThreePlural;

    @Column
    @CreationTimestamp
    private LocalDateTime creationDate;
    @Column
    @UpdateTimestamp
    private LocalDateTime updateDate;

}
