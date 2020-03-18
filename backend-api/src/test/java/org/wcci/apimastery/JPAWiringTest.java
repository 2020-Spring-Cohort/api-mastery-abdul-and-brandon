package org.wcci.apimastery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.wcci.apimastery.Storage.ArtistRepository;
import org.wcci.apimastery.Storage.SongRepository;
import org.wcci.apimastery.models.Album;
import org.wcci.apimastery.models.Artist;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JPAWiringTest {
    @Autowired

}
