package com.edufy.edufy.services;

import com.edufy.edufy.models.Artist;
import com.edufy.edufy.models.DislikedMedia;
import com.edufy.edufy.models.LikedMedia;
import com.edufy.edufy.models.UserMediaHistory;

import java.util.List;
import java.util.Optional;

public interface HistoryServiceInterface {

    List<LikedMedia> getLikedMedia(int id);

    List<DislikedMedia> getDislikedMedia(int id);

    List<UserMediaHistory> getMediaHistory(int id);

    LikedMedia addLiked(LikedMedia media);

    DislikedMedia addDisliked(DislikedMedia media);

    UserMediaHistory addUserMediaHistory(UserMediaHistory media);

/*    //get all artists (by alphabetical)

    //create artist

    Artist createArtist(Artist artistToCreate);

    // *** PUTS ***

    //update artist
    Artist updateArtist(Artist artist, int id);

    // *** DELETE ***

    //Delete artist
    void deleteArtist(int id);*/


}
