package flore.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import flore.model.Flore;
import flore.model.ReferentielCaracteristique;

public interface IReferentielCaracteristiqueRepository extends JpaRepository<ReferentielCaracteristique, Long>{


}
