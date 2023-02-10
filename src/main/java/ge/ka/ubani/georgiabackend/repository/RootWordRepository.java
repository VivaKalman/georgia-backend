package ge.ka.ubani.georgiabackend.repository;

import ge.ka.ubani.georgiabackend.entity.RootWord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RootWordRepository extends JpaRepository<RootWord, UUID> {
}
