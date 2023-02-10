package ge.ka.ubani.georgiabackend.repository;

import ge.ka.ubani.georgiabackend.entity.RootWord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RootWordRepository extends JpaRepository<RootWord, UUID> {

    List<RootWord> findAllByWordContains(String word);

    List<RootWord> findDistinctByWordContainingAndRootWordTrue(String value);
}
