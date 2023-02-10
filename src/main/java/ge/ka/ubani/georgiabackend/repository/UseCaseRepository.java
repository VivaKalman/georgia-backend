package ge.ka.ubani.georgiabackend.repository;

import ge.ka.ubani.georgiabackend.entity.UseCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UseCaseRepository extends JpaRepository<UseCase, UUID> {

    List<UseCase> findAllByRootWordId(UUID rootWordId);
}
