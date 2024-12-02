/*
 * You can use the following import statements
 *
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */
package com.example.artgallery.repository;

import com.example.artgallery.model.Art;
import com.example.artgallery.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtJpaRepository extends JpaRepository<Art, Integer> {
    List<Art> findByArtist(Artist artist);
}
