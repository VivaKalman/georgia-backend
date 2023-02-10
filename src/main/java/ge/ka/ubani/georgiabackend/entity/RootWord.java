package ge.ka.ubani.georgiabackend.entity;

import ge.ka.ubani.georgiabackend.enums.SpeechPartType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "root_word")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RootWord {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column(nullable = false)
    private String word;

    @Enumerated(value = EnumType.STRING)
    private SpeechPartType type;

    @Column
    String meaning;

    @Column
    String translate;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "ref_word_id")
    private RootWord refWord;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "noun_id")
    private Noun noun;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "verb_id")
    private Verb verb;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adjective_id")
    private Adjective adjective;

    @Column
    @CreationTimestamp
    private LocalDateTime creationDate;
    @Column
    @UpdateTimestamp
    private LocalDateTime updateDate;
}
