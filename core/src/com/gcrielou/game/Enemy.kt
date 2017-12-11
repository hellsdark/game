package com.gcrielou.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import utils.drawSprite

/**
 * Created by gcrielou on 05/12/2017.
 */
class Enemy(texture:Texture, var x: Int, var y: Int) : Character(texture) {

    init {
        positionX = x * Config.SPRITE_SIZE_WORLD_UNIT
        positionY = y * Config.SPRITE_SIZE_WORLD_UNIT
        health = 1
    }

    override var statesSprites: Map<String, Array<Sprite>> = mapOf(
            "IDLE" to arrayOf(Sprite(0, 0), Sprite(0, 0), Sprite(1, 0))
    )



}