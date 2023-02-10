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
@Table(name = "use_case")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UseCase {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column(nullable = false)
    private String origin;
    @Column(nullable = false)
    private String translate;

    @Column(name = "root_word_id")
    private UUID rootWordId;

    @Column
    @CreationTimestamp
    private LocalDateTime createDate;
    @Column
    @UpdateTimestamp
    private LocalDateTime updateDate;
}
