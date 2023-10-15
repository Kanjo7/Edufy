package com.edufy.edufy.services;

import com.edufy.edufy.models.Artist;
import com.edufy.edufy.models.DislikedMedia;
import com.edufy.edufy.models.LikedMedia;
import com.edufy.edufy.models.UserMediaHistory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HistoryServiceInterface {

    List<LikedMedia> getLikedMedia();

    List<DislikedMedia> getDislikedMedia(int id);

    List<UserMediaHistory> getMediaHistory(int id);

    LikedMedia addLiked(LikedMedia media);

    DislikedMedia addDisliked(DislikedMedia media);

    UserMediaHistory addMediaToHistory(int type, int mediaId, int userId);

/*    UserMediaHistory addTrack(int videoid, int userid);

    UserMediaHistory addTrack()*/

}
