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
@Table(name = "noun")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Noun {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column
    private String singular;
    @Column
    private String plural;
    @Column
    private String nominative;
    @Column
    private String ergative;
    @Column
    private String dative;
    @Column
    private String genitive;
    @Column
    private String instrumental;
    @Column
    private String adverbial;
    @Column
    private String vocative;

    @Column
    @CreationTimestamp
    private LocalDateTime creationDate;
    @Column
    @UpdateTimestamp
    private LocalDateTime updateDate;
}
