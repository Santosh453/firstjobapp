package com.skode.review.service;

import com.skode.review.entity.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);

    boolean addReview(Long companyId, Review review);

    Review getReviewById(Long companyId, Long reviewId);

    boolean updateReview(Long companyId, Long reviewId, Review updatedReview);

    boolean deleteReview(Long companyId, Long reviewId);
}
