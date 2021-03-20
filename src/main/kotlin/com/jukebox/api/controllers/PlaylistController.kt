package com.jukebox.api.controllers

import com.jukebox.api.services.PlaylistService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class PlaylistController(val playlistService: PlaylistService) {

    @GetMapping("/")
    fun health(): String {
        return "ok"
    }

    @GetMapping("/playlist")
    fun getPlaylist(): String {
        return playlistService.getPlaylist()
    }
}