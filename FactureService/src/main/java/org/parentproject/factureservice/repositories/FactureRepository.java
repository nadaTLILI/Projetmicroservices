package org.parentproject.factureservice.repositories;

import org.parentproject.factureservice.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {


//	@Query("SELECT f FROM Facture f where f.fournisseur=:fournisseur and f.archivee=false")
//	List<Facture> getFactureByFournisseur(@Param("fournisseur") Fournisseur fournisseur);

    @Query("SELECT sum(f.montantFacture) FROM Facture f where  f.dateCreationFacture between :startDate"
            + " and :endDate and f.archivee=false")
    float getTotalFacturesEntreDeuxDates(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
