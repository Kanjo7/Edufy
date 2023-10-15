package com.edufy.edufy.services;

import com.edufy.edufy.models.*;
import com.edufy.edufy.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryServices implements HistoryServiceInterface {

@Autowired
private LikedMediaRepository likedMediaRepository;

@Autowired
private DislikedMediaRepository dislikedMediaRepository;

@Autowired
private UserMediaHistoryRepository userMediaHistoryRepository;
@Autowired
private VideoRepository videoRepository;
@Autowired
private TrackRepository trackRepository;
@Autowired
UserRepository userRepository;
@Autowired
MediaTypeRepository mediaTypeRepository;

    @Override
    public List<LikedMedia> getLikedMedia() {
        return likedMediaRepository.findAll();
    }

    @Override
    public List<LikedMedia> getLikedMediaByUser(int userid) {
        return likedMediaRepository.findLikedMediaByUser_Id(userid);
    }

    @Override
    public List<DislikedMedia> getDislikedMedia() {
        return dislikedMediaRepository.findAll();
    }

    @Override
    public List<DislikedMedia> getDislikedMediaByUser(int userid) {
        return dislikedMediaRepository.findDislikedMediaByUser_Id(userid);
    }

    @Override
    public List<UserMediaHistory> getMediaHistoryByUser(int id) {
        return userMediaHistoryRepository.findUserMediaHistoryByUser_Id(id);
    }

    @Override
    public List<UserMediaHistory> getAllMediaHistory() {
        return userMediaHistoryRepository.findAll();
    }



    @Override
    public LikedMedia addLikedTrack(int mediaId, int userId) {
        LikedMedia l = new LikedMedia();
        l.setTrack(trackRepository.findTrackById(mediaId));
        l.setUser(userRepository.findById(userId));
        likedMediaRepository.save(l);

        return l;
    }

    @Override
    public LikedMedia addLikedVideo(int mediaId, int userId) {
        LikedMedia l = new LikedMedia();
        l.setVideo(videoRepository.findById(mediaId));
        l.setUser(userRepository.findById(userId));
        likedMediaRepository.save(l);
        return l;
    }

/*    @Override
    public LikedMedia addLikedPod(int mediaId, int userId) {
        return null;
    }*/

    @Override
    public DislikedMedia addDislikedTrack(int mediaId, int userId) {
        DislikedMedia d = new DislikedMedia();
        d.setTrack(trackRepository.findTrackById(mediaId));
        d.setUser(userRepository.findById(userId));
        dislikedMediaRepository.save(d);
        return d;
    }

    @Override
    public DislikedMedia addDislikedVideo(int mediaId, int userId) {
        DislikedMedia d = new DislikedMedia();
        d.setVideo(videoRepository.findById(mediaId));
        d.setUser(userRepository.findById(userId));
        dislikedMediaRepository.save(d);
        return d;
    }

    @Override
    public DislikedMedia addDislikedPod(int mediaId, int userId) {
        return null;
    }

    @Override
    public UserMediaHistory addMediaToHistory(int type, int mediaId, int userId) {
        UserMediaHistory u = new UserMediaHistory();

        if (type == 1){
            u.setTrack(trackRepository.findTrackById(mediaId));
            u.setUser(userRepository.findById(userId));
        } else if (type == 2) {
            u.setVideo(videoRepository.findById(mediaId));
            u.setUser(userRepository.findById(userId));
        }
        userMediaHistoryRepository.save(u);

        return u;
}
    public HistoryServices() {
    }

    public LikedMediaRepository getLikedMediaRepository() {
        return likedMediaRepository;
    }

    public void setLikedMediaRepository(LikedMediaRepository likedMediaRepository) {
        this.likedMediaRepository = likedMediaRepository;
    }

    public DislikedMediaRepository getDislikedMediaRepository() {
        return dislikedMediaRepository;
    }

    public void setDislikedMediaRepository(DislikedMediaRepository dislikedMediaRepository) {
        this.dislikedMediaRepository = dislikedMediaRepository;
    }

    public UserMediaHistoryRepository getUserMediaHistoryRepository() {
        return userMediaHistoryRepository;
    }

    public void setUserMediaHistoryRepository(UserMediaHistoryRepository userMediaHistoryRepository) {
        this.userMediaHistoryRepository = userMediaHistoryRepository;
    }


    public HistoryServices(LikedMediaRepository likedMediaRepository, DislikedMediaRepository dislikedMediaRepository,
                           UserMediaHistoryRepository userMediaHistoryRepository,
                           VideoRepository videoRepository, TrackRepository trackRepository,
                           UserRepository userRepository, MediaTypeRepository mediaTypeRepository) {
        this.likedMediaRepository = likedMediaRepository;
        this.dislikedMediaRepository = dislikedMediaRepository;
        this.userMediaHistoryRepository = userMediaHistoryRepository;
        this.videoRepository = videoRepository;
        this.trackRepository = trackRepository;
        this.userRepository = userRepository;
        this.mediaTypeRepository = mediaTypeRepository;
    }

    public HistoryServices(LikedMediaRepository likedMediaRepository, DislikedMediaRepository dislikedMediaRepository, UserMediaHistoryRepository userMediaHistoryRepository) {
        this.likedMediaRepository = likedMediaRepository;
        this.dislikedMediaRepository = dislikedMediaRepository;
        this.userMediaHistoryRepository = userMediaHistoryRepository;
    }
}
