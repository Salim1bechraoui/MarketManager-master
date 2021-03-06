package tn.enig.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.enig.model.Produit;

@Repository
public interface IProduit extends JpaRepository<Produit, Integer> {

	
	
	
	@Query("select p from Produit p where p.magasin.id =:x")
	public List<Produit> getAllProduitByMagasin(@Param("x") Integer x );
	
}