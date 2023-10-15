package com.edufy.edufy.services;

import com.edufy.edufy.models.DislikedMedia;
import com.edufy.edufy.models.LikedMedia;
import com.edufy.edufy.models.UserMediaHistory;
import com.edufy.edufy.repositories.DislikedMediaRepository;
import com.edufy.edufy.repositories.LikedMediaRepository;
import com.edufy.edufy.repositories.UserMediaHistoryRepository;
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

    @Override
    public List<LikedMedia> getLikedMedia(int id) {
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
    public UserMediaHistory addUserMediaHistory(UserMediaHistory media) {
        return userMediaHistoryRepository.save(media);
    }
}
