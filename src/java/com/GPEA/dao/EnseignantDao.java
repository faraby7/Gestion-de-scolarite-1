package com.GPEA.dao;

import com.GPEA.beans.Enseignant;
import java.sql.Blob;
import java.util.ArrayList;



public interface EnseignantDao {

    //void creer( Enseignant admin ) throws DAOException;

    Enseignant trouver( String email ) throws DAOException;

    Enseignant trouver( Long idEnseignant ) throws DAOException;
    Enseignant trouver(String email,String password);
    void modifier(Enseignant enseignant) throws DAOException;
    Long getIdCompte(Long idEnseignant);
    Blob getImageBlob(Long id_enseignant);
    ArrayList<Enseignant> getAllEnseignant() throws DAOException;
    void inserer(Enseignant enseignant) throws DAOException;

}