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
    public List<DislikedMedia> getDislikedMedia(int id) {
        return dislikedMediaRepository.findAll();
    }
    @Override
    public List<UserMediaHistory> getMediaHistory(int id) {
        return userMediaHistoryRepository.findAll();
    }

    @Override
    public LikedMedia addLiked(LikedMedia media) {
        return likedMediaRepository.save(media);
    }

    @Override
    public DislikedMedia addDisliked(DislikedMedia media) {
        return dislikedMediaRepository.save(media);
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

    //Track track, Video video, User user

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
