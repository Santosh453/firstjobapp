package com.skode.job.service;

import com.skode.job.entity.Job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
    void createJob(Job job);

    Job getByJobId(Long id);

    boolean deleteByJobId(Long id);

    boolean updateJobById(Long id, Job updateJob);
}
