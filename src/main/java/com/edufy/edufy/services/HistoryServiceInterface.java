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
    List<LikedMedia> getLikedMediaByUser(int userid);

    List<DislikedMedia> getDislikedMedia();

    List<DislikedMedia> getDislikedMediaByUser(int userid);


    List<UserMediaHistory> getMediaHistoryByUser(int id);

    List<UserMediaHistory> getAllMediaHistory();

    LikedMedia addLikedTrack(int mediaId, int userId);

    LikedMedia addLikedVideo(int mediaId, int userId);

/*    LikedMedia addLikedPod(int mediaId, int userId);*/

    DislikedMedia addDislikedTrack(int mediaId, int userId);

    DislikedMedia addDislikedVideo(int mediaId, int userId);

    DislikedMedia addDislikedPod(int mediaId, int userId);

    UserMediaHistory addMediaToHistory(int type, int mediaId, int userId);

/*    UserMediaHistory addTrack(int videoid, int userid);

    UserMediaHistory addTrack()*/

}
