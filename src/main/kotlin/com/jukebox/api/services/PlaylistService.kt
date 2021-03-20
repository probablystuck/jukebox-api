package com.jukebox.api.services

import org.springframework.stereotype.Service

@Service
class PlaylistService {
    fun getPlaylist(): String {
        // spotify api call here
        return "playlist"
    }
}