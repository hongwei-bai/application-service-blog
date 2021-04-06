package com.hongwei.service.scheduler

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class ScheduledTasks {
    // 30 mins : 30 min x 60 s x 1000 ms = 1,800,000, For copy:1800000
    @Scheduled(fixedRate = 1800000)
    fun reportCurrentTime() {
    }
}